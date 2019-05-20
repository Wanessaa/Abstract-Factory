package exemploAbstractFactory;

public class TesteFactory {

	private static Carro montarCarro(String tipo){
		CarroFactory cf = null;
		switch(tipo){
		case "luxo":
			cf = new CarroLuxoFactory();
			break;
		case "popular":
			cf = new CarroPopularFactory();
			
		case "fashion":
			cf = new CarroPopularFactory();
		}
		Carro carro = new Carro();
		carro.setRoda(cf.montarRoda());
		carro.setSom(cf.montarSom());
		return carro;
	}
	
	public static void main(String[] args) {
		Carro c1 = montarCarro("luxo");
		System.out.println(c1.getRoda());
		System.out.println(c1.getSom());
		
		
		
//		Carro c2 = montarCarro("popular");
//		System.out.println("End");
	}
}

