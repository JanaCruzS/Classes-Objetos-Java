package aula03;

public class garrafa {
    String cor;
    int tamanho;

    boolean tampada;

    void tampar() {
        this.tampada = true;
    }
    void destampada() {
        this.tampada = false;
    }
    void encher() {
        if (this.tampada == true){
            System.out.println("ERRO! Não posso encher a aula02.garrafa! ");
        } else {
            System.out.println("Enchendo a aula02.garrafa...");
        }
    }

}
