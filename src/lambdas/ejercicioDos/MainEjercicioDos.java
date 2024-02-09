package lambdas.ejercicioDos;

import java.util.ArrayList;
import java.util.List;

public class MainEjercicioDos {
    public static void main(String[] args) {
        Curriculum curriculum = new Curriculum(
                "Pepe",
                "García",
                "Juan",
                18,
                new ArrayList<>(List.of("Excel, Java, Rust"))
        );
        LibroPDF libroPDF = new LibroPDF(
                "Narnia",
                "Batman",
                "Fantasia",
                20
        );
        Informe informe = new Informe(
                "Hola mundo!",
                "David",
                "Martin",
                15
        );

        Imprimible.imprimir(informe);
        Imprimible.imprimir(libroPDF);
        Imprimible.imprimir(curriculum);
    }
}

interface Imprimible{
    public static String imprimir(Documento documento) { // Con generic no anda --> preguntar
        System.out.println(documento.toString());
        return documento.toString();
    }
}


class Documento {
    private String nombreAutor;

    public Documento(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
}

class Curriculum extends Documento{
    String nombre;
    String apellido;
    int edad;
    ArrayList<String> habilidades;

    public Curriculum(String nombreAutor, String nombre, String apellido, int edad, ArrayList<String> habilidades) {
        super(nombreAutor);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", habilidades=" + habilidades +
                '}';
    }
}

class LibroPDF extends Documento{
    String titulo;
    String genero;
    int cantidadPaginas;

    public LibroPDF(String nombreAutor, String titulo, String genero, int cantidadPaginas) {
        super(nombreAutor);
        this.titulo = titulo;
        this.genero = genero;
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public String toString() {
        return "LibroPDF{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", cantidadPaginas=" + cantidadPaginas +
                '}';
    }
}

class Informe extends Documento {
    String texto;
    String nombreRevisor;
    int cantidadPaginas;

    public Informe(String nombreAutor, String texto, String nombreRevisor, int cantidadPaginas) {
        super(nombreAutor);
        this.texto = texto;
        this.nombreRevisor = nombreRevisor;
        this.cantidadPaginas = cantidadPaginas;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "texto='" + texto + '\'' +
                ", nombreRevisor='" + nombreRevisor + '\'' +
                ", cantidadPaginas=" + cantidadPaginas +
                '}';
    }
}