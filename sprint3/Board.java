/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sos;



/**
 *
 * @author Timd
 */
public class Board {
    private char boardGrid[][];
    private int boardSize = 8;
    private int gameType = 0;      //0 simple game, 1 general game
    private int isInProgress = 0;// 0 not in progress, 1 in progress
    private char redLetter = 'S';  
    private char blueLetter = 'S'; 
    protected int turn = 0 ;      //0 represents red, 1 represents blue
    protected int winner = -1; //-1 no winner declared
    private int isGameOver = 0;
    
    public Board(){
        System.out.println("Board Created");
    }
    public void initializeGame(){
        this.isInProgress = 1;
        boardGrid = new char[this.getBoardSize()][this.getBoardSize()];
        for (char[] boardGrid1 : boardGrid) {
            for (int j = 0; j < boardGrid1.length; j++) {
                boardGrid1[j] = '~';
            }
        }
    }
    public void setBoardSize(int boardSize){
        this.boardSize = boardSize;
    }
    public int getBoardSize(){
        return boardSize;
    }
    public void setGameType(int gameType){
        this.gameType = gameType;
    }
    public int getGameType(){
        return gameType;
    }
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
    public int isEmpty(int x, int y){
        if(getCell(x,y) == '~'){
            return 0;
        }
        return 1;
    }
    public char getCell(int x, int y){
        return this.boardGrid[x][y];
    }
    public void setCell(int x, int y, char letter){
        this.boardGrid[x][y] = letter;
    }
    public void changeTurn(){
        turn = (0 == turn) ? 1:0;
    }
    public void setTurn(int turn){
        this.turn = turn;
    }
    public int getTurn(){
        return turn;
    }
    public char getRedLetter(){
        return redLetter;
    }
    public void setRedLetter(char letter){
        this.redLetter = letter;
    }
        public char getBlueLetter(){
        return blueLetter;
    }
    public void setBlueLetter(char letter){
        this.blueLetter = letter;
    }

    public int isInProgress(){
        return this.isInProgress;
    }
    public void printBoardToConsole(){
        for (char[] boardGrid1 : boardGrid) {
            for (int j = 0; j < boardGrid1.length; j++) {
                System.out.print(boardGrid1[j] + " ");
            }
            System.out.println();
        }
    }
    
    public int getWinner(){
        return this.winner;
    }
    
    public void setWinner(){
        this.winner = this.turn;
    }
    public int isFull(){
        for (char[] boardGrid1 : boardGrid) {
            for (int j = 0; j < boardGrid1.length; j++) {
               if(boardGrid1[j] == '~'){
                   return 0;
               }
            }
        }
        return 1;
    }
    public int isSOS(int x,int y){
      
        if(y >= 2){//Straight up SOS
            if(this.getCell(x, y)== 'S' && this.getCell(x, y-1) == 'O' && this.getCell(x, y-2)=='S'){
                return 1;
            }
        }
       
        if((this.boardSize - y -1) >= 2){ //Straight down SOS
             if(this.getCell(x, y)== 'S' && this.getCell(x, y + 1) == 'O' && this.getCell(x, y + 2)=='S'){
                return 1;
            }  
        }
       
        if(x >= 2){//Straight left SOS
            if(this.getCell(x, y)== 'S' && this.getCell(x - 1, y) == 'O' && this.getCell(x - 2, y)=='S'){
                return 1;
            }
        }
       
        if((this.boardSize - x - 1) >= 2){ //Straight right SOS
             if(this.getCell(x, y)== 'S' && this.getCell(x + 1, y) == 'O' && this.getCell(x + 2, y)=='S'){
                return 1;
            }  
        } 
       
        if(y >= 1 &&((this.boardSize - y -1) >= 1)){//Straight up & down SOS O
            if(this.getCell(x, y)== 'O' && this.getCell(x, y-1) == 'S' && this.getCell(x, y+1)=='S'){
                return 1;
            }
        }

          
        if(x >= 1 && ((this.boardSize - x -1) >= 1)){//Straight left and right SOS O
            if(this.getCell(x, y)== 'O' && this.getCell(x - 1, y) == 'S' && this.getCell(x +1, y)=='S'){
                return 1;
            }
        }

       
        if(x >= 2 && y >= 2){//diagonal left upper
             if(this.getCell(x, y)== 'S' && this.getCell(x - 1, y - 1) == 'O' && this.getCell(x - 2, y - 2)=='S'){
                return 1;
            }  
        }
         
        if(x >= 2 && (this.boardSize - y -1) >= 2){//diagonal left lower
             if(this.getCell(x, y)== 'S' && this.getCell(x - 1, y + 1) == 'O' && this.getCell(x - 2, y + 2)=='S'){
                return 1;
            }  
        } 
        
        if((this.boardSize - x -1) >= 2 && y >= 2){//diagonal right upper
             if(this.getCell(x, y)== 'S' && this.getCell(x + 1, y - 1) == 'O' && this.getCell(x + 2, y - 2)=='S'){
                return 1;
            }  
        }   

        if((this.boardSize - x -1) >= 2 && (this.boardSize - y -1) >= 2){//diagonal right lower
             if(this.getCell(x, y)== 'S' && this.getCell(x + 1, y + 1) == 'O' && this.getCell(x + 2, y + 2)=='S'){
                return 1;
            }  
        }  
     
        if(x >= 1 && y >= 1){//diagonal  minor O
             if(this.getCell(x, y)== 'O' && this.getCell(x - 1, y - 1) == 'S' && this.getCell(x + 1, y + 1)=='S'){
                return 1;
            }  
        }          
 
        if((y >= 1) && (x <= 2) && (x >=1)){//diagonal  major O
             if(this.getCell(x, y)== 'O' && this.getCell(x + 1, y - 1) == 'S' && this.getCell(x - 1, y + 1)=='S'){
                return 1;
            }  
        } 
          /* */
        return 0;
    }
    
    public int isGameOver(int isSOS){
        
        if(isSOS == 1){
            this.setWinner();
            return 1;
        }
        if(this.isFull() == 1){
            return 1;
        }
        return 0;
    }

   public void setIsGameOver(){
       this.isGameOver = 1;
   }
   
   public int getIsGameOver(){
       return this.isGameOver;
   }
   
}
