package com.JavaSandbox;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.JavaSandbox.models.Controlador;

@SpringBootTest
class JavaSandboxApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testDependenciaMarca()
	{
		Controlador controlador = new Controlador();
		controlador.getDatosRecursosTecnologicos();
	}

}
