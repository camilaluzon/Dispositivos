package Dispositivo;

public class Dispositivo {

        public String nombre;
        String tipo;
        public boolean activo;

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
