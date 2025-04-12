package travel.management.system;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener {
   JButton login,signup,bpassword;
   JTextField tfpassword,tfusername;
    login(){
    setSize(900,400);
    setLocation(400,200);
    setLayout(null);
    
    getContentPane().setBackground(Color.WHITE);
    JPanel pl=new JPanel();
    pl.setBackground(new Color(131,193,233));
    pl.setBounds(0,0,400,400);
    pl.setLayout(null);
    add(pl);
    ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
    Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(100,120,200,200);
    pl.add(image);
    
    JPanel p2= new JPanel();
    p2.setLayout(null);
    p2.setBounds(400,30,450,300);
    add(p2);
    JLabel username= new JLabel("Username");
    username.setBounds(60,20,100,30);
    username.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    p2.add(username);
    
    tfusername=new JTextField();
    tfusername.setBorder(BorderFactory.createEmptyBorder());
    p2.add(tfusername);
    tfusername.setBounds(60,60,300,30);
    
    JLabel password= new JLabel("Password");
    password.setBounds(60,110,100,25);
    password.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
    p2.add(password);
    
  tfpassword=new JTextField();
    tfpassword.setBorder(BorderFactory.createEmptyBorder());
    p2.add(tfpassword);
    tfpassword.setBounds(60,150,300,30);
    
  login=new JButton("Login");
    login.setBounds(60,200,130,30);
    login.setBackground(new Color(133,193,233));
    login.setForeground(Color.white);
    
    login.setBorder(new LineBorder(new Color(133,193,233)));
    login.addActionListener(this);
    p2.add(login);
    
     signup=new JButton("Signup");
    signup.setBounds(230,200,130,30);
    signup.setBackground(new Color(133,193,233));
    signup.setForeground(Color.white);
    signup.setBorder(new LineBorder(new Color(133,193,233)));
    signup.addActionListener(this);
    p2.add(signup);
    
    bpassword=new JButton("Forget Password");
    bpassword.setBounds(130,250,130,30);
    bpassword.setBackground(new Color(133,193,233));
    bpassword.setForeground(Color.white);
    bpassword.setBorder(new LineBorder(new Color(133,193,233)));
   bpassword.addActionListener(this);
    p2.add(bpassword);
    
    JLabel text= new JLabel("Trouble in login...");
    text.setBounds(300,250,150,20);
    text.setForeground(Color.RED);
    p2.add(text);
    
    setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==login){
            try {
                String username = tfusername.getText();
                String pass=tfpassword.getText();
                
                String query ="select * from account where username = '"+username+"' AND password= '"+pass+"' ";
            conn c= new conn();
            ResultSet rs= c.s.executeQuery(query);
            if (rs.next()){
                setVisible(false);
                new Loading(username);
            }
           else {
         JOptionPane.showMessageDialog(null,"incorrect username of password"); 
                        
            } }
            catch (Exception e){
                    e.printStackTrace();
                    }
        }
        
        else if(ae.getSource()==signup) {
            setVisible(false);
            new signup();
            
        }
        else {  
            setVisible (false);
            new ForgetPassword();}}
        
    public static void main(String[] args) {
        login l=new login();
    }
}