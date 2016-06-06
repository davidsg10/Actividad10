package mainPackage;

public class Producto {

    int idProducto;
    String Nombre;
    String Marca;
    String Cantidad;

    public Producto(int idProducto, String Nombre, String Marca, String Cantidad) {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Cantidad = Cantidad;
    }

    public void setCodigo(int noC) {
        this.idProducto = noC;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setMarca(String marca) {
        this.Nombre = marca;
    }

    public void setCantidad(String cant) {
        this.Cantidad = cant;
    }

    public int getCodigo() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getMarca() {
        return this.Marca;
    }

    public String getCantidad() {
        return this.Cantidad;
    }

    public String[] getFilas() {
        String[] fila = new String[4];

        fila[0] = String.valueOf(idProducto);
        fila[1] = Nombre;
        fila[2] = Marca;
        fila[3] = Cantidad;
        return fila;
    }

}
