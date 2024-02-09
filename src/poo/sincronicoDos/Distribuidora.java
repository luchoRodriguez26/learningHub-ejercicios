package poo.sincronicoDos;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    private List<Producto> productos = new ArrayList<>();

    public List<Producto> getProductos() {
        return productos;
    }

    public void precioTotal () {
        double precioFinal = 0.0;
        for(Producto producto : productos) {
            System.out.println(producto.getNombre() + " costó: " + producto.getPrecio());
            precioFinal += producto.getPrecio();
        };
        System.out.println("Precio final: " + precioFinal);
    }
}
