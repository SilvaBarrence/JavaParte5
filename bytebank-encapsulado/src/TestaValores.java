public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(12345, 56789);
        Conta conta2 = new Conta(12345, 2131231);
        Conta conta3 = new Conta(12345, 56754345);

        System.out.println(conta.getNumeroDaAgencia());
        System.out.println(Conta.getContador());
    }
}
