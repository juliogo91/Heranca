
public class Animais {

	private String nome;
	private String tipo;
	private float peso;
	private float tamanho;
	
	public float verificarTamanho() {
		return tamanho * 100;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getPeso() {
		return peso;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public float getTamanho() {
		return tamanho;
	}
}
