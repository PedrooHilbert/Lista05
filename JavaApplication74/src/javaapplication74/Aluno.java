public class Aluno {

    private String nome;
    private int idade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private int estrategia;
    private int criatividade;
    private String casa;

  
    public Aluno(String nome, int idade, int coragem, int inteligencia,
                  int ambicao, int lealdade, int estrategia, int criatividade) {

        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
    }

  
    public void calcularCasa() {

        int grifinoria = (2 * coragem) + lealdade;
        int sonserina = (2 * ambicao) + estrategia;
        int corvinal = (2 * inteligencia) + criatividade;
        int lufalufa = ((2 * lealdade) + coragem) / 3;

        int maior = grifinoria;
        casa = "Grifinória";

        if (sonserina > maior) {
            maior = sonserina;
            casa = "Sonserina";
        }

        if (corvinal > maior) {
            maior = corvinal;
            casa = "Corvinal";
        }

        if (lufalufa > maior) {
            maior = lufalufa;
            casa = "Lufa-Lufa";
        }
    }


    public void exibirInformacoes() {

        System.out.println("\nAluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Casa escolhida: " + casa);
    }
}