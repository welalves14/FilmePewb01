package br.com.ifce.test;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;

public class ViewMain {

	
	// "ambiente de teste
	
	
	public static void main(String[] args) {
		Filme filme01 = new Filme();
		filme01.setTitulo("Fogo em alto mar");
		filme01.setCategoria("terror");
		filme01.setDuracao(200);
		filme01.setPreco(18.0);
		filme01.setData("14/08/2020");
		
		Filme filme02 = new Filme();
		filme02.setTitulo("Tropeiro do nordeste");
		filme02.setCategoria("Ação");
		filme02.setDuracao(109);
		filme02.setPreco(99.0);
		filme02.setData("15/07/2010");
		
		Filme filme03 = new Filme();
		filme03.setTitulo("A casa de blimian");
		filme03.setCategoria("da pior que tem");
		filme03.setDuracao(145);
		filme03.setPreco(88.0);
		filme03.setData("02/07/2002");
		
		Filme filme04 = new Filme();
		filme04.setTitulo("Cavalgando na agua");
		filme04.setCategoria("terror");
		filme04.setDuracao(99);
		filme04.setPreco(10.0);
		filme04.setData("12/01/2022");
		
		Filme filme05 = new Filme();
		filme05.setTitulo("Aquelas coisas, joão gomes");
		filme05.setCategoria("chifre");
		filme05.setDuracao(44);
		filme05.setPreco(17.0);
		filme05.setData("03/07/2020");
		
		Filme filme06 = new Filme();
		filme06.setTitulo("Ceara 6 x 0 na sulamericana");
		filme06.setCategoria("muito amor");
		filme06.setDuracao(90);
		filme06.setPreco(88.0);
		filme06.setData("17/05/2022");
		
		
		FilmeController filmeCon = new FilmeController();
		
		filmeCon.salvar(filme01);
		filmeCon.salvar(filme02);
		filmeCon.salvar(filme03);
		filmeCon.salvar(filme04);
		filmeCon.salvar(filme05);
		filmeCon.salvar(filme06);
		
		
		filmeCon.remover(filme01);
		
		filmeCon.buscarID(filme03.getCodigo());
		
		filme05.setTitulo("Era hoje doi, tarsicio");
		filme05.setData("25/07/2019");
		
		filmeCon.atualizar(filme05);
		
	}

}
