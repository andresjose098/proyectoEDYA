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
public class PacienteCotizante extends Paciente {
    
    private double salario;
    private int celular;

    public PacienteCotizante(double salario, int celular, int numeroRegistro, int numeroIdentidad, String nombre, ArrayList<ServicioMedico> suServicioMedico) {
        super(numeroRegistro, numeroIdentidad, nombre, suServicioMedico);
        this.salario = salario;
        this.celular = celular;
        this.susServiciosMedicos= suServicioMedico;
    }

    public PacienteCotizante(double salario, int celular, int numeroRegistro, int numeroIdentidad, String nombre) {
        super(numeroRegistro, numeroIdentidad, nombre);
        this.salario = salario;
        this.celular = celular;
        susServiciosMedicos= new ArrayList<>();
    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    /**
     *
     * @return
     */
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
    public String getRangoSalarial(){
        return CalcularRangosalarial(salario);
    }
    

  
    

    @Override
    public String toString() {
        String res = " PacienteCotizante:  " + "salario: " + salario + 
                ", celular: " + celular +super.toString();
        
        for (int i = 0; i < susServiciosMedicos.size(); i++)
            res += "\n" + (i+1) + ". " + susServiciosMedicos.get(i).toString();
        
        return res;
    }
    
    
    
}
