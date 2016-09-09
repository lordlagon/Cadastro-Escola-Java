package br.edu.up;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

		public static void main(String[] args) throws IOException {
		menu();		}
		
		public static void menu() throws IOException {
			// TODO Auto-generated method stub
				System.out.println("Digite o numero para a função");
				System.out.println("1 - Cadastro de Aluno");
				System.out.println("2 - Cadastro de Professores");
				System.out.println("3 - Relatório das Listas");
				System.out.println("0 - Sair do Menu");
				int numMenu;
				Scanner leitor = new Scanner (System.in);
				System.out.println("Digite o numero: ");
				String menu = new String();
				menu = leitor.nextLine();
				numMenu = Integer.parseInt(menu);
				
				
				switch (numMenu) {
					 case 1 :
						 cadAluno();
						 break;
					 case 2:
						 cadProfessor();
						 
						 break;
					 case 3:
						 
						 listAluno();
						 break;
					 
					 case 0:
						 System.out.println("!Você Fechou o Programa!\n");
						 break;
					  default:
						 System.out.println("\n!Numero Incorreto!");
						 menu();
						 break;
					 }
		 
			}
			
		public static void cadAluno() throws IOException{
				// TODO Auto-generated method stub

			/*-----------------------------Cadastro de Novo Aluno-------------------*/
				
		//	
		//	
//			if (Alunos.exists()){
//				Scanner scanLeitura = new Scanner (Alunos);
//				int numLinha = 1;
//				while (scanLeitura.hasNextLine()){
//					String linha = scanLeitura.nextLine();
//					System.out.println(numLinha++ + ": "+ linha);
//					bw.write(linha);
//					
//					
//				}
//				
//				scanLeitura.close();
//			}
		//	
			Scanner leitor = new Scanner (System.in);
			File Alunos = new File("alunos.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(Alunos,true));
							
			System.out.println("Informe a quantidade de aluno que serão cadastrados:");
				
				
				int qntd=0;
				String numQntd = new String();
				numQntd = leitor.nextLine();
				qntd = Integer.parseInt(numQntd);
			
				/*Cria a Lista de Alunos Novos*/
			List <Aluno> lista = new ArrayList<Aluno>();
					
			for (int i = 0; i < qntd; i++) {
				Aluno A = new Aluno();
				System.out.println("Digite um nome:");
				A.setNome(leitor.nextLine());
				System.out.println("Digite a idade:");
				A.setIdade(Integer.parseInt(leitor.nextLine()));
				System.out.println("Digite o sexo:");
				A.setSexo(leitor.nextLine());
			
				lista.add(A);
				}
			
			
				
				for (Pessoa Aluno : lista) {
					System.out.println("Nome: " + Aluno.getNome());
					System.out.println("Idade: " + Aluno.getIdade());
					System.out.println("Sexo: " + Aluno.getSexo());
					System.out.println("-----------------------------\n");
					
					bw.write("Nome: " + Aluno.getNome()+" ");
					bw.write("Idade: " + Aluno.getIdade()+" ");
					bw.write("Sexo: " + Aluno.getSexo()+";\n");
					
					//bw.write("Nome:" + Aluno.getNome()+" "+ "Idade:"+ Aluno.getIdade()+" "+ "Sexo:" + Aluno.getSexo() +";");
				}
				
				bw.close();
				//fw.close();
							
				System.out.println("Deseja cadastrar mais algum aluno?");
				System.out.println("1- Sim");
				System.out.println("0- Não");
		
				int numMenu;
				System.out.println("Digite o numero: ");
				String Novo = new String();
				Novo = leitor.nextLine();
				numMenu = Integer.parseInt(Novo);
				
				switch (numMenu) {
					 case 1 :
						 cadAluno();
						 break;
					  default:
					menu();
						 break;
					 }
				leitor.close();
			
				
						}
					
		public static void listAluno() throws IOException{
			
			Scanner num = new Scanner(System.in);
			System.out.print("Localizando Relatórios...\n\n");
			
			System.out.print("1- Alunos.txt\n");
			System.out.print("2- Professores.txt\n");
			System.out.print("Digite o numero do arquivo\n");
			
			
//			System.out.print("Informe o nome do arquivo: ");
			Scanner leitor = new Scanner(System.in);
//			String nomeDoArquivo = scan.nextLine();
//			scan.close();
			
			int numArquivo;
			String Novo2 = new String();
			Novo2 = leitor.nextLine();
			numArquivo = Integer.parseInt(Novo2);
			
			switch (numArquivo) {
				 case 1 :
					 File arquivo = new File("Alunos.txt");
					 if (arquivo.exists()) {
							Scanner scanLeitura = new Scanner(arquivo);
							int numeroDaLinha = 1;
							while (scanLeitura.hasNext()) {
								String linha = scanLeitura.nextLine();
								System.out.println(numeroDaLinha++ + ": " + linha);
						}
								scanLeitura.close();
						}
									 
					 break;
				 case 2 :
					 File arquivo2 = new File("Professores.txt");
					 if (arquivo2.exists()) {
							Scanner scanLeitura = new Scanner(arquivo2);
							int numeroDaLinha = 1;
							while (scanLeitura.hasNext()) {
								String linha = scanLeitura.nextLine();
								System.out.println(numeroDaLinha++ + ": " + linha);
						}
								scanLeitura.close();
						}
					
				  default:
				menu();
					 break;
				 }
		 
					
			
			System.out.println("Deseja verificar outro Arquivo?");
			System.out.println("1- Sim");
			System.out.println("0- Não");
	
			int numMenu;
			System.out.println("Digite o numero: ");
			String Novo = new String();
			
			Novo = leitor.nextLine();
			numMenu = Integer.parseInt(Novo);
			
			switch (numMenu) {
				 case 1 :
					 listAluno();
					 break;
				  default:
				menu();
					 break;
				 }
			leitor.close();
		
		}	
			

		
		
		public static void cadProfessor() throws IOException {



		/*-----------------------------Cadastro de Novo Professor-------------------*/
		Scanner leitor = new Scanner (System.in);	
		File Professores = new File("professores.txt");
		FileWriter fw = new FileWriter (Professores);
		BufferedWriter bw = new BufferedWriter(fw);
				
		int qntd=0;
		System.out.println("Informe a quantidade de Professores que serão cadastrados:");
		String numQntd = new String();
		numQntd = leitor.nextLine();
		qntd = Integer.parseInt(numQntd);

		List <Professor> lista = new ArrayList<Professor>();

		/*Preenche mais duas pessoas*/

		for (int i = 0; i < qntd; i++) {
		Professor Pr = new Professor();
		System.out.println("Digite um nome:");
		Pr.setNome(leitor.nextLine());
		System.out.println("Digite a idade:");
		Pr.setIdade(Integer.parseInt(leitor.nextLine()));
		System.out.println("Digite o sexo:");
		Pr.setSexo(leitor.nextLine());

		lista.add(Pr);
		}

		leitor.close();


		for (Pessoa Professor : lista) {
			bw.write("Nome:" + Professor.getNome()+" "+ "Idade:"+ Professor.getIdade()+" "+ "Sexo:" + Professor.getSexo() +"; ");
						
		}

		bw.close();
		fw.close();
		}

		public static void listProfessor() throws IOException{
			System.out.print("Informe o nome do arquivo: ");
			Scanner scan = new Scanner(System.in);
			String nomeDoArquivo = scan.nextLine();
			scan.close();

			File arquivo = new File(nomeDoArquivo);
			if (arquivo.exists()) {
			Scanner scanLeitura = new Scanner(arquivo);
			int numeroDaLinha = 1;
			while (scanLeitura.hasNext()) {
				String linha = scanLeitura.nextLine();
				System.out.println(numeroDaLinha++ + ": " + linha);
		}
				scanLeitura.close();
		}
		}	
}

		
