package Dispositivo;

public class Main {
    public static void main(){
        Dispositivo disp1 = new Dispositivo();
        Dispositivo disp2 = new Dispositivo();
        disp1.nombre="Telefono";
        disp2.nombre="Computadora";
        disp1.tipo="movil";
        disp2.tipo="de escritorio";
        disp1.activo=true;
        disp2.activo=false;

        disp1.mostrarInformacion();
        disp1.mostrarEstado();

        disp2.mostrarInformacion();
        disp2.mostrarEstado();
    }
}
