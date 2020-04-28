package com.gft.osworks.domain.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gft.osworks.domain.exception.NegocioException;
import com.gft.osworks.domain.model.Cliente;
import com.gft.osworks.domain.model.OrdemServico;
import com.gft.osworks.domain.model.statusOrdemServico;
import com.gft.osworks.domain.repository.ClienteRepository;
import com.gft.osworks.domain.repository.OrdemServicoRepository;

@Service
public class GestaoOrdemServicoService {

	@Autowired
	private OrdemServicoRepository ordemServicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	
	public OrdemServico criar(OrdemServico ordemServico) {
		Cliente cliente = clienteRepository.findById(ordemServico.getCliente().getId())
				.orElseThrow(()-> new NegocioException("Cliente não encontrado"));
		
		ordemServico.setCliente(cliente);
		ordemServico.setStatus(statusOrdemServico.ABERTA);
		ordemServico.setDataAbertura(LocalDateTime.now());
		ordemServico.setDataFinalizacaoDateTime(LocalDateTime.now());
		
		return ordemServicoRepository.save(ordemServico);
	}
}
