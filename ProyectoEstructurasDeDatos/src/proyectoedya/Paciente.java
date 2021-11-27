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
public class Paciente {
    
    protected int numeroRegistro;
    protected int numeroIdentidad;
    protected String nombre;
    protected  ArrayList<ServicioMedico> susServiciosMedicos;
    protected String RangoSalarial;

    public Paciente(int numeroRegistro, int numeroIdentidad, String nombre, ArrayList<ServicioMedico> susServiciosMedicos) {
        this.numeroRegistro = numeroRegistro;
        this.numeroIdentidad = numeroIdentidad;
        this.nombre = nombre;
        this.susServiciosMedicos = susServiciosMedicos;
    }

    public Paciente(int numeroRegistro, int numeroIdentidad, String nombre) {
        this.numeroRegistro = numeroRegistro;
        this.numeroIdentidad = numeroIdentidad;
        this.nombre = nombre;
        this.susServiciosMedicos = susServiciosMedicos;
    }

    public String getRangoSalarial() {
        return RangoSalarial;
    }

   public String CalcularRangosalarial(double salario){
        String res="";
        
      if(salario<=1817051){
            res="Rango salarial 1";
        }else if(salario>=1817052 && salario<=4542631){
           res="Rango salarial 2";
        }else if(salario>=4542632){
            res="Rango salarial 3";
        }
      RangoSalarial = res;
        
        return res;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public int getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(int numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ServicioMedico> getSusServiciosMedicos() {
        return susServiciosMedicos;
    }

    public void setSusServiciosMedicos(ArrayList<ServicioMedico> susServiciosMedicos) {
        this.susServiciosMedicos = susServiciosMedicos;
    }

  

    @Override
    public String toString() {
        String res = " numeroRegistro: " + numeroRegistro + 
                ", numeroIdentidad: " + numeroIdentidad + 
                ", nombre: " + nombre + 
                ",numero de servicios medicos solicitados: " +susServiciosMedicos.size(); 
        
        return res;
    }
     
    
    
}
