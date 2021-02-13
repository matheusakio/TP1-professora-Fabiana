import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int mes, ano, dia =1;
    Scanner ler = new Scanner(System.in);
    double jan2011, resultado = 0, soma = 0, média, maior = 0, sengundoNum= 0, menor = 999;
    // IGNORA O NOME DA VARIAVEL "jan2011", tava testando e acabei usando até o final,  
    System.out.print("Qual ano deseja? ");
    ano = ler.nextInt();
    System.out.print("Qual mês deseja? ");
    mes = ler.nextInt();
    if (ano >= 2011 && ano <= 2020) {
      if (ano == 2011) {
        if (mes >= 1 && mes <= 12) {
          if (mes == 1){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Janeiro de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Janeiro de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Janeiro de 2011 é: " + menor);


          }
          if (mes == 2){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 28);
              System.out.printf("A média de Fevereiro de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Fevereiro de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Fevereiro de 2011 é: " + menor);


          }
          if (mes == 3){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Março de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Março de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Março de 2011 é: " + menor);


          }
          if (mes == 4){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Abril de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Abril de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Abril de 2011 é: " + menor);


          }
          if (mes == 5){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Maio de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Maio de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Maio de 2011 é: " + menor);


          }
          if (mes == 6){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Junho de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Junho de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Junho de 2011 é: " + menor);


          }
          if (mes == 7){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Julho de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Julho de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Julho de 2011 é: " + menor);


          }
          if (mes == 8){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Agosto de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Agosto de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Agosto de 2011 é: " + menor);


          }
          if (mes == 9){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Setembro de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Setembro de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Setembro de 2011 é: " + menor);


          }
          if (mes == 10){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Outubro de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Outubro de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Outubro de 2011 é: " + menor);


          }
          if (mes == 11){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Novembro de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Novembro de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Novembro de 2011 é: " + menor);


          }
          if (mes == 12){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Dezembro de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Dezembro de 2011 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Dezembro de 2011 é: " + menor);


          }
        }  else {
        System.out.print("Mês invalido");
        }

      }
      
      if (ano == 2012) {
        if (mes >= 1 && mes <= 12) {
          if (mes == 1){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Janeiro de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Janeiro de2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Janeiro de 2012 é: " + menor);


          }
          if (mes == 2){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 29);
              System.out.printf("A média de Fevereiro de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Fevereiro de 2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Fevereiro de 2012 é: " + menor);


          }
          if (mes == 3){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Março de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Março de 2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Março de 2012 é: " + menor);


          }
          if (mes == 4){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Abril de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Abril de 2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Abril de 2012 é: " + menor);


          }
          if (mes == 5){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Maio de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Maio de 2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Maio de 2012 é: " + menor);


          }
          if (mes == 6){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Junho de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Junho de 2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Junho de 2012 é: " + menor);


          }
          if (mes == 7){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Julho de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Julho de 2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Julho de 2012 é: " + menor);


          }
          if (mes == 8){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Agosto de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Agosto de 2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Agosto de 2012 é: " + menor);


          }
          if (mes == 9){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Setembro de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Setembro de 2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Setembro de 2012 é: " + menor);


          }
          if (mes == 10){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Outubro de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Outubro de 2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Outubro de 2012 é: " + menor);


          }
          if (mes == 11){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Novembro de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Novembro de 2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Novembro de 2012 é: " + menor);


          }
          if (mes == 12){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Dezembro de 2012 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Dezembro de 2012 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Dezembro de 2012 é: " + menor);


          }
        }  else {
        System.out.print("Mês invalido");
        }

      }
      if (ano == 2013) {
        if (mes >= 1 && mes <= 12) {
          if (mes == 1){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Janeiro de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Janeiro de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Janeiro de 2013 é: " + menor);


          }
          if (mes == 2){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 28);
              System.out.printf("A média de Fevereiro de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Fevereiro de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Fevereiro de 2013 é: " + menor);


          }
          if (mes == 3){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Março de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Março de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Março de 2013 é: " + menor);


          }
          if (mes == 4){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Abril de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Abril de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Abril de 2013 é: " + menor);


          }
          if (mes == 5){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Maio de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Maio de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Maio de 2013 é: " + menor);


          }
          if (mes == 6){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Junho de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Junho de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Junho de 2013 é: " + menor);


          }
          if (mes == 7){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Julho de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Julho de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Julho de 2013 é: " + menor);


          }
          if (mes == 8){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Agosto de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Agosto de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Agosto de 2013 é: " + menor);


          }
          if (mes == 9){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Setembro de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Setembro de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Setembro de 2013 é: " + menor);


          }
          if (mes == 10){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Outubro de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Outubro de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Outubro de 2013 é: " + menor);


          }
          if (mes == 11){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Novembro de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Novembro de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Novembro de 2013 é: " + menor);


          }
          if (mes == 12){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Dezembro de 2013 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Dezembro de 2013 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Dezembro de 2013 é: " + menor);


          }
        }  else {
        System.out.print("Mês invalido");
        }

      }
      if (ano == 2014) {
        if (mes >= 1 && mes <= 12) {
          if (mes == 1){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Janeiro de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Janeiro de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Janeiro de 2014 é: " + menor);


          }
          if (mes == 2){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 28);
              System.out.printf("A média de Fevereiro de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Fevereiro de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Fevereiro de 2014 é: " + menor);


          }
          if (mes == 3){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Março de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Março de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Março de 2014 é: " + menor);


          }
          if (mes == 4){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Abril de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Abril de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Abril de 2014 é: " + menor);


          }
          if (mes == 5){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Maio de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Maio de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Maio de 2014 é: " + menor);


          }
          if (mes == 6){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Junho de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Junho de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Junho de 2014 é: " + menor);


          }
          if (mes == 7){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Julho de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Julho de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Julho de 2014 é: " + menor);


          }
          if (mes == 8){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Agosto de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Agosto de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Agosto de 2014 é: " + menor);


          }
          if (mes == 9){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Setembro de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Setembro de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Setembro de 2014 é: " + menor);


          }
          if (mes == 10){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Outubro de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Outubro de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Outubro de 2014  é: " + menor);


          }
          if (mes == 11){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Novembro de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Novembro de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Novembro de 2014 é: " + menor);


          }
          if (mes == 12){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Dezembro de 2014 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Dezembro de 2014 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Dezembro de 2014 é: " + menor);


          }
        }  else {
        System.out.print("Mês invalido");
        }

      }
      if (ano == 2015) {
        if (mes >= 1 && mes <= 12) {
          if (mes == 1){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Janeiro de 2015 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Janeiro de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Janeiro de 2015 é: " + menor);


          }
          if (mes == 2){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 28);
              System.out.printf("A média de Fevereiro de 2015 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Fevereiro de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Fevereiro de 2015 é: " + menor);


          }
          if (mes == 3){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Março de 2015 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Março de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Março de 2015 é: " + menor);


          }
          if (mes == 4){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Abril de 2015 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Abril de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Abril de 2015 é: " + menor);


          }
          if (mes == 5){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Maio de 2015 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Maio de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Maio de 2015 é: " + menor);


          }
          if (mes == 6){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Junho de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Junho de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Junho de 2015 é: " + menor);


          }
          if (mes == 7){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Julho de 2015 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Julho de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Julho de 2015 é: " + menor);


          }
          if (mes == 8){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Agosto de 2015 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Agosto de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Agosto de 2015 é: " + menor);


          }
          if (mes == 9){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Setembro de 2015 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Setembro de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Setembro de 2015 é: " + menor);


          }
          if (mes == 10){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Outubro de 2015 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Outubro de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Outubro de 2015 é: " + menor);


          }
          if (mes == 11){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Novembro de 2015 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Novembro de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Novembro de 2015 é: " + menor);


          }
          if (mes == 12){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Dezembro de 2015 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Dezembro de 2015 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Dezembro de 2015 é: " + menor);


          }
        }  else {
        System.out.print("Mês invalido");
        }

      }
      if (ano == 2016) {
        if (mes >= 1 && mes <= 12) {
          if (mes == 1){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Janeiro de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Janeiro de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Janeiro de 2016 é: " + menor);


          }
          if (mes == 2){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 29);
              System.out.printf("A média de Fevereiro de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Fevereiro de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Fevereiro de 2016 é: " + menor);


          }
          if (mes == 3){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Março de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Março de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Março de 2016 é: " + menor);


          }
          if (mes == 4){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Abril de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Abril de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Abril de 2016 é: " + menor);


          }
          if (mes == 5){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Maio de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Maio de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Maio de 2016 é: " + menor);


          }
          if (mes == 6){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Junho de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Junho de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Junho de 2016 é: " + menor);


          }
          if (mes == 7){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Julho de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Julho de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Julho de 2016 é: " + menor);


          }
          if (mes == 8){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Agosto de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Agosto de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Agosto de 2016 é: " + menor);


          }
          if (mes == 9){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Setembro de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Setembro de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Setembro de 2016 é: " + menor);


          }
          if (mes == 10){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Outubro de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Outubro de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Outubro de 2016 é: " + menor);


          }
          if (mes == 11){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Novembro de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Novembro de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Novembro de 2016 é: " + menor);


          }
          if (mes == 12){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Dezembro de 2016 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Dezembro de 2016 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Dezembro de 2016 é: " + menor);


          }
        }  else {
        System.out.print("Mês invalido");
        }

      }
      if (ano == 2017) {
        if (mes >= 1 && mes <= 12) {
          if (mes == 1){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Janeiro de 2017 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Janeiro de 2017 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Janeiro de 2017 é: " + menor);


          }
          if (mes == 2){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 28);
              System.out.printf("A média de Fevereiro de 2017 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Fevereiro de 2017 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Fevereiro de 2017 é: " + menor);


          }
          if (mes == 3){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Março de 2017 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Março de 2017 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Março de 2017 é: " + menor);


          }
          if (mes == 4){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Abril de 2017 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Abril de 2017 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Abril de 2017 é: " + menor);


          }
          if (mes == 5){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Maio de 2017 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Maio de 2017 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Maio de 2017 é: " + menor);


          }
          if (mes == 6){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Junho de 2017 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Junho de 2017 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Junho de 2017 é: " + menor);


          }
          if (mes == 7){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Julho de 2017 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Julho de 2017é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Julho de 2017 é: " + menor);


          }
          if (mes == 8){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Agosto de 2017 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Agosto de 2017 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Agosto de 2017 é: " + menor);


          }
          if (mes == 9){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Setembro de 2017 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Setembro de 2017 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Setembro de 2017 é: " + menor);


          }
          if (mes == 10){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Outubro de 2017 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Outubro de 2017 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Outubro de 2017 é: " + menor);


          }
          if (mes == 11){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Novembro de 2011 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Novembro de 2017 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Novembro de 2017 é: " + menor);


          }
          if (mes == 12){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Dezembro de 2017 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Dezembro de 2017 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Dezembro de 2017 é: " + menor);


          }
        }  else {
        System.out.print("Mês invalido");
        }

      }
      if (ano == 2018) {
        if (mes >= 1 && mes <= 12) {
          if (mes == 1){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Janeiro de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Janeiro de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Janeiro de 2018 é: " + menor);


          }
          if (mes == 2){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 28);
              System.out.printf("A média de Fevereiro de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Fevereiro de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Fevereiro de 2018 é: " + menor);


          }
          if (mes == 3){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Março de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Março de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Março de 2018 é: " + menor);


          }
          if (mes == 4){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Abril de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Abril de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Abril de 2018 é: " + menor);


          }
          if (mes == 5){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Maio de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Maio de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Maio de 2018 é: " + menor);


          }
          if (mes == 6){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Junho de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Junho de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Junho de 2018 é: " + menor);


          }
          if (mes == 7){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Julho de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Julho de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Julho de 2018 é: " + menor);


          }
          if (mes == 8){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Agosto de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Agosto de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Agosto de 2018 é: " + menor);


          }
          if (mes == 9){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Setembro de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Setembro de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Setembro de 2018 é: " + menor);


          }
          if (mes == 10){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Outubro de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Outubro de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Outubro de 2018 é: " + menor);


          }
          if (mes == 11){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Novembro de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Novembro de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Novembro de 2018 é: " + menor);


          }
          if (mes == 12){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Dezembro de 2018 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Dezembro de 2018 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Dezembro de 2018 é: " + menor);


          }
        }  else {
        System.out.print("Mês invalido");
        }

      }
      if (ano == 2019) {
        if (mes >= 1 && mes <= 12) {
          if (mes == 1){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Janeiro de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Janeiro de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Janeiro de 2019 é: " + menor);


          }
          if (mes == 2){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 28);
              System.out.printf("A média de Fevereiro de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Fevereiro de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Fevereiro de 2019 é: " + menor);


          }
          if (mes == 3){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Março de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Março de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Março de 2019 é: " + menor);


          }
          if (mes == 4){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Abril de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Abril de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Abril de 2019 é: " + menor);


          }
          if (mes == 5){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Maio de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Maio de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Maio de 2019 é: " + menor);


          }
          if (mes == 6){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Junho de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Junho de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Junho de 2019 é: " + menor);


          }
          if (mes == 7){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Julho de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Julho de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Julho de 2019 é: " + menor);


          }
          if (mes == 8){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Agosto de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Agosto de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Agosto de 2019 é: " + menor);


          }
          if (mes == 9){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Setembro de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Setembro de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Setembro de 2019 é: " + menor);


          }
          if (mes == 10){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Outubro de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Outubro de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Outubro de 2019 é: " + menor);


          }
          if (mes == 11){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Novembro de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Novembro de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Novembro de 2019 é: " + menor);


          }
          if (mes == 12){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Dezembro de 2019 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Dezembro de 2019 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Dezembro de 2019 é: " + menor);


          }
        }  else {
        System.out.print("Mês invalido");
        }

      }
      if (ano == 2020) {
        if (mes >= 1 && mes <= 12) {
          if (mes == 1){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Janeiro de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Janeiro de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Janeiro de 2020 é: " + menor);


          }
          if (mes == 2){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 29);
              System.out.printf("A média de Fevereiro de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Fevereiro de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Fevereiro de 2020 é: " + menor);


          }
          if (mes == 3){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Março de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Março de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Março de 2020 é: " + menor);


          }
          if (mes == 4){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Abril de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Abril de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Abril de 2020 é: " + menor);


          }
          if (mes == 5){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Maio de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Maio de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Maio de 2020 é: " + menor);


          }
          if (mes == 6){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Junho de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Junho de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Junho de 2020 é: " + menor);


          }
          if (mes == 7){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Julho de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Julho de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Julho de 2020 é: " + menor);


          }
          if (mes == 8){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Agosto de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Agosto de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Agosto de 2020 é: " + menor);


          }
          if (mes == 9){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Setembro de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Setembro de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Setembro de 2020 é: " + menor);


          }
          if (mes == 10){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Outubro de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Outubro de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Outubro de 2020 é: " + menor);


          }
          if (mes == 11){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 30);
              System.out.printf("A média de Novembro de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Novembro de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Novembro de 2020 é: " + menor);


          }
          if (mes == 12){
            do{            
              System.out.printf("Média de temperatura dia %d? ", dia);
              dia++;
              jan2011 = ler.nextDouble();
              resultado = jan2011 + soma;
              soma = resultado;
              média = resultado / dia;
              if(jan2011 >= maior){
                  maior = jan2011;
                }
              
     
              if(jan2011 <= menor){
                  menor = jan2011;
                }
     
            }while(dia >= 0 && dia <= 31);
              System.out.printf("A média de Dezembro de 2020 é: " + média);
              System.out.printf("\n" );
              System.out.printf("A maior temperatura de Dezembro de 2020 é: " + maior);
              System.out.printf("\n" );
              System.out.printf("A menor temperatura de Dezembro de 2020 é: " + menor);


          }
        }  else {
        System.out.print("Mês invalido");
        }

      }

    } else {
        System.out.print("Ano invalido");

    }
  }
}