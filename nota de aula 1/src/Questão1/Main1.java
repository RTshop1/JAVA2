package Questão1;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno();


        System.out.println("Digite o nome do aluno");
        a.nome = sc.nextLine();
        System.out.println(a.nome);

        System.out.println("Digite a primeira nota");
        a.nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota");
        a.nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota");
        a.nota3 = sc.nextDouble();

        a.calcule_a_media();

        System.out.printf("%.1f", a.media);

        if (a.media >=7) {
            System.out.println(" Aprovado! ");
        }else if (a.media >= 4){
            System.out.println(" Final ");
        } else {
            System.out.println(" Reprovado! ");


        }






    }
}
