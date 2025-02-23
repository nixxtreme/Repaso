import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Suma extends JFrame{
    private JPanel panel1;
    private JTextField textPantalla;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnsum;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnres;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnprod;
    private JButton btn0;
    private JButton btnpnt;
    private JButton btndiv;
    private JButton btnequal;
    double operando1;
    double operando2;
    double result;
    public Suma(){
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocation(800,800);
        setVisible(true);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText(textPantalla.getText() +  "9");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText(textPantalla.getText() +  "8");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText(textPantalla.getText() +  "7");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText(textPantalla.getText() +  "6");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText(textPantalla.getText() +  "5");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText(textPantalla.getText() +  "4");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText(textPantalla.getText() +  "3");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText(textPantalla.getText() +  "2");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText(textPantalla.getText() +  "1");
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText(textPantalla.getText() +  "0");
            }
        });
        btnpnt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!textPantalla.getText().contains(".")){
                    textPantalla.setText(textPantalla.getText() +  ".");
                }
            }
        });
        btndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((!textPantalla.getText().contains("/") &&
                        !textPantalla.getText().contains("/") &&
                        !textPantalla.getText().contains("-") &&
                        !textPantalla.getText().contains("+")
                ) && (
                        textPantalla.getText().contains("0") ||
                                textPantalla.getText().contains("1") ||
                                textPantalla.getText().contains("2") ||
                                textPantalla.getText().contains("3") ||
                                textPantalla.getText().contains("4") ||
                                textPantalla.getText().contains("5") ||
                                textPantalla.getText().contains("6") ||
                                textPantalla.getText().contains("7") ||
                                textPantalla.getText().contains("8") ||
                                textPantalla.getText().contains("9")
                )){
                    textPantalla.setText(textPantalla.getText() + "/");
                }
            }
        });

        btnprod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((!textPantalla.getText().contains("*") &&
                        !textPantalla.getText().contains("/") &&
                        !textPantalla.getText().contains("-") &&
                        !textPantalla.getText().contains("+")
                ) && (
                        textPantalla.getText().contains("0") ||
                                textPantalla.getText().contains("1") ||
                                textPantalla.getText().contains("2") ||
                                textPantalla.getText().contains("3") ||
                                textPantalla.getText().contains("4") ||
                                textPantalla.getText().contains("5") ||
                                textPantalla.getText().contains("6") ||
                                textPantalla.getText().contains("7") ||
                                textPantalla.getText().contains("8") ||
                                textPantalla.getText().contains("9")
                )){
                    textPantalla.setText(textPantalla.getText() + "*");
                }
            }
        });
        btnsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((!textPantalla.getText().contains("*") &&
                        !textPantalla.getText().contains("/") &&
                        !textPantalla.getText().contains("-") &&
                        !textPantalla.getText().contains("+")
                ) && (
                        textPantalla.getText().contains("0") ||
                                textPantalla.getText().contains("1") ||
                                textPantalla.getText().contains("2") ||
                                textPantalla.getText().contains("3") ||
                                textPantalla.getText().contains("4") ||
                                textPantalla.getText().contains("5") ||
                                textPantalla.getText().contains("6") ||
                                textPantalla.getText().contains("7") ||
                                textPantalla.getText().contains("8") ||
                                textPantalla.getText().contains("9")
                )){
                    textPantalla.setText(textPantalla.getText() + "+");
                }
            }
        });

        btnres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((!textPantalla.getText().contains("*") &&
                        !textPantalla.getText().contains("/") &&
                        !textPantalla.getText().contains("-") &&
                        !textPantalla.getText().contains("+")
                ) && (
                        textPantalla.getText().contains("0") ||
                                textPantalla.getText().contains("1") ||
                                textPantalla.getText().contains("2") ||
                                textPantalla.getText().contains("3") ||
                                textPantalla.getText().contains("4") ||
                                textPantalla.getText().contains("5") ||
                                textPantalla.getText().contains("6") ||
                                textPantalla.getText().contains("7") ||
                                textPantalla.getText().contains("8") ||
                                textPantalla.getText().contains("9")
                )){
                    textPantalla.setText(textPantalla.getText() + "-");
                }
            }
        });

        btnequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textPantalla.getText().contains("/")){
                    String array[] = textPantalla.getText().split("/");
                    operando1 = Float.valueOf(array[0]);
                    operando2 = Float.valueOf(array[1]);
                    if(operando2 != 0){
                        result = operando1 / operando2;
                        textPantalla.setText(textPantalla.getText() + " = " + result);
                    }else{
                        textPantalla.setText("Error");
                    }

                }
                if(textPantalla.getText().contains("*")){
                    String array[] = textPantalla.getText().split("*");
                    operando1 = Float.valueOf(array[0]);
                    operando2 = Float.valueOf(array[1]);
                }
                if(textPantalla.getText().contains("+")){
                    String array[] = textPantalla.getText().split("+");
                    operando1 = Float.valueOf(array[0]);
                    operando2 = Float.valueOf(array[1]);
                }
                if(textPantalla.getText().contains("-")){
                    String array[] = textPantalla.getText().split("-");
                    operando1 = Float.valueOf(array[0]);
                    operando2 = Float.valueOf(array[1]);
                }

            }
        });
    }


}
