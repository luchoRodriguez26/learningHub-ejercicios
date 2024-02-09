package poo;

public class PooParteUnoEjercitacion {
    // Al momento de crear la clase Automovil se han cometido algunos errores en su diseño.
    // ¿Puedes identificarlos y corregirlos siguiendo lo que has aprendido acerca de ellas?

    public class Automovil {

        String marca;
        String color;
        double kilometros;

        // Borre el constructor vacio porque esta definido implicitamente

        public Automovil(String marca, String color, double kilometros) {
            this.marca = marca;
            this.color = color;
            this.kilometros = kilometros;
        }

        public String mostrarMarcaYColor() {
            String marcaYColor = "La marca del auto es: " + this.marca + ". El color del auto es: " + this.color;
            return marcaYColor;

        }
    }

}
