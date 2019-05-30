package br.com.projuris;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DesafioApplication.class)
@RunWith(SpringRunner.class)
public class TestMyCalculo {
	
	private MyCalculo teste = new MyCalculo();
	
	@Test
	public void testeCustoPorCargo() {
		List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		listaFuncionario.add(new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0)));
		listaFuncionario.add(new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70)));
		listaFuncionario.add(new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45)));
		listaFuncionario.add(new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9)));
		listaFuncionario.add(new Funcionario("Gerente", "Financeiro", new BigDecimal(7500)));
		listaFuncionario.add(new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0)));
		listaFuncionario.add(new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4)));
		listaFuncionario.add(new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90)));
		listaFuncionario.add(new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50)));
		listaFuncionario.add(new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0)));
		
		List<CustoCargo> a = teste.custoPorCargo(listaFuncionario);
		assertEquals("Deveria conter 4", 4, a.size());
		// System.out.println(a.get(0).getCargo());
		// System.out.println(a.get(0).getCusto());
		// Há bastante o que melhorar neste teste, só estou testando o tamanho da Lista.
	}
	
	@Test
	public void testeCustoDepartamento() {
		List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		listaFuncionario.add(new Funcionario("Assistente", "Administrativo", new BigDecimal(1000.0)));
		listaFuncionario.add(new Funcionario("Gerente", "Administrativo", new BigDecimal(7000.70)));
		listaFuncionario.add(new Funcionario("Diretor", "Administrativo", new BigDecimal(10000.45)));
		listaFuncionario.add(new Funcionario("Assistente", "Financeiro", new BigDecimal(1300.9)));
		listaFuncionario.add(new Funcionario("Gerente", "Financeiro", new BigDecimal(7500)));
		listaFuncionario.add(new Funcionario("Diretor", "Financeiro", new BigDecimal(11000.0)));
		listaFuncionario.add(new Funcionario("Estagiário", "Jurídico", new BigDecimal(700.4)));
		listaFuncionario.add(new Funcionario("Assistente", "Jurídico", new BigDecimal(1800.90)));
		listaFuncionario.add(new Funcionario("Gerente", "Jurídico", new BigDecimal(9500.50)));
		listaFuncionario.add(new Funcionario("Diretor", "Jurídico", new BigDecimal(13000.0)));
		
		List<CustoDepartamento> a = teste.custoDepartamento(listaFuncionario);
		assertEquals("Deveria conter 3", 3, a.size());
		// System.out.println(a.get(0).getDepartamento());
		// System.out.println(a.get(0).getCusto());
		// Há bastante o que melhorar neste teste, só estou testando o tamanho da Lista.
	}
	
	

}
