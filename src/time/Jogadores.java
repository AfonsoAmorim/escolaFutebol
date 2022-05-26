package time;

public class Jogadores {

	String nome;
	String sobreNome;
	int idade;
	int rA; // registro do jogador
	
	
	
	@Override
	public String toString() {
		return "Jogadores [nome=" + nome + ", sobreNome=" + sobreNome + ", idade=" + idade + ", rA=" + rA + "]";
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getrA() {
		return rA;
	}
	public void setrA(int rA) {
		this.rA = rA;
	}
	
	
	
	
}
