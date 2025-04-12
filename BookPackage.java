package travel.management.system;


import java.awt.Color;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class BookPackage extends JFrame implements ActionListener {
    Choice cpackage;
    JTextField tfpersons;
    String username;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    JButton checkprice, Book, back;
    
    BookPackage(String username){
        this.username=username;
     setBounds(350,200,1100,500);
     setLayout(null);
     getContentPane().setBackground(Color.white);
     
     
     JLabel text=new JLabel("BOOK PACKAGE");
     text.setBounds(100,10,200,30);
     text.setFont(new Font("Tahoma", Font.BOLD,20));
     add(text);
     
    JLabel lblusername= new JLabel("Username");
    lblusername.setBounds(40,70,150,20);
    add(lblusername);
    
    labelusername= new JLabel();
    labelusername.setBounds(250,70,100,20);
    add(labelusername);
    
   
    
    JLabel lblpackage= new JLabel("select package");
    lblpackage.setBounds(40,110,100,20);
    add(lblpackage);
    
    cpackage=new Choice();
    cpackage.add("Gold Package");
    cpackage.add("Silver Package");
    cpackage.add("Bronze Package");
    cpackage.setBounds(250,110,100,25);
    add(cpackage);
    
    JLabel lblpersons= new JLabel("Total Persons");
    lblpersons.setBounds(40,150,150,25);
    add(lblpersons);
    
    tfpersons=new JTextField("1");
    tfpersons.setBounds(250,150,200,25);
    add(tfpersons);
    
    JLabel lblid=new JLabel("id");
    lblid.setBounds(40,190,150,25);
    add(lblid);
    
    labelid= new JLabel();
    labelid.setBounds(250,190,200,25);
    add(labelid);
    
    JLabel lblnumber= new JLabel("Number");
    lblnumber.setBounds(40,230,150,25);
    add(lblnumber);
    
    labelnumber= new JLabel();
    labelnumber.setBounds(250,230,150,25);
    add(labelnumber);
    
    JLabel lblphone= new JLabel("Phone");
     lblphone.setBounds(40,270,150,20);
    add( lblphone);
    
   labelphone= new JLabel();
    labelphone.setBounds(250,270,200,25);
    add(labelphone);
    
    JLabel lbltotal= new JLabel("Total Price");
    lbltotal.setBounds(40,310,150,25);
    add(lbltotal);
    
    labelprice= new JLabel();
    labelprice.setBounds(250,330,150,25);
    add(labelprice);
    
     try{
                    conn conn = new conn();
                        String query = "select * from customer where username= '"+username+"'";
                        ResultSet rs = conn.s.executeQuery(query);
                        while(rs.next()){
                            labelusername.setText(rs.getString("username"));
                            labelid.setText(rs.getString("id"));
                            labelnumber.setText(rs.getString("number"));
  
                            labelphone.setText(rs.getString("phone"));
                            
                        }
                }
                catch(Exception e1){
                        e1.printStackTrace();
                }
     
     checkprice=new JButton("Check Price");
     checkprice.setBackground(Color.black);
     checkprice.setForeground(Color.white);
     checkprice.setBounds(60,380,120,25);
     checkprice.addActionListener(this);
     add(checkprice);
     
     Book=new JButton("Book Package");
     Book.setBackground(Color.black);
     Book.setForeground(Color.white);
     Book.setBounds(200,390,120,25);
     Book.addActionListener(this);
     add(Book);
     
     back=new JButton("Back");
     back.setBackground(Color.black);
     back.setForeground(Color.white);
     back.setBounds(340,380,120,25);
     back.addActionListener(this);
     add(back);
     
     ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i5 = i4.getImage().getScaledInstance(500,300, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(550,50,500,300);
        add(image);
		
    
        
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            String pack=cpackage.getSelectedItem();
            int cost=0;
            if(pack.equals("Gold Package")){
                cost+=12000;
            }else if(pack.equals("Silver Package")){
                cost+=25000;
            }else{
                cost+=32000;
            }
            int persons=Integer.parseInt(tfpersons.getText());
            cost*=persons;
            labelprice.setText("RS "+ cost);
            
        }else if(ae.getSource()==Book){
            
                            try{
	    			conn c=new conn();
                                c.s.executeUpdate("insert into bookPackage values('"+labelusername.getText()+"', '"+cpackage.getSelectedItem()+"', '"+tfpersons.getText()+"', '"+labelid.getText()+"', '"+labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labelprice.getText()+"')");
                                
                                JOptionPane.showMessageDialog(null, "Package booked successfully");
                                setVisible(false);
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
            
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new BookPackage("");
    }
}