package exemploAbstractFactory;

public class CarroFashionFactory extends CarroFactory {

	@Override
	public Roda montarRoda() {
		return new RodaSimples();
		
	}

	@Override
	public Som montarSom() {
		return new Paredao();
		
	}

}
