
public class TestePorco {
	public static void main(String[] args) {
		
		Porco porco = new Porco();
		porco.setNome("porco");
		porco.setPeso(200);
		porco.setTipo("mamífero");
		porco.setTamanho(60);
		
		porco.setChafurdar("chafurdando");
		boolean chafurdou = porco.chafurdarNaLama("chafurdando");
		
		System.out.println(porco.getNome());
		System.out.println(porco.getPeso());
		System.out.println(porco.getTipo());
		System.out.println(porco.getTamanho());
		System.out.println(chafurdou);
	}
}
