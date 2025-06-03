
package filadupla;

public class DuplamenteEncadeada {

    private No inicio;
    private No fim;

    public void criar() {
        this.inicio = null;
        this.fim = null;
    }

  
    public void inserir(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

   
    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    
    public void remover(String valor) {
        No atual = inicio;

        while (atual != null) {
            if (atual.valor.equals(valor)) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    inicio = atual.proximo;
                }

                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    fim = atual.anterior;
                }

                
                atual = null;
                return;
            }

            atual = atual.proximo;
        }
    }
}
