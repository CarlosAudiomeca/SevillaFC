package com.cjimenezro.SevillaFC.domain.models;

public interface EquipoRepository {

    public void save(Equipo equipos);

    public Equipo getByID(String idEquipo);

}
