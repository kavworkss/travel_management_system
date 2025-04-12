package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton viewPersonalDetails, viewPackages,addPersonalDetails, checkPackages,bookPackages,  updatePersonalDetails,deletePersonalDetails;

    Dashboard(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

         updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
      checkPackages=new JButton("Check Packages");
       checkPackages.setBounds(0,200,300,50);
       checkPackages.setBackground(new Color(0,0,102));
       checkPackages.setForeground(Color.white);
       checkPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
       checkPackages.setMargin(new Insets(0,0,0,100));
       checkPackages.addActionListener(this);
       p2.add(checkPackages); 
       
       bookPackages=new JButton("Book Packages");
       bookPackages.setBounds(0,250,300,50);
       bookPackages.setBackground(new Color(0,0,102));
       bookPackages.setForeground(Color.white);
       bookPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
       bookPackages.setMargin(new Insets(0,0,0,120));
       bookPackages.addActionListener(this);
       p2.add(bookPackages); 
       
        viewPackages=new JButton("View Packages");
       viewPackages.setBounds(0,300,300,50);
       viewPackages.setBackground(new Color(0,0,102));
       viewPackages.setForeground(Color.white);
       viewPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
       viewPackages.setMargin(new Insets(0,0,0,120));
       viewPackages.addActionListener(this);
       p2.add(viewPackages); 
       
       JButton viewHotels=new JButton("View Hotels ");
       viewHotels.setBounds(0,350,300,50);
       viewHotels.setBackground(new Color(0,0,102));
       viewHotels.setForeground(Color.white);
       viewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
       viewHotels.setMargin(new Insets(0,0,0,140));
       p2.add(viewHotels); 
       
       JButton bookHotels=new JButton("Book Hotels ");
       bookHotels.setBounds(0,400,300,50);
       bookHotels.setBackground(new Color(0,0,102));
       bookHotels.setForeground(Color.white);
       bookHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
       bookHotels.setMargin(new Insets(0,0,0,140));
       p2.add(bookHotels); 
       
       JButton viewBookedHotels=new JButton("View Booked Hotels ");
       viewBookedHotels.setBounds(0,450,300,50);
       viewBookedHotels.setBackground(new Color(0,0,102));
       viewBookedHotels.setForeground(Color.white);
       viewBookedHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
       viewBookedHotels.setMargin(new Insets(0,0,0,70));
       p2.add(viewBookedHotels); 
       
       JButton destinations=new JButton("Destinations ");
       destinations.setBounds(0,500,300,50);
       destinations.setBackground(new Color(0,0,102));
       destinations.setForeground(Color.white);
       destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
       destinations.setMargin(new Insets(0,0,0,130));
       p2.add(destinations); 
       
       JButton payements=new JButton("Payementss ");
       payements.setBounds(0,550,300,50);
       payements.setBackground(new Color(0,0,102));
       payements.setForeground(Color.white);
       payements.setFont(new Font("Tahoma", Font.PLAIN, 20));
       payements.setMargin(new Insets(0,0,0,155));
       p2.add(payements);
       
       JButton calculator=new JButton("Calculator");
       calculator.setBounds(0,600,300,50);
       calculator.setBackground(new Color(0,0,102));
       calculator.setForeground(Color.white);
       calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
       calculator.setMargin(new Insets(0,0,0,145));
       p2.add(calculator);
       
       JButton notepad=new JButton("Notepad");
       notepad.setBounds(0,650,300,50);
       notepad.setBackground(new Color(0,0,102));
       notepad.setForeground(Color.white);
       notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
       notepad.setMargin(new Insets(0,0,0,155));
       p2.add(notepad);
       
       JButton about=new JButton("About");
       about.setBounds(0,700,300,50);
       about.setBackground(new Color(0,0,102));
       about.setForeground(Color.white);
       about.setFont(new Font("Tahoma", Font.PLAIN, 20));
       about.setMargin(new Insets(0,0,0,175));
       p2.add(about);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);

        JLabel text = new JLabel("KavLaksh Travel and Tourism System");
        text.setBounds(400, 70, 1000, 70);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.PLAIN, 40));
        image.add(text);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        }else if(ae.getSource()==checkPackages){
            new checkPackage();
        }else if(ae.getSource()==bookPackages){
            new BookPackage(username);
        }else if(ae.getSource()== updatePersonalDetails){
            new UpdateCustomer(username);
        }else if(ae.getSource()==deletePersonalDetails){
            new DeleteDetails(username);
        }else if(ae.getSource()==viewPackages){
            new ViewPackage(username);
        }else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        }
    }

    public static void main(String[] args) {
        new Dashboard("");
    }
}