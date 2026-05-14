public class clsProd {
    //ATRIBUTOS
    private String nomProd;//nombre de producto
    private int cantProd;//cantidad de producto
    private float preProd;//precio de producto

    //CONSTRUCTOR
    public clsProd() {
        this.nomProd = "";
        this.cantProd = 0;
        this.preProd = 0.0f;
    }

    //METODOS
    //set nombre de producto
    public void setNomProd(String nomProd) {
        if (nomProd != null && nomProd != "") {
            this.nomProd = nomProd;
        } else {
            System.out.println("Nombre vacío");
            System.out.println("Intentelo de nuevo!");
        }
    }

    //set cantidad de producto
    public void setCantProd(int cantProd) {
        this.cantProd = cantProd;
    }

    //set preico de producto
    public void setPrecio(float preProd) {
        if (preProd > 0) {
            this.preProd = preProd;
        }else{
            System.out.println("El precio ingresado de producto es invalido");
            System.out.println("Intentelo de nuevo.");
        }
    }

    //venta
    public void venta(int cantProd){
        if ( this.cantProd > cantProd) {
            //reducimos la cantiadad
            this.cantProd = this.cantProd - cantProd;
            System.out.println("venta realizada con exito.");
        }else {
            System.out.println("lo siento tu venta no peude realzarce por falta de stock en el producto.");
        }
    }

    //mostrar producto (get general pero no devolvera nada.)
    public void mostProd(){
        System.out.println("Nombre: "+nomProd);
        System.out.println("Precio: "+preProd);
        System.out.println("Cantidad: "+cantProd);
    }
}
