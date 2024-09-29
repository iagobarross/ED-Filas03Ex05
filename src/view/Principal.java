package view;

import model.Pessoa;
import br.edu.fateczl.Fila.*;
import controller.ParqueController;

public class Principal {

	public static void main(String[] args) {
		Fila<Pessoa> f = new Fila<>();
		ParqueController parqCont = new ParqueController();
		
		for (int i = 0; i < 30; i++) {
			Pessoa p = new Pessoa();
			p.setNome("Pessoa" + (i+1));
			p.setIdade((int)((Math.random() * 31) + 10));
			p.setAltura((float)((Math.random() * 0.66) + 1.35));
			f.insert(p);
		}
		
		parqCont.brinquedo(f);
	}

}
