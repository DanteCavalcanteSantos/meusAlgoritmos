package br.com.algoritmo.gustavog;

import java.util.ArrayList;
import java.util.*;

public class ExercicioMelhorado5 {

	
	//Atributos
	private double primeiraNota;
	private double segundaNota;
	private String nomeAluno;
  

	//Métodos assessores
	public double getPrimeiraNota() {
		return primeiraNota;
	}
	public void setPrimeiraNota(double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}
	public double getSegundaNota() {
		return segundaNota;
	}
	public void setSegundaNota(double segundaNota) {
		this.segundaNota = segundaNota;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	//metodos
	
	
	public double calcNota() {
		double media;
		return media = (this.primeiraNota + this.segundaNota) / 2;
	}

	//Guardar o nome 
	
	public String registraAluno(String nome) {
		return nome = this.getNomeAluno();
	}
	
	
	
	
		
	
	
	
	
	
	
}
