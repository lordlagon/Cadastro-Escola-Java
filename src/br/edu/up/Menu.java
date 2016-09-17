package br.edu.up;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

	static Scanner leitor = new Scanner(System.in);
		public static void main(String[] args) throws IOException {
		
			menu();
		}
		public static void menu() throws IOException {

			// Menu
			
				System.out.println("|Digite o numero para a função|");
				System.out.println("|1 - Cadastro de Aluno        |");
				System.out.println("|2 - Listar Alunos            |");
				System.out.println("|3 - Cadastro de Professores  |");
				System.out.println("|4 - Listar Professores       |");
				System.out.println("|5 - Apagar Arquivos          |");
				System.out.println("|0 - Sair                     |");
				
				int numMenu;
				System.out.println("Digite o numero: ");
				numMenu = leitor.nextInt();
				switch (numMenu) {
					 case 1 :
						 cadAluno();
						 break;
					 case 2:
						 listAluno();
	 
						 break;
					 case 3:
						 cadProfessor();
						 
						 break;
					 case 4:
						 listProfessor();
						 break;

					 case 5:
						 apagarArquivo();
						 break;
						 
					 case 0:
						 System.out.println("!Você Fechou o Programa!\n");
						 break;
					  default:
						 System.out.println("\n!Numero Incorreto!");
						 menu();
				
			}
		 
			}
		public static void cadAluno() throws IOException{

			// Cria o arquivo dos alunos
			File Alunos = new File("alunos.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(Alunos,true));
							
			System.out.println("Informe a quantidade de aluno que serão cadastrados:");
			int qntd=0;
			qntd = leitor.nextInt();
							
			//Vetor de lista de Alunos
			List <Aluno> lista = new ArrayList<Aluno>();
			// Pega as informações dos Alunos
			for (int i = 0; i < qntd; i++) {
				Aluno A = new Aluno();
				System.out.println("Digite um nome:");
				A.setNome(leitor.next());
				System.out.println("Digite a idade:");
				A.setIdade(leitor.nextInt());
				System.out.println("Digite o sexo:");
				A.setSexo(leitor.next());
				System.out.println("Digite a Disciplina:");
				A.setDisciplina(leitor.next());
				System.out.println("Digite a Nota1:");
				A.setNota1(leitor.nextDouble());
				System.out.println("Digite a Nota2:");
				A.setNota2(leitor.nextDouble());
				System.out.println("Digite a Nota3:");
				A.setNota3(leitor.nextDouble());
				
				//Adiciona na lista
				lista.add(A);
			}	
			
			//Grava as informações da Lista no Arquivo dos Alunos
			for (Aluno Aluno : lista) {
				
				bw.write("Nome: " + Aluno.getNome()+" ");
				bw.write("Idade: " + Aluno.getIdade()+" ");
				bw.write("Sexo: " + Aluno.getSexo()+" ");
				bw.write("Disciplina: " + Aluno.getDisciplina()+" ");
				bw.write("Nota1: " + Aluno.getNota1()+" ");
				bw.write("Nota2: " + Aluno.getNota2()+" ");
				bw.write("Nota3: " + Aluno.getNota3()+" ");
				bw.write("Aprovado: " + Aluno.isAprovado()+";\n");
				
			}
			bw.close();
							
			System.out.println("Deseja continuar cadastrando?");
				System.out.println("1- Sim");
				System.out.println("0- Não (Retorna ao Menu)");
		
				int numMenu;
				numMenu = leitor.nextInt();
								
				switch (numMenu) {
					 case 1 :
					cadAluno();
					break;
					  default:
					menu();
					break;
					 }
		
				//bw.close();
				
				
						}
		public static void listAluno() throws IOException{
				
			System.out.println();
			
			//Recupera o arquivo dos Alunos
			File arquivo = new File("Alunos.txt");
			//Le os dados do aqruivo e joga na tela
			int numMenu = lerArquivo(arquivo);						
			switch (numMenu) {
				 case 1 :
				listAluno();
				break;
				  default:
				menu();
				
				 }
			}
		public static void cadProfessor() throws IOException {

			File Professores = new File("professores.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(Professores,true));
							
			System.out.println("Informe a quantidade de Professores que serão cadastrados:");
			int qntd=0;
			qntd = leitor.nextInt();
							
			
			List <Professor> lista = new ArrayList<Professor>();
					
			for (int i = 0; i < qntd; i++) {
				Professor Pr = new Professor();
				System.out.println("Digite um nome:");
				Pr.setNome(leitor.next());
				System.out.println("Digite a idade:");
				Pr.setIdade(leitor.nextInt());
				System.out.println("Digite o sexo:");
				Pr.setSexo(leitor.next());
				System.out.println("Digite a Disciplina:");
				Pr.setDisciplina(leitor.next());
				lista.add(Pr);
			}	
			
			
			for (Professor Prof : lista) {
				
				bw.write("Nome: " + Prof.getNome()+" ");
				bw.write("Idade: " + Prof.getIdade()+" ");
				bw.write("Sexo: " + Prof.getSexo()+" ");
				bw.write("Disciplina: " + Prof.getDisciplina()+"\n");
				
			}
			bw.close();
							
				System.out.println("Deseja continuar cadastrando?");
				System.out.println("1- Sim");
				System.out.println("0- Não (Retorna ao Menu)");
		
				int numMenu;
				numMenu = leitor.nextInt();
								
				switch (numMenu) {
					 case 1 :
					cadProfessor();
					break;
					  default:
					menu();
					break;
					 }
		
				//bw.close();
				
						}
		public static void listProfessor() throws IOException{

			File arquivo = new File("Professores.txt");
			int numMenu = lerArquivo(arquivo);						
			switch (numMenu) {
				 case 1 :
				listProfessor();
				break;
				  default:
				menu();
			
				 }
	
		}
		public static void apagarArquivo() throws IOException{
			
			System.out.print("Informe o nome do arquivo que deseja apagar: ");
			Scanner scan = new Scanner(System.in);
			String nomeDoArquivo = scan.nextLine();
			
			File listas = new File(nomeDoArquivo);
			if (listas.exists()) {
					
				System.out.println("\nTem certeza que deseja apagar o Arquivo "+nomeDoArquivo+"?");
				System.out.println("1- Sim");
				System.out.println("0- Não (Retorna ao Menu)");
				
				int del = scan.nextInt();
				switch (del) {
				 case 1 :
				listas.delete();
				System.out.println("Arquivo Excluído");
				break;
				  default:
				menu();
				}		
								
		}else{
			System.out.println("Arquivo não encontrado!");
		}	
			System.out.println("\nDeseja apagar outro Arquivo?");
			System.out.println("1- Sim");
			System.out.println("0- Não (Retorna ao Menu)");
	
			int nMenu = scan.nextInt();
			switch (nMenu) {
			 case 1 :
			apagarArquivo();
			break;
			  default:
			menu();
					
			 }
			scan.close();
		}
		private static int lerArquivo(File arquivo) throws FileNotFoundException {
			
			//Verifica se o arquivo existe
		if (arquivo.exists()) {
			//Faz a leitura do arquivo e joga na tela
		Scanner scanLeitura = new Scanner(arquivo);
			int numeroDaLinha = 1;
			while (scanLeitura.hasNext()) {
				String linha = scanLeitura.nextLine();
				System.out.println(numeroDaLinha++ + ": " + linha);
		}
				scanLeitura.close();
		}else{
			System.out.println("Arquivo não encontrado!");
		}		

		System.out.println("\nDeseja verificar novamente?");
			System.out.println("1- Sim");
			System.out.println("0- Não (Retorna ao Menu)");
			int numMenu;
			numMenu = leitor.nextInt();
			return numMenu;
		}
		}






