package example;

public class CarritoDeCompras {
    // Variable total se utilizara para almacenar el total
    public float total;
    /*
     * Variable products es un array que almacenara todo los productos en mi carrito
     * de compras
     */
    public Producto[] productos;
    /*
     * Variable contador sera mi contador y se incremantara cada vez que ingresemos
     * un nuevo producto
     */
    public int contador;

    public CarritoDeCompras() {

        // Variable total alamacena el total de la compra
        this.total = 0;
        // Variable index almacena el ultimo indice del array de los productos.
        this.contador = 0;
        // Varialbe products es un array de tipo Producto que alamacenara objetos
        this.productos = new Producto[100];
    }

    /*
     * Metodo getTotal es un metodo que me realizara la suma de todos los precios en
     * el array productos.
     */
    public float getTotal() {
        /*
         * Iterar en todos los productos utilizando un ciclo for para obtener su precio
         * y sumarlo al total para retornarlo
         */
        for (int i = 0; i < this.contador; i++) {

            this.total = this.total + this.productos[i].precio;
        }
        return this.total;
    }

    /**
     * addProduct pide un producto por parametro el cual agrega al array de
     * productos que tenemos en el ultimo indice
     */
    public void addProduct(Producto p) {

        // Agregamos el producto en el ultimo indice y despues lo incrementamos

        /*
         * Ejemplo 1: primer producto contador se inicia en 0 this.productos[0] = p
         * ,contador se incrementa en 1 entonces contador ahora vale 1
         * _________________________________________________________________________________
         * Ejemplo 2: segundo producto contador es 1 this.productos[1]= p incrementamos
         * contador en 1
         */
        this.productos[this.contador] = p;
        /*
         * Incrementamos el contador de 1 en 1 ,utilizando this.contador++
         * 
         */
        this.contador++;
    }

    public void imprimirListaDeProductos() {
        /**
         * Comenzamos iterando en 0 utilizamos la i como nombre de variable creamos una
         * varialbe llamada p que es de tipo Producto y en el indice i saca un producto
         * y ese produtcto madanda a llamar el metodo imprimirDescripcion().
         */
        for (int i = 0; i < this.contador; i++) {
            // Guardamos el producto en una variable p
            Producto p = this.productos[i];
            /*
             * Mandamos a llamar el metodo imprimirDescripcion() del producto definido en la
             * clase Producto
             */
            p.imprimirDescripcion();
            // Imprimimos unos guiones nadamas para separar es opcional
            System.out.println("_______________________");
        }
    }

}