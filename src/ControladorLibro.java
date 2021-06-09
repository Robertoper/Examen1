import java.util.Scanner;

public class ControladorLibro {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("CREADOR DE ETIQUETAS");
        System.out.println("Introduzca que tipo de informacion es(0=novela, 1=poesia, 2=diccionario)");
        int categoria=teclado.nextInt();
        System.out.print("Introduzca el nombre del titulo: ");
        String titulo=teclado.next();
        System.out.print("Introduzca el nombre del autor: ");
        String autor=teclado.next();
        Libro.setCategoria(categoria);
        Libro.setAutor(autor);
        Libro.setTitulo(titulo);
        if (categoria==0){
            System.out.println("NOV");
        }
    }
}
