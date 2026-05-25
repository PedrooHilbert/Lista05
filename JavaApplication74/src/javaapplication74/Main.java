import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 0) {

            System.out.println("\nDigite o nome do aluno:");
            String nome = sc.nextLine();

            System.out.println("Digite a idade:");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.println("Coragem:");
            int coragem = Integer.parseInt(sc.nextLine());

            System.out.println("Inteligência:");
            int inteligencia = Integer.parseInt(sc.nextLine());

            System.out.println("Ambição:");
            int ambicao = Integer.parseInt(sc.nextLine());

            System.out.println("Lealdade:");
            int lealdade = Integer.parseInt(sc.nextLine());

            System.out.println("Estratégia:");
            int estrategia = Integer.parseInt(sc.nextLine());

            System.out.println("Criatividade:");
            int criatividade = Integer.parseInt(sc.nextLine());

            Aluno aluno = new Aluno(
                    nome,
                    idade,
                    coragem,
                    inteligencia,
                    ambicao,
                    lealdade,
                    estrategia,
                    criatividade
            );

            aluno.calcularCasa();
            aluno.exibirInformacoes();

            System.out.println("\nDigite 0 para sair ou qualquer número para continuar:");
            opcao = Integer.parseInt(sc.nextLine());
        }

        sc.close();
    }
}