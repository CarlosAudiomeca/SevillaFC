package com.cjimenezro.SevillaFC.domain.useCase;

import com.cjimenezro.SevillaFC.domain.models.Partido;
import com.cjimenezro.SevillaFC.domain.models.PartidoRepository;

public class AddPartidoUseCase {

    private PartidoRepository partidoRepository;

    public AddPartidoUseCase (PartidoRepository partidoRepository){
        this.partidoRepository=partidoRepository;
    }

    public void execute(Partido partido){
        partidoRepository.save(partido);
    }

}
