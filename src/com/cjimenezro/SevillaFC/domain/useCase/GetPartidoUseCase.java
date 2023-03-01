package com.cjimenezro.SevillaFC.domain.useCase;

import com.cjimenezro.SevillaFC.domain.models.PartidoRepository;

public class GetPartidoUseCase {

    private PartidoRepository partidoRepository;

    public GetPartidoUseCase (PartidoRepository partidoRepository){
        this.partidoRepository=partidoRepository;
    }

    public void execute(){
        partidoRepository.getAll();
    }

}
