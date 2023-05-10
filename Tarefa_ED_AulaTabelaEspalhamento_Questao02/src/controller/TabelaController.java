package controller;

import br.edu.fateczl.lista.listaObj.Lista;
import model.Morador;


public class TabelaController implements ITabelaController{
	Lista[] vetMorador;
	
	public TabelaController() {
		vetMorador = new Lista[10];
		for(int i = 0 ; i < 10 ; i++) {
			vetMorador[i] = new Lista();
		}
	}

	@Override
	public void cadastrar(Morador m) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Morador consultar(Morador m) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Morador m) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listar(String andar) {
		// TODO Auto-generated method stub
		
	}
	
	
}
