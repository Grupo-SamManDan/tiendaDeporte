package es.tienda.modelos;

public class Proveedor extends Persona {

    public enum TipoProveedor {
        SERVICIO, RECURSOS, FABRICANTE
    }

    private TipoProveedor tipoProveedor;

    public Proveedor(String nombre, String apellidos, String dni, TipoProveedor tipoProveedor) {
        super(nombre, apellidos, dni);
        this.tipoProveedor = tipoProveedor;
    }

    public static Proveedor alta(String nombre, String apellidos, String dni, TipoProveedor tipoProveedor) {
        return new Proveedor(nombre, apellidos, dni, tipoProveedor);
    }

    public TipoProveedor getTipoProveedor() { return tipoProveedor; }
    public void setTipoProveedor(TipoProveedor tipoProveedor) { this.tipoProveedor = tipoProveedor; }

    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("DNI: " + getDni());
        System.out.println("Tipo proveedor: " + tipoProveedor );
    }
}