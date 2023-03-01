package com.cjimenezro.SevillaFC.domain.useCase;

import com.cjimenezro.SevillaFC.domain.models.Arbitro;
import com.cjimenezro.SevillaFC.domain.models.ArbitroRepository;

public class GetArbitroUseCase {

    private ArbitroRepository arbitroRepository;

    public GetArbitroUseCase(ArbitroRepository arbitroRepository){
        this.arbitroRepository=arbitroRepository;
    }

    public Arbitro execute(String arbitroId){
        return arbitroRepository.getById(arbitroId);
    }

}
