import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e valida o nome
        String nome;
        do {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        // Solicita e valida a idade
        int idade;
        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        // Solicita e valida o salário
        double salario;
        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        // Solicita e valida o sexo
        char sexo;
        do {
            System.out.print("Digite o sexo ('f' ou 'm'): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        // Solicita e valida o estado civil
        char estadoCivil;
        do {
            System.out.print("Digite o estado civil ('s', 'c', 'v' ou 'd'): ");
            estadoCivil = scanner.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        // Exibe as informações validadas
        System.out.println("\nInformações validadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}
