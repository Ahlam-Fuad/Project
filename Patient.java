/**
 * Created by elham on 12/8/2020.
 */
public class Patient {

    private String name;
    private int age;
    private Disease disease;
    private float result;
    private float secondResult;

    public Patient(String name, int age, Disease disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) { this.result = result; }

    public float getSecondResult() {
        return secondResult;
    }

    public void setSecondResult(float secondResult) { this.secondResult = secondResult; }

}
