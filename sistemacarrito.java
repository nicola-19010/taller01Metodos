public class sistemacarrito {
    public static void main(String[] args) {

        for (int i = 0 ; i <= listaproductos.length; i++){
            listaproductos[i] = 500 + (150 * (i));



    }



    }

    public static void MostrarCantitadProductos(){
        System.out.println();

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
}
