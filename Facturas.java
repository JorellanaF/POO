package facturas;

/**
 *
 * @author jorge
 */
public class Facturas {
    private String Proveedor;
    private String Producto;
    private int Cantidad;
    private int Precio;

    /**
     */
    
    //Objetos Class
    public Facturas(){
        
    }
    public Facturas(String fProveedor,String fProducto, int fCantidad, int fPrecio){
        this.Proveedor = fProveedor;
        this.Producto = fProducto;
        this.Cantidad = fCantidad;
        this.Precio = fPrecio;
    }
   
    //Creando un producto
    Facturas p1 = new Facturas();
    
    //Getters 
    public String setProveedor(){
        return Proveedor;
    }
    
    public String setProducto(){
        return Producto;
    }
    
    public int setCantidad(){
        return Cantidad;
    }
    
    public int setPrecio(){
        return Precio;
    }
    
    //Setters p1
    public void setProveedor(String proveedor) {
        this.Proveedor = proveedor;
    }
    
    public void setProducto(String producto) {
        this.Producto = producto;
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
