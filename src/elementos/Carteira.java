package classes;

import estruturadedados.DynamicArray;

public class CarteiraDeAcoes {

	private DynamicArray<AcaoAbstrata> acoes;
	
	public Carteira() {
		acoes = new DymanicArray<AcaoAbstrata>();
	}
	
	public void AddAcao(AcaoAbstrata a) {
		acoes.adicionar(a);
	}
	
	@Override
	public String toString() {
		return acoes.toString();
	}
}
