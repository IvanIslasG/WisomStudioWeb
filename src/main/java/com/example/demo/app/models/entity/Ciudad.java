package com.example.demo.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ciudades")
public class Ciudad implements Serializable{
	
	@SequenceGenerator(name="PerSeq",sequenceName = "P_S",initialValue = 1, allocationSize = 10)
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PerSeq")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String ciudad;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", ciudad=" + ciudad + "]";
	}
	
	

}
