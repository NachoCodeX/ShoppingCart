// declarar el paquete
package example;

// Clase producto 
public class Producto {
    // Variable de tipo string para almacenar el nombre del producto.
    public String nombre;
    // Variable de tipo de float para almacenar el precio del producto.
    public float precio;
    // Variable de tipo entero para almacenar la cantidad del producto en stock.
    public int cantidad;
    // Variable de tipo entero para almacenar el descuento del producto.
    public int descuento;

    // Contructor del Producto para inicializar todas las variables.
    public Producto(String nombre, float precio, int cantidad, int descuento) {
        /*
         * Alamcenamos el nombre que pasamos por parametro en el atributo de la clase
         * this.nombre
         */
        this.nombre = nombre;
        /*
         * Alamcenamos el precio que pasamos por parametro en el atributo de la clase
         * this.precio
         */
        this.precio = precio;
        /*
         * Alamcenamos el cantidad que pasamos por parametro en el atributo de la clase
         * this.cantidad
         */
        this.cantidad = cantidad;
        /*
         * Alamcenamos el descuento que pasamos por parametro en el atributo de la clase
         * this.descuento
         */
        this.descuento = descuento;
    }

    public void imprimirDescripcion() {
        System.out.println("Product's name: " + this.nombre);
        System.out.println("Product's price: " + this.precio);
        System.out.println("Product's quantity: " + this.cantidad);
        System.out.println("Product's discount: " + this.descuento);
    }
}