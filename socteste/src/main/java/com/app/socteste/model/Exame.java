package com.app.socteste.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Exame implements Serializable {
	
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	private Date dt_exame;

	@NotNull
	private String nm_exame;
	
	@Column(unique=true)
	@NotNull
	private String nm_paciente;
	
	@NotNull
	private String obs_result;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm_paciente() {
		return nm_paciente;
	}
	public void setNm_paciente(String nm_paciente) {
		this.nm_paciente = nm_paciente;
	}
	public String getNm_exame() {
		return nm_exame;
	}
	public void setNm_exame(String nm_exame) {
		this.nm_exame = nm_exame;
	}
	public Date getDt_exame() {
		return dt_exame;
	}
	public void setDt_exame(Date dt_exame) {
		this.dt_exame = dt_exame;
	}
	public String getObs_result() {
		return obs_result;
	}
	public void setObs_result(String obs_result) {
		this.obs_result = obs_result;
	}
	
	
	@Override
	public String toString() {
		return "Exame [nm_paciente=" + nm_paciente + ", nm_exame=" + nm_exame + ", dt_exame=" + dt_exame + ", obs_result="
				+ obs_result + "]";
	}
	
	
	
}
	