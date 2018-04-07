package productos;

/**
 *
 * @author jorge
 */
public class Productos {

    private String Nombre;
    private int Cantidad;
    private int Precio;

    /**
     */
    
    //Objetos Class
    public Productos(){
        
    }
    public Productos(String pNombre, int pCantidad, int pPrecio){
        this.Nombre = pNombre;
        this.Cantidad = pCantidad;
        this.Precio = pPrecio;
    }
    
    /*public Factura(String nProducto, int Cantidad1, int Precio1){
        private String Proveedor;
        this.Prod
        this.Cantidad = pCantidad;
        this.Precio = pPrecio;
    }*/
    
    //Creando un producto
    Productos p1 = new Productos();
    
    //Getters 
    public String setNombre(){
        return Nombre;
    }
    
    public int setCantidad(){
        return Cantidad;
    }
    
    public int setPrecio(){
        return Precio;
    }
    
    //Setters p1
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.Precio = precio;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
