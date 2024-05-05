package BancoPOO;

public class banco {

    private String nome;
    private int conta;
    private Double saldo;
    private Double depositar;
    private Double sacar;
    private Double consulta;


    public banco(String nome, int conta, Double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    //AÇÕES
    //Depositar
    public Double getDepositar(){
        return depositar;
    }
    public void setDepositar(Double depositar){
        setSaldo(saldo + depositar);
        System.out.println("Deposito de " + depositar + "$ feito com sucesso.");
    }

    //Sacar
    public Double getSacar(){
        return sacar;
    }
    public void setSacar(Double saque){
        
        if(saque > saldo){
            System.out.println("Saldo insuficiente!");
        }else{
            setSaldo(saldo - saque);
            System.out.println("Saque de " + saque + "$ feito com sucesso");
        }
    }

    //Saldo
    public Double getConsulta(){
        return consulta;
    }
    public void setConsulta(){
        System.out.println("O saldo disponivel é " + saldo + "$");
    }



}