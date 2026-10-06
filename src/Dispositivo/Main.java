package Dispositivo;

public class Main {
    static void main() {
        Dispositivo disp1 = new Dispositivo();
        Dispositivo disp2 = new Dispositivo();
        disp1.setNombre("Telefono");
        disp2.setNombre("Computadora");
        disp1.setTipo("movil");
        disp2.setTipo("de escritorio");
        disp1.setActivo(true);
        disp2.setActivo(false);

        disp1.activar();
        disp1.mostrarInformacion();
        disp1.mostrarEstado();

        disp2.activar();
        disp2.mostrarInformacion();
        disp2.mostrarEstado();
    }
}
