package com.cjimenezro.SevillaFC.domain.useCase;

import com.cjimenezro.SevillaFC.domain.models.Equipo;
import com.cjimenezro.SevillaFC.domain.models.EquipoRepository;

public class GetEquipoUseCase {

    private EquipoRepository equipoRepository;

    public  GetEquipoUseCase (EquipoRepository equipoRepository){
        this.equipoRepository=equipoRepository;
    }

    public Equipo execute(String equipoId){
        return equipoRepository.getByID(equipoId);
    }

}
