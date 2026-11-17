public class substring {
       public static void main(String[] args) {
           String path = "home/user/index.html";
           int dot = path.indexOf('.');
           int barra = path.lastIndexOf('/');
           String extension = path.substring(dot + 1 );
           String archivo = path.substring(barra + 1,  dot);

           System.out.println(extension);

           System.out.println(archivo);

       }
}


