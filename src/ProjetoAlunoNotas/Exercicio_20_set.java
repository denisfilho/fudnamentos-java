package ProjetoAlunoNotas;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class Exercicio_20_set {
    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[Constantes.MAXIMO_DE_ALUNOS];
        int alunosCadastrados = 0;
        Scanner leTeclado = new Scanner(System.in);

        do{
            System.out.println(Constantes.OPCAO_CADASTRAR_ALUNO + " - Cadastrar ProjetoAlunoNotas.Aluno");
            System.out.println(Constantes.OPCAO_MEDIA_ALUNO + " - Exibir Média do ProjetoAlunoNotas.Aluno");
            System.out.println(Constantes.MAXIMO_DE_ALUNOS + " - Exibir Maior Media");
            System.out.println(Constantes.OPCAO_SAIR + " - Sair");
            System.out.print("Informe uma opção: ");
            int opcao = leTeclado.nextInt();

            if (opcao == Constantes.OPCAO_SAIR){
                System.out.println("Programa Finalizado!");
                break;
            }
            switch (opcao){
                case Constantes.OPCAO_CADASTRAR_ALUNO:
                    if (alunosCadastrados< Constantes.MAXIMO_DE_ALUNOS){

                        alunos[alunosCadastrados] = new Aluno();
                        alunos[alunosCadastrados] = alunos[alunosCadastrados].cadastrarAluno(leTeclado, alunosCadastrados);
                        alunosCadastrados++;

                        System.out.println("Alunos cadastrados: " + alunosCadastrados + "/" + Constantes.MAXIMO_DE_ALUNOS);
                    }
                    else{

                        System.out.println("Número total de alunos já cadastrados");
                    }
                    break;
                case Constantes.OPCAO_MEDIA_ALUNO:
                    System.out.print("Informe a matrícula do aluno: ");

                    long matricula = leTeclado.nextLong();
                    Aluno alunoPesquisado = Aluno.encontraMatricula(matricula, alunos);

                    if(alunoPesquisado!=null){
                        System.out.println("A media do aluno " + alunoPesquisado.nome + " é " + alunoPesquisado.media );
                    }
                    else{
                        System.out.println("Matricula não encontrada");
                    }
                    break;
                case Constantes.OPCAO_MAIOR_MEDIA:
                    if(alunosCadastrados == Constantes.MAXIMO_DE_ALUNOS){

                        Aluno alunoMaiorMedia = Aluno.encontraMaiorMedia(alunos);
                        System.out.println("A maior média da turma foi do aluno : " + alunoMaiorMedia.nome + " e sua média foi: " + alunoMaiorMedia.media);

                    }
                    else{
                        System.out.println("Para utilizar essa opção é necessário que todos os 3 (três) alunos estejam cadastrados.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (true);
    }
}
