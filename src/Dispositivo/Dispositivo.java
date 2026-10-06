package Dispositivo;

public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

    public void setNombre(String nombre){
        if (nombre !=null && !nombre.isBlank()){
            this.nombre = nombre;
        }
    }
    public void setTipo(String tipo){
        if (tipo !=null && !tipo.isBlank()){
            this.tipo = tipo;
        }
    }
    public void setActivo(boolean activo){
        this.activo = activo;
    }

    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public boolean isActivo(){
        return activo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: "+tipo);
        System.out.println("Tipo: "+activo);
    }

    void mostrarEstado(){
        String estado = activo?"estado activo":"estado inactivo";
        System.out.println(nombre+" "+activo);
    }

    void activar(){
        if (activo==false){
            activo=true;
            System.out.println(nombre+ "ha sido activado");
        }
    }
}
