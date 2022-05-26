package horario.jogos;

public class HorarioJogos {

	int horario1 = 10;
	int horario2 = 16;
	int horario3 = 20;
	

	
	
	@Override
	public String toString() {
		return "HorarioJogos [horario1=" + horario1 + ", horario2=" + horario2 + ", horario3=" + horario3 + "]";
	}
	
	
	public int getHorario1() {
		return horario1;
	}
	public void setHorario1(int horario) {
		if(horario == horario1) {
			System.out.println("A partida será às "+ horario1 + " horas");
		}else if(horario == horario2){
			System.out.println("Marcar o jogo para o turno vespertino." + horario2 + " horas");
		}else if(horario == horario3){
			System.out.println("Marcar o jogo para o turno noturno." + horario3 + " horas");
		}else {
			System.out.println("Horário não disponível!");
		}
		this.horario1 = horario;
	}
	
	
	
	
	public int getHorario2() {
		return horario2;
	}
	public void setHorario2(int horario2) {
		this.horario2 = horario2;
	}
	public int getHorario3() {
		return horario3;
	}
	public void setHorario3(int horario3) {
		this.horario3 = horario3;
	}
}
	
		
	
	
	
	
