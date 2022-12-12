import java.util.Scanner;

// rde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.



public class DesafioTurno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom Dia!");
        } else if(turno == 'V') {
            System.out.println("Boa Tarde!");
        } else if(turno == 'N') {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }
        
leitor.close();
    }
}
