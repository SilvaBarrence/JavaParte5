public class TesteGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(12345, 6789);
        System.out.println(conta.getNumeroDaContaCorrente());

        Cliente gabriel = new Cliente();

        gabriel.setNome("Gabriel");
        conta.setTitular(gabriel);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Programador");

    }
}
