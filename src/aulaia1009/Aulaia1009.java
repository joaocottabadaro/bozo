/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaia1009;
import java.util.Scanner;
/**
 *
 * @author ice
 */
public class Aulaia1009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("digite a quantidade de jogadores");
        int jogadores = scan.nextInt(); 
        Jogo a = new Jogo(jogadores);
        a.Jogadores();
        a.iniciarBozo();
    }
    
}
