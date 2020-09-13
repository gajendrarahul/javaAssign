import javax.swing.*;
import java.awt.event.*;
public class SimpleInterest extends JFrame
{
    JLabel j1, j2, j3, j4,j5;
    JTextField t1, t2, t3;
    JButton b1;

    public SimpleInterest() {

    }

    public SimpleInterest(String S) {
        super(S);
    }

    public void set() {
        j1 = new JLabel("calculating simple interest");
        j2 = new JLabel("Principal");
        j3 = new JLabel("Time");
        j4 = new JLabel("Rate");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b1 = new JButton("Calculate");
        j5 = new JLabel();
        setLayout(null);
        j1.setBounds(50, 40, 200, 30);
        j2.setBounds(50, 80, 100, 20);
        t1.setBounds(130, 80, 70, 20);
        j3.setBounds(50, 110, 100, 20);
        t2.setBounds(130, 110, 70, 20);
        j4.setBounds(50, 150, 100, 20);
        t3.setBounds(130, 140, 70, 20);
        b1.setBounds(50, 190, 130, 20);
        j5.setBounds(50, 230, 200, 30);
        b1.addActionListener(new Int());
        add(j1);
        add(j2);
        add(t1);
        add(j3);
        add(t2);
        add(j4);
        add(t3);
        add(b1);
        add(j5);
    }

    class Int implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Float p=Float.parseFloat(t1.getText());
            Float t=Float.parseFloat(t2.getText());
            Float r=Float.parseFloat(t3.getText());
            Float i=((p*t*r)/100);
            j5.setText("Total interest is :"+i);
        }
    }

    public static void main(String[] args)
    {
        // TODO code application logic here
        SimpleInterest jf=new SimpleInterest("SimpleInterest");
        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.set();

    }
}