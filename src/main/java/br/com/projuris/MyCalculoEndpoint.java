package br.com.projuris;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCalculoEndpoint {

	private MyCalculo myCalculo = new MyCalculo();
	
	@GetMapping("/custoCargo")
	public List<CustoCargo> custoCargoEndpoint(@RequestBody List<Funcionario> funcionarios) {

		return myCalculo.custoPorCargo(funcionarios);

	}

	@GetMapping("/custoDepartamento")
	public List<CustoDepartamento> custoDepartamentoEndpoint(@RequestBody List<Funcionario> funcionarios) {

		return myCalculo.custoDepartamento(funcionarios);

	}

}
