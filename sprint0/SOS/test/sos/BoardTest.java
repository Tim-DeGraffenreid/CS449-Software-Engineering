/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sos;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Timd
 */
public class BoardTest {
    @Test
    public void testInitializeGameSimple() {
        System.out.println("initializeGame");
        Board instance = new Board();
        instance.setGameType(0);
        instance.setBoardSize(8);
        instance.initializeGame();
        int expResult = 1;
        int result = instance.isInProgress();
        assertEquals(expResult,result);  
    }
    
    @Test
    public void testInitializeGameGeneral() {
        System.out.println("initializeGame");
        Board instance = new Board();
        instance.setGameType(0);
        instance.setBoardSize(8);
        instance.initializeGame();
        int expResult = 1;
        int result = instance.isInProgress();
        assertEquals(expResult,result);  
    }
    @Test
    public void testSetBoardSize() {
        System.out.println("getBoardSize");
        Board instance = new Board();
        instance.initializeGame();
        int expResult = 6;
        instance.setBoardSize(6);
        int result = instance.getBoardSize();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetGameTypeSimple() {
        System.out.println("setGameType");
        int expResult = 0;
        Board instance = new Board();
        instance.setGameType(0);
        int result = instance.getGameType();
        assertEquals(expResult,result);
    }
    public void testSetGameTypeSimpleNotChosen() {
        System.out.println("setGameType");
        int expResult = 0;
        Board instance = new Board();
        int result = instance.getGameType();
        assertEquals(expResult,result);
    }
    @Test
    public void testSetGameTypeGeneral() {
        System.out.println("setGameType");
        int expResult = 1;
        Board instance = new Board();
        instance.setGameType(1);
        int result = instance.getGameType();
        assertEquals(expResult,result);
    }

    @Test
    public void testGetEmptyCell() {
        System.out.println("getCell");
        int x = 0;
        int y = 0;
        Board instance = new Board();
        instance.initializeGame();
        char expResult = '~';
        char result = instance.getCell(x, y);
        assertEquals(expResult, result);       
    }

    @Test
    public void testChangeTurn() {
        System.out.println("changeTurn");
        Board instance = new Board();
        instance.changeTurn();
        int expResult = 1;
        int result = instance.getTurn();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMakeMoveSRed() {
        System.out.println("makeMove S");
        int x = 0;
        int y = 0;
        Board instance = new Board();
        instance.initializeGame();
        instance.setTurn(0);
        char expResult = 'S';
        int didMove = instance.makeMove(x, y);
        char result = instance.getCell(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMakeMoveORed() {
        System.out.println("makeMove O");
        int x = 0;
        int y = 0;
        Board instance = new Board();
        instance.initializeGame();
        instance.setTurn(0);
        instance.setRedLetter('O');
        char expResult = 'O';
        int didMove = instance.makeMove(x, y);
        char result = instance.getCell(x, y);
        assertEquals(expResult, result);
    }   
        @Test
    public void testMakeMoveSBlue() {
        System.out.println("makeMove S");
        int x = 0;
        int y = 0;
        Board instance = new Board();
        instance.initializeGame();
        instance.setTurn(1);
        char expResult = 'S';
        int didMove = instance.makeMove(x, y);
        char result = instance.getCell(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMakeMoveOBlue() {
        System.out.println("makeMove O");
        int x = 0;
        int y = 0;
        Board instance = new Board();
        instance.initializeGame();
        instance.setTurn(1);
        instance.setBlueLetter('O');
        char expResult = 'O';
        int didMove = instance.makeMove(x, y);
        char result = instance.getCell(x, y);
        assertEquals(expResult, result);
    }   
    
    @Test
    public void testInvalidMoveRed(){
        System.out.println("makeMove Invalid");
        int x = 0;
        int y = 0;
        Board instance = new Board();
        instance.initializeGame();
        instance.setBlueLetter('S');
        instance.setRedLetter('O');
        char expResult = 'O';
        int didMove = instance.makeMove(x, y);
        int nextMove = instance.makeMove(x, y);
        char result = instance.getCell(x, y);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInvalidMoveBlue(){
        System.out.println("makeMove Invalid");
        int x = 0;
        int y = 0;
        Board instance = new Board();
        instance.initializeGame();
        instance.setRedLetter('S');
        int didMove = instance.makeMove(0, 1);
        instance.setBlueLetter('O');
        int nextMove = instance.makeMove(x, y);
        int lastMove = instance.makeMove(x, y);
        char expResult = 'O';
        char result = instance.getCell(x, y);
        assertEquals(expResult, result);
    }
    @Test
    public void testSimpleBluePlayerWin(){
        System.out.println("Simple Blue Player Win");
        Board instance = new Board();
        instance.setBoardSize(5);
        instance.initializeGame();
        instance.setRedLetter('S');
        instance.setBlueLetter('S');
        int move1 = instance.makeMove(0, 0);
        int move2 = instance.makeMove(0, 1);
        instance.setRedLetter('O');
        int move3 = instance.makeMove(0,2);
        int move4 = instance.makeMove(0, 3);
        int result = instance.getWinner();
        int expResult = 1;
        assertEquals(expResult, result);
    }
    @Test
    public void testSimpleDraw(){
        System.out.println("Simple Draw");
        Board instance = new Board();
        instance.setBoardSize(5);
        instance.initializeGame();
        instance.setRedLetter('S');
        instance.setBlueLetter('S');

        for(int i = 0; i < 5; i++){
            for(int j = 0; i < 5; i++){
                int move = instance.makeMove(i, j);
            }
        }
        
        int result = instance.getWinner();
        int expResult = -1;
        assertEquals(expResult, result);
    }
    @Test 
    public void testGeneralRedWin(){
        System.out.println("General Red Win");
        Board instance = new Board();
        instance.setBoardSize(4);
        instance.initializeGame();
        instance.setRedLetter('S');
        instance.setBlueLetter('O');
        int move1 = instance.makeMove(0, 0);
        int move2 = instance.makeMove(0, 1);
        int move3 = instance.makeMove(0, 2);
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; i < 4; i++){
                int move = instance.makeMove(i, j);
            }
        }
        
        int result = instance.getWinner();
        int expResult = 0;
        assertEquals(expResult, result);       
        
    }

    @Test 
    public void testGeneralDraw(){
        System.out.println("General Draw");
        Board instance = new Board();
        instance.setBoardSize(4);
        instance.initializeGame();
        instance.setRedLetter('S');
        instance.setBlueLetter('S');
 
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; i < 4; i++){
                int move = instance.makeMove(i, j);
            }
        }
        
        int result = instance.getWinner();
        int expResult = -1;
        assertEquals(expResult, result);       
        
    }    
    
}
