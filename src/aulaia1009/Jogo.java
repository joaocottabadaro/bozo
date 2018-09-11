/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaia1009;
import java.util.ArrayList;
        

/**
 *
 * @author ice
 */
public class Jogo {
    ArrayList<Jogador> jogadores = new  ArrayList();
    ArrayList<Dado> dados  = new ArrayList();

    public Jogo() {
        for(int i=0;i<3;i++)
        {
            jogadores.add(new Jogador());
        }
        for(int i=0;i<5;i++)
        {
            dados.add(new Dado());
            
        }
    }
}

   
            

            
           
