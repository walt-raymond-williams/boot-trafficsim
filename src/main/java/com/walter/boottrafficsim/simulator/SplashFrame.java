/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.walter.boottrafficsim.simulator;
//import sun.awt.image.ToolkitImage;
import java.awt.Color;
import java.awt.Font;
//import java.awt.GridLayout;
//import java.awt.Image;
//import java.awt.Toolkit;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.filechooser.FileNameExtensionFilter;
//import sun.awt.image.ToolkitImage;

/**
 *
 * @author paleo
 */
public class SplashFrame extends JFrame{
    
    boolean completed = false;
    String fileName=("map.pro");
    int carTotal = 5000;
    boolean loadCarFile =true;
    boolean parseMap =false;
    boolean saveCars=false;
    JLabel bg;
    JLabel tittle;
    JLabel tittle2;
    double minLat=0;
    double minLon=0;
    double maxLon=0;
    double maxLat =0;
    int latRange=0;
    int lonRange=0;
    int scale1 = 100000;
    JLabel statusBar = new JLabel("Ready");

//        openPro("map.pro");
//        carTotal=5000;
//        loadCarFile=true;
    SplashFrame()
    {
         latRange = (int)((maxLat-minLat)*scale1);// calculate the size of the window
        lonRange = (int)((maxLon- minLon)*scale1);
        //System.out.println("SIZE OF WINDOW: " + lonRange/scale + " " +latRange/scale );
        this.setSize(lonRange,latRange);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //this.setSize(440,300); // regular stuff for jframe 
//        this.setDefaultCloseOperation(0);
//        this.setUndecorated(true);
        //this.setContentPane(new JLabel(new ImageIcon("./src/map.jpg")));
       // BufferedImage img = ImageIO.read(new File("./src/map.jpg"));
        this.setTitle("Traffic Sim");
        setIconImage(new ImageIcon("./src/mainMenu3.png").getImage());

        //this.setOpacity(0.7f);
//        this.setLocation(0,55);
//        this.setLayout(new BorderLayout());
        //this.setLayout(new GridLayout());
        //17475.0 7160.0
        setSize(1680, 1090);
        setLayout(null);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ImageIcon img = new ImageIcon("./src/map2.jpg");
        
        bg = new JLabel("",img, JLabel.CENTER);
        
        bg.setBounds(0,0,1680, 1090);
                     
        bg.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        GridBagLayout layout = new GridBagLayout();
        
        bg.setLayout(layout);
        
        tittle = new JLabel("The Traffic Sim");
        tittle.setFont(new Font("Sans Serif", Font.BOLD, 85));
        tittle.setForeground(new Color(242,242,242));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 0;
        bg.add(tittle,gbc);
        
        //--------------------------------------------
        tittle2 = new JLabel("\n\n");
        //tittle2.setFont(new Font("Serif", Font.BOLD, 20));
        tittle2.setForeground(new Color(242,242,242));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        //gbc.gridwidth = 1;
        //gbc.anchor = GridBagConstraints.CENTER;
        	
        gbc.ipady = 9;
        gbc.weightx = 0.0;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        bg.add(tittle2,gbc);
        
        JButton loadMapButton = new JButton("Load Map");
        loadMapButton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        loadMapButton.setBackground(new Color(242,242,242));
        loadMapButton.setForeground(new Color(0,0,0));
        loadMapButton.setFocusPainted(false);
        loadMapButton.addActionListener((ActionEvent e) -> {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    ".pro files", "pro");
            chooser.setFileFilter(filter);
            
            int returnVal = chooser.showOpenDialog(chooser);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: " +
                        chooser.getSelectedFile().getAbsolutePath());
                fileName=chooser.getSelectedFile().getAbsolutePath();
            }
//                            System.out.println("??? "+completed);
        });
        //gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 2;
        // gbc.gridx = 1;
        // gbc.gridy = 1;
         bg.add(loadMapButton,gbc);
        
        JButton startButton = new JButton("Start");
        startButton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        startButton.setBackground(new Color(242,242,242));
        startButton.setForeground(new Color(0,0,0));
        startButton.setFocusPainted(false);
        startButton.addActionListener((ActionEvent e) -> {
            completed=true;
            statusBar.setText("Loading...");
//                            System.out.println("??? "+completed);
        });
         gbc.gridx = 0;
         gbc.gridy = 3;
         bg.add(startButton,gbc);
         
        JButton parseMapButton = new JButton("Parse Map");
        parseMapButton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        parseMapButton.setBackground(new Color(242,242,242));
        parseMapButton.setForeground(new Color(0,0,0));
        parseMapButton.setFocusPainted(false);
        parseMapButton.addActionListener((ActionEvent e) -> {
            
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    ".osm files", "osm","osmPRO");
            chooser.setFileFilter(filter);
            
            int numCars = 0;
            boolean notVerif = true;
            while(notVerif){
                String str=JOptionPane.showInputDialog("Please input number of cars: ");
                try{
                    numCars=Integer.parseInt(str);
                    notVerif=false;
                }catch(Exception ex){
                    
                }
            }
            int returnVal = chooser.showOpenDialog(chooser);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: " +
                        chooser.getSelectedFile().getAbsolutePath());
                fileName=chooser.getSelectedFile().getAbsolutePath();
                
                // USE THIS SHIT
                System.out.println("name to make prjectL "+fileName.substring(0,fileName.length()-4));
                parseMap=true;
                
                
                
                carTotal=numCars;
                saveCars=true;
                completed=true;
                System.out.println("??? "+completed);
            }
            statusBar.setText("Parsing...");
//                            System.out.println("??? "+completed);
        });
         gbc.gridx = 0;
         gbc.gridy = 4;
         bg.add(parseMapButton,gbc);
         
        JButton carButton = new JButton("Build Cars"); 
        carButton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        carButton.setBackground(new Color(242,242,242));
        carButton.setForeground(new Color(0,0,0));
        carButton.setFocusPainted(false);
        carButton.addActionListener((ActionEvent e) -> {
            
            boolean notVerif=true;
            
            int numCars=100;
            while(notVerif){
                String str=JOptionPane.showInputDialog("Please input number of cars: ");
                try{
                    numCars=Integer.parseInt(str);
                    notVerif=false;
                }catch(Exception ex){
                    
                }
            }
            carTotal=numCars;
            
            saveCars=true;
            
            completed=true;
            
//                            System.out.println("??? "+completed);
        });
        
        gbc.gridx = 0;
        gbc.gridy = 5;
        bg.add(carButton,gbc);
        
        
        statusBar.setFont(new Font("Sans Serif", Font.BOLD, 20));
        statusBar.setForeground(new Color(242,242,242));
        gbc.gridx = 0;
        gbc.gridy = 6;
        bg.add(statusBar,gbc);
        
    
        add(bg);
        this.setVisible(true);
        //this.setAlwaysOnTop(true);
    }
    
    String openPro()
    {
        String proName="";
        
        return proName;
    }
    
    String openMap(){
        String openName="";
        
        return openName;
    }
    
    public boolean isDone(){
        return completed;
    }
}
