import org.omg.CORBA.Environment;
import sun.plugin2.message.Message;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.io.*;
import java.util.Scanner;

/**
 * Created by elham on 12/8/2020.
 */

public class FirstScreen
{
    private JPanel p1;
    private JTextField nameTxt;
    private JTextField ageTxt;
    private JPanel p2;
    private JPanel p3;
    private JButton submitButton;
    private JRadioButton Radio1;
    private JRadioButton Radio2;
    private JRadioButton Radio3;
    private JTextField resultTxt;
    private JLabel ResultLabl;


    static JFrame f1;

    Patient p = null;
    Disease d = null;


    public FirstScreen()
    {
        MyFile.createAndWriteAdviceFile(true);
        MyFile.readAdviceFileToArray();

        f1= new JFrame();

        ButtonGroup bt = new ButtonGroup();
        bt.add(Radio1);
        bt.add(Radio2);
        bt.add(Radio3);

        submitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                goSecond();
            }
        });
    }

    private void goSecond()
    {
        if(getValues())
        {
            f1.setVisible(false);
            ResultScreen.RunFrame(p, theJFrame);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"لقد قمت بإدخال قيمة خاطئة , حاول مرة أخرى !!");
        }
    }

    private boolean getValues()
    {
        if(Radio1.isSelected()) // DM
        {
            D_DM d1 = new D_DM(Radio1.getText(), 1);
            d = d1;
        }
        else if(Radio2.isSelected()) // CH
        {
            D_CH d1 = new D_CH(Radio2.getText(), 2);
            d = d1;
        }
        else if(Radio3.isSelected()) // PR
        {
            D_PR d1 = new D_PR(Radio3.getText(), 3);
            d = d1;
        }

        p = new Patient(nameTxt.getText(), Integer.parseInt(ageTxt.getText()), d);

        if(d.getDisease_number() < 3)
        {
            p.setResult( Float.parseFloat( resultTxt.getText() ) );
        }
        else
        {
            String[] vals = resultTxt.getText().split("/");

            try
            {
                p.setResult(Float.parseFloat(vals[0]));
                p.setSecondResult(Float.parseFloat(vals[1]));
            }
            catch (Exception ex)
            {
                ///// Error Value
                System.out.println("لقد قمت بإدخال قيمة خاطئة , حاول مرة أخرى !! " + ex.getMessage());

                return false;
            }
        }

        return true;
    }


    static JFrame theJFrame;

    public static void RunFrame()
    {
        FirstScreen form = new FirstScreen();

        theJFrame = new JFrame("اطـمـئـن");
        theJFrame.setSize(500, 500);
        theJFrame.add(form.p1);
        theJFrame.setVisible(true);
        theJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
