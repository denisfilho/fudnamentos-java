public class Aluno {
    String nome;
    long matricula;
    double[] notas = new double[2];
    double media;

    public double CalculaMedia(Aluno aluno){
        return ((aluno.notas[0]*Constantes.PESO_1 + aluno.notas[1]*Constantes.PESO_2)/(Constantes.PESO_1+Constantes.PESO_2));
    }
    public static Aluno EncontraMatricula(long matricula, Aluno[] alunos){
        for (int i =0; i<alunos.length; i++){
            if (matricula == alunos[i].matricula){
                return alunos[i];
            }
        }
        return null;
    }
    public static Aluno EncontraMaiorMedia(Aluno[] alunos){
        int posicaoMaiorMedia = 0;
        for(int i=0; i< alunos.length; i++){
            if (alunos[posicaoMaiorMedia].media < alunos[i].media){
                posicaoMaiorMedia = i;
            }
        }
        return alunos[posicaoMaiorMedia];
    }
}
