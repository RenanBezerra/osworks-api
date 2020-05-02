package com.gft.osworks.api.model;

import java.time.OffsetDateTime;

public class ComentarioModel {

	private Long id;
	private String descricao;
	private OffsetDateTime dataEnvio;
	public Long getIdLong() {
		return id;
	}
	public void setIdLong(Long idLong) {
		this.id = idLong;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public OffsetDateTime getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(OffsetDateTime dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	
	
}
