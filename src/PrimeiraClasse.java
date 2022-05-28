import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deseja calcular a média: ");
        String recalcular = scanner.next();
        while (recalcular.equals("Sim")){
            System.out.print("Digite a primeira nota: ");
            float nota1 = scanner.nextFloat();
            System.out.print("Digite a segunda nota: ");
            float nota2 = scanner.nextFloat();
            System.out.print("Digite a terceira nota: ");
            float nota3 = scanner.nextFloat();
            System.out.print("Digite a quarta nota: ");
            float nota4 = scanner.nextFloat();
            AlunoClasse alunoClasse = new AlunoClasse(nota1, nota2, nota3, nota4);
            float media = alunoClasse.calcularMedia();
            String statusAluno = alunoClasse.getStatusAluno(media);
            System.out.println(statusAluno);
            System.out.print("Deseja calcular outra média: ");
            recalcular = scanner.next();
        }
    }
}
