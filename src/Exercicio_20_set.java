import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class Exercicio_20_set {
    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[3];
        int alunosCadastrados = 0;
        Scanner leTeclado = new Scanner(System.in);

        do{
            System.out.println(Constantes.OPCAO_CADASTRAR_ALUNO + " - Cadastrar Aluno");
            System.out.println(Constantes.OPCAO_MEDIA_ALUNO + " - Exibir Média do Aluno");
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
                        alunos[alunosCadastrados].matricula = -1;
                        do{
                            System.out.print("Informe a matrícula do aluno " + (alunosCadastrados + 1) + " : ");
                            alunos[alunosCadastrados].matricula = leTeclado.nextInt();

                            if(alunos[alunosCadastrados].matricula < 0){
                                System.out.println("Infome uma matrícula válida");
                            }
                        } while (alunos[alunosCadastrados].matricula < 0);
                        System.out.print("Informe o nome do aluno: ");
                        alunos[alunosCadastrados].nome = leTeclado.next();

                        System.out.print("Informe a primeira nota de " + alunos[alunosCadastrados].nome + " : ");
                        alunos[alunosCadastrados].notas[0] = leTeclado.nextDouble();
                        System.out.print("Informe a primeira nota de " + alunos[alunosCadastrados].nome + " : ");
                        alunos[alunosCadastrados].notas[1] = leTeclado.nextDouble();
                        alunos[alunosCadastrados].media =alunos[alunosCadastrados].CalculaMedia(alunos[alunosCadastrados]);
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
                    Aluno alunoPesquisado = Aluno.EncontraMatricula(matricula, alunos);
                    if(alunoPesquisado!=null){
                        System.out.println("A media do aluno " + alunoPesquisado.nome + " é " + alunoPesquisado.media );
                    }
                    else{
                        System.out.println("Matricula não encontrada");
                    }
                    break;
                case Constantes.OPCAO_MAIOR_MEDIA:
                    if(alunosCadastrados == Constantes.MAXIMO_DE_ALUNOS){
                        Aluno alunoMaiorMedia = Aluno.EncontraMaiorMedia(alunos);
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
