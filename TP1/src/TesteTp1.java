import java.util.Scanner;
import java.util.ArrayList;
public class TesteTp1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int contCadastro=0, opc2=0;
		int opc, temas, palavras, jogar;
		
		//String lerTemas [] = new String [50];
		String[][] lerTemas2 = new String[5][11];
		
		lerTemas2[0][0] = "Times de Futebol";lerTemas2[0][1] = "Cruzeiro"; lerTemas2[0][2]= "Goias"; lerTemas2[0][3]= "Flamengo"; lerTemas2[0][4]= "Santos"; lerTemas2[0][5]= "Botafogo";lerTemas2[0][6]= "Fluminense";lerTemas2[0][7]= "Sao Paulo";lerTemas2[0][8]= "Criciuma";lerTemas2[0][9]= "Real Madrid";lerTemas2[0][10]= "Barcelona";
		lerTemas2[1][0] = "Times de Basquete"; lerTemas2[1][1] = "Celtics"; lerTemas2[1][2]= "Cavaliers"; lerTemas2[1][3]= "Pistons"; lerTemas2[1][4]= "Pacers"; lerTemas2[1][5]= "Warriors";lerTemas2[1][6]= "Clippers";lerTemas2[1][7]= "Lakers";lerTemas2[1][8]= "Suns";lerTemas2[1][9]= "Rockets";lerTemas2[1][10]= "Pelicans";
		lerTemas2[2][0] = "Países"; lerTemas2[2][1] = "Alemanha"; lerTemas2[2][2]= "Angola"; lerTemas2[2][3]= "Bahamas"; lerTemas2[2][4]= "Bangladexe"; lerTemas2[2][5]= "Brasil";lerTemas2[2][6]= "Camaroes";lerTemas2[2][7]= "Equador";lerTemas2[2][8]= "Filipinas";lerTemas2[2][9]= "Hungria";lerTemas2[2][10]= "Iraque";
		lerTemas2[3][0] = "Animal";lerTemas2[3][1] = "Abelha"; lerTemas2[3][2]= "Baiacu"; lerTemas2[3][3]= "Aranha"; lerTemas2[3][4]= "Andorinha"; lerTemas2[3][5]= "Carrapato";lerTemas2[3][6]= "Diabo da Tasmania";lerTemas2[3][7]= "Ema";lerTemas2[3][8]= "Enguia";lerTemas2[3][9]= "Escaravelho";lerTemas2[3][10]= "Faisao";
		lerTemas2[4][0] = "Marcas";lerTemas2[4][1] = "Adidas"; lerTemas2[4][2]= "Bad Boy"; lerTemas2[4][3]= "Cavalera"; lerTemas2[4][4]= "Electrolux"; lerTemas2[4][5]= "Fanta";lerTemas2[4][6]= "Havaianas";lerTemas2[4][7]= "Huawei";lerTemas2[4][8]= "Jaguar";lerTemas2[4][9]= "Lacoste";lerTemas2[4][10]= "Jeep";
		
		
		

		do {
			System.out.println("                                MENU PRINCIPAL");
			System.out.println("1. Gerenciador de Temas, 2. Gerenciar Palavras, 3. Jogar e 4. Sair:");
			opc = ler.nextInt();
			
			switch (opc) {
				case 1:
					
					do {
						System.out.println("                         Gerenciador de Temas:");
						System.out.println("1. Cadastrar Temas, 2. Excluir Temas, 3. Buscar Temas, 4. Voltar ao Menu Principal");
						temas = ler.nextInt();
						
						switch(temas) {
							case 1:
								System.out.println(" ");
								System.out.println("            Sessão de Cadastro de Temas:");
								
								do {
			
									System.out.println("Digite o nome do Tema: ");
									lerTemas2 [contCadastro][0]= ler.nextLine();
									ler.nextLine();
									contCadastro++;
									
									
									if(contCadastro <=2){
                                        System.out.println("Quer cadastrar mais temas?");
                                        System.out.println("Digite 1 para sim e qualquer OUTRO número para não!!!");
                                        opc2 = ler.nextInt();
                                        continue;
                                    }else {
                                        System.out.println("Você chegou ao limite de temas cadastrados!");
                                        System.out.println("Voltando para o Gerenciador de Temas....");
                                        break;
                                    }
									
								}while(opc2 > 0 && opc2<2);
								break;
								
							case 2:
								System.out.println("Excluir Temas");

								break;
								
							case 3:
								System.out.println("         Buscador de Temas:");
								
									System.out.println(lerTemas2[0][0]);
								break;
								
							case 4:
								System.out.println("Voltando ao Menu Principal....");
								System.out.println(" ");
								System.out.println(" ");
								break;
						}
						
					}while(temas>0 && temas<4);
					break;
				case 2:	
					
					do {
						System.out.println("Gerenciar Palavras:");
						System.out.println("1. Cadastrar Palavras, 2. Excluir Palavras, 3. Buscar Palavras");
						palavras = ler.nextInt();
						switch(palavras) {
							case 1:
								
								break;
							case 2:
								
								break;
							case 3:
								
								break;
							case 4:
								System.out.println("Voltando ao Menu....");
								break;
						}
						
						
					}while(palavras>0 && palavras<4);		
					break;
				case 3:
					
					do {
						System.out.println("Jogar:");
						jogar = ler.nextInt();
						switch(jogar) {
							case 1:
								
								break;
							case 2:
								
								break;
							case 3:
								
								break;
							case 4:
								System.out.println("Voltando ao Menu....");
								break;
						}
						
					}while(jogar>0 && jogar<4);
					break;
				case 4:
					System.out.println("Saindo...");
					break;
			}
		
		}while(opc>0 && opc<4);
	}

}