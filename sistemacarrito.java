public class sistemacarrito {
    public static void main(String[] args) {
        AgregarCarrito();




    }



    }
    //metodo agregar al carrito
    public static void AgregarCarrito(){
        for (int i = 0 ; i < int listaproductos.length; i++) {
            listaproductos[i] = numero_randomc;
            System.out.println(i)
        }

    }

    //metodo largo carrito
    public static int Generarnum_carrito(){
        int numero_randomc = (int)(Math.random()*20 + 1);
        return numero_randomc;
    }

    //metodo numero de productos
    public static  int Generarnum_productos(){
        int numero_randomp = (int)(Math.random()*15 );
        return numero_randomp;
    }

    //intento
    public static int CalcularPrecioP() {
        for (int i = 0 ; i <= listaproductos.length; i++){
            listaproductos[i] = 150 * (i+1);
            return

    }
}
