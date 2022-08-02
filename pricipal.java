import java.util.Scanner;

public class pricipal {
    public static void main(String[] args) {
        int ant, at, prox;
        int i;
        Scanner n = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int namber = n.nextInt();
        Scanner n2 = new Scanner(System.in);
        System.out.print("Digite o número que você procura:  ");
        int namber2 = n2.nextInt();


        ant = 0;
        at = 1;
        System.out.println(ant);
        System.out.println(at);
        if(namber2 == ant){
            System.out.println("O número " + namber2 +" está na sequência Fibonacci");
            return;
        } else if (namber2 == at) {
            System.out.println("O número " + namber2 +" está na sequência Fibonacci");
            return;
        }

        for(i = 0; i< namber-2 ; i++){
            prox  = ant + at;
            ant = at;
            at = prox;
            System.out.println(prox );
            if(namber2 == prox){
                System.out.println("O número " + namber2 +" está na sequência Fibonacci");
                return;
            }

        }
        System.out.println("O número não está na sequência Fibonacci");

    }
}
