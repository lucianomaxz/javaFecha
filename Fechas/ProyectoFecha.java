package Fechas;

public class ProyectoFecha {
    public static void main(String[]args){
        Fecha fecha=new Fecha(6,3,2019);

        fecha.MostrarFechaNumerico();
        System.out.println();
        fecha.MostrarFechaTexto();
        System.out.println();



        fecha.CambiarFecha(8,5,2020);

        System.out.println();
        fecha.MostrarFechaNumerico();
        System.out.println();
        fecha.MostrarFechaTexto();
        System.out.println();

    }
}
