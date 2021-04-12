/**
 * Created by elham on 12/8/2020.
 */
public class D_CH extends Disease {

    public D_CH(String disease_name, int disease_number) {

        super(disease_name, disease_number);
        super.setDisease_low(239);
        super.setDisease_normal(200);
        super.setDisease_height(240);

    }

    public void calculateResult(float value)
    {
        if (value < getDisease_normal()) {
            ////Low

            resultText = MyFile.advices[1][0];
            diteText = MyFile.advices[1][1];
            exerciseText = MyFile.advices[1][2];

        } else if (value >= getDisease_normal() && value < getDisease_height()) {
            ////NORMAL

            resultText = MyFile.advices[1][3];
            diteText = MyFile.advices[1][4];
            exerciseText = MyFile.advices[1][5];

        } else if (value >= getDisease_height()) {
            //////HIGH

            resultText = MyFile.advices[1][6];
            diteText = MyFile.advices[1][7];
            exerciseText = MyFile.advices[1][8];
        }

    }


}
