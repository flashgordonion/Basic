
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlo
 */
public class GameTyperView extends javax.swing.JFrame {

    /**
     * Creates new form GameTyperView
     */
    public GameTyperView() {
        initComponents();
    }

    public void appendText(String str)
    {
        jTextArea1.append(str);
    }
    
    public void appendText(char cha)
    {
    	String str = "" + cha;
    	jTextArea1.append(str);
    }
    
    public void deleteLastChar(){
    	String str = jTextArea1.getText();
    	if(str.length() > 0) jTextArea1.setText(str.substring(0, str.length()-1));
    }
    
    public void toggleRightTriggerButton()
    {
        rightTriggerButton.doClick();
    }
    
    public void highlightLetter(char letterName)
    {
        switch(letterName)
        {
            case 'a':
                lowerCharA.setForeground(Color.yellow);
                break;
            case 'b':
                lowerCharB.setForeground(Color.yellow);
                break;
            case 'c':
                lowerCharC.setForeground(Color.yellow);
                break;
            case 'd':
                lowerCharD.setForeground(Color.yellow);
                break;
            case 'e':
                lowerCharE.setForeground(Color.yellow);
                break;
            case 'f':
                lowerCharF.setForeground(Color.yellow);
                break;
            case 'g':
                lowerCharG.setForeground(Color.yellow);
                break;
            case 'h':
                lowerCharH.setForeground(Color.yellow);
                break;
            case 'i':
                lowerCharI.setForeground(Color.yellow);
                break;
            case 'j':
                lowerCharJ.setForeground(Color.yellow);
                break;
            case 'k':
                lowerCharK.setForeground(Color.yellow);
                break;
            case 'l':
                lowerCharL.setForeground(Color.yellow);
                break;
            case 'm':
                lowerCharM.setForeground(Color.yellow);
                break;
            case 'n':
                lowerCharN.setForeground(Color.yellow);
                break;
            case 'o':
                lowerCharO.setForeground(Color.yellow);
                break;
            case 'p':
                lowerCharP.setForeground(Color.yellow);
                break;
            case 'q':
                lowerCharQ.setForeground(Color.yellow);
                break;
            case 'r':
                lowerCharR.setForeground(Color.yellow);
                break;
            case 's':
                lowerCharS.setForeground(Color.yellow);
                break;
            case 't':
                lowerCharT.setForeground(Color.yellow);
                break;
            case 'u':
                lowerCharU.setForeground(Color.yellow);
                break;
            case 'v':
                lowerCharV.setForeground(Color.yellow);
                break;    
            case 'w':
                lowerCharW.setForeground(Color.yellow);
                break;
            case 'x':
                lowerCharX.setForeground(Color.yellow);
                break;
            case 'y':
                lowerCharY.setForeground(Color.yellow);
                break;
            case 'z':
                lowerCharZ.setForeground(Color.yellow);
                break;
            case '/':
                lowerCharSlash.setForeground(Color.yellow);
                break;
            case ':':
                lowerCharColon.setForeground(Color.yellow);
                break;
            case '@':
                lowerCharAt.setForeground(Color.yellow);
                break;
            case '-':
                lowerCharDash.setForeground(Color.yellow);
                break;
            case ',':
                lowerCharComma.setForeground(Color.yellow);
                break;
            case '.':
                lowerCharDot.setForeground(Color.yellow);
                break;
            default:
                System.out.println("ERROR! highlightLetter()");
        }
    }
    
