public class MainConta {
    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente("12345", 1000.0f);
        System.out.println(contaCorrente);
        contaCorrente.depositar(500.0f);
        System.out.println("Após depósito de R$ 500: " + contaCorrente);
        contaCorrente.sacar(200.0f);
        System.out.println("Após saque de R$ 200: " + contaCorrente);

        
        ContaEspecial contaEspecial = new ContaEspecial("67890", 1000.0f, 500.0f);
        System.out.println(contaEspecial);
        contaEspecial.depositar(200.0f);
        System.out.println("Após depósito de R$ 200: " + contaEspecial);
        contaEspecial.sacar(1300.0f); // Saque que excede o saldo, mas dentro do limite de crédito
        System.out.println("Após saque de R$ 1300: " + contaEspecial);
    }
}
