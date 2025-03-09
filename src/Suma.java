import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private JButton CEButton;
    private JButton DelButton;
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
/*
                if(!textPantalla.getText().contains(".")){
                    textPantalla.setText(textPantalla.getText() +  ".");
                }

 */
                String array[] = textPantalla.getText().split("[*/+\\-]");
                /*if(array.length == 1){
                    if(!array[0].contains(".")){
                        textPantalla.setText(textPantalla.getText() +  ".");
                    }
                }else{
                    if(!array[1].contains(".")) {
                        textPantalla.setText(textPantalla.getText() + ".");
                    }
                }*/
                if(!array[array.length-1].contains(".")){
                    textPantalla.setText(textPantalla.getText() + ".");
                }

            }
        });
        btndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(
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
                ){
                    textPantalla.setText(textPantalla.getText() + "/");
                }


            }
        });

        btnprod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(
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
                ){
                    textPantalla.setText(textPantalla.getText() + "*");
                }
            }
        });
        btnsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(
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
                ){
                    textPantalla.setText(textPantalla.getText() + "+");
                }
            }
        });

        btnres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(
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
                ){
                    textPantalla.setText(textPantalla.getText() + "-");
                }
            }
        });

        btnequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*if(textPantalla.getText().contains("/")){
                    String array[] = textPantalla.getText().split("/");
                    operando1 = Float.valueOf(array[0]);
                    operando2 = Float.valueOf(array[1]);
                    if(operando2 != 0){
                        result = operando1 / operando2;
                        textPantalla.setText(String.valueOf(result));
                    }else{
                        textPantalla.setText("Error");
                    }
                }
                if(textPantalla.getText().contains("*")){
                    String array[] = textPantalla.getText().split("\\*");
                    operando1 = Float.valueOf(array[0]);
                    operando2 = Float.valueOf(array[1]);
                    result = operando1 * operando2;
                    textPantalla.setText(String.valueOf(result));
                }
                if(textPantalla.getText().contains("+")){
                    String array[] = textPantalla.getText().split("\\+");
                    operando1 = Float.valueOf(array[0]);
                    operando2 = Float.valueOf(array[1]);
                    result = operando1 + operando2;
                    textPantalla.setText(String.valueOf(result));
                }
                if(textPantalla.getText().contains("-")){
                    String array[] = textPantalla.getText().split("-");
                    operando1 = Float.valueOf(array[0]);
                    operando2 = Float.valueOf(array[1]);
                    result = operando1 - operando2;
                    textPantalla.setText(String.valueOf(result));
                }*/

                int opera;
                double resParc = 0.0;
                List<String> numeros = new ArrayList<>();

                String nums[] = textPantalla.getText().split("[*/+\\-]");
                //numeros = Arrays.stream(nums).toList();
                numeros = new ArrayList<>(Arrays.asList(nums));
                List<String> operadores = new ArrayList<>();
                Pattern pattern = Pattern.compile("[*/+\\-]");
                Matcher matcher = pattern.matcher((textPantalla.getText()));
                while (matcher.find()) {
                    operadores.add(matcher.group());
                }

                while(!operadores.isEmpty()){
                    while(operadores.indexOf("*") != -1){
                        operar(operadores, numeros, operadores.indexOf("*"));
                    }
                    while(operadores.indexOf("/") != -1){
                        operar(operadores, numeros, operadores.indexOf("/"));
                    }
                    while(operadores.indexOf("+") != -1){
                        operar(operadores, numeros, operadores.indexOf("+"));
                    }
                    while(operadores.indexOf("-") != -1){
                        operar(operadores, numeros, operadores.indexOf("-"));
                    }
                }
                textPantalla.setText(String.valueOf(numeros.get(0)));

            }
        });

        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText("");
            }
        });

        DelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPantalla.setText(textPantalla.getText().substring(0, textPantalla.getText().length()-1));
            }
        });
    }
    void operar(List<String> operadores, List<String> numeros, int opera){
        Double resParc = 0.0;
        switch(operadores.get(opera)){
            case "+":
                resParc = Double.valueOf(numeros.get(opera)) + Double.valueOf(numeros.get(opera + 1));
                break;
            case "-":
                resParc = Double.valueOf(numeros.get(opera)) - Double.valueOf(numeros.get(opera + 1));
                break;
            case "*":
                resParc = Double.valueOf(numeros.get(opera)) * Double.valueOf(numeros.get(opera + 1));
                break;
            case "/":
                resParc = Double.valueOf(numeros.get(opera)) / Double.valueOf(numeros.get(opera + 1));
                break;
        }

        numeros.remove(opera);
        numeros.remove(opera);
        numeros.add(opera, String.valueOf(resParc));
        operadores.remove(opera);
    }

}
