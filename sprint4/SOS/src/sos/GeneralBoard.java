/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sos;



/**
 *
 * @author Timd
 */
public class GeneralBoard extends Board {
    private int redScore = 0;
    private int blueScore = 0;
    public GeneralBoard(){
        this.setGameType(1);  
    }
    
    public void addRedPoint(){
        this.redScore++;
    }
    public void addBluePoint(){
        this.blueScore++;
    }
    public int getRedScore(){
        return this.redScore;
    }
    public int getBlueScore(){
        return this.blueScore;
    }
   
    @Override
    public void setWinner(){
        if (this.getRedScore() > this.getBlueScore()){
            this.winner = 0;
        }else if(this.getBlueScore() > this.getRedScore()){
            this.winner = 1;
        }
    }
    
    
    @Override
    public int makeMove(int x, int y){
        if(this.isEmpty(y, x) == 0){
          char letter;
          if(this.getTurn() == 0){
              letter = getRedLetter();
          }else{
              letter = getBlueLetter();
          }  
          setCell(y,x,letter);
          
          
          if(this.isSOS(y,x) == 1){
              if(this.getTurn() == 0){
                  this.addRedPoint();
              }else if(this.getTurn()==1){
                  this.addBluePoint();
              }
          }
          
 
          if(this.isFull()==1){
              this.setWinner();
              this.setIsGameOver();
          }
          this.changeTurn();
          return 1;
        }
        return 0;
    }   
}
