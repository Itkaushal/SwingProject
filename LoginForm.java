import javax.swing.*;
import java.awt.*;

 class Login extends JFrame {

        JTextField t1;
        JPasswordField p1;
        JButton b1,b2;
        JLabel l1,l3,l4;
        JPanel login;

        Login()
        {
            JFrame frame = new JFrame();
            Font font = new Font("Serif",Font.BOLD,40);

            JPanel heading = new JPanel();
            heading.setBackground(new Color(0,0,0,15));
            heading.setBounds(0,0,900,80);

            JLabel l2 = new JLabel("Login");
            l2.setBounds(200,100,450,350);
            l2.setFont(font);
            l2.setForeground(Color.RED);
            heading.add(l2);
            frame.add(heading);

            //login

            login=new JPanel();
            login.setBackground(new Color(0,0,0,11));
            login.setLayout(null);
            login.setBounds(250,145,400,350);

            ImageIcon icon =new ImageIcon("download.png");
            Image im = icon.getImage();
            Image image = im.getScaledInstance(55,30,Image.SCALE_SMOOTH);
            icon=new ImageIcon(image);
            l1=new JLabel(" ",icon,JLabel.CENTER);
            l1.setBounds(30,100,80,30);
            login.add(l1);

            t1=new JTextField("Enter User Id");
            t1.setBounds(120,100,200,35);
            login.add(t1);

            ImageIcon imgicon = new ImageIcon("key.jpeg");
            Image im1 = imgicon.getImage();
            Image image2 = im1.getScaledInstance(55,30,Image.SCALE_SMOOTH);
            imgicon=new ImageIcon(image2);
            l3=new JLabel(" ",imgicon,JLabel.CENTER);
            l3.setBounds(30,140,80,30);
            login.add(l3);

            p1= new JPasswordField("Enter Password");
            p1.setBounds(120,140,200,35);
            login.add(p1);

            b1=new JButton("Login");
            b1.setBounds(120,180,70,40);
            b1.setBackground(Color.blue);
            b1.setForeground(Color.WHITE);
            login.add(b1);

            b2=new JButton("SignUp");
            b2.setBounds(200,180,100,40);
            b2.setBackground(Color.blue);
            b2.setForeground(Color.WHITE);
            login.add(b2);

            frame.add(login);


            ImageIcon icon2 =new ImageIcon("bb.jpeg");
            Image im2 = icon2.getImage();
            Image imag2= im2.getScaledInstance(900,600,Image.SCALE_SMOOTH);
            icon2=new ImageIcon(imag2);
            l4=new JLabel(" ",icon2,JLabel.CENTER);
            l4.setBounds(0,0,900,600);
            l4.add(login);
            l4.add(heading);
            frame.add(l4);

            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            frame.setSize(900,600);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setResizable(false);

        }

     public static void main(String[] args) {
         new Login();
     }
    }
