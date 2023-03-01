package com.cjimenezro.SevillaFC.domain.models;

public class Medico extends Persona {

    private String especialidad;

    //Funciones

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
