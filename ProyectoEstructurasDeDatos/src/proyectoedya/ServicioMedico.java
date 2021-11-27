/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedya;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class ServicioMedico {
    
    String tipo;
    private LocalDate fechaValida;
    double costoTotal;
    String RangoSalarial;

    public ServicioMedico(String tipo, LocalDate fechaValida, double costoTotal, String RangoSalarial) {
        this.tipo = tipo;
        this.fechaValida = fechaValida;
        this.costoTotal = costoTotal;
        this.RangoSalarial= RangoSalarial;
    }

    
    
     public double calcularCoPago(){
            double Copago = 0;
            
        if (tipo.equalsIgnoreCase("Cirugia")||tipo.equalsIgnoreCase("Hospitalizacion")){

            if(RangoSalarial.equalsIgnoreCase("Rango salarial 1")){

                Copago =costoTotal*0.115;
                if(Copago>260747)
                    Copago=260747;
            }else if(RangoSalarial.equalsIgnoreCase("Rango salarial 2") ){

                Copago =costoTotal*0.173;
                if(Copago>1044805)
                    Copago=1044805;
            
            }else if( RangoSalarial.equalsIgnoreCase("Rango salarial 3")){

                Copago =costoTotal*0.23;
                if(Copago>2089610)
                    Copago=2089610;

            }
         }
        
        
        return Math.round(Copago);
    }
     
    
     
     
     
     
    public double calcularCuotaModeradoraCotizante(){
       
         double CuotaModeradora = 0;
  
          if( RangoSalarial.equalsIgnoreCase("Rango salarial 1") ){
            CuotaModeradora =3500;
        }else if( RangoSalarial.equalsIgnoreCase("Rango salarial 2")){
            CuotaModeradora =14000;
        }else if(RangoSalarial.equalsIgnoreCase("Rango salarial 3")){
            CuotaModeradora =36800;
        }
        
        return CuotaModeradora;
    }
    
     public double calcularCuotaModeradoraBeneficiario(){
       
         double CuotaModeradora = 0;
        
           if(tipo.equalsIgnoreCase("Consulta medica general")||tipo.equalsIgnoreCase("Consulta medica especialista")){
               
                 if( RangoSalarial.equalsIgnoreCase("Rango salarial 1") ){
            CuotaModeradora =3500;
        }else if( RangoSalarial.equalsIgnoreCase("Rango salarial 2")){
            CuotaModeradora =14000;
        }else if(RangoSalarial.equalsIgnoreCase("Rango salarial 3")){
            CuotaModeradora =36800;
        }
           }else{
               CuotaModeradora=0;
           }
        
        
        return CuotaModeradora;
    }
    
        

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaValida() {
        return fechaValida;
    }

    public void setFechaValida(LocalDate fechaValida) {
        this.fechaValida = fechaValida;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return " ServicioMedico:  " + "tipo: " + tipo + 
                ", fechaValida: " + fechaValida + 
                ", costoTotal: " + costoTotal;
         
    }
      
   
 
    
    
    
}
