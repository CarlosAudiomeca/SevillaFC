package com.cjimenezro.SevillaFC.data;

import com.cjimenezro.SevillaFC.data.local.ArbitroFileLocalDataSource;
import com.cjimenezro.SevillaFC.domain.models.Arbitro;
import com.cjimenezro.SevillaFC.domain.models.ArbitroRepository;

public class ArbitroDataRepository implements ArbitroRepository {

    private ArbitroFileLocalDataSource dataSource;

    public ArbitroDataRepository (ArbitroFileLocalDataSource arbitroFileLocalDataSource){
        this.dataSource=arbitroFileLocalDataSource;
    }

    @Override
    public void save(Arbitro arbitro) {
        dataSource.save(arbitro);
    }

    @Override
    public Arbitro getById(String idArbitro) {
        return dataSource.findById(idArbitro);
    }
}
