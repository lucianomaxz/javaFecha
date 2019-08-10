package Fechas;

public class Fecha{
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

   public void CambiarFecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }


    public void MostrarFechaNumerico(){
        System.out.print("dia: "+dia+" mes: "+mes+" año"+año);
    }

    protected String ArregloMeses[]={" ","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciempre"};

    public void MostrarFechaTexto(){


        System.out.print(dia+" de "+ArregloMeses[mes]+" de "+año);


    }


}
