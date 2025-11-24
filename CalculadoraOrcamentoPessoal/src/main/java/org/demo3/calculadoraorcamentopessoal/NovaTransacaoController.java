package org.demo3.calculadoraorcamentopessoal;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.demo3.calculadoraorcamentopessoal.model.TipoTransacao;
import org.demo3.calculadoraorcamentopessoal.model.Transacao;

public class NovaTransacaoController {

    @FXML
    private TextField txtDescricao;

    @FXML
    private TextField txtValor;

    @FXML
    private RadioButton radioDespesa;

    @FXML
    private RadioButton radioReceita;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnSalvar;

    // Transação criada e retornada para o PrincipalController
    private Transacao transacaoCriada;

    @FXML
    public void initialize() {
        // Define 'Receita' como padrão ao abrir a janela
        radioReceita.setSelected(true);
    }

    public Transacao getTransacaoCriada() {
        return transacaoCriada;
    }

    @FXML
    private void salvarTransacao() {
        try {
            String descricao = txtDescricao.getText();
            if (txtValor.getText().trim().isEmpty()) {
                System.out.println("O valor não pode estar vazio.");
                return;
            }
            double valor = Double.parseDouble(txtValor.getText());

            TipoTransacao tipo = radioReceita.isSelected()
                    ? TipoTransacao.RECEITA
                    : TipoTransacao.DESPESA;

            transacaoCriada = new Transacao(valor, descricao, tipo);

            fecharJanela();

        } catch (NumberFormatException e) {
            System.out.println("Erro: O valor deve ser um número válido.");
        } catch (Exception e) {
            System.out.println("Erro ao salvar transação: " + e.getMessage());
        }
    }

    @FXML
    private void cancelar() {
        transacaoCriada = null;
        fecharJanela();
    }

    private void fecharJanela() {
        Stage stage = (Stage) btnSalvar.getScene().getWindow();
        stage.close();
    }
}
