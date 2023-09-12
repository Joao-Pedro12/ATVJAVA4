import java.util.Scanner;
public class main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        loginA a = new loginA();
        loginP p = new loginP();



        System.out.print("Digite 1 para cadastrar um Aluno:\n");
        System.out.print("Digite 2 para cadastrar um Professor:");

        int resp = sc.nextInt();

        switch (resp){
            case 1:
                System.out.println("Digite seu nome: ");
                a.setNome(sc.next());

                System.out.println("Digite sua idade: ");
                a.setIdade(sc.nextInt());

                System.out.print("Digite a nota 1: ");
                a.setN1(sc.nextDouble());

                System.out.print("Digite a nota 2: ");
                a.setN2(sc.nextDouble());
                a.calcmedia();

                System.out.println("A média do aluno é: " +a.getMedia()  );





                break;
            case 2:

                System.out.print("Nome Professor: ");
                p.setNome(sc.next());

                System.out.print("Idade Professor: ");
                p.setIdade(sc.nextInt());

                System.out.print("Sua especialização: ");
                p.setEspecialização(sc.next());

                System.out.print("Seu salário: ");
                p.setSalário(sc.nextDouble());



                break;
            default:
                System.out.print("Opção Inválida");
        }


    }

}
