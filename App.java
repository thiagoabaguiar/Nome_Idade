import java.util.Scanner;

// 1º CRIAR A CLASSE DA APLICAÇÃO
public class App{

    // 2º CRIAR O MÉTODO MAIN
    public static void main(String[] args){

        // 3º DECLARAR AS VARIÁVEIS
        Scanner scan = new Scanner(System.in); // apenas criando a variável do tipo Scanner para ter acesso aos métodos dessa classe
        String nameStudent = new String();
        int ageStudent;
        
        
        while (true){
            System.out.println("Digite o nome do aluno (digite 0 para ESC): ");
            nameStudent = scan.next();
            if (nameStudent.equals("0")) break;
            System.out.println("Digite a idade do aluno:");
            ageStudent = scan.nextInt();           
            System.out.println("O(a) " + nameStudent + " tem " + ageStudent + " anos.");
            scan.close();
        }

    }

}