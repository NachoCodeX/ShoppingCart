
/*
    Necesitamos importar Producto y Carrito de compras 
    para poder utilizarlos correctamente

*/
import example.Producto;
import example.CarritoDeCompras;

public class Main {

    public static void main(String[] args) {
        // Intancia del Carrito y lo guardamos en una variable cart
        CarritoDeCompras cart = new CarritoDeCompras();
        // Creamos un producto y lo almacenamos en la variable p1
        Producto p1 = new Producto("Producto 1", 15f, 10, 0);
        Producto p2 = new Producto("Producto 2", 150f, 10, 0);
        // utilizamos el metodo definido en CarritoDeCompras utilizando la variable cart
        cart.addProduct(p1);
        cart.addProduct(p2);
        // imprimimos el total es un metodo del shopping cart
        System.out.println("Total: " + cart.getTotal());
    }

}