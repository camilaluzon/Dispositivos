package dispositivo;

public class dispositivo {

        public String nombre;
        String tipo;
        public boolean activo;

        public void mostrarInformacion() {
            System.out.println("Nombre: "+nombre);
            System.out.println("Tipo: "+tipo);
            System.out.println("Tipo: "+activo);
        }

        void mostrarEstado(){
            System.out.println("Estado: " + activo);
        }
    }
