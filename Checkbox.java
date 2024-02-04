import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Checkbox implements ItemListener {

    JLabel label;
    JCheckBox c1,c2,c3;
    JFrame frame;

    Checkbox(){

         frame = new JFrame();

         c1 = new JCheckBox("Python");
        c1.setBounds(100,100,150,50);
        frame.add(c1);

        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);


        c2 = new JCheckBox("Java");
        c2.setBounds(100,150,100,50);
        frame.add(c2);

        c3 = new JCheckBox("C++");
        c3.setBounds(100,200,50,50);
        frame.add(c3);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        JCheckBox c1 = (JCheckBox) e.getItem();
        int state = e.getStateChange();
        if (state == ItemEvent.SELECTED)
        {
            System.out.println(c1.getText()+ "selected");
            JOptionPane.showMessageDialog(frame,c1.getText());
        }

        JCheckBox c2 = (JCheckBox) e.getItem();
        int state2 = e.getStateChange();
        if (state2 == ItemEvent.SELECTED)
        {
            System.out.println(c2.getText()+ "selected");
        }

        JCheckBox c3 = (JCheckBox) e.getItem();
        int state3 = e.getStateChange();
        if (state3 == ItemEvent.SELECTED)
        {
            System.out.println(c3.getText()+ "selected");
        }

    }

    public static void main(String[] args) {
        Checkbox c = new Checkbox();
    }

}
