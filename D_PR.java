import javax.swing.*;

/**
 * Created by elham on 12/8/2020.
 */
public class D_PR extends Disease {

    private float secondLow;
    private float secondNormal;
    private float secondHeight;


    public float getSecondLow() {
        return secondLow;
    }

    public void setSecondLow(float secondLow) {
        this.secondLow = secondLow;
    }

    public float getSecondNormal() {
        return secondNormal;
    }

    public void setSecondNormal(float secondNormal) {
        this.secondNormal = secondNormal;
    }

    public float getSecondHeight() {
        return secondHeight;
    }

    public void setSecondHeight(float secondHeight) {
        this.secondHeight = secondHeight;
    }

    public D_PR(String disease_name, int disease_number) {

        super(disease_name, disease_number);

        super.setDisease_low(90);
        this.setSecondLow(60);

        super.setDisease_normal(120);
        this.setSecondNormal(80);

        super.setDisease_height(150);
        this.setSecondHeight(90);

    }


    public void calculateResult(float value, float value2)
    {
        if(value < getDisease_normal() && value2 < getSecondNormal()  )
        {
            //// Low

            resultText = MyFile.advices[2][0];
            diteText = MyFile.advices[2][1];
            exerciseText = MyFile.advices[2][2];
        }
        else if(
                   (value >= getDisease_normal() && value < getDisease_height() )
                && ( value2 >= getSecondNormal() && value2 < getSecondHeight() )
                )
        {
            //// normal

            resultText = MyFile.advices[2][3];
            diteText = MyFile.advices[2][4];
            exerciseText = MyFile.advices[2][5];

            System.out.println("In Normal PR : ");
        }
        else if(value >= getDisease_height() && value2 >= getSecondHeight() )
        {
            //high

            resultText = MyFile.advices[2][6];
            diteText = MyFile.advices[2][7];
            exerciseText = MyFile.advices[2][8];

            System.out.println("In Heigh PR : ");
        }
        else
        {
            /// Wrong Insert
            JOptionPane.showMessageDialog(null,"ERROR Insert PR : ");

            System.out.println("لقد قمت بإدخال قيمة غير صحيحه , حاول مرة أخرى !! ");
        }
    }
}
