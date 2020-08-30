public class Conta {
    private double saldo;
    private int numeroDaAgencia;
    private int numeroDaContaCorrente;
    private Cliente titular;
    private  static int contador;

    public Conta(int numeroDaAgencia, int numeroDaContaCorrente){
        Conta.contador++;
        System.out.println("O total de contas é de: "+contador);
        this.numeroDaAgencia = numeroDaAgencia;
        this.numeroDaContaCorrente = numeroDaContaCorrente;
        System.out.println("Está sendo criado uma conta de número: "+ this.numeroDaContaCorrente);
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumeroDaAgencia() {
        return this.numeroDaAgencia;
    }

    public void setNumeroDaAgencia(int numeroDaAgencia) {
        if(numeroDaAgencia <= 0){
            System.out.println("O número deve ser maior que zero!");
            return;
        }
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public int getNumeroDaContaCorrente() {
        return this.numeroDaContaCorrente;
    }

    public void setNumeroDaContaCorrente(int numeroDaContaCorrente) {
        if(numeroDaContaCorrente <= 0){
            System.out.println("O número deve ser maior que zero!");
            return;
        }
        this.numeroDaContaCorrente = numeroDaContaCorrente;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getContador() {
        return Conta.contador;
    }
}
