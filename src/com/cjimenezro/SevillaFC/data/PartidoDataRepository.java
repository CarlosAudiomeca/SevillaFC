package com.cjimenezro.SevillaFC.data;

import com.cjimenezro.SevillaFC.data.local.ArbitroFileLocalDataSource;
import com.cjimenezro.SevillaFC.data.local.PartidoFileLocalDataSource;
import com.cjimenezro.SevillaFC.domain.models.Arbitro;
import com.cjimenezro.SevillaFC.domain.models.ArbitroRepository;
import com.cjimenezro.SevillaFC.domain.models.Partido;
import com.cjimenezro.SevillaFC.domain.models.PartidoRepository;

import java.util.List;

public class PartidoDataRepository implements PartidoRepository {

    private PartidoFileLocalDataSource dataSource;

    public PartidoDataRepository(PartidoFileLocalDataSource partidoFileLocalDataSource){
        this.dataSource=partidoFileLocalDataSource;
    }


    @Override
    public void save(Partido partidos) {
        dataSource.save(partidos);
    }

    @Override
    public List<Partido> getAll() {
        return dataSource.findAll();
    }

    @Override
    public void delete(String idPartido) {
        dataSource.delete(idPartido);
    }
}
