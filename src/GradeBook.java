public class GradeBook {
    private String nomeCurso;
    double [] notasAlunos;

    public GradeBook(String nomeCurso,double[]notasAlunos){
        this.nomeCurso=nomeCurso;
        this.notasAlunos = notasAlunos;
    }
    public String getNomeCurso(){
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getMediaTurma(){
        double somaNotas = 0;
        for(double nota : notasAlunos){
            somaNotas+= nota;
        }
        return somaNotas/notasAlunos.length;
    }
    public double getMenorNota() {
        double menorNota = notasAlunos[0];
        for (double nota : notasAlunos) {
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        return menorNota;
    }
    public double getMaiorNota(){
        double maiorNota = notasAlunos[0];
        for(double nota : notasAlunos){
            if(nota>maiorNota){
                maiorNota=nota;
            }
        }
        return maiorNota;
    }

    public void getDistribuicaodeNotas(){
        int[] faixaDeNotas = new int[10];

    for(double nota : notasAlunos){
        if(nota>=0.0 && nota<1.0){
            faixaDeNotas[0]++;
        } else if (nota>=1.0 && nota<2.0) {
            faixaDeNotas[1]++;
        } else if (nota>=2.0 && nota<3.0) {
            faixaDeNotas[2]++;
        } else if (nota>=3.0 && nota<=4.0) {
            faixaDeNotas[3]++;
        } else if (nota>4.0 && nota<=5.0) {
            faixaDeNotas[4]++;
        } else if (nota>5.0 && nota<=6.0) {
            faixaDeNotas[5]++;
        } else if (nota>6.0 && nota<=7.0) {
            faixaDeNotas[6]++;
        } else if (nota>7.0 && nota<=8.0) {
            faixaDeNotas[7]++;
        } else if (nota>8.0 && nota<=9.0) {
            faixaDeNotas[8]++;
        }else{
            faixaDeNotas[9]++;
        }
    }
        mostraDistribuicaoNotas(faixaDeNotas);
 }
    private void mostraDistribuicaoNotas(int[] faixaDeNotas) {
        for(int i = 0; i< faixaDeNotas.length;i++){
            System.out.printf("Quantidade de notas na faixa entre %d e %d : %d%n",i , i+1,faixaDeNotas[i]);
        }
    }
}
