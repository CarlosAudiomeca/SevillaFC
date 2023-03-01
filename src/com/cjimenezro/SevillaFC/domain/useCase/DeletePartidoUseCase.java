package com.cjimenezro.SevillaFC.domain.useCase;

import com.cjimenezro.SevillaFC.domain.models.Partido;
import com.cjimenezro.SevillaFC.domain.models.PartidoRepository;

public class DeletePartidoUseCase {

    private PartidoRepository partidoRepository;

    public DeletePartidoUseCase(PartidoRepository partidoRepository){
        this.partidoRepository=partidoRepository;
    }

    public void execute(String partidoId){
        partidoRepository.delete(partidoId);
    }

}
