package criaTime;

import javax.swing.JOptionPane;

import comissaoTecnica.Professor;
import horario.jogos.HorarioJogos;

public class Times {

	public static void main(String[] args) {

		String nomeProfessor = JOptionPane.showInputDialog("Qual nome do professor para a partida: ? ");
		String sobrenomeProfessor = JOptionPane.showInputDialog("Qual � o sobrenome do professor: ? ");
		String idadeProfessor = JOptionPane.showInputDialog("Qual � o seu RG: ?");
		
		Professor professorA = new Professor();
		professorA.setNome(nomeProfessor);
		professorA.setSobreNome(sobrenomeProfessor);
		professorA.setrG(Integer.valueOf(idadeProfessor));
		
		
		HorarioJogos horario = new HorarioJogos();
		String testeHorario = JOptionPane.showInputDialog("Qual hor�rio do jogo? ");
		horario.setHorario1(testeHorario);
		
		
		
		System.out.println("O nome do professor dessa partida � "+professorA.getNome());
		System.out.println("Seu sobrenome � "+professorA.getSobreNome());
		System.out.println("Seu RG para confirma��o � "+professorA.getrG());

		
		System.out.println("O hor�rio escolhido � "+horario.getHorario1());
	}

	
	
	
}
