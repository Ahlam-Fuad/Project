import javax.swing.*;

/**
 * Created by elham on 3/24/2021.
 */
public class HistoryScreen {
    private JTextArea textArea1;
    private JPanel panel1;

    public HistoryScreen(JFrame previousFrame)
    {
        textArea1.setText("\n");

        while(!ResultScreen.stackHistory.isEmpty())
        {
            Patient p;
            p = ResultScreen.stackHistory.pop();
            textArea1.append(
                    "Number: " + ResultScreen.stackHistory.currentSize() + "\n"
                    + "Name: " + p.getName() + "\n"
                    + "Age: " + p.getAge()+ "\n"
                    + "Disease Name: " + p.getDisease().getDisease_name()+ "\n"
                    + "Result: \n"
                    + p.getDisease().getResultText()+ "\n"
                    + p.getDisease().getDiteText()+ "\n"
                    + p.getDisease().getExerciseText()+ "\n"
                    + "=================================" + "\n\n"
            );
        }
    }

    static JFrame theJFrame;

    public static void RunFrame(JFrame previousFrame)
    {
        HistoryScreen form = new HistoryScreen(previousFrame);

        theJFrame = new JFrame("اطـمـئـن");
        theJFrame.setSize(600, 1200);
        theJFrame.add(form.panel1);
        theJFrame.setVisible(true);
        // theJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
