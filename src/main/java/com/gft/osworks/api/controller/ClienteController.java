package com.gft.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1l);
		cliente1.setNome("João");
		cliente1.setTelefone("34 999-000");
		cliente1.setEmail("joao@gmail.com");

		Cliente cliente2 = new Cliente();
		cliente2.setId(2l);
		cliente2.setNome("MAria");
		cliente2.setTelefone("34 11111-000");
		cliente2.setEmail("maria@gmail.com");

		return Arrays.asList(cliente1, cliente2);
	}
}
