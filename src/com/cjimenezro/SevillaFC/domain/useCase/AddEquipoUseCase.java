package com.cjimenezro.SevillaFC.domain.useCase;

import com.cjimenezro.SevillaFC.domain.models.Equipo;
import com.cjimenezro.SevillaFC.domain.models.EquipoRepository;

public class AddEquipoUseCase {

    private EquipoRepository equipoRepository;

    public AddEquipoUseCase(EquipoRepository equipoRepository){
        this.equipoRepository=equipoRepository;
    }

    public void execute(Equipo equipo) {
        equipoRepository.save(equipo);
    }

}
