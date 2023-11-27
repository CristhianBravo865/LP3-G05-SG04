package Lab10;

import java.util.Objects;

// Clase Producto
class Producto {
    private String codigo;
    private String descripcion;
    private double precio;

    public Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Producto [Código=" + codigo + ", Descripción=" + descripcion + ", Precio=" + precio + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return codigo.equals(producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion, precio);
    }

}