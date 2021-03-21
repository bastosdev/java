package aula05;
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("Número da Conta: " + this.getNumConta());
        System.out.println("Tipo de Conta: " + this.getTipo());
        System.out.println("Respnsável: " + this.getDono());
        System.out.println("Saldo Atual: " + this.getSaldo());
        System.out.println("Conta Aberta? " + this.getStatus());
    }
    /*MÉTODO ABRIR CONTA*/

    public void abriConta(String abrirConta){
        this.setTipo(tipo);
        this.setStatus(true);
        if (abrirConta == "CC"){
            this.saldo = 50;
        }else if (abrirConta == "CP"){
            this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!");
    }
    //*MÉTODO FECHAR CONTA*/

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, ainda com saldo!");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada, posui débitos!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    /*MÉTODO DEPOSITAR NA CONTA*/

    public void depositar(float depositar){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + depositar);
            System.out.println("Depositado na conta de " + getDono());
        } else {
            System.out.println("Impossivel depositar em conta fechada!");
        }

    }
    /*MÉTODO SACAR NA CONTA*/

    public void sacar(float sacar){
        if (this.getStatus()) {
            if (this.getSaldo() >= sacar) {
                this.setSaldo(this.getSaldo() - sacar);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossivel Sacar de uma conta fechada!");
        }
    }
    /*MÉTODO PAGAR MENSALIDADE*/

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade Paga!");
        } else {
            System.out.println("Impossivel pagar de uma conta fechada!");
        }
    }
    /*CONSTRUTOR DE CONTA*/
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    //*ABAIXO MÉTODOS ACESSORES*//

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
