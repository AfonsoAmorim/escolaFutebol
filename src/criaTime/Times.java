package criaTime;

import javax.swing.JOptionPane;

import comissaoTecnica.Professor;
import horario.jogos.HorarioJogos;
import time.Jogadores;

public class Times {

	public static void main(String[] args) {

		String nomeProfessor = JOptionPane.showInputDialog("Qual nome do professor para a partida: ? ");
		String sobrenomeProfessor = JOptionPane.showInputDialog("Qual é o sobrenome do professor: ? ");
		String idadeProfessor = JOptionPane.showInputDialog("Qual é o seu RG: ?");

		Professor professorA = new Professor();
		professorA.setNome(nomeProfessor);
		professorA.setSobreNome(sobrenomeProfessor);
		professorA.setrG(Integer.valueOf(idadeProfessor));

		HorarioJogos horario = new HorarioJogos();

		String disciplinaRemover = JOptionPane.showInputDialog("Horários disponíveis: 10, 16 e 20 horas");
		horario.setHorario1(Integer.valueOf(disciplinaRemover));

		for (int pos = 1; pos<5;pos++) {
			String nomeJogador = JOptionPane.showInputDialog("Nome do jogador " + pos + " ?");
			Jogadores jogador = new Jogadores();
			jogador.setNome(nomeJogador);
			System.out.println("Os jogadores são: " + jogador.getNome());
		} 
				
				
				
		System.out.println("O nome do professor dessa partida é: " + professorA.getNome());
		System.out.println("Seu sobrenome é: " + professorA.getSobreNome());
		System.out.println("Seu RG para confirmação é: " + professorA.getrG());

		System.out.println("Prepare-se para o jogo às " + horario.getHorario1() + " horas");
		
	}

}
