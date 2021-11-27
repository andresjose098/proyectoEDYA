/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedya;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PacienteBeneficiario extends Paciente {
    
    private String tipoIdentificacion;
     private int id_cotizante;
     
     

    public PacienteBeneficiario(String tipoIdentificacion, int numeroRegistro, int numeroIdentidad, String nombre, ArrayList<ServicioMedico> suServicioMedico, String RangoSalarial, int Cotizante) {
        super(numeroRegistro, numeroIdentidad, nombre, suServicioMedico);
        this.tipoIdentificacion = tipoIdentificacion;
        this.susServiciosMedicos= suServicioMedico;
        this.RangoSalarial = RangoSalarial;
                this.id_cotizante = Cotizante;

    }

    public PacienteBeneficiario(String tipoIdentificacion, int Cotizante, int numeroRegistro, int numeroIdentidad, String nombre,String RangoSalarial) {
        super(numeroRegistro, numeroIdentidad, nombre);
        this.tipoIdentificacion = tipoIdentificacion;
        this.id_cotizante = Cotizante;
         this.RangoSalarial = RangoSalarial;
    }
    public PacienteBeneficiario(String tipoIdentificacion, int numeroRegistro, int numeroIdentidad, String nombre,String RangoSalarial, int Cotizante) {
        super(numeroRegistro, numeroIdentidad, nombre);
        this.tipoIdentificacion = tipoIdentificacion;
        susServiciosMedicos= new ArrayList<>();
         this.RangoSalarial = RangoSalarial;
                 this.id_cotizante = Cotizante;

    }
    



    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    @Override
    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    @Override
    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public int getNumeroIdentidad() {
        return numeroIdentidad;
    }

    @Override
    public void setNumeroIdentidad(int numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public ArrayList<ServicioMedico> getSusServiciosMedicos() {
        return susServiciosMedicos;
    }
    @Override
    public void setSusServiciosMedicos(ArrayList<ServicioMedico> susServiciosMedicos) {
        this.susServiciosMedicos = susServiciosMedicos;
    }


    @Override
    public String toString() {
        String res = "PacienteBeneficiario:  " + "tipoIdentificacion: " + tipoIdentificacion +
                      " id Cotizante: "+id_cotizante + super.toString();
        
        for (int i = 0; i < susServiciosMedicos.size(); i++)
            res += "\n" + (i+1) + ". " + susServiciosMedicos.get(i).toString();
                    
        return res;
    }
    
    
    
}
