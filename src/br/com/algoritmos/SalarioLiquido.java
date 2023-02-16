package br.com.algoritmos;

public class SalarioLiquido {

	private double valorHora;
	private double horasTrabalhada;
	private double percentualDesconto;
	private double taxaDesconto;
	
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getHorasTrabalhada() {
		return horasTrabalhada;
	}
	public void setHorasTrabalhada(double horasTrabalhada) {
		this.horasTrabalhada = horasTrabalhada;
	}
	public double getPercentualDesconto() {
		return percentualDesconto;
	}
	public void setPercentualDesconto(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}

	public double getTaxaDesconto() {
		return taxaDesconto;
	}
	public void setTaxaDesconto(double taxaDesconto) {
		this.taxaDesconto = taxaDesconto;
	}
	
	
	//Salario Bruto
	
	public double calculaSalarioB() {
		return  valorHora * horasTrabalhada;
	}
	
	//Taxa de desconto
	public double calculaTD() {
		return taxaDesconto = calculaSalarioB() * (percentualDesconto / 100);
	}
	
	// resultado salario liquido 
	
	public double salarioL() {
		return calculaSalarioB() - calculaTD();
	}
	
	
}
