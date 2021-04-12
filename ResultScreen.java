import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by elham on 12/8/2020.
 */

public class ResultScreen {
    private JPanel theResultPanel;
    private JLabel resultLabl;
    private JLabel DiteLabl;
    private JLabel ExerciseLabl;
    private JButton backButton;
    private JButton endButton;
    private JButton button1;
    private JButton showHistory;
    private JTextPane textPane1;

    JFrame previousFrame;

    public ResultScreen(Patient p, JFrame previousFrame)
    {
        this.previousFrame = previousFrame;

        if(p.getDisease().getDisease_number() == 3)
        {
            p.getDisease().calculateResult(p.getResult(), p.getSecondResult());
        }
        else if(p.getDisease().getDisease_number() < 3)
        {
            p.getDisease().calculateResult(p.getResult());
        }

        resultLabl.setText(p.getDisease().getResultText());
        DiteLabl.setText(p.getDisease().getDiteText());
        ExerciseLabl.setText(p.getDisease().getExerciseText());

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                previousFrame.setVisible(true);
                theJFrame.setVisible(false); // close ///////////////////////
            }
        });
        endButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                theJFrame.dispatchEvent(new WindowEvent(theJFrame, WindowEvent.WINDOW_CLOSING));
                // close all application ///////////////////////////
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Desktop d= Desktop.getDesktop();
                try {
                    d.browse(new URI("https://www.moh.gov.sa/awarenessplateform/Pages/default.aspx"));
                } catch (IOException es) {
                    es.printStackTrace();
                } catch (URISyntaxException se) {
                    se.printStackTrace();
                }
            }
        });
        showHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HistoryScreen.RunFrame(theJFrame);
            }
        });

        addToStackHistory(p);

    }

    private static int sizeOfStack = 5;
    public static StackHistory stackHistory = new StackHistory(sizeOfStack);

    private void addToStackHistory(Patient p)
    {
        stackHistory.push(p);
    }


    static JFrame theJFrame;

    public static void RunFrame(Patient p, JFrame previousFrame)
    {
        ResultScreen form = new ResultScreen(p, previousFrame);

        theJFrame = new JFrame("اطـمـئـن");
        theJFrame.setSize(600, 350);
        theJFrame.add(form.theResultPanel);
        theJFrame.setVisible(true);
        theJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
