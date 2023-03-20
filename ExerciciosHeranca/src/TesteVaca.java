
public class TesteVaca {

	public static void main(String[] args) {
		
		Vaca vaca = new Vaca();
		vaca.setNome("vaca");
		vaca.setPeso(430);
		vaca.setTipo("mamífero");
		vaca.setTamanho(150);
		
		vaca.setAndar("pastando");
		boolean pastou = vaca.andarNoPasto("pastando");
		
		System.out.println(vaca.getNome());
		System.out.println(vaca.getPeso());
		System.out.println(vaca.getTipo());
		System.out.println(vaca.getTamanho());
		System.out.println(pastou);
		
	}
}
