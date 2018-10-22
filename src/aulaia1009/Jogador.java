/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaia1009;
import java.util.Scanner;
 

public class Jogador {
    
       private String nome;
       Tabuleiro tab = new Tabuleiro();
       int numJogada;
        Scanner scan = new Scanner(System.in);
       Dado dado1 = new Dado();
  
      
    public Jogador(String nome) {
        this.nome = nome;
    }
   
       
   public void setNome(String nome)
   {
            this.nome = nome;
        }

    public String getNome() {
        return nome;
    }

   
    public void lancaDados() {
        dado1.rolarDado();
        dado1.exibeFaces();
    }
      
      void escolhePosicao()
     {
        System.out.println("escolha a sua jogada\n" +"0-AS");
         System.out.println( " 1-Duque  2-Terno  3-Quadra  4-Quina  5-Sena  6-FU  7-Seguida 8-Quadrada  9-General\"");
         numJogada = scan.nextInt();
         tab.calcularPontuacao(numJogada, dado1);
     }
             
      //dado1.rolarPosicao(num);
   
    public void trocaDados(int num)
    {
    dado1.trocarDado(num);
    dado1.exibeFaces();
    }
    
    public int pontuacaoFinal()
            {  
             return tab.pontuacaoJogador();
            
    }
   }



  
