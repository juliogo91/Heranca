
public class Vaca extends Animais{
	
	private String nome;
	private String tipo;
	private float peso;
	private float tamanho;
	private String andar;
	
	public void setAndar(String andar) {
		this.andar = andar;
	}
	public boolean andarNoPasto(String andar) {
		if(String.valueOf(this.andar) == andar) return true;
		else return false;
}
	public float verificarTamanho() {
		return tamanho * 100;
	}
}