    public void unHighlightLetter(char letterName)
    {
        switch(letterName)
        {
            case 'a':
                lowerCharA.setForeground(Color.black);
                break;
            case 'b':
                lowerCharB.setForeground(Color.black);
                break;
            case 'c':
                lowerCharC.setForeground(Color.black);
                break;
            case 'd':
                lowerCharD.setForeground(Color.black);
                break;
            case 'e':
                lowerCharE.setForeground(Color.black);
                break;
            case 'f':
                lowerCharF.setForeground(Color.black);
                break;
            case 'g':
                lowerCharG.setForeground(Color.black);
                break;
            case 'h':
                lowerCharH.setForeground(Color.black);
                break;
            case 'i':
                lowerCharI.setForeground(Color.black);
                break;
            case 'j':
                lowerCharJ.setForeground(Color.black);
                break;
            case 'k':
                lowerCharK.setForeground(Color.black);
                break;
            case 'l':
                lowerCharL.setForeground(Color.black);
                break;
            case 'm':
                lowerCharM.setForeground(Color.black);
                break;
            case 'n':
                lowerCharN.setForeground(Color.black);
                break;
            case 'o':
                lowerCharO.setForeground(Color.black);
                break;
            case 'p':
                lowerCharP.setForeground(Color.black);
                break;
            case 'q':
                lowerCharQ.setForeground(Color.black);
                break;
            case 'r':
                lowerCharR.setForeground(Color.black);
                break;
            case 's':
                lowerCharS.setForeground(Color.black);
                break;
            case 't':
                lowerCharT.setForeground(Color.black);
                break;
            case 'u':
                lowerCharU.setForeground(Color.black);
                break;
            case 'v':
                lowerCharV.setForeground(Color.black);
                break;    
            case 'w':
                lowerCharW.setForeground(Color.black);
                break;
            case 'x':
                lowerCharX.setForeground(Color.black);
                break;
            case 'y':
                lowerCharY.setForeground(Color.black);
                break;
            case 'z':
                lowerCharZ.setForeground(Color.black);
                break;
            case '/':
                lowerCharSlash.setForeground(Color.black);
                break;
            case ':':
                lowerCharColon.setForeground(Color.black);
                break;
            case '@':
                lowerCharAt.setForeground(Color.black);
                break;
            case '-':
                lowerCharDash.setForeground(Color.black);
                break;
            case ',':
                lowerCharComma.setForeground(Color.black);
                break;
            case '.':
                lowerCharDot.setForeground(Color.black);
                break;
            default:
                System.out.println("ERROR! unHighlightLetter()");
        }        
    }
    
    public void highlightPanel(PanelName panelName)
    {
        switch (panelName)
        {
            case PANEL_NORTH:
                northPanel.setBackground(Color.RED);
                break;
            case PANEL_SOUTH:
                southPanel.setBackground(Color.RED);
                break;
            case PANEL_WEST:
                westPanel.setBackground(Color.RED);
                break;
            case PANEL_EAST:
                eastPanel.setBackground(Color.RED);
                break;
            case PANEL_NORTH_WEST:
                northWestPanel.setBackground(Color.RED);
                break;
            case PANEL_NORTH_EAST:
                northEastPanel.setBackground(Color.RED);
                break;
            case PANEL_SOUTH_WEST:
                southWestPanel.setBackground(Color.RED);
                break;
            case PANEL_SOUTH_EAST:
                southEastPanel.setBackground(Color.RED);
                break;
            default:
                System.out.println("ERROR! highlightPanel()");
        }
    }
    
    public void unHighlightPanel(PanelName panelName)
    {
        Color defaultColor = this.getBackground();
        switch (panelName)
        {
            case PANEL_NORTH:
                northPanel.setBackground(defaultColor);
                break;
            case PANEL_SOUTH:
                southPanel.setBackground(defaultColor);
                break;
            case PANEL_WEST:
                westPanel.setBackground(defaultColor);
                break;
            case PANEL_EAST:
                eastPanel.setBackground(defaultColor);
                break;
            case PANEL_NORTH_WEST:
                northWestPanel.setBackground(defaultColor);
                break;
            case PANEL_NORTH_EAST:
                northEastPanel.setBackground(defaultColor);
                break;
            case PANEL_SOUTH_WEST:
                southWestPanel.setBackground(defaultColor);
                break;
            case PANEL_SOUTH_EAST:
                southEastPanel.setBackground(defaultColor);
                break;
            default:
                System.out.println("ERROR! unHighlightPanel()");
        }
    }
    
    public void unHighlightAllPanels()
    {
        unHighlightPanel(PanelName.PANEL_NORTH);
        unHighlightPanel(PanelName.PANEL_SOUTH);
        unHighlightPanel(PanelName.PANEL_EAST);
        unHighlightPanel(PanelName.PANEL_WEST);
        unHighlightPanel(PanelName.PANEL_NORTH_EAST);
        unHighlightPanel(PanelName.PANEL_NORTH_WEST);
        unHighlightPanel(PanelName.PANEL_SOUTH_EAST);
        unHighlightPanel(PanelName.PANEL_SOUTH_WEST);
    }
    
