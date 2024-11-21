package aula03.aula02;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        garrafa g1 = new garrafa();
        g1.cor = "rosa";
        g1.tamanho = 2000;
    }
}