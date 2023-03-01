package com.cjimenezro.SevillaFC.domain.useCase;

import com.cjimenezro.SevillaFC.domain.models.Arbitro;
import com.cjimenezro.SevillaFC.domain.models.ArbitroRepository;

public class AddArbritroUseCase {

    private ArbitroRepository arbitroRepository;

    public AddArbritroUseCase(ArbitroRepository arbitroRepository){
        this.arbitroRepository=arbitroRepository;
    }

    public void  execute(Arbitro arbitro){
        arbitroRepository.save(arbitro);
    }

}
