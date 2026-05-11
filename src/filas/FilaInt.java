package filas;

public class FilaInt {
    private class No{
        int dados;
        No prox;
    }
    private No ini,fim;

    public void init (){
        ini = fim = null;
    }

    public boolean isEmpty(){
        return (ini == null && fim == null);
    }

    public void enqueue(int elem){
        No novo = new No();
        novo.dados = elem;
        novo.prox = null;
        if (isEmpty()){
            ini = novo;
        }else {
            fim.prox = novo;
        }
        fim = novo;
    }

    public void dequeue(){}
}
