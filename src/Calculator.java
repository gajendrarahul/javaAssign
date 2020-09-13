import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame
{
    JLabel j1,j2,j3,j4;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;

    public Calculator()
    {

    }
    public Calculator(String S)
    {
        super(S);
    }

    public void set() {
        j1 = new JLabel("Calculate");
        j2 = new JLabel("first number");
        j3 = new JLabel("second number");
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        j4 = new JLabel();
        setLayout(null);
        j1.setBounds(50, 50, 200, 30);
        j2.setBounds(50, 80, 100, 20);
        t1.setBounds(150, 80, 70, 20);
        j3.setBounds(50, 130, 100, 20);
        t2.setBounds(150, 130, 70, 20);
        b1.setBounds(50, 180, 50, 20);
        b2.setBounds(120, 180, 50, 20);
        b3.setBounds(190, 180, 50, 20);
        b4.setBounds(260, 180, 50, 20);
        j4.setBounds(50, 230, 200, 20);
        b1.addActionListener(new Ex());
        b2.addActionListener(new sub());
        b3.addActionListener(new mul());
        b4.addActionListener(new div());
        add(j1);
        add(j2);
        add(t1);
        add(j3);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(j4);
    }
    class Ex implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int x=Integer.parseInt(t1.getText());
            int y=Integer.parseInt(t2.getText());
            int s=x+y;
            j4.setText("Result is :"+s);
        }
    }
    class sub implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int x=Integer.parseInt(t1.getText());
            int y=Integer.parseInt(t2.getText());
            int s=x-y;
            j4.setText("Result is :"+s);
        }
    }
    class mul implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int x=Integer.parseInt(t1.getText());
            int y=Integer.parseInt(t2.getText());
            int s=x*y;
            j4.setText("Result is :"+s);
        }
    }
    class div implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Float x=Float.parseFloat(t1.getText());
            Float y=Float.parseFloat(t2.getText());
            Float s=x/y;
            j4.setText("Result is :"+s);
        }
    }


    public static void main(String[] args)
    {
        // TODO code application logic here
        Calculator jf=new Calculator("Calculator");
        jf.setSize(500,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.set();

    }
}