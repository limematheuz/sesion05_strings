import java.util.Scanner;

public class upper_lower_case {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("Esta frase en lower: " + frase.toLowerCase());
        System.out.println("Esta frase en upper: " + frase.toUpperCase());

    }
}
