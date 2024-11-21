package aula03;

public class Caneta {
   public String modelo;
    public String cor;
    private float ponta;
   protected int carga;
    private boolean tampada;

    //get e set são metodos acessores, oq garante a segurança de acesso dos atributose metodo
    //geralmente o set sempre tera um retorno dentro do parenteses, do mesmo tipo que o parametro no exemplo, "set modelo" recebe um paranetro
    // (String modelo) mesmo tipo de que o atributo declarado acima
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
// final dos get e set

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public void status() {
        System.out.println("Modelo" + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Uma caneta" + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar! ");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    public void tampar() {
        this.tampada = true;
    }


    public void destampar() {
        this.tampada = false;
    }
}


