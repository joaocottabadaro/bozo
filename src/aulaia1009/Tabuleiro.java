/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaia1009;


public class Tabuleiro {
    private int pontPosicao[] = {1,2,3,4,5,6,20,30,40,50};
           private int pontosJogador=0;
      
         //   calcularPontuacao();
   public void exibeTabuleiro()
   {
       for(int i=0;i<11;i++)
           System.out.println(pontPosicao[i]+"\n");
   
   }
   
   public void calcularPontuacao(int posicao, Dado dado1)
   {
       if(posicao ==0 )
       {
           int k=0;
       for(int i =0;i<5;i++)
       {
        if (dado1.faces[i] == 0){
            pontosJogador++;
        k+=2;
        } 
       
       }
           System.out.println(k);
       }
       
         if(posicao ==1 )
       {
           int k=0;
       for(int i =0;i<5;i++)
       {
        if (dado1.faces[i] == 2){
            pontosJogador=pontosJogador +2;
            k+=2;
        }
       }
           System.out.println(k);
       }
       
        if(posicao ==2 )
       {
           int k=0;
       for(int i =0;i<5;i++)
       {
        if (dado1.faces[i] == 3){
            pontosJogador=pontosJogador +3;
            k+=3;
        } 
       
       }
           System.out.println(k);
       }
        
         if(posicao ==3 )
       {
           int k=0;
       for(int i =0;i<5;i++)
       {
        if (dado1.faces[i] == 4){
            pontosJogador=pontosJogador +4;
            k+=4;
        }    
       
       }
           System.out.println(k);
       }
       
    if(posicao ==4 )
       {
           int k=0;
       for(int i =0;i<5;i++)
       {
        if (dado1.faces[i] == 5){
            pontosJogador=pontosJogador +5;
        }   
       
       }
           System.out.println(k);
       }
   
           if(posicao == 5 )
       {
           int k=0;
       for(int i =0;i<5;i++)
       {
        if (dado1.faces[i] == 6){
            pontosJogador=pontosJogador +6;
            k+=6;
        }   
       
       }
           System.out.println(k);
       }
           
        if(posicao == 9)
        {
              int k=0;
             int j =1;
             int num1 = dado1.faces[0];
              for(int i =1;i<5;i++)
              {
                  if(dado1.faces[i]==num1)
                      j++;
              
              }
              if(j==6){
                  pontosJogador+=60;
              k=60;
              }     
              System.out.println(k);
          
          
          
          
        }
        if(posicao==6){
          int k=1;
          int z=0;
          int z1=0;
          int w=dado1.faces[0];
          for(int i =1;i<5;i++) {
        if(dado1.faces[i]==w)
          {
            k++;
        }
          }
        if(k==2 || k==3)
        {
        for(int i =0;i<5;i++){
            if(dado1.faces[i]!=k)
              {
                z1=dado1.faces[i]; 
                break;
            }
  
        }
        for(int i =1;i<5;i++)
        if(dado1.faces[i]==z1)
          {
            z++;
        }
        if(z1==2 || z1==3){
            pontosJogador+=20;
        k=20;
        }
            System.out.println(k);
        }
        else
                System.out.println("k");
        
       
      
        
        }
        
    if(posicao==8 ){
        int k=0;
        int z=dado1.faces[0];
        int j=1;
        int v=0;
        int h=0;
    for(int i=1;i<5;i++){
        if(dado1.faces[1]==z)
            h++;
      
        
        
    }
    if(z==1 || z==4){
       for(int i =0;i<5;i++){
            if(dado1.faces[i]!=v)
              {
                v=dado1.faces[i]; 
                break;
            }
  
        }
        for(int i =1;i<5;i++)
        if(dado1.faces[i]==v)
          {
            h++;
        } 
    if(h==4){
         pontosJogador+=40;
         k=40;
         System.out.println(k);
       
    }
        
        
        
    }
    else
            System.out.println(k);
   
    }
          
          
          
          
          
        
        if(posicao==7)
        {
              int j=0;
              int k=0;
              int num=dado1.faces[0];
               for(int i =1;i<5;i++)
               {
                   if(dado1.faces[i]==num+1)
                       j++;
               
               
               }
            if(j==4){
            pontosJogador+=30;
             k=30;
            }
               else
                   System.out.println("nao teve pontos");
               System.out.println(k);
        }
         
        
   }
   public int pontuacaoJogador()
            {
            return pontosJogador;
            
            
            
            }
          
   
}
