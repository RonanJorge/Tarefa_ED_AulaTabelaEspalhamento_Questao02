package controller;

import model.Morador;

public interface ITabelaController {
	public void cadastrar(Morador m) throws Exception;
	public Morador consultar(Morador m) throws Exception;
	public void excluir(Morador m) throws Exception;
	public void listar(String andar) throws Exception;
}
