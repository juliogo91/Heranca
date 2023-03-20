
public class Porco extends Vaca {
	private String nome;
	private String tipo;
	private float peso;
	private float tamanho;
	private String chafurdar;

	public void setChafurdar(String chafurdar) {
		this.chafurdar = chafurdar;
	}

	public boolean chafurdarNaLama(String chafurdar) {
		if (String.valueOf(this.chafurdar) == chafurdar)return true;
		else return false;
	}

	public float verificarTamanho() {
		return tamanho * 100;
	}
}
