/**
 * Created by elham on 12/8/2020.
 */
public class D_DM extends Disease {

    public D_DM(String disease_name, int disease_number) {

        super(disease_name, disease_number);
        super.setDisease_low(80);
        super.setDisease_normal(110);
        super.setDisease_height(170);
    }

    public void calculateResult(float value)
    {
        if (value < getDisease_normal()) {
            ////Low

            resultText = MyFile.advices[0][0];
            diteText = MyFile.advices[0][1];
            exerciseText = MyFile.advices[0][2];

        } else if (value >= getDisease_normal() && value < getDisease_height()) {
            ////NORMAL

            resultText = MyFile.advices[0][3];
            diteText = MyFile.advices[0][4];
            exerciseText = MyFile.advices[0][5];

        } else if (value >= getDisease_height()) {
            //////HIGH/*

            resultText = MyFile.advices[0][6];
            diteText = MyFile.advices[0][7];
            exerciseText = MyFile.advices[0][8];

        }

    }



}
