a. int[] A; A[0] = 0; --> 1.erro

b.A JVM inicia a execução de seu programa, mas não consegue encontrar as classes da plataforma Java (que residem em classes.zip ou rt.jar)  --> 2.checked exception

c. Um programa está lendo uma stream e alcança o marcador de fim da stream --> 4.não é lançada exceção

d. Antes de fechar a stream e após atingir o marcador de fim da stream, o programa tenta ler da stream novamente --> 3.erro de compilação