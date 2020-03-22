package br.com.sisdb.brewer.model;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {
	
	@NotBlank(message = "SKU é obrigatório.")
	private String sku;
	@NotBlank(message = "Nome é obrigatório.")
	private String nome;
	
	@Size(max = 5, min = 2, message = "A descrição deve ter de 1 à 50 caracteres.")
	private String descricao;
	
	
	
	
	public Cerveja() {
		super();
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
