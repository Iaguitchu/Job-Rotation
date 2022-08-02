import java.util.Scanner;

public class Inverte_String {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite a palavra a ser invertida: ");
        String string = n.next();
        String string2 = "";

        for(int i = string.length() - 1; i >= 0; i --){
            string2 = string2 +string.charAt(i);
        }
        System.out.println(string2);
    }
}
