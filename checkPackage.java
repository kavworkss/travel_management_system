package travel.management.system;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class checkPackage extends JFrame {
    checkPackage(){
        setBounds(450, 200, 900,600);
      String[] package1 = new String[]{"package1.jpg","GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only"};
      String[] package2 = new String[]{"package2.jpg","SILVER PACKAGE","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only"};
      String[] package3 = new String[]{"package3.jpg","BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Monsoon Special", "Rs 32000 only"};
        
        JTabbedPane tab=new JTabbedPane();
        JPanel p1=createPackage(package1);
        
        
        
        tab.addTab("Package 1", null, p1);
        
        JPanel p2=createPackage(package2);
        tab.addTab("Package 2", null, p2);
        
        JPanel p3=createPackage(package3);
        tab.addTab("Package 3", null, p3);
        add(tab);
        
        setVisible(true);
    }
    public JPanel createPackage(String[] pack){
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
                
        JLabel l1=new JLabel(pack[1]);
        l1.setBounds(50,5,300,30);
        l1.setForeground(Color.magenta);
        l1.setFont(new Font("Tahoma",Font.BOLD,12));
        p1.add(l1);
        
        JLabel l2=new JLabel(pack[2]);
       l2.setBounds(30,60,300,30);
        l2.setForeground(Color.red);
        l2.setFont(new Font("Tahoma",Font.BOLD,12));
        p1.add(l2);
        
        JLabel l3=new JLabel(pack[3]);
       l3.setBounds(30,110,300,30);
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Tahoma",Font.BOLD,12));
        p1.add(l3);
        
        JLabel l4=new JLabel(pack[4]);
       l4.setBounds(30,160,300,30);
        l4.setForeground(Color.red);
        l4.setFont(new Font("Tahoma",Font.BOLD,12));
        p1.add(l4);
        
        JLabel l5=new JLabel(pack[6]);
       l5.setBounds(30,210,300,30);
        l5.setForeground(Color.blue);
        l5.setFont(new Font("Tahoma",Font.BOLD,12));
        p1.add(l5);
        
        JLabel l6=new JLabel(pack[7]);
       l6.setBounds(30,260,300,30);
        l6.setForeground(Color.red);
        l6.setFont(new Font("Tahoma",Font.BOLD,12));
        p1.add(l6);
        
        JLabel l7=new JLabel(pack[8]);
       l7.setBounds(30,310 ,300,30);
        l7.setForeground(Color.blue);
        l7.setFont(new Font("Tahoma",Font.BOLD,12));
        p1.add(l7);
        
        JLabel l8=new JLabel(pack[9]);
       l8.setBounds(30,360 ,300,30);
        l8.setForeground(Color.black);
        l8.setFont(new Font("Tahoma",Font.BOLD,12));
        p1.add(l8);
        
        JLabel l9=new JLabel(pack[10]);
       l9.setBounds(500,480 ,300,30);
        l9.setForeground(Color.red);
        l9.setFont(new Font("Tahoma",Font.BOLD,12));
        p1.add(l9);
        
         JLabel l20=new JLabel(pack[11]);
       l20.setBounds(750,480 ,300,30);
        l20.setForeground(Color.black);
        l20.setFont(new Font("Tahoma",Font.BOLD,12));
        p1.add(l20);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[0]));
        Image i5 = i4.getImage().getScaledInstance(500,300, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(350,20,500,300);
        p1.add(image);
        
        return p1;
    }
    public static void main(String[] args) {
        new checkPackage(); 
    }
}