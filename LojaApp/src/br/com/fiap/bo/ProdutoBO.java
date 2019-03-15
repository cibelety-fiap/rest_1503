package br.com.fiap.bo;



import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoBO {
	
	public static ProdutoTO buscar(int codProd) {
		
		if (codProd == 401) {
			return new ProdutoTO(codProd,2.99,4, "Camisa Branca");
		
		} else if (codProd == 402) {
			return new ProdutoTO(codProd,2.99,4, "Camisa Azul");
			// System.out.println( p.getDescricao());
		} else if (codProd == 403) {
			return new ProdutoTO(codProd,2.99,4, "Camisa Rosa");
		} else {
			return new ProdutoTO(-1,0,0, "Produto não encontrado");
		}
	}

	public List<ProdutoTO> listar() {
		ArrayList<ProdutoTO> lista = new ArrayList<ProdutoTO>();
		lista.add(ProdutoBO.buscar(401));
		lista.add(ProdutoBO.buscar(402));
		lista.add(ProdutoBO.buscar(403));
		lista.add(ProdutoBO.buscar(404));
		return lista;
	}

}
