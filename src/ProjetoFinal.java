import java.util.Scanner;

public class ProjetoFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Rodrigo Ferreira";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500.00;
        int opcaoEscolhida = 0;
        String extrato = "";


        System.out.println("***********************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo conta: " + tipoDeConta);
        System.out.println("Saldo inicial: R$" + saldoInicial);
        System.out.println("\n***********************"); //\n serve para pular uma linha

        System.out.println("\nOperações");
        System.out.println("1-Consultar saldos");
        System.out.println("2-Receber valor");
        System.out.println("3-Transferir valor");
        System.out.println("4-sair");
        System.out.println("5-Extrato");
        System.out.println("\n***********************"); //\n serve para pular uma linha





        while (opcaoEscolhida != 4){
            System.out.println("\nDigite a opção desejada:");
            opcaoEscolhida = scanner.nextInt();
                if (opcaoEscolhida == 1){
                    System.out.println("Saldo da conta é: " + String.format("%.2f", saldoInicial));
                }
                else if (opcaoEscolhida == 2) {
                    System.out.println("Digite o valor que deseja receber");
                    double valorRecebido = scanner.nextDouble();
                    extrato += "Recebeu: R$" + valorRecebido + "\n";

                    if (valorRecebido < 0){
                        System.out.println("Valor inválido!");
                    }else {
                        saldoInicial += valorRecebido;
                        System.out.println("Saldo atualizado R$" + saldoInicial);
                    }
                }
                else if (opcaoEscolhida == 3) {
                    System.out.println("Informe o valor que deseja transferir: ");
                    double valorTransferir = scanner.nextDouble();
                    extrato += "Transferiu: R$" + valorTransferir + "\n";
                    if (valorTransferir > saldoInicial){
                        System.out.println("Valor maior que você possui em conta");
                    }
                    else {
                        saldoInicial -= valorTransferir;
                        System.out.println("saldo atualiado R$" + saldoInicial);
                    }
                }
                else if (opcaoEscolhida == 5) {
                    System.out.println("Extrato da conta:");
                    System.out.println(extrato);
                    System.out.println("Saldo da conta é: " + String.format("%.2f", saldoInicial));

                }

        }

        System.out.println("Você saiu da sua conta!");


    }
}