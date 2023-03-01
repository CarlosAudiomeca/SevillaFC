package com.cjimenezro.SevillaFC.data;

import com.cjimenezro.SevillaFC.data.local.EquipoFileLocalDataSource;
import com.cjimenezro.SevillaFC.domain.models.Equipo;
import com.cjimenezro.SevillaFC.domain.models.EquipoRepository;

public class EquipoDataRepository implements EquipoRepository {

    private EquipoFileLocalDataSource dataSource;

    public EquipoDataRepository (EquipoFileLocalDataSource equipoFileLocalDataSource){
        this.dataSource=equipoFileLocalDataSource;
    }


    @Override
    public void save(Equipo equipo) {
        dataSource.save(equipo);
    }

    @Override
    public Equipo getByID(String idEquipo) {
        return dataSource.findById(idEquipo);
    }
}
