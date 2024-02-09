package ejerciciosIntegradores.elEconomico;

public class Item {
    private int codigo;
    private String nombre;
    private Double costoUnitario;
    private int cantidadComprada; // ??

    public Item(int codigo, String nombre, Double costoUnitario, int cantidadComprada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.costoUnitario = costoUnitario;
        this.cantidadComprada = cantidadComprada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public double getCostoTotal () {
        return this.getCostoUnitario() * this.getCantidadComprada();
    }
}
