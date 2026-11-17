import java.util.Scanner;

public class search_book {
    public static void main(String[] args) {
        String[] catalogo = {
                "Los muertos vivientes",
                "Brevísima historia del tiempo",
                "La clave secreta del universo",
                "Mi universo",
                "Patria",
                "De mayor quiero ser feliz",
                "Empieza por los zapatos"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el título del libro: ");
        String busqueda = scanner.nextLine();


        boolean encontrado = false;


        for (String libro : catalogo) {

            if (libro.equalsIgnoreCase(busqueda)) {
                encontrado = true;
                break;
            }
        }


        if (encontrado) {
            System.out.println("El libro sí existe en el catálogo.");
        } else {
            System.out.println("El libro no existe en el catálogo.");
        }

    }
}


//
//Completa el siguiente programa en Java que dispone de la colección de libros de una biblioteca, para que solicite al usuario el título de un libro, y le devuelva si existe en el catálogo o no. En la siguiente imagen se muestra un ejemplo de ejecución del programa: Hint: Nos gustaría que si el usuario introduce “los muertos vivientes” y en el catálogo el título del libro está registrado como “Los muertos vivientes”, el resultado de la búsqueda sea positivo. Es decir, nos interesa que no se tenga en cuenta mayúsculas/minúsculas en la búsqueda.   Para conseguir esto la clase String dispone de, además del método equals, del método equalsIgnoreCase