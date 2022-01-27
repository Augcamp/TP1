import java.util.Scanner;
import java.util.ArrayList;
public class TesteTp1 {
	static Scanner ler = new Scanner(System.in);
	static int opc, palavras, jogar;
	static String[][] lerTemas2 = new String[51][51];

	public static void main(String[] args) {
	
		
		lerTemas2[0][0] = "times de futebol";lerTemas2[0][1] = "cruzeiro"; lerTemas2[0][2]= "goias"; lerTemas2[0][3]= "flamengo"; lerTemas2[0][4]= "santos"; lerTemas2[0][5]= "botafogo";lerTemas2[0][6]= "fluminense";lerTemas2[0][7]= "sao paulo";lerTemas2[0][8]= "criciuma";lerTemas2[0][9]= "real Madrid";lerTemas2[0][10]= "barcelona";
		lerTemas2[1][0] = "times de basquete"; lerTemas2[1][1] = "celtics"; lerTemas2[1][2]= "cavaliers"; lerTemas2[1][3]= "pistons"; lerTemas2[1][4]= "pacers"; lerTemas2[1][5]= "warriors";lerTemas2[1][6]= "clippers";lerTemas2[1][7]= "lakers";lerTemas2[1][8]= "suns";lerTemas2[1][9]= "rockets";lerTemas2[1][10]= "pelicans";
		lerTemas2[2][0] = "paises"; lerTemas2[2][1] = "alemanha"; lerTemas2[2][2]= "angola"; lerTemas2[2][3]= "bahamas"; lerTemas2[2][4]= "bangladexe"; lerTemas2[2][5]= "brasil";lerTemas2[2][6]= "camaroes";lerTemas2[2][7]= "equador";lerTemas2[2][8]= "filipinas";lerTemas2[2][9]= "hungria";lerTemas2[2][10]= "iraque";
		lerTemas2[3][0] = "animais";lerTemas2[3][1] = "abelha"; lerTemas2[3][2]= "baiacu"; lerTemas2[3][3]= "aranha"; lerTemas2[3][4]= "andorinha"; lerTemas2[3][5]= "carrapato";lerTemas2[3][6]= "diabo da tasmania";lerTemas2[3][7]= "ema";lerTemas2[3][8]= "enguia";lerTemas2[3][9]= "escaravelho";lerTemas2[3][10]= "faisao";
		lerTemas2[4][0] = "marcas";lerTemas2[4][1] = "adidas"; lerTemas2[4][2]= "bad Boy"; lerTemas2[4][3]= "cavalera"; lerTemas2[4][4]= "electrolux"; lerTemas2[4][5]= "fanta";lerTemas2[4][6]= "havaianas";lerTemas2[4][7]= "huawei";lerTemas2[4][8]= "jaguar";lerTemas2[4][9]= "lacoste";lerTemas2[4][10]= "jeep";
		
		for (int k = 5; k < 51; k++) {
            lerTemas2[k][0] = "null";
        }
		
		metodoPalavra(lerTemas2,5,1);
		metodoPalavra(lerTemas2,0,11);


		do {
			System.out.println("                                MENU PRINCIPAL");
			System.out.println("1. Gerenciador de Temas, 2. Gerenciar Palavras, 3. Jogar e 4. Sair:");
			opc = ler.nextInt();
			
			switch (opc) {
				case 1:
					metodoGerenciarTemas(lerTemas2);
					break;
				case 2:	
					metodoGerenciarPalavras(lerTemas2);
							
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
	static void metodoPalavra(String[][] lerTemas2, int i, int k) {
		for (int m=i ; m < 51; m++) {
			for (int n = k; n < 51; n++){
				lerTemas2[m][n] = "null";
			}
        }
	}
	static void metodoGerenciarTemas(String[][] lerTemas2) {
		
		int contCadastro=0, opc2=0;
		int veriTema=0, veriTema2=0, veriTema3=0;
		int temas;
		String nomeTema, excluirTema;

		do {
			System.out.println("                         Gerenciador de Temas:");
			System.out.println("1. Cadastrar Temas, 2. Excluir Temas, 3. Buscar Temas, 4. Voltar ao Menu Principal");
			temas = ler.nextInt();
			ler.nextLine();
			
			switch(temas) {
				case 1:
					System.out.println(" ");
					System.out.println("            Sessão de Cadastro de Temas:");
								
					do {

						System.out.println("Digite o nome do Tema: ");
						nomeTema = ler.nextLine();
						nomeTema = nomeTema.toLowerCase();
						contCadastro++;
						
						for(int i=0; i<50; i++){
				            if(lerTemas2[i][0].equals(nomeTema)){
				            	System.out.printf("O tema %s já existe!", nomeTema ); 
				                System.out.println(" ");
				                System.out.println(" ");
				                veriTema = 1;
				            }
				        }
				        if (veriTema!=1){
				            System.out.printf("O tema %s foi adicionado!!!", nomeTema);
				            System.out.println(" ");
				            for(int b=0; b<50; b++){
                                if(lerTemas2[b][0].equals("null")){
                                lerTemas2[b][0] = lerTemas2[b][0].replace(lerTemas2[b][0], nomeTema); 
                                break;
                                }
                            }
				        }
						
						
						if(contCadastro <50){
                            System.out.println("Quer cadastrar mais temas?");
                            System.out.println("Digite 1 para sim e qualquer OUTRO número para não!!!");
                            opc2 = ler.nextInt();
                            ler.nextLine();
                            continue;
                        }else {
                            System.out.println("Você chegou ao limite de temas cadastrados!");
                            System.out.println("Voltando para o Gerenciador de Temas....");
                            break;
                        }
						
					}while(opc2 > 0 && opc2<2);
					break;
					
				case 2:
					System.out.println("        Excluir Temas");
					System.out.println("Digite o nome do Tema a ser exluido: ");
					excluirTema = ler.nextLine();
					excluirTema = excluirTema.toLowerCase();
					
					for(int c=0; c<50; c++){
			            if(lerTemas2[c][0].equals(excluirTema)){
			            	for(int d=1; d<50; d++){
			            		if(lerTemas2[c][d].equals("null") == false){
                                    System.out.println("Não é possível exluir temas que possuam palavras cadastradas!!");
                                    veriTema2 = 1;
                                    break;
                                }
			            	} 
			            	if(veriTema2!=1) {
				            	System.out.printf("O tema %s foi excluido!!!", excluirTema); 
				            	lerTemas2[c][0] = lerTemas2[c][0].replace(lerTemas2[c][0], "null");
				                System.out.println(" ");
				                System.out.println(" ");
				                veriTema3 = 1;
			                }
			            }
			        }
					
					
					if (veriTema3!=1 && veriTema2!=1){
						System.out.printf("O tema %s não foi encontrado!!!", excluirTema);
						System.out.println(" ");
					}

					break;
					
				case 3:
					System.out.println("         Buscador de Temas:");
					for (int a = 0; a < 50; a++) {
			            System.out.printf(lerTemas2[a][0] + ",         posição do Tema: %d - 0", a );
			            System.out.println(" ");
			        }
					
					break;
					
				case 4:
					System.out.println("Voltando ao Menu Principal....");
					System.out.println(" ");
					System.out.println(" ");
					break;
			}
			
		}while(temas>0 && temas<4);
	}
	
	
	static void metodoGerenciarPalavras(String[][] lerTemas2) {
		int contPalavra=0, opc2=0;
		int veriTema=0, veriTema2=0, veriTema3=0, veriTema4=0,veriPalavra=0, veriPalavra2=0;
		int palavras;
		String nomeTema, excluirTema, nomePalavra, excluirPalavra;

		do {
			System.out.println("");
			System.out.println("");
			System.out.println("                               Gerenciador de Palavras:");
			System.out.println("1. Cadastrar Palavras, 2. Excluir Palavras, 3. Buscar Palavras, 4. Listagem, 5. Voltar ao Menu Principal");
			palavras = ler.nextInt();
			ler.nextLine();
			
			switch(palavras) {
				case 1:
					System.out.println(" ");
					System.out.println("            Sessão de Cadastro de Palavras:");
								
					do {

						System.out.println("Digite o nome do Tema: ");
						nomeTema = ler.nextLine();
						nomeTema = nomeTema.toLowerCase();
						
						
						for(int i=0; i<50; i++){
				            if(lerTemas2[i][0].equals(nomeTema)){
				            	System.out.printf("O tema %s foi encontrado!", nomeTema );
				            	veriTema=1;
				            	System.out.println(" ");
				            	System.out.println("Digite a palavra a ser cadastrada: ");
				                nomePalavra = ler.nextLine();
				                nomePalavra = nomePalavra.toLowerCase();

				            	for(int k=1; k<51; k++) {
				            		if(lerTemas2[i][k].equals("null")|| lerTemas2[i][k].equals(nomePalavra)){
		                                lerTemas2[i][k] = lerTemas2[i][k].replace(lerTemas2[i][k], nomePalavra); 
		                                contPalavra++;
		                                break;
		                                }
				            	}			                
				            }
				        }
						if(veriTema!=1) {
							System.out.println("O tema não existe!!!");
							System.out.println("Voltando para o Gerenciador de Palavras....");
							break;
						}
						if(contPalavra<40){
                            System.out.println("Quer cadastrar mais palavras?");
                            System.out.println("Digite 1 para sim e qualquer OUTRO número para não!!!");
                            opc2 = ler.nextInt();
                            ler.nextLine();
                            continue;
                        }else {
                            System.out.println("Você chegou ao limite de palavras cadastradas!");
                            System.out.println("Voltando para o Gerenciador de Palavras....");
                            break;
                        }
						
					}while(opc2 > 0 && opc2<2);
					break;
					
				case 2:
					System.out.println("        Excluir Palavras: ");
					System.out.println("Digite o nome do Tema onde você queira excluir a palavra: ");
					nomeTema = ler.nextLine();
					nomeTema = nomeTema.toLowerCase();
    

					for(int v=0; v<50; v++) {
                        if(lerTemas2[v][0].equals(nomeTema)) {
                            System.out.print("Digite a palavra a ser excluida: ");
                            excluirPalavra = ler.nextLine();
                            excluirPalavra = excluirPalavra.toLowerCase();
                            for(int u=1; u<50; u++){
                                if(lerTemas2[v][u].equals(excluirPalavra)){
                                	System.out.printf("A palavra %s foi excluida!", excluirPalavra );
                                	System.out.println(" ");
                                    lerTemas2[v][u] = lerTemas2[v][u].replace(lerTemas2[v][u], "null"); 
                                    veriPalavra = 1;
                                    break;
                                }
                            }
                            if(veriPalavra != 1){
                                System.out.printf("A palavra %s não foi encontrada!", excluirPalavra );
                                System.out.println(" ");
                                System.out.println("Voltando ao Menu.... ");
                                veriPalavra2 = 1;
                            }
                            break;
                        }
                    }
                    if (veriPalavra2 != 1 && veriPalavra != 1){
                    	System.out.printf("O tema %s não foi encontrado!", nomeTema );
                    }

                    System.out.println(" ");
                    break;
				case 3:

					
					break;
					
				case 4:
					
					System.out.println("                           Listagem de Palavras:");
					System.out.println("Digite o nome do Tema para acessar sua Listagem: ");
					nomeTema = ler.nextLine();
					nomeTema = nomeTema.toLowerCase();
					
					for(int w=0; w<50; w++){
                        if(lerTemas2[w][0].equals(nomeTema)){
                            veriTema4 = 1;
                            for(int z=1; z<51; z++) {   
                                System.out.println(lerTemas2[w][z]);
                            }  
                        }
                    }
                    if (veriTema4 != 1)  {
                        System.out.println("Tema não encontrado!");
                        System.out.println("Voltando ao Menu Principal....");
                    }
                    break;
				case 5: 
					System.out.println("Voltando ao Menu Principal....");
					System.out.println(" ");
					System.out.println(" ");
					break;
					
			}
			
		}while(palavras>0 && palavras<4);
	}
}