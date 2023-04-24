/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sos;

import java.util.Random;

/**
 *
 * @author Timd
 */
public class SimpleComputerGame extends Board {

    @Override
    public int makeMove(int x, int y){
        
        if((this.getComputerPlayer()==0 && this.getTurn() == 0) || (this.getComputerPlayer() == 1 && this.getTurn() == 1) || this.getComputerPlayer() == 2){
            
          int move[] = this.getComputerMove();
          x = move[0];
          y = move[1];
          
          if(this.getComputerPlayer() == 0 && this.getTurn() == 0){
              this.setRedLetter(this.getComputerLetter());
          }
          if(this.getComputerPlayer() == 1 && this.getTurn() == 1){
              this.setBlueLetter(this.getComputerLetter());
          }
          if(this.getComputerPlayer() == 2 && this.getTurn() == 1){
              this.setRedLetter(this.getComputerLetter());
          }
          if(this.getComputerPlayer() == 2 && this.getTurn() == 1){
              this.setBlueLetter(this.getComputerLetter());
          }   
        }
        //See if you can call the parent class for this later
        if(this.isEmpty(y, x) == 0){
          char letter;
          if(this.getTurn() == 0){
              letter = getRedLetter();
          }else{
              letter = getBlueLetter();
          }  
          setCell(y,x,letter);
          if(this.isSOS(y,x) == 1){
              this.setWinner();
              this.setIsGameOver();
          }else if(this.isFull()==1){
              this.setIsGameOver();
          }else{
              changeTurn(); 
          }
 
          return 1;
        }
        return 0;
    }
    
    public int[] getComputerMove(){
        int[] move = new int[2];
       
        while(true){
            Random genRandom = new Random(); 
            
            int xMove = genRandom.nextInt(0,this.getBoardSize());
            int yMove = genRandom.nextInt(0,this.getBoardSize());
            
            if(this.isEmpty(yMove, xMove) == 0){
                move[0] = xMove;
                move[1] = yMove;
                break;
            }        
        }
        
        return move;
    }
    
    public char getComputerLetter(){
        Random genRandom = new Random();
        int rand = genRandom.nextInt(2);
        if(rand == 0){
            return 'S';
        }else{
            return 'O';
        }
    }
    
}
