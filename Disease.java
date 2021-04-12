/**
 * Created by elham on 12/8/2020.
 */

public class Disease {

    private String Disease_name;
    private int Disease_number;
    private float Disease_low;
    private float Disease_normal;
    private float Disease_height;
    protected String resultText;
    protected String diteText;
    protected String exerciseText;

    public float getDisease_low() {
        return Disease_low;
    }

    public void setDisease_low(float disease_low) {
        Disease_low = disease_low;
    }

    public float getDisease_normal() {
        return Disease_normal;
    }

    public void setDisease_normal(float disease_normal) {
        Disease_normal = disease_normal;
    }

    public float getDisease_height() {
        return Disease_height;
    }

    public void setDisease_height(float disease_height) {
        Disease_height = disease_height;
    }

    public String getResultText() { return resultText; }

    public String getDiteText() { return diteText; }

    public String getExerciseText() { return exerciseText; }

    public void calculateResult(float value) { }
    public void calculateResult(float value, float value2) { }

    public Disease(String disease_name, int disease_number) {
        Disease_name = disease_name;
        Disease_number = disease_number;
    }

    public String getDisease_name() {
        return Disease_name;
    }

    public void setDisease_name(String disease_name) {
        Disease_name = disease_name;
    }

    public int getDisease_number() {
        return Disease_number;
    }

    public void setDisease_number(int disease_number) {
        Disease_number = disease_number;
    }

}
