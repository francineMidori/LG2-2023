import acoes.AcaoII;
import elementos.Corretora;
import elementos.Investidor;

public class Teste {

	public static void main(String[] args) {
		
		Corretora c = new Corretora();
		
		AcaoII a1 = new AcaoII("Nome 1", 20.9, 0.5, 32.0, 100);
		AcaoII a2 = new AcaoII("Nome 2", 30.9, 1.0, 21.0, 320);
		
		Investidor i1 = new Investidor(1240125, "Chaelin Lee", 1000.0);
		Investidor i2 = new Investidor(1295862, "Jay Park", 1000.0);
		
		c.enviarOrdem(a1, i1);
		c.enviarOrdem(a2, i2);
		
		c.exibirOrdens();
	}
}
