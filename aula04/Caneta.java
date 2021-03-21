package aula04;
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(){
        this.tampar();
        this.cor = "Azul";

    }

    public void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void destampar(){
        this.tampada = false;
    }
    public void tampar(){
        this.tampada = true;
    }
}
