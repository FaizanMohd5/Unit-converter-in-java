import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class LengthConverterFrame extends JFrame {
    private JPanel panel;
    private JLabel appName;
    private JLabel wordTo;
    private JLabel result;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JButton convertButton;
    private JTextField input;

    public void initComponents(){

        panel.add(appName); //just for formality
        panel.add(wordTo);  //just for formality
        panel.add(input);   //taken for consideration (takes number)
        panel.add(result);  //takes for consideration (high priority)

        panel.add(comboBox1); // takes for consideration (array of strings);
        panel.add(comboBox2);

        panel.add(convertButton);// for main event handling mechanism

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double number = Double.parseDouble(input.getText());
                    String from = (String) comboBox1.getSelectedItem();
                    String to = (String) comboBox2.getSelectedItem();
                    if (from.equals("Kilometer")) {
                        kiloToX(number, to);
                    } else if (from.equals("Hectometer")) {
                        hectoToX(number, to);
                    } else if (from.equals("Dekameter")) {
                        dekaToX(number, to);
                    } else if (from.equals("Meter")) {
                        meterToX(number, to);
                    } else if (from.equals("Decimeter")) {
                        deciToX(number, to);
                    } else if (from.equals("Centimeter")) {
                        centiToX(number, to);
                    } else {
                        milliToX(number, to);
                    }
                }
                catch(NumberFormatException exception){
                    result.setText("Invalid input"+"\n"+"Only numerics allowed");
                    input.setText(null);
                }
            }
        });
    }
    DecimalFormat df = new DecimalFormat("#.######");
    private void kiloToX(double number, String to) {
        if(to.equals("Hectometer")){
            result.setText(df.format(number*10)+"hm");
        } else if (to.equals("Dekameter")) {
            result.setText(df.format(number*10*10)+"dam");
        } else if (to.equals("Meter")) {
            result.setText(df.format(number*10*10*10)+"m");
        } else if (to.equals("Decimeter")) {
            result.setText(df.format(number*10*10*10*10)+"dm");
        } else if (to.equals("Centimeter")) {
            result.setText(df.format(number*10*10*10*10*10)+"cm");
        } else if (to.equals("Millimeter")) {
            result.setText(df.format(number*10*10*10*10*10*10)+"mm");
        }
    }
    private void hectoToX(double number, String to) {
        if(to.equals("Kilometer")){
            result.setText(df.format(number/10)+"km");
        } else if (to.equals("Dekameter")) {
            result.setText(df.format(number*10)+"dam");
        } else if (to.equals("Meter")) {
            result.setText(df.format(number*10*10)+"m");
        } else if (to.equals("Decimeter")) {
            result.setText(df.format(number*10*10*10)+"dm");
        } else if (to.equals("Centimeter")) {
            result.setText(df.format(number*10*10*10*10)+"cm");
        } else if (to.equals("Millimeter")) {
            result.setText(df.format(number*10*10*10*10*10)+"mm");
        }
    }
    private void dekaToX(double number, String to) {
        if(to.equals("Kilometer")){
            result.setText(df.format(number/10/10)+"km");
        } else if (to.equals("Hectometer")) {
            result.setText(df.format(number/10)+"hm");
        } else if (to.equals("Meter")) {
            result.setText(df.format(number*10)+"m");
        } else if (to.equals("Decimeter")) {
            result.setText(df.format(number*10*10)+"dm");
        } else if (to.equals("Centimeter")) {
            result.setText(df.format(number*10*10*10)+"cm");
        } else if (to.equals("Millimeter")) {
            result.setText(df.format(number*10*10*10*10)+"mm");
        }
    }
    private void meterToX(double number, String to) {
        if(to.equals("Kilometer")){
            result.setText(df.format(number/10/10/10)+"km");
        } else if (to.equals("Hectometer")) {
            result.setText(df.format(number/10/10)+"hm");
        } else if (to.equals("Dekameter")) {
            result.setText(df.format(number/10)+"dam");
        } else if (to.equals("Decimeter")) {
            result.setText(df.format(number*10)+"dm");
        } else if (to.equals("Centimeter")) {
            result.setText(df.format(number*10*10)+"cm");
        } else if (to.equals("Millimeter")) {
            result.setText(df.format(number*10*10*10)+"mm");
        }
    }
    private void deciToX(double number, String to) {
        if(to.equals("Kilometer")){
            result.setText(df.format(number/10/10/10/10)+"km");
        } else if (to.equals("Hectometer")) {
            result.setText(df.format(number/10/10/10)+"hm");
        } else if (to.equals("Dekameter")) {
            result.setText(df.format(number/10/10)+"dam");
        } else if (to.equals("Meter")) {
            result.setText(df.format(number/10)+"m");
        } else if (to.equals("Centimeter")) {
            result.setText(df.format(number*10)+"cm");
        } else if (to.equals("Millimeter")) {
            result.setText(df.format(number*10*10)+"mm");
        }
    }
    private void centiToX(double number, String to) {
        if(to.equals("Kilometer")){
            result.setText(df.format(number/10/10/10/10/10)+"km");
        } else if (to.equals("Hectometer")) {
            result.setText(df.format(number/10/10/10/10)+"hm");
        } else if (to.equals("Dekameter")) {
            result.setText(df.format(number/10/10/10)+"dam");
        } else if (to.equals("Meter")) {
            result.setText(df.format(number/10/10)+"m");
        } else if (to.equals("Decimeter")) {
            result.setText(df.format(number/10)+"dm");
        } else if (to.equals("Millimeter")) {
            result.setText(df.format(number*10)+"mm");
        }
    }
    private void milliToX(double number, String to) {
        if(to.equals("Kilometer")){
            result.setText(df.format(number/10/10/10/10/10/10)+"km");
        } else if (to.equals("Hectometer")) {
            result.setText(df.format(number/10/10/10/10/10)+"hm");
        } else if (to.equals("Dekameter")) {
            result.setText(df.format(number/10/10/10/10)+"dam");
        } else if (to.equals("Meter")) {
            result.setText(df.format(number/10/10/10)+"m");
        } else if (to.equals("Decimeter")) {
            result.setText(df.format(number/10/10)+"dm");
        } else if (to.equals("Centimeter")) {
            result.setText(df.format(number/10)+"cm");
        }
    }
    public void positionComponents() {
        appName.setBounds(140, 20, 200, 20); // Centered horizontally, 100 pixels from the top, width 200
        input.setBounds(140, 70, 100, 20);   // 50 pixels from the left, 60 pixels from the top, width 100
        wordTo.setBounds(180, 130, 50, 20);  // 160 pixels from the left, 60 pixels from the top, width 50
        comboBox1.setBounds(50, 130, 100, 20); // Position for first JComboBox
        comboBox2.setBounds(225, 130, 100, 20); // Position for second JComboBox
        convertButton.setBounds(140, 200, 100, 30); // Position for JButton
        result.setBounds(165, 260, 200, 20);  // Position for result JLabel
    }
    public void colorComponents(){

    }
    public LengthConverterFrame(){
        panel.setLayout(null);
        setVisible(true);
        setSize(400,400);
        setContentPane(panel);

        initComponents();
        positionComponents();
        colorComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
            LengthConverterFrame frame = new LengthConverterFrame();
    }
}
