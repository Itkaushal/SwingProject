import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener {
     JFrame frame;
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bplus,bminus,bmulti,bpoint,bpercent,bequal,bdivide,bclear;
     JTextField textField;
    static double a,b,c=0;
    int op;


     Calculator()
     {
          frame= new JFrame();

          Font font = new Font("Algerian",Font.BOLD,40);
          Font font2 = new Font("Serif",Font.BOLD,20);

          JPanel heading = new JPanel();
          heading.setBackground(new Color(0,0,0,25));
          heading.setBounds(0,0,900,70);

          JLabel label = new JLabel("Calculator");
          label.setBounds(200,200,400,300);
          label.setFont(font);
          label.setForeground(Color.RED);
          heading.add(label);
          frame.add(heading);

          JPanel calculator=new JPanel();
          calculator.setBackground(new Color(0,0,0,45));
          calculator.setLayout(null);
          calculator.setBounds(250,100,350,500);
          frame.add(calculator);

          textField=new JTextField();
          textField.setBounds(25,10,300,60);
          calculator.add(textField);

          //first row
          b7= new JButton("7");
          b7.setBounds(25,100,60,40);
          b7.setBackground(Color.BLUE);
          calculator.add(b7);
          b7.setForeground(Color.WHITE);
          b7.setFont(font2);

          b8= new JButton("8");
          b8.setBounds(105,100,60,40);
          b8.setBackground(Color.BLUE);
          calculator.add(b8);
          b8.setFont(font2);
          b8.setForeground(Color.WHITE);

          b9= new JButton("9");
          b9.setBounds(185,100,60,40);
          b9.setBackground(Color.BLUE);
          b9.setFont(font2);
          calculator.add(b9);
          b9.setForeground(Color.WHITE);

          bplus= new JButton("+");
          bplus.setBounds(265,100,60,40);
          bplus.setBackground(Color.BLUE);
          calculator.add(bplus);
          bplus.setFont(font2);
          bplus.setForeground(Color.WHITE);

          // second row
          b4= new JButton("4");
          b4.setBounds(25,160,60,40);
          b4.setBackground(Color.BLUE);
          calculator.add(b4);
          b4.setFont(font2);
          b4.setForeground(Color.WHITE);

          b5= new JButton("5");
          b5.setBounds(105,160,60,40);
          b5.setBackground(Color.BLUE);
          calculator.add(b5);
          b5.setFont(font2);
          b5.setForeground(Color.WHITE);

          b6= new JButton("6");
          b6.setBounds(185,160,60,40);
          b6.setBackground(Color.BLUE);
          calculator.add(b6);
          b6.setFont(font2);
          b6.setForeground(Color.WHITE);

          bminus= new JButton("-");
          bminus.setFont(font2);
          bminus.setBounds(265,160,60,40);
          bminus.setBackground(Color.BLUE);
          calculator.add(bminus);
          bminus.setForeground(Color.WHITE);

          // third row

          b1= new JButton("1");
          b1.setBounds(25,220,60,40);
          b1.setBackground(Color.BLUE);
          calculator.add(b1);
          b1.setFont(font2);
          b1.setForeground(Color.WHITE);

          b2= new JButton("2");
          b2.setBounds(105,220,60,40);
          b2.setBackground(Color.BLUE);
          calculator.add(b2);
          b2.setFont(font2);
          b2.setForeground(Color.WHITE);

          b3= new JButton("3");
          b3.setBounds(185,220,60,40);
          b3.setBackground(Color.BLUE);
          calculator.add(b3);
          b3.setFont(font2);
          b3.setForeground(Color.WHITE);

          bmulti= new JButton("*");
          bmulti.setBounds(265,220,60,40);
          bmulti.setBackground(Color.BLUE);
          calculator.add(bmulti);
          bmulti.setFont(font2);
          bmulti.setForeground(Color.WHITE);

          // fourth row
          b0= new JButton("0");
          b0.setBounds(25,280,60,40);
          b0.setBackground(Color.BLUE);
          b0.setFont(font2);
          b0.setForeground(Color.WHITE);
          calculator.add(b0);

          bpoint= new JButton(".");
          bpoint.setBounds(105,280,60,40);
          bpoint.setBackground(Color.BLUE);
          calculator.add(bpoint);
          bpoint.setFont(font2);
          bpoint.setForeground(Color.WHITE);

          bclear= new JButton("CLR");
          bclear.setBounds(185,280,60,40);
          bclear.setBackground(Color.WHITE);
          bclear.setForeground(Color.RED);
          calculator.add(bclear);

          bdivide= new JButton("/");
          bdivide.setBounds(265,280,60,40);
          bdivide.setBackground(Color.BLUE);
          calculator.add(bdivide);
          bdivide.setFont(font2);
          bdivide.setForeground(Color.WHITE);

          bequal= new JButton("=");
          bequal.setBounds(25,340,100,40);
          bequal.setFont(font2);
          bequal.setBackground(Color.WHITE);
          bequal.setForeground(Color.RED);
          calculator.add(bequal);

          bpercent= new JButton("%");
          bpercent.setBounds(150,340,100,40);

          
          bpercent.setFont(font2);
          bpercent.setForeground(Color.WHITE);
          bpercent.setBackground(Color.blue);
          calculator.add(bpercent);

          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
          b4.addActionListener(this);
          b5.addActionListener(this);
          b6.addActionListener(this);
          b7.addActionListener(this);
          b8.addActionListener(this);
          b9.addActionListener(this);
          b0.addActionListener(this);
          bpoint.addActionListener(this);
          bpercent.addActionListener(this);
          bequal.addActionListener(this);
          bdivide.addActionListener(this);
          bmulti.addActionListener(this);
          bplus.addActionListener(this);
          bminus.addActionListener(this);
          bclear.addActionListener(this);


          frame.setLayout(null);
          frame.setVisible(true);
          frame.setSize(900,700);
          frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
          frame.setResizable(false);

     }

     @Override
     public void actionPerformed(ActionEvent e) {
          if (e.getSource()==b1)
               textField.setText(textField.getText().concat("1"));
          if (e.getSource()==b2)
               textField.setText(textField.getText().concat("2"));
          if (e.getSource()==b3)
               textField.setText(textField.getText().concat("3"));
          if (e.getSource()==b4)
               textField.setText(textField.getText().concat("4"));
          if (e.getSource()==b5)
               textField.setText(textField.getText().concat("5"));
          if (e.getSource()==b6)
               textField.setText(textField.getText().concat("6"));
          if (e.getSource()==b7)
               textField.setText(textField.getText().concat("7"));
          if (e.getSource()==b8)
               textField.setText(textField.getText().concat("8"));
          if (e.getSource()==b9)
               textField.setText(textField.getText().concat("9"));
          if (e.getSource()==b0)
               textField.setText(textField.getText().concat("0"));
          if (e.getSource()==bpoint)
               textField.setText(textField.getText().concat("."));


          if (e.getSource()==bplus)
          {
              a=Double.parseDouble(textField.getText());
              op=1;
              textField.setText("");
          }
          if (e.getSource()==bminus)
          {
               a=Double.parseDouble(textField.getText());
               op=2;
               textField.setText("");
          }
          if (e.getSource()==bmulti)
          {
               a=Double.parseDouble(textField.getText());
               op=3;
               textField.setText("");
          }
          if (e.getSource()==bdivide)
          {
               a=Double.parseDouble(textField.getText());
               op=4;
               textField.setText("");

          }
          if (e.getSource()==bpercent)
          {
               a=Double.parseDouble(textField.getText());
               op=5;
               textField.setText("");
          }
          if (e.getSource()==bequal)
          {
               b=Double.parseDouble(textField.getText());
               switch (op) {
                    case 1 -> c = a + b;
                    case 2 -> c = a - b;
                    case 3 -> c = a * b;
                    case 4 -> {
                         if (b != 0)
                         {
                              c=a/b;
                         }
                         else {
                              JOptionPane.showMessageDialog(frame,"cannot divided by zero!");
                              return;
                         }

                    }
                    case 5 -> c = a % b;
                    default -> JOptionPane.showMessageDialog(frame, "Wrong");
               }
               textField.setText("Result is: " + String.valueOf(c));
          }

          if (e.getSource()==bclear)
          {

               textField.setText("");
          }

     }

     public static void main(String[] args) {

          new Calculator();

     }
}
