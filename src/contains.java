import java.util.Scanner;

public class contains {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String texto = sc.nextLine();


        if(texto.length() > 0){
            System.out.println("Introduce una palabra para buscarla: ");
            String buscarPalabra = sc.nextLine();
            if (texto.toLowerCase().contains(buscarPalabra)){
                System.out.println("la palabra buscada es: " + buscarPalabra);
            }else{
                System.out.println("No se encontro la palabra buscada");
            }
//            System.out.println("La palabra es: " + palabra);
        }else{
            System.out.println("No contiene caracteres, introduce un nuevo texto: ");
            String nuevoTexto = sc.nextLine();
            System.out.println("Este es el nuevo texto: " + nuevoTexto);

//            if(nuevoTexto > 0){
//
//            }
        }


    }
}

//Desarrolla un  programa en Java que solicite al usuario un texto.   Si el texto introducido por el usuario está vacío (no contiene caracteres) el programa termina.  Si el testo introducido por el usuario no está vacío, solicita al usuario una palabra y busca esta palabra en el texto, mostrando por consola si se ha localizado o no.