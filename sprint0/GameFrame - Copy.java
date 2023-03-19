 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sos;
import java.awt.Graphics;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JLabel;
/**
 *
 * @author Timd
 */
public class GameFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form GameFrame
     */
    public GameFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameType = new javax.swing.ButtonGroup();
        board = new sos.Board();
        redButtonGroup = new javax.swing.ButtonGroup();
        blueButtonGroup = new javax.swing.ButtonGroup();
        gameLabel = new javax.swing.JLabel();
        simpleGameRadioButton = new javax.swing.JRadioButton();
        generalGameRadioButton = new javax.swing.JRadioButton();
        boardSizeLabel = new javax.swing.JLabel();
        boardSizeTextField = new javax.swing.JTextField();
        recordGameCheckBox = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bluePlayerLabel = new javax.swing.JLabel();
        redPlayerLabel = new javax.swing.JLabel();
        startGameButton = new javax.swing.JButton();
        redRadioS = new javax.swing.JRadioButton();
        redRadioO = new javax.swing.JRadioButton();
        blueRadioS = new javax.swing.JRadioButton();
        blueRadioO = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOS Game");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gameLabel.setText("SOS");

        gameType.add(simpleGameRadioButton);
        simpleGameRadioButton.setSelected(true);
        simpleGameRadioButton.setText("Simple Game");

        gameType.add(generalGameRadioButton);
        generalGameRadioButton.setText("General Game");

        boardSizeLabel.setText("Board size");

        boardSizeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        boardSizeTextField.setText("8");
        boardSizeTextField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                boardSizeTextFieldInputMethodTextChanged(evt);
            }
        });

        recordGameCheckBox.setText("Record Game");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(354, 354));
        jPanel1.setMinimumSize(new java.awt.Dimension(354, 354));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(354, 354));
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        jLabel1.setText("Click Board Below To Show Grid");

        bluePlayerLabel.setText("Blue Player");

        redPlayerLabel.setText("Red Player");

        startGameButton.setLabel("Start Game");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });

        redButtonGroup.add(redRadioS);
        redRadioS.setSelected(true);
        redRadioS.setText("S");
        redRadioS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redRadioSMouseClicked(evt);
            }
        });

        redButtonGroup.add(redRadioO);
        redRadioO.setText("O");
        redRadioO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redRadioOMouseClicked(evt);
            }
        });
        redRadioO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redRadioOActionPerformed(evt);
            }
        });

        blueButtonGroup.add(blueRadioS);
        blueRadioS.setSelected(true);
        blueRadioS.setText("S");
        blueRadioS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blueRadioSMouseClicked(evt);
            }
        });

        blueButtonGroup.add(blueRadioO);
        blueRadioO.setText("O");
        blueRadioO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blueRadioOMouseClicked(evt);
            }
        });
        blueRadioO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueRadioOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(simpleGameRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(generalGameRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boardSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(redRadioO, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(redRadioS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10))
                                    .addComponent(redPlayerLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(378, 378, 378)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boardSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(startGameButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(blueRadioO, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bluePlayerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(blueRadioS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(recordGameCheckBox)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpleGameRadioButton)
                    .addComponent(generalGameRadioButton)
                    .addComponent(gameLabel)
                    .addComponent(boardSizeLabel)
                    .addComponent(boardSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startGameButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(bluePlayerLabel)
                                .addGap(20, 20, 20)
                                .addComponent(blueRadioS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(blueRadioO))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(redPlayerLabel)
                                .addGap(20, 20, 20)
                                .addComponent(redRadioS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(redRadioO)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(recordGameCheckBox)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown
    private int getCellSize(){
        return 352/Integer.parseInt(this.boardSizeTextField.getText());
    }
    private void drawGUIBoard(){
        int boardSize = Integer.parseInt(this.boardSizeTextField.getText());
        int cellSize = getCellSize();
        int GRID_SIZE = 352;
        Graphics g = jPanel1.getGraphics();
        //Board Outline
        g.drawLine(0, 0, GRID_SIZE,0 );
        g.drawLine(GRID_SIZE, 0, GRID_SIZE,GRID_SIZE );
        g.drawLine(GRID_SIZE, GRID_SIZE, 0,GRID_SIZE );
        g.drawLine(0, GRID_SIZE, 0,0 );
        //Grid Lines
        for(int i = 1; i < boardSize; i++){
           g.drawLine(0, cellSize*i,GRID_SIZE,cellSize*i); 
           g.drawLine(cellSize*i, 0,cellSize*i, GRID_SIZE);
        }
    }
    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if(this.board.isInProgress()==1){
            drawGUIBoard();
            int x = (int) java.lang.Math.floor(evt.getX()/44);
            int y = (int) java.lang.Math.floor(evt.getY()/44);  
           // System.out.println("is Empty: " + this.board.isEmpty(x,y));
            System.out.println(x +","+y);
            this.board.makeMove(x, y);
            this.board.printBoardToConsole();
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentAdded

    private void jPanel1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentResized

    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        // TODO add your handling code here:
        this.board.setBoardSize(Integer.parseInt(this.boardSizeTextField.getText()));
        
        for (Enumeration<AbstractButton> buttons = gameType.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                if("Simple Game".equals(button.getText())){
                    this.board.setGameType(0);      //Sets game to Simple 
                }else{
                    this.board.setGameType(1);      //Sets game to General   
                }
            }
        }
        drawGUIBoard();
        
        this.board.initializeGame();
        JLabel label = new JLabel("S");
        
        label.setBounds(308,308, 44, 44);
        jPanel1.add(label);
        label.setVisible(true);
        // ToDO: create paintGrid() to call after each move

        //jPanel1.repaint();
        
        System.out.println(this.board.getGameType());
        System.out.println(this.board.getBoardSize());
    }//GEN-LAST:event_startGameButtonActionPerformed

    private void redRadioOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redRadioOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redRadioOActionPerformed

    private void blueRadioOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueRadioOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blueRadioOActionPerformed

    private void boardSizeTextFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_boardSizeTextFieldInputMethodTextChanged
        // TODO add your handling code here:
        System.out.println(this.boardSizeLabel.getText());
    }//GEN-LAST:event_boardSizeTextFieldInputMethodTextChanged

    private void redRadioSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redRadioSMouseClicked
        for (Enumeration<AbstractButton> buttons = redButtonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                if("S".equals(button.getText())){
                    this.board.setRedLetter(1); 
                }else{
                    this.board.setRedLetter(2);
                }
            }
        }
        System.out.println(this.board.getRedLetter());
    }//GEN-LAST:event_redRadioSMouseClicked

    private void redRadioOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redRadioOMouseClicked
        for (Enumeration<AbstractButton> buttons = redButtonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                if("S".equals(button.getText())){
                    this.board.setRedLetter(1); 
                }else{
                    this.board.setRedLetter(2);
                }
            }
        }
        System.out.println(this.board.getRedLetter());
    }//GEN-LAST:event_redRadioOMouseClicked

    private void blueRadioSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueRadioSMouseClicked
        for (Enumeration<AbstractButton> buttons = blueButtonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                if("S".equals(button.getText())){
                    this.board.setBlueLetter(1); 
                }else{
                    this.board.setBlueLetter(2);
                }
            }
        }
        System.out.println(this.board.getBlueLetter());
    }//GEN-LAST:event_blueRadioSMouseClicked

    private void blueRadioOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueRadioOMouseClicked
        for (Enumeration<AbstractButton> buttons = blueButtonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                if("S".equals(button.getText())){
                    this.board.setBlueLetter(1); 
                }else{
                    this.board.setBlueLetter(2);
                }
            }
        }
        System.out.println(this.board.getBlueLetter());
    }//GEN-LAST:event_blueRadioOMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame().setVisible(true);
                
            }
           
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup blueButtonGroup;
    private javax.swing.JLabel bluePlayerLabel;
    private javax.swing.JRadioButton blueRadioO;
    private javax.swing.JRadioButton blueRadioS;
    private sos.Board board;
    private javax.swing.JLabel boardSizeLabel;
    private javax.swing.JTextField boardSizeTextField;
    private javax.swing.JLabel gameLabel;
    private javax.swing.ButtonGroup gameType;
    private javax.swing.JRadioButton generalGameRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox recordGameCheckBox;
    private javax.swing.ButtonGroup redButtonGroup;
    private javax.swing.JLabel redPlayerLabel;
    private javax.swing.JRadioButton redRadioO;
    private javax.swing.JRadioButton redRadioS;
    private javax.swing.JRadioButton simpleGameRadioButton;
    private javax.swing.JButton startGameButton;
    // End of variables declaration//GEN-END:variables
}
