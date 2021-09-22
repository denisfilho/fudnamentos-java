package ProjetoAlunoNotas;

import java.util.Scanner;

public class Aluno {
    String nome;
    long matricula;
    double[] notas = new double[2];
    double media;

    public Aluno cadastrarAluno(Scanner leTeclado, int alunosCadastrados){
        Aluno alunoCadastrado = new Aluno();
        alunoCadastrado.matricula = -1;

        do{
            System.out.print("Informe a matrícula do aluno " + (alunosCadastrados + 1) + " : ");
            alunoCadastrado.matricula = leTeclado.nextInt();

            if(alunoCadastrado.matricula < 0){

                System.out.println("Infome uma matrícula válida");

            }
        } while (alunoCadastrado.matricula < 0);

        System.out.print("Informe o nome do aluno: ");
        alunoCadastrado.nome = leTeclado.next();

        System.out.print("Informe a primeira nota de " + alunoCadastrado.nome + " : ");
        alunoCadastrado.notas[0] = leTeclado.nextDouble();

        System.out.print("Informe a segunda nota de " + alunoCadastrado.nome + " : ");
        alunoCadastrado.notas[1] = leTeclado.nextDouble();

        alunoCadastrado.media =alunoCadastrado.calculaMedia(alunoCadastrado);
        return alunoCadastrado;
    }
    public double calculaMedia(Aluno aluno){
        return ((aluno.notas[0]* Constantes.PESO_1 + aluno.notas[1]*Constantes.PESO_2)/(Constantes.PESO_1+Constantes.PESO_2));
    }
    public static Aluno encontraMatricula(long matricula, Aluno[] alunos){
        for (int i =0; i<alunos.length; i++){
            if (matricula == alunos[i].matricula){
                return alunos[i];
            }
        }
        return null;
    }
    public static Aluno encontraMaiorMedia(Aluno[] alunos){
        int posicaoMaiorMedia = 0;
        for(int i=0; i< alunos.length; i++){
            if (alunos[posicaoMaiorMedia].media < alunos[i].media){
                posicaoMaiorMedia = i;
            }
        }
        return alunos[posicaoMaiorMedia];
    }

}