    public void unHighlightAllLetters()
    {
        unHighlightLetter('a'); unHighlightLetter('b'); unHighlightLetter('c');
        unHighlightLetter('d'); unHighlightLetter('e'); unHighlightLetter('f'); 
        unHighlightLetter('g'); unHighlightLetter('h'); unHighlightLetter('i'); 
        unHighlightLetter('j'); unHighlightLetter('k'); unHighlightLetter('l'); 
        unHighlightLetter('m'); unHighlightLetter('n'); unHighlightLetter('o'); 
        unHighlightLetter('p'); unHighlightLetter('q'); unHighlightLetter('r'); 
        unHighlightLetter('s'); unHighlightLetter('t'); unHighlightLetter('u');
        unHighlightLetter('v'); unHighlightLetter('w'); unHighlightLetter('x');
        unHighlightLetter('y'); unHighlightLetter('z'); unHighlightLetter('/'); 
        unHighlightLetter(':'); unHighlightLetter('@'); unHighlightLetter('-');
        unHighlightLetter(','); unHighlightLetter('.'); 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        southEastPanel = new javax.swing.JPanel();
        lowerCharM = new javax.swing.JLabel();
        lowerCharN = new javax.swing.JLabel();
        lowerCharO = new javax.swing.JLabel();
        lowerCharP = new javax.swing.JLabel();
        southWestPanel = new javax.swing.JPanel();
        lowerCharU = new javax.swing.JLabel();
        lowerCharV = new javax.swing.JLabel();
        lowerCharW = new javax.swing.JLabel();
        lowerCharX = new javax.swing.JLabel();
        northEastPanel = new javax.swing.JPanel();
        lowerCharE = new javax.swing.JLabel();
        lowerCharF = new javax.swing.JLabel();
        lowerCharG = new javax.swing.JLabel();
        lowerCharH = new javax.swing.JLabel();
        westPanel = new javax.swing.JPanel();
        lowerCharY = new javax.swing.JLabel();
        lowerCharZ = new javax.swing.JLabel();
        lowerCharComma = new javax.swing.JLabel();
        lowerCharDot = new javax.swing.JLabel();
        northWestPanel = new javax.swing.JPanel();
        lowerCharColon = new javax.swing.JLabel();
        lowerCharSlash = new javax.swing.JLabel();
        lowerCharAt = new javax.swing.JLabel();
        lowerCharDash = new javax.swing.JLabel();
        eastPanel = new javax.swing.JPanel();
        lowerCharI = new javax.swing.JLabel();
        lowerCharJ = new javax.swing.JLabel();
        lowerCharK = new javax.swing.JLabel();
        lowerCharL = new javax.swing.JLabel();
        southPanel = new javax.swing.JPanel();
        lowerCharQ = new javax.swing.JLabel();
        lowerCharR = new javax.swing.JLabel();
        lowerCharS = new javax.swing.JLabel();
        lowerCharT = new javax.swing.JLabel();
        northPanel = new javax.swing.JPanel();
        lowerCharA = new javax.swing.JLabel();
        lowerCharB = new javax.swing.JLabel();
        lowerCharC = new javax.swing.JLabel();
        lowerCharD = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        rightTriggerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lowerCharM.setText("m");

        lowerCharN.setText("n");

        lowerCharO.setText("o");

        lowerCharP.setText("p");

        javax.swing.GroupLayout southEastPanelLayout = new javax.swing.GroupLayout(southEastPanel);
        southEastPanel.setLayout(southEastPanelLayout);
        southEastPanelLayout.setHorizontalGroup(
            southEastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southEastPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lowerCharO)
                .addGap(15, 15, 15))
            .addGroup(southEastPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(southEastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lowerCharP, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowerCharN))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        southEastPanelLayout.setVerticalGroup(
            southEastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southEastPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharN)
                .addGap(17, 17, 17)
                .addGroup(southEastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerCharM)
                    .addComponent(lowerCharO))
                .addGap(18, 18, 18)
                .addComponent(lowerCharP)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lowerCharU.setText("u");

        lowerCharV.setText("v");

        lowerCharW.setText("w");

        lowerCharX.setText("x");

        javax.swing.GroupLayout southWestPanelLayout = new javax.swing.GroupLayout(southWestPanel);
        southWestPanel.setLayout(southWestPanelLayout);
        southWestPanelLayout.setHorizontalGroup(
            southWestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southWestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lowerCharW)
                .addGap(15, 15, 15))
            .addGroup(southWestPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(southWestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lowerCharX, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowerCharV))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        southWestPanelLayout.setVerticalGroup(
            southWestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southWestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharV)
                .addGap(17, 17, 17)
                .addGroup(southWestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerCharU)
                    .addComponent(lowerCharW))
                .addGap(18, 18, 18)
                .addComponent(lowerCharX)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lowerCharE.setText("e");

        lowerCharF.setText("f");

        lowerCharG.setText("g");

        lowerCharH.setText("h");

        javax.swing.GroupLayout northEastPanelLayout = new javax.swing.GroupLayout(northEastPanel);
        northEastPanel.setLayout(northEastPanelLayout);
        northEastPanelLayout.setHorizontalGroup(
            northEastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northEastPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lowerCharG)
                .addGap(15, 15, 15))
            .addGroup(northEastPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(northEastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lowerCharH, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowerCharF))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        northEastPanelLayout.setVerticalGroup(
            northEastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northEastPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharF)
                .addGap(17, 17, 17)
                .addGroup(northEastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerCharE)
                    .addComponent(lowerCharG))
                .addGap(18, 18, 18)
                .addComponent(lowerCharH)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lowerCharY.setText("y");

        lowerCharZ.setText("z");

        lowerCharComma.setText(",");

        lowerCharDot.setText(".");

        javax.swing.GroupLayout westPanelLayout = new javax.swing.GroupLayout(westPanel);
        westPanel.setLayout(westPanelLayout);
        westPanelLayout.setHorizontalGroup(
            westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(westPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lowerCharComma)
                .addGap(15, 15, 15))
            .addGroup(westPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lowerCharDot, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowerCharZ))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        westPanelLayout.setVerticalGroup(
            westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(westPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharZ)
                .addGap(17, 17, 17)
                .addGroup(westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerCharY)
                    .addComponent(lowerCharComma))
                .addGap(18, 18, 18)
                .addComponent(lowerCharDot)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lowerCharColon.setText(":");

        lowerCharSlash.setText("/");

        lowerCharAt.setText("@");

        lowerCharDash.setText("-");

        javax.swing.GroupLayout northWestPanelLayout = new javax.swing.GroupLayout(northWestPanel);
        northWestPanel.setLayout(northWestPanelLayout);
        northWestPanelLayout.setHorizontalGroup(
            northWestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northWestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharColon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lowerCharAt)
                .addGap(15, 15, 15))
            .addGroup(northWestPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(northWestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lowerCharDash, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowerCharSlash))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        northWestPanelLayout.setVerticalGroup(
            northWestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northWestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharSlash)
                .addGap(17, 17, 17)
                .addGroup(northWestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerCharColon)
                    .addComponent(lowerCharAt))
                .addGap(18, 18, 18)
                .addComponent(lowerCharDash)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lowerCharI.setText("i");

        lowerCharJ.setText("j");

        lowerCharK.setText("k");

        lowerCharL.setText("l");

        javax.swing.GroupLayout eastPanelLayout = new javax.swing.GroupLayout(eastPanel);
        eastPanel.setLayout(eastPanelLayout);
        eastPanelLayout.setHorizontalGroup(
            eastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eastPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lowerCharK)
                .addGap(15, 15, 15))
            .addGroup(eastPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(eastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lowerCharL, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowerCharJ))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        eastPanelLayout.setVerticalGroup(
            eastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eastPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharJ)
                .addGap(17, 17, 17)
                .addGroup(eastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerCharI)
                    .addComponent(lowerCharK))
                .addGap(18, 18, 18)
                .addComponent(lowerCharL)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lowerCharQ.setText("q");

        lowerCharR.setText("r");

        lowerCharS.setText("s");

        lowerCharT.setText("t");

        javax.swing.GroupLayout southPanelLayout = new javax.swing.GroupLayout(southPanel);
        southPanel.setLayout(southPanelLayout);
        southPanelLayout.setHorizontalGroup(
            southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lowerCharS)
                .addGap(15, 15, 15))
            .addGroup(southPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lowerCharT, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowerCharR))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        southPanelLayout.setVerticalGroup(
            southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharR)
                .addGap(17, 17, 17)
                .addGroup(southPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerCharQ)
                    .addComponent(lowerCharS))
                .addGap(18, 18, 18)
                .addComponent(lowerCharT)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        northPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                northPanelMousePressed(evt);
            }
        });

        lowerCharA.setText("a");

        lowerCharB.setText("b");

        lowerCharC.setText("c");

        lowerCharD.setText("d");

        javax.swing.GroupLayout northPanelLayout = new javax.swing.GroupLayout(northPanel);
        northPanel.setLayout(northPanelLayout);
        northPanelLayout.setHorizontalGroup(
            northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lowerCharC)
                .addGap(15, 15, 15))
            .addGroup(northPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lowerCharD, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowerCharB))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        northPanelLayout.setVerticalGroup(
            northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(northPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lowerCharB)
                .addGap(17, 17, 17)
                .addGroup(northPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerCharA)
                    .addComponent(lowerCharC))
                .addGap(18, 18, 18)
                .addComponent(lowerCharD)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(westPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(northWestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(southWestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(northPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(northEastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(southPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(southEastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(southPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(northEastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(northWestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(southWestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(southEastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(northPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(westPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(eastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        rightTriggerButton.setText("RB (space)");
        rightTriggerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightTriggerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightTriggerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightTriggerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void northPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_northPanelMousePressed
        // TODO add your handling code here:
        northPanel.setBackground(Color.red);
    }//GEN-LAST:event_northPanelMousePressed

    private void rightTriggerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightTriggerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightTriggerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel eastPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lowerCharA;
    private javax.swing.JLabel lowerCharAt;
    private javax.swing.JLabel lowerCharB;
    private javax.swing.JLabel lowerCharC;
    private javax.swing.JLabel lowerCharColon;
    private javax.swing.JLabel lowerCharComma;
    private javax.swing.JLabel lowerCharD;
    private javax.swing.JLabel lowerCharDash;
    private javax.swing.JLabel lowerCharDot;
    private javax.swing.JLabel lowerCharE;
    private javax.swing.JLabel lowerCharF;
    private javax.swing.JLabel lowerCharG;
    private javax.swing.JLabel lowerCharH;
    private javax.swing.JLabel lowerCharI;
    private javax.swing.JLabel lowerCharJ;
    private javax.swing.JLabel lowerCharK;
    private javax.swing.JLabel lowerCharL;
    private javax.swing.JLabel lowerCharM;
    private javax.swing.JLabel lowerCharN;
    private javax.swing.JLabel lowerCharO;
    private javax.swing.JLabel lowerCharP;
    private javax.swing.JLabel lowerCharQ;
    private javax.swing.JLabel lowerCharR;
    private javax.swing.JLabel lowerCharS;
    private javax.swing.JLabel lowerCharSlash;
    private javax.swing.JLabel lowerCharT;
    private javax.swing.JLabel lowerCharU;
    private javax.swing.JLabel lowerCharV;
    private javax.swing.JLabel lowerCharW;
    private javax.swing.JLabel lowerCharX;
    private javax.swing.JLabel lowerCharY;
    private javax.swing.JLabel lowerCharZ;
    private javax.swing.JPanel northEastPanel;
    private javax.swing.JPanel northPanel;
    private javax.swing.JPanel northWestPanel;
    private javax.swing.JButton rightTriggerButton;
    private javax.swing.JPanel southEastPanel;
    private javax.swing.JPanel southPanel;
    private javax.swing.JPanel southWestPanel;
    private javax.swing.JPanel westPanel;
    // End of variables declaration//GEN-END:variables
}
