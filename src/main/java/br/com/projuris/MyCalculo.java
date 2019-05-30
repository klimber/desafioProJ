package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MyCalculo implements Calculo {

	// Ficaria melhor se os objetos CustoCargo e CustoDepartamento tivessem
	// construtores, mas acho que já está razoável.

	public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {

		// Obtem os cargos, uso um set pra não ter entradas repetidas
		Set<String> listaCargos = funcionarios.stream() //
				.map(f -> f.getCargo()) //
				.collect(Collectors.toSet());

		List<CustoCargo> resultado = new ArrayList<CustoCargo>();

		// Itera nos cargos, buscando os valores. Cria um custoCargo respectivo para
		// cada cargo e adiciona ao resultado
		for (String cargo : listaCargos) {

			CustoCargo custoCargo = new CustoCargo();

			custoCargo.setCargo(cargo);
			custoCargo.setCusto(funcionarios.stream() //
					.filter(f -> f.getCargo().equals(cargo)) //
					.map(f -> f.getSalario()) //
					.reduce(BigDecimal.ZERO, BigDecimal::add));

			resultado.add(custoCargo);

		}

		return resultado;
	}

		//A implementação deste método é análoga ao anterior.
	public List<CustoDepartamento> custoDepartamento(List<Funcionario> funcionarios) {

		Set<String> listaDepartamentos = funcionarios.stream() //
				.map(f -> f.getDepartamento()) //
				.collect(Collectors.toSet());

		List<CustoDepartamento> resultado = new ArrayList<CustoDepartamento>();

		for (String departamento : listaDepartamentos) {

			CustoDepartamento custoDepartamento = new CustoDepartamento();

			custoDepartamento.setDepartamento(departamento);
			custoDepartamento.setCusto(funcionarios.stream() //
					.filter(f -> f.getDepartamento().equals(departamento)) //
					.map(f -> f.getSalario()) //
					.reduce(BigDecimal.ZERO, BigDecimal::add));

			resultado.add(custoDepartamento);

		}

		return resultado;

	}

}
