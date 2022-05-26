package horario.jogos;

public class HorarioJogos {

	String horario1 = "10";
	
	
	public void setHorario1(String testeHorario) {
		if(testeHorario == "10") {
			System.out.println("O jogo é as "+ testeHorario);
		}else {
			System.out.println("Marcar o jogo para o turno vespertino.");
		}
		this.horario1 = testeHorario;
	}
	
	public String getHorario1() {
		return horario1;
	}
	
}
