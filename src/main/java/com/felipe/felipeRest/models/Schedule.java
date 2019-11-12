package com.felipe.felipeRest.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_SCHEDULE")
public class Schedule implements Serializable {

	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String titulo;
	private String descricao;
	private Calendar dataSchedule;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Calendar getDataSchedule() {
		return dataSchedule;
	}
	public void setDataSchedule(Calendar dataSchedule) {
		this.dataSchedule = dataSchedule;
	}
	
	
}
