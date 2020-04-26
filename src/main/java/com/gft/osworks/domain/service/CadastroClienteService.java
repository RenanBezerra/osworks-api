package com.gft.osworks.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.osworks.domain.exception.NegocioException;
import com.gft.osworks.domain.model.Cliente;
import com.gft.osworks.domain.repository.ClienteRepository;

@Service	
public class CadastroClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente) {
		Cliente clienteExistenteEmail = clienteRepository.findByEmail(cliente.getEmail());
		Cliente clienteExistenteNome = (Cliente) clienteRepository.findByNome(cliente.getNome());
		
		if (clienteExistenteEmail != null && !clienteExistenteEmail.equals(cliente)) {
			throw new NegocioException("Já existe um cliente cadastrado com este e-mail.");
		}
		if (clienteExistenteNome != null && !clienteExistenteNome.equals(cliente)) {
			throw new NegocioException("Já existe um cliente cadastrado com este nome.");
		}
		
		
		return clienteRepository.save(cliente);
		
	}
	
	public void excluir(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}
}
