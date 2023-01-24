import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //GradeBook cursoJava = new GradeBook();

        System.out.println("Quantidade ded alunos");
        Scanner input = new Scanner(System.in);
        double [] notasDoCurso = new double[input.nextInt()];
        System.out.println("Digite as notas do curso");
        for(int i=0;i< notasDoCurso.length;i++){
            System.out.printf("Digite a nota do aluno %d: ",i+1);
            notasDoCurso[i]= input.nextDouble();
        }
        GradeBook cursoJava = new GradeBook("Curso Java",notasDoCurso);
        System.out.printf("Nome do curso:%s%n",cursoJava.getNomeCurso());
        System.out.printf("Média do curso:%.2f%n",cursoJava.getMediaTurma());
        System.out.printf("Menor nota do curso:%s%n",cursoJava.getMenorNota());


    }
}