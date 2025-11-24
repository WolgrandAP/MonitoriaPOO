package org.demo3.calculadoraorcamentopessoal;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.demo3.calculadoraorcamentopessoal.model.TipoTransacao;
import org.demo3.calculadoraorcamentopessoal.model.Transacao;

import java.io.IOException;

public class PrincipalController {

    @FXML
    private ListView<Transacao> listTransacoes;

    @FXML
    private Label labelTotalReceitas;

    @FXML
    private Label labelTotalDespesas;

    @FXML
    private Label labelSaldo;

    @FXML
    private Button btnNovaTransacao;

    @FXML
    private Button btnLimpar;

    // ---------- MÉTODO CHAMADO PELO BOTÃO ----------
    @FXML
    private void abrirNovaTransacao() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("nova-transacao.fxml")
            );

            Stage stage = new Stage();
            stage.setTitle("Nova Transação");

            Scene scene = new Scene(loader.load(), 450, 250);
            stage.setScene(scene);

            stage.initModality(Modality.APPLICATION_MODAL);

            stage.showAndWait();

            // após fechar a janela, pegamos a transação criada
            NovaTransacaoController controller = loader.getController();
            Transacao nova = controller.getTransacaoCriada();

            if (nova != null) {
                listTransacoes.getItems().add(nova);
                atualizarTotais();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    // ---------- LIMPAR LISTA ----------
    @FXML
    private void limparTransacoes() {
        listTransacoes.getItems().clear();
        atualizarTotais();
    }

    // ---------- ATUALIZAR LABELS ----------
    private void atualizarTotais() {
        double totalReceitas = listTransacoes.getItems()
                .stream()
                .filter(t -> t.getTipo() == TipoTransacao.RECEITA)
                .mapToDouble(Transacao::getValor)
                .sum();

        double totalDespesas = listTransacoes.getItems()
                .stream()
                .filter(t -> t.getTipo() == TipoTransacao.DESPESA)
                .mapToDouble(Transacao::getValor)
                .sum();

        double saldo = totalReceitas - totalDespesas;

        labelTotalReceitas.setText(String.format("%.2f", totalReceitas));
        labelTotalDespesas.setText(String.format("%.2f", totalDespesas));
        labelSaldo.setText(String.format("%.2f", saldo));
    }
}
