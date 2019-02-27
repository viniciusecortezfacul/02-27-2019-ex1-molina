/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortez.ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Eustaquio Cortez
 */
public class Elevator {
    private boolean isOpen = false;
    private byte andarAtual = 0;
    private final int ANDAR_MAIS_ALTO = 40;
    private final int ANDAR_MAIS_BAIXO = 0;
    public void openDoor(){
        System.out.println("Porta abrindo...");
        this.isOpen = true;
        System.out.println("Porta aberta!");
        
    }
    public void closeDoor(){
        System.out.println("Porta fechada...");
        this.isOpen = false;
        System.out.println("Porta fechada!");
       
    }
    public void goUp(){
        if(this.andarAtual == 40) System.err.println("Você já está no último andar!");
        else ++this.andarAtual;
        System.out.println("Subiu para o andar: " + this.andarAtual);
    }
    public void goDown(){
       if(this.andarAtual == 0) System.err.println("Não é possível ir mais para baixo");
       else --this.andarAtual;
        System.out.println("Desceu para o andar: " + this.andarAtual);
    }
    public void goUtil(int x){
        
        if(!(x > 40 || x < 0)){
            if(this.andarAtual > x){
                while(this.andarAtual != x){
                    this.goDown();
                }
            }else if(this.andarAtual < x){
                while(this.andarAtual != x){
                    this.goUp();
                }
            }else{
                System.out.println("Você já está no andar desejado!");
            }
        }else{
            System.out.println("Andar não existe!");
        }
    }
    public int getAndarAtual(){
        return this.andarAtual;
    }
}
