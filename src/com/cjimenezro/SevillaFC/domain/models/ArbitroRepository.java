package com.cjimenezro.SevillaFC.domain.models;

public interface ArbitroRepository {

    public void save(Arbitro arbitro);

    public Arbitro getById(String idArbitro);

}
