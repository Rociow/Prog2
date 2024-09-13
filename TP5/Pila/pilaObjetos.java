import java.util.Stack;

public class pilaObjetos {
    Stack <String> libros;

    public pilaObjetos () {
        libros = new Stack<>();
    }

    public static void main(String[] args) {
        pilaObjetos libreria = new pilaObjetos();
        libreria.push("Libro1");

        System.out.println(libreria.pop());
        
    }
}