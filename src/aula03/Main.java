package aula03;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("bic","preta",0.7f);
        c1.modelo = " bic cristal";
        c1.cor= "Azul";
       // c1.ponta = 0.5f; atributo como private
        c1.carga = 80;
       // c1.tampada = true;
        c1.destampar();


        c1.status();

    }
}