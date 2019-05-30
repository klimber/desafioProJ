package br.com.projuris;

import java.util.List;

public interface Calculo {
	
	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios);
	
	public List<CustoDepartamento> custoDepartamento(List<Funcionario> funcionarios);

}
