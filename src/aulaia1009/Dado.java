/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaia1009;

/**
 *
 * @author ice
 */
public class Dado {
   private int numFaces;
   private int tam =5;
     int faces[] = new int[tam];
            
            
            
           
 
                            
    public void rolar()
    {
        for(int i=0;i<5;i++)
            this.faces[i]=(int)((Math.random())*6+1);
    }   

    void exibeFaces() {
        for(int i=0;i<5;i++)
            System.out.println("dado "+ i +"="+ faces[i]);
    }
        
    
    
}
