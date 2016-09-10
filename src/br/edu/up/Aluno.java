package br.edu.up;

		public class Aluno extends Pessoa {
			
			private int matricula;
			private String Disciplinas;
			private double nota1;
			private double nota2;
			private double nota3;
			String aprovado;
			
			
			public boolean isAprovado(){
				
				double media = (nota1 + nota2 + nota3)/3;
				
				boolean isAp = false;
				
				if (media>6.0){
				isAp = true;
				}
				return isAp;
				}
			
			
			
			public double getNota3() {
				return nota3;
			}
			public void setNota3(double nota3) {
				this.nota3 = nota3;
			}
			public double getNota2() {
				return nota2;
			}
			public void setNota2(double nota2) {
				this.nota2 = nota2;
			}
			public double getNota1() {
				return nota1;
			}
			public void setNota1(double nota1) {
				this.nota1 = nota1;
			}
			public String getDisciplina() {
				return Disciplinas;
			}
			public void setDisciplina(String disciplinas) {
				this.Disciplinas = disciplinas;
			}
			public int getMatricula() {
				return matricula;
			}
			public void setMatricula(int matricula) {
				this.matricula = matricula;
			}


			

		}



