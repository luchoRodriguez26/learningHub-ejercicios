package ejerciciosIntegradores.elEconomico;

import java.util.List;

public class Factura {
    private Cliente cliente;
    private List<Item> items;

    public Factura(Cliente cliente, List<Item> items) {
        this.cliente = cliente;
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotalCompra () {
        return this.items.stream().mapToDouble(Item::getCostoTotal).sum();
    }
}
