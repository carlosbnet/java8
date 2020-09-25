package com.example.carros;

import com.example.carros.api.controller.exception.ObjectNotFoundException;
import com.example.carros.domain.Carro;
import com.example.carros.domain.dto.CarroDTO;
import com.example.carros.service.CarroService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.*;


@SpringBootTest
class CarrosServicesTests {



	@Autowired
	private CarroService carroService;


	@Test
	void insertCar() {

		Carro carro = new Carro();

		carro.setNome("Fiat Siena");
		carro.setTipo("popular");

		CarroDTO c = carroService.insert(carro);

		assertNotNull(c);

		Long id = c.getId();
		assertNotNull(id);

		//Busca o objeto
		c = carroService.getCarroById(id);
		assertNotNull(c);

		assertEquals("Fiat Siena",c.getNome());
		assertEquals("popular", c.getTipo());

		//Delete o objeto
		carroService.del(id);

		//verifica se deletou
		try{
			assertNull(carroService.getCarroById(id));
			fail("O carro não foi excluido");
		}catch (ObjectNotFoundException e){
			//ok
		}


	}


	@Test
	void list(){
		List<CarroDTO> carroDTOS = carroService.getCarros();

		assertEquals(30,carroDTOS.size());


	}

	@Test
	void listTipo(){

		assertEquals(10,carroService.getCarrobyTipo("classicos").size());
		assertEquals(10, carroService.getCarrobyTipo("esportivos").size());
		assertEquals(10, carroService.getCarrobyTipo("luxo").size());


	}

	@Test
	void testGet(){

		CarroDTO op =  carroService.getCarroById(11L);

		assertNotNull(op);

		assertEquals("Ferrari FF",op.getNome());
	}

}
