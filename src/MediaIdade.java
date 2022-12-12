// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int soma = 0;
        double media = 0;

        System.out.println("Aluno 1, digite sua idade:");
        int idade1 = leitor.nextInt();
        soma += idade1;
        System.out.println("Aluno 2, digite sua idade:");
        int idade2 = leitor.nextInt();
        soma += idade2;
        System.out.println("Aluno 3, digite sua idade:");
        int idade3 = leitor.nextInt();
        soma += idade3;

        media = soma / 3;

        if ((media>=0)&&(media<=25)){
            System.out.println("Jovem!");
        } else if ((media>=26)&&(media<=60)) {
            System.out.println("Adulta!");
        } else if (media>60) {
            System.out.println("Idosa!");
        }

        leitor.close();
       
    }
}