import java.awt.*;
import java.awt.event.*;

public class TicTacToe implements ActionListener,WindowListener {
    Frame f;
    Button button,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    Label l;
    int count =0;
    String letter;
    public TicTacToe() {
        f= new Frame("Tic Tac Toe");
        button= new Button();
        l= new Label();

        b1= new Button();
        b1.setBackground(Color.darkGray);
        b1.setFont(new Font("SansSerif", Font.BOLD, 50));
        b1.setBounds(55,70,100,100);

        b2 = new Button();
        b2.setBackground(Color.darkGray);
        b2.setFont(new Font("SansSerif", Font.BOLD, 50));
        b2.setBounds(155,70,100,100);

        b3 = new Button();
        b3.setBackground(Color.darkGray);
        b3.setFont(new Font("SansSerif", Font.BOLD, 50));
        b3.setBounds(255,70,100,100);

        b4 = new Button();
        b4.setBackground(Color.darkGray);
        b4.setFont(new Font("SansSerif", Font.BOLD, 50));
        b4.setBounds(55,170,100,100);

        b5 = new Button();
        b5.setBackground(Color.darkGray);
        b5.setFont(new Font("SansSerif", Font.BOLD, 50));
        b5.setBounds(155,170,100,100);

        b6 = new Button();
        b6.setBackground(Color.darkGray);
        b6.setFont(new Font("SansSerif", Font.BOLD, 50));
        b6.setBounds(255,170,100,100);

        b7 = new Button();
        b7.setBackground(Color.darkGray);
        b7.setFont(new Font("SansSerif", Font.BOLD, 50));
        b7.setBounds(55,270,100,100);

        b8 = new Button();
        b8.setBackground(Color.darkGray);
        b8.setFont(new Font("SansSerif", Font.BOLD, 50));
        b8.setBounds(155,270,100,100);

        b9 = new Button();
        b9.setBackground(Color.darkGray);
        b9.setFont(new Font("SansSerif", Font.BOLD, 50));
        b9.setBounds(255,270,100,100);

        b10 = new Button("Restart");
        b10.setBackground(Color.darkGray);
        b10.setForeground(Color.GREEN);
        b10.setFont(new Font("SansSerif",Font.BOLD,20));
        b10.setBounds(55,380,300,30);

        l.setBounds(55,35,300,40);
     l.setForeground(Color.black);
     l.setFont(new Font("SansSerif",Font.BOLD,20));

        f.add(button);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(l);



        button.addActionListener(this);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);

        f.addWindowListener(this);
        f.setSize(400,440);
        f.setResizable(false);
        f.setBackground(Color.lightGray);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;

        if(count==1||count==3||count==5||count==7||count==9){
            letter="X";
        }

        else if(count==2||count==4||count==6||count==8){
            letter="0";

        }
        if(e.getSource()==b1){
            b1.setLabel(letter);
            b1.setEnabled(false);
        }

        else if(e.getSource()==b2) {
            b2.setLabel(letter);
            b2.setEnabled(false);

        }
        else if(e.getSource()==b3){
            b3.setLabel(letter);
            b3.setEnabled(false);

        }

        else if(e.getSource()==b4){
            b4.setLabel(letter);
            b4.setEnabled(false);

        }
        else if(e.getSource()==b5){
            b5.setLabel(letter);
            b5.setEnabled(false);
        }

        else if(e.getSource()==b6){
            b6.setLabel(letter);
            b6.setEnabled(false);
        }
        else if(e.getSource()==b7){
            b7.setLabel(letter);
            b7.setEnabled(false);

        }

        else if(e.getSource()==b8){
            b8.setLabel(letter);
            b8.setEnabled(false);

        }

        else if(e.getSource()==b9){
            b9.setLabel(letter);
            b9.setEnabled(false);

        }
        else if(e.getSource()==b10){
            letter = "";

            count = 0;

            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);

            b1.setLabel("");
            b2.setLabel("");
            b3.setLabel("");
            b4.setLabel("");
            b5.setLabel("");
            b6.setLabel("");
            b7.setLabel("");
            b8.setLabel("");
            b9.setLabel("");
            b9.setLabel("");
            l.setText("");
            boolean win = false;
        }
        checkWinner();
        }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
    private void checkWinner() {
        Boolean win = null;

        if (b1.getLabel() == b2.getLabel() && b2.getLabel() == b3.getLabel() && b1.getLabel() != "" && b2.getLabel() != "" && b3.getLabel() != "") {

            win = true;

        }


else if (b4.getLabel() == b5.getLabel() && b5.getLabel() == b6.getLabel() && b4.getLabel() != "" && b5.getLabel() != "" && b6.getLabel() != "") {

            win = true;

        }



else if (b7.getLabel() == b8.getLabel() && b8.getLabel() == b9.getLabel() && b7.getLabel() != ""&& b8.getLabel() != "" && b9.getLabel() != "") {

            win = true;

        }


else if (b1.getLabel() == b4.getLabel() && b4.getLabel() == b7.getLabel() && b1.getLabel() != ""&& b4.getLabel() != "" && b7.getLabel() != "") {

            win = true;
        }



else if (b2.getLabel() == b5.getLabel() && b5.getLabel() == b8.getLabel() && b2.getLabel() != "" && b5.getLabel() != "" && b8.getLabel() != "") {
            win = true;

        } else if (b3.getLabel() == b6.getLabel() && b6.getLabel() == b9.getLabel() && b3.getLabel() != "" && b6.getLabel() !="" && b9.getLabel() != "") {

            win = true;
        }



else if (b1.getLabel() == b5.getLabel() && b5.getLabel() == b9.getLabel() && b1.getLabel() != "" && b5.getLabel() != "" && b9.getLabel() != "") {

            win = true;

        }



else if (b3.getLabel() == b5.getLabel() && b5.getLabel() == b7.getLabel() && b3.getLabel() != "" && b5.getLabel() != "" && b7.getLabel() != "") {

            win = true;
    }
     else {

        win = false;

    }
        if (win) {

            l.setText("Hurray ! Player " +  letter + " Wins");

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

        } else if (!win && count == 9) {
            l.setText("The Game ended in a tie :)");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

        }
        }

    public static void main(String[] args) {
        new TicTacToe();
    }
}

