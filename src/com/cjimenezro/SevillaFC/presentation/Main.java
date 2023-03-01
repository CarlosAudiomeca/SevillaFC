package com.cjimenezro.SevillaFC.presentation;

import com.cjimenezro.SevillaFC.data.ArbitroDataRepository;
import com.cjimenezro.SevillaFC.data.EquipoDataRepository;
import com.cjimenezro.SevillaFC.data.PartidoDataRepository;
import com.cjimenezro.SevillaFC.data.local.ArbitroFileLocalDataSource;
import com.cjimenezro.SevillaFC.data.local.EquipoFileLocalDataSource;
import com.cjimenezro.SevillaFC.data.local.PartidoFileLocalDataSource;
import com.cjimenezro.SevillaFC.domain.models.*;
import com.cjimenezro.SevillaFC.domain.useCase.*;

public class Main {
    public static void main(String[] args) {

        EquipoRepository equipoRepository = new EquipoDataRepository(EquipoFileLocalDataSource.getInstance());
        PartidoRepository partidoRepository = new PartidoDataRepository(PartidoFileLocalDataSource.getInstance());
        ArbitroRepository arbitroRepository = new ArbitroDataRepository(ArbitroFileLocalDataSource.getInstance());


        Equipo sevilla = new Equipo();
        sevilla.setId("1");
        sevilla.setCategoria("Primera");
        sevilla.setNombre("SevillaFC");
        sevilla.setJugadores("Bono");

        Equipo betis = new Equipo();
        betis.setId("2");
        betis.setCategoria("Primera");
        betis.setNombre("Real Betis balompié");
        betis.setJugadores("Claudio Bravo");

        AddEquipoUseCase addEquipoUseCase = new AddEquipoUseCase(equipoRepository);
        addEquipoUseCase.execute(sevilla);
        addEquipoUseCase.execute(betis);

        Arbitro arbitro = new Arbitro();
        arbitro.setId("1");
        arbitro.setNombre("Jesus");
        arbitro.setApellidos("Gil Manzano");
        arbitro.setFechaNacimento("04/02/1984");
        arbitro.setCategoria("Primera");

        AddArbritroUseCase addArbritroUseCase = new AddArbritroUseCase(arbitroRepository);
        addArbritroUseCase.execute(arbitro);

        GetEquipoUseCase getEquipoUseCase = new GetEquipoUseCase(equipoRepository);
        GetArbitroUseCase getArbitroUseCase = new GetArbitroUseCase(arbitroRepository);

        Partido partido = new Partido();
        partido.setId("1");
        partido.setEquipoLocal(getEquipoUseCase.execute("1"));
        partido.setEquipoVisitante(getEquipoUseCase.execute("2"));
        partido.setArbitro(getArbitroUseCase.execute("1"));
        partido.setResultado("5-0");
        partido.setFechaPartido("21/05/2022");

        AddPartidoUseCase addPartidoUseCase = new AddPartidoUseCase(partidoRepository);
        addPartidoUseCase.execute(partido);



    }
}