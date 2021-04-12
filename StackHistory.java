import javax.swing.*;

/**
 * Created by elham on 3/24/2021.
 */
public class StackHistory {

    private int top;
    private Patient[] patient;
    private int size;

    public StackHistory(int size)
    {
        top = -1;
        this.size = size;
        patient = new Patient[size];
    }

    public boolean isEmpty()
    {
        if(top == -1)
            return true;
        return false;
    }

    public boolean isFull()
    {
        if(top == (size - 1) )
            return true;
        return false;
    }

    public int currentSize()
    {
        return (top + 2);
    }

    public void push(Patient p)
    {
        if(top < (size - 1))
        {
            top++;
            patient[top] = p;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Can Not Insert, Stack Is Full");
        }
    }

    public Patient pop()
    {
        if(top > -1)
        {
            top--;
            return patient[(top + 1)];
        }
        else
        {
            /// outOfRange
        }

        return null;
    }

}
