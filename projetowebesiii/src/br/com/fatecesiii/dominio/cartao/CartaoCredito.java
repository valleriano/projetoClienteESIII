package br.com.fatecesiii.dominio.cartao;

import java.util.Date;

public class CartaoCredito extends Cartao {

	public void CriaCartao() throws Exception {
		
		Date dtCadastro;
		String nome;
		int tipoCartao;
		
		dtCadastro = getDataCadastro();
		
		if(dtCadastro != null) {
			tipoCartao = 1;
			nome = getNomeImpressoCartao();
			
			if(nome.isEmpty()) {
				throw new Exception("Cartão Inválido");
			}
		}
		
	}
}
