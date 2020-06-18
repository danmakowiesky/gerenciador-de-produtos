package br.com.daniel.DesafioJava.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cliente;
	private Float totalDaCompra;
	private Date dataDaCompra;
	private String produtos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Float getTotalDaCompra() {
		return totalDaCompra;
	}

	public void setTotalDaCompra(Float totalDaCompra) {
		this.totalDaCompra = totalDaCompra;
	}

	public Date getDataDaCompra() {
		return dataDaCompra;
	}

	public void setDataDaCompra(Date dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

}
