package com.JavaSandbox;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.JavaSandbox.models.DefinicionAgenda;
import com.JavaSandbox.models.DetalleDefinicionAgenda;
import com.JavaSandbox.models.GestorGenerarAgenda;
import com.JavaSandbox.models.Prestador;

@SpringBootTest
class JavaSandboxApplicationTests {

	@Test
	void testCrearAgenda() {

		// Objetos DetalleDefinicionAgenda para el dia lunes ---------------------------------------------------
		DetalleDefinicionAgenda detalleDefinicionAgendaLunesMañana = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaLunesMañana.setDiaSemana("Lunes");
		detalleDefinicionAgendaLunesMañana.setEsIntervaloEntreHoras(false);
		detalleDefinicionAgendaLunesMañana.setHoraInicio(LocalTime.of(8, 0));
		detalleDefinicionAgendaLunesMañana.setHoraFin(LocalTime.of(13, 0));

		DetalleDefinicionAgenda detalleDefinicionAgendaLunesIntervalo = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaLunesIntervalo.setDiaSemana("Lunes");
		detalleDefinicionAgendaLunesIntervalo.setEsIntervaloEntreHoras(true);
		detalleDefinicionAgendaLunesIntervalo.setHoraInicio(LocalTime.of(13, 0));
		detalleDefinicionAgendaLunesIntervalo.setHoraFin(LocalTime.of(15, 0));

		DetalleDefinicionAgenda detalleDefinicionAgendaLunesTarde = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaLunesTarde.setDiaSemana("Lunes");
		detalleDefinicionAgendaLunesTarde.setEsIntervaloEntreHoras(false);
		detalleDefinicionAgendaLunesTarde.setHoraInicio(LocalTime.of(15, 0));
		detalleDefinicionAgendaLunesTarde.setHoraFin(LocalTime.of(19, 0));
		
		// Objetos DetalleDefinicionAgenda para el dia martes ----------------------------------------------------
		DetalleDefinicionAgenda detalleDefinicionAgendaMartesMañana = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaMartesMañana.setDiaSemana("Martes");
		detalleDefinicionAgendaMartesMañana.setEsIntervaloEntreHoras(false);
		detalleDefinicionAgendaMartesMañana.setHoraInicio(LocalTime.of(8, 0));
		detalleDefinicionAgendaMartesMañana.setHoraFin(LocalTime.of(13, 0));

		DetalleDefinicionAgenda detalleDefinicionAgendaMartesIntervalo = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaMartesIntervalo.setDiaSemana("Martes");
		detalleDefinicionAgendaMartesIntervalo.setEsIntervaloEntreHoras(true);
		detalleDefinicionAgendaMartesIntervalo.setHoraInicio(LocalTime.of(13, 0));
		detalleDefinicionAgendaMartesIntervalo.setHoraFin(LocalTime.of(15, 0));

		DetalleDefinicionAgenda detalleDefinicionAgendaMartesTarde = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaMartesTarde.setDiaSemana("Martes");
		detalleDefinicionAgendaMartesTarde.setEsIntervaloEntreHoras(false);
		detalleDefinicionAgendaMartesTarde.setHoraInicio(LocalTime.of(15, 0));
		detalleDefinicionAgendaMartesTarde.setHoraFin(LocalTime.of(19, 0));

		// Objetos DetalleDefinicionAgenda para el dia miercoles ---------------------------------------------------
		DetalleDefinicionAgenda detalleDefinicionAgendaMiercolesMañana = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaMiercolesMañana.setDiaSemana("Miercoles");
		detalleDefinicionAgendaMiercolesMañana.setEsIntervaloEntreHoras(false);
		detalleDefinicionAgendaMiercolesMañana.setHoraInicio(LocalTime.of(8, 0));
		detalleDefinicionAgendaMiercolesMañana.setHoraFin(LocalTime.of(13, 0));

		DetalleDefinicionAgenda detalleDefinicionAgendaMiercolesIntervalo = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaMiercolesIntervalo.setDiaSemana("Miercoles");
		detalleDefinicionAgendaMiercolesIntervalo.setEsIntervaloEntreHoras(true);
		detalleDefinicionAgendaMiercolesIntervalo.setHoraInicio(LocalTime.of(13, 0));
		detalleDefinicionAgendaMiercolesIntervalo.setHoraFin(LocalTime.of(15, 0));

		DetalleDefinicionAgenda detalleDefinicionAgendaMiercolesTarde = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaMiercolesTarde.setDiaSemana("Miercoles");
		detalleDefinicionAgendaMiercolesTarde.setEsIntervaloEntreHoras(false);
		detalleDefinicionAgendaMiercolesTarde.setHoraInicio(LocalTime.of(15, 0));
		detalleDefinicionAgendaMiercolesTarde.setHoraFin(LocalTime.of(19, 0));

		// Objetos DetalleDefinicionAgenda para el dia jueves ----------------------------------------------------
		DetalleDefinicionAgenda detalleDefinicionAgendaJuevesMañana = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaJuevesMañana.setDiaSemana("Jueves");
		detalleDefinicionAgendaJuevesMañana.setEsIntervaloEntreHoras(false);
		detalleDefinicionAgendaJuevesMañana.setHoraInicio(LocalTime.of(8, 0));
		detalleDefinicionAgendaJuevesMañana.setHoraFin(LocalTime.of(13, 0));

		DetalleDefinicionAgenda detalleDefinicionAgendaJuevesIntervalo = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaJuevesIntervalo.setDiaSemana("Jueves");
		detalleDefinicionAgendaJuevesIntervalo.setEsIntervaloEntreHoras(true);
		detalleDefinicionAgendaJuevesIntervalo.setHoraInicio(LocalTime.of(13, 0));
		detalleDefinicionAgendaJuevesIntervalo.setHoraFin(LocalTime.of(15, 0));

		DetalleDefinicionAgenda detalleDefinicionAgendaJuevesTarde = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaJuevesTarde.setDiaSemana("Jueves");
		detalleDefinicionAgendaJuevesTarde.setEsIntervaloEntreHoras(false);
		detalleDefinicionAgendaJuevesTarde.setHoraInicio(LocalTime.of(15, 0));
		detalleDefinicionAgendaJuevesTarde.setHoraFin(LocalTime.of(19, 0));

		// Objetos DetalleDefinicionAgenda para el dia viernes ---------------------------------------------------
		DetalleDefinicionAgenda detalleDefinicionAgendaViernesMañana = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaViernesMañana.setDiaSemana("Viernes");
		detalleDefinicionAgendaViernesMañana.setEsIntervaloEntreHoras(false);
		detalleDefinicionAgendaViernesMañana.setHoraInicio(LocalTime.of(8, 0));
		detalleDefinicionAgendaViernesMañana.setHoraFin(LocalTime.of(13, 0));

		DetalleDefinicionAgenda detalleDefinicionAgendaViernesIntervalo = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaViernesIntervalo.setDiaSemana("Viernes");
		detalleDefinicionAgendaViernesIntervalo.setEsIntervaloEntreHoras(true);
		detalleDefinicionAgendaViernesIntervalo.setHoraInicio(LocalTime.of(13, 0));
		detalleDefinicionAgendaViernesIntervalo.setHoraFin(LocalTime.of(15, 0));

		DetalleDefinicionAgenda detalleDefinicionAgendaViernesTarde = new DetalleDefinicionAgenda();
		detalleDefinicionAgendaViernesTarde.setDiaSemana("Viernes");
		detalleDefinicionAgendaViernesTarde.setEsIntervaloEntreHoras(false);
		detalleDefinicionAgendaViernesTarde.setHoraInicio(LocalTime.of(15, 0));
		detalleDefinicionAgendaViernesTarde.setHoraFin(LocalTime.of(19, 0));

		// Crear objeto DefinicionAgenda ------------------------------------------------------------------
		DefinicionAgenda definicionAgenda = new DefinicionAgenda();
		definicionAgenda.setMes(1);
		definicionAgenda.setAnio(2022);
		definicionAgenda.setDuracionTurno(60);
		definicionAgenda.setIntervaloEntreTurnos(15);

		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaLunesMañana);
		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaLunesIntervalo);
		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaLunesTarde);

		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaMartesMañana);
		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaMartesIntervalo);
		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaMartesTarde);

		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaMiercolesMañana);
		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaMiercolesIntervalo);
		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaMiercolesTarde);

		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaJuevesMañana);
		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaJuevesIntervalo);
		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaJuevesTarde);

		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaViernesMañana);
		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaViernesIntervalo);
		definicionAgenda.conocerDetalleDefinicionAgenda(detalleDefinicionAgendaViernesTarde);

		// Crear objeto Prestador
		Prestador prestador = new Prestador();
		prestador.setNombre("Juan");
		
		// Agregar datos de prueba al gestor
		GestorGenerarAgenda gestorGenerarAgenda = new GestorGenerarAgenda();
		gestorGenerarAgenda.setDefinicionAgenda(definicionAgenda);
		gestorGenerarAgenda.setPrestador(prestador);
		
		// Generar agenda
		gestorGenerarAgenda.generarAgenda();
	}
}



