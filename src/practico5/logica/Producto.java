
package practico5.logica;

/**
 *
 * @author marus
 */
public class Producto {
    private String nombre ;
    private String categoria; 
    private double precio;
    private int codigo;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precio, int codigo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
