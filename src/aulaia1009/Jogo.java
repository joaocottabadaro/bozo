/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaia1009;
import java.util.ArrayList;
 import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ice
 */
public class Jogo {
   private int numJogadores;
   
    ArrayList<Jogador> jogadores = new  ArrayList();
Scanner scan = new Scanner(System.in);
    public Jogo(int numJogadores)
    {
     this.numJogadores = numJogadores;   
    }   
    
    /**
     *
     */
    public void Jogadores(){
        
        System.out.println("Digite o nome dos Jogadores:");
        for(int i = 0;i<numJogadores;i++)
        {
            jogadores.add( new Jogador(scan.nextLine())); 
        }
        
                                     }
    
    
    public void iniciarBozo()          {

    for(int i =0;i<3;i++)
   {  
        for(Jogador jogador: jogadores){
            System.out.println("jogador "+ jogador.getNome() + "  sua vez " );
            
            jogador.lancaDados();
            System.out.println(" Quantos dados quer trocar");
            int numTroca =scan.nextInt();
            if(numTroca !=0)
            {
                System.out.println("digite a posicao dos dados");
                int w=0;
                while(w<numTroca)
                {
                int faceTroca =scan.nextInt();
                jogador.trocaDados(faceTroca);
                w++;
                }
                jogador.escolhePosicao();
            }
             else
                jogador.escolhePosicao();
    }
        
   }
    int maior =0;
    for(Jogador jogador:jogadores){
    for(int i=0;i<numJogadores;i++)
    {
       if(jogador.pontuacaoFinal()>maior)
           maior=jogador.pontuacaoFinal();
                
            
    }
       for(int i=0;i<numJogadores;i++){
           if(maior==jogador.pontuacaoFinal())
           {
               System.out.println("O vencedor foi "+jogador.getNome());
               break;
           }
           
       }
       break;
    }    
        
        
    }    
        
        
 }
        
        
        
        
        
        
        
        
        
        
        
     
        
              
























                        
    


   
            

            
