public class MainExercicio {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("Helcius Cabral");

        conta1.depositar(100, 123);
        System.out.println(conta1.getSaldo());

        conta1.sacar(10000, 123);
        System.out.println(conta1.getSaldo());

        conta1.sacar(23, 13);
        System.out.println(conta1.getSaldo());

        conta1.sacar(19, 123);
        System.out.println(conta1.getSaldo());
    }
}
