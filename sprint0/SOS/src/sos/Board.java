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
    private int turn = 0 ;      //0 represents red, 1 represents blue
    
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
          changeTurn();
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
}
