import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by elham on 3/24/2021.
 */
public class MyFile {

    private static String filePath = "advice.txt";

    public static void createAndWriteAdviceFile(boolean forceCreate)
    {
        if(Files.notExists(Paths.get(filePath)) || forceCreate)
        {
            // JOptionPane.showMessageDialog(null, "Not Exist File " + filePath);

            try
            {
                // FileWriter writer = new FileWriter(filePath, true);
                FileWriter writer = new FileWriter(filePath);


                String resultText = "";
                String diteText = "";
                String exerciseText = "";
                String resultText2 = "";
                String diteText2 = "";
                String exerciseText2 = "";
                String resultText3 = "";
                String diteText3 = "";
                String exerciseText3 = "";


                ///// DM /////
                resultText = "مستوى السكر لديك منخفض , لتحسين مستوى السكر في الدم اتبع التعليمات التالية :";
                diteText = " الحمية الغذائية : * تناول المأكولات السكرية و المشروبات السكرية أيضاً .  * قم بفحص امستوى السكر في دمك كل 30 دقيقة.* توجه إلى أقرب عيادة أو مستشفى في حييك في أقرب فرصة ممكنة .";
                exerciseText = "التمارين المساعدة : * لا تقم بأي حركة مرهقة حتى يعود مستوى السكر في دمك إلى المستوى الطبيعي).";

                resultText2 = "مستوى السكر طبيعي ,للحفاظ على مستوى السكر الطبيعي  في الدم اتبع التعليمات التالية : ";
                diteText2 = "الحمية الغذائية : * قم بإضافة الفواكه و الألياف إلى حميتك الغذائية (فاكهة إلى فاكهتين كحد أقصى يومياً) .  * قم بإضافة الخضروات إلى حميتك الغذائية المعتادة . * تجنب تناول الكربوهيدرات و المأكولات و المشروبات السكرية .";
                exerciseText2 = "التمارين المساعدة :  * تمرن لمدة 30 دقيقة بشكل يومي (المشي المكثف أو الجري المكثف ).";

                resultText3 = "مستوى السكر لديك مرتفع , للإنقاص مستوى السكر إتبع التعليمات التالية :";
                diteText3 = "* توجه لأقرب مستشفى في حييك بشكل عاجل . ";
                exerciseText3 =  "التمارين المساعدة : لا تقم بأي حركة مرهقة حتى رؤيتك الطبيب .";

                writer.write("1");
                writer.write(System.lineSeparator());
                writer.write(resultText);
                writer.write(System.lineSeparator());
                writer.write(diteText);
                writer.write(System.lineSeparator());
                writer.write(exerciseText);
                writer.write(System.lineSeparator());
                writer.write(resultText2);
                writer.write(System.lineSeparator());
                writer.write(diteText2);
                writer.write(System.lineSeparator());
                writer.write(exerciseText2);
                writer.write(System.lineSeparator());
                writer.write(resultText3);
                writer.write(System.lineSeparator());
                writer.write(diteText3);
                writer.write(System.lineSeparator());
                writer.write(exerciseText3);
                writer.write(System.lineSeparator());

                ///// CH /////
                resultText = "نسبة الكوليسترول لديك في الحد الأعلى للمستوى الطبيعي  , لتحسين مستوى الكوليسترول لديك اتبع التعليمات التالية : ";
                diteText = "الحمية الغذائية :  *ابتعد عن المأكلات الدهنية و النشويات. *قم بممارسة الرياضة  . *قم بالفحص الدوري لمستوى الكوليسترول لديك كل 6 أشهر.";
                exerciseText = "التمارين المساعدة :  *قم بمتابعة أخصائي التغذية الخاص بك لمعرفة التمارين المناسبة لك.";

                resultText2 = "مستوى الكوليسترول لديك طبيعي  , للحفاظ على مستوى الكوليسترول لديك اتبع التعليمات التالية : ";
                diteText2 = "الحمية الغذائية : * قم بممارسة حميتك الغذائية المعتادة. * قم بحساب السعرات الحرارية المستهلكة يومياً للحفاظ على مستوى الكوليسترول الطبيعي في الدم. ";
                exerciseText2 = "التمارين المساعدة : * قم بممارسة الرياضة و الجري .";

                resultText3 = "مستوى الكوليسترول لديك عالٍ  , لتحسين مستوى الكوليسترول لديك اتبع التعليمات التالية : ";
                diteText3 = "الحمية الغذائية : * ابتعد عن الأطعمة التي تحتوي على نسبة عالية من الدهون. * احسب احتياجاتك اليومية للسعرات الحرارية . * قم بممارسة الرياضة * قم بمراجعة أخصائي باطنية لمتابعة مستوى الكوليسترول لديك.";
                exerciseText3 =  "التمارين المساعدة : * قم بمتابعة أخصائي التغذية الخاص بك لمعرفة التمارين المناسبة لك.";

                writer.write("2");
                writer.write(System.lineSeparator());
                writer.write(resultText);
                writer.write(System.lineSeparator());
                writer.write(diteText);
                writer.write(System.lineSeparator());
                writer.write(exerciseText);
                writer.write(System.lineSeparator());
                writer.write(resultText2);
                writer.write(System.lineSeparator());
                writer.write(diteText2);
                writer.write(System.lineSeparator());
                writer.write(exerciseText2);
                writer.write(System.lineSeparator());
                writer.write(resultText3);
                writer.write(System.lineSeparator());
                writer.write(diteText3);
                writer.write(System.lineSeparator());
                writer.write(exerciseText3);
                writer.write(System.lineSeparator());

                ///// PR /////
                resultText = "ضغط الدم لديك منخفض";
                diteText = "الرجاء التوجه لأقرب مستشفى أو عيادة طبية في حيك , و تجنب كثرة الحركة . ";
                exerciseText =  "";

                resultText2 = "ضغط الدم لديك طبيعي , للمحافظة على مستوى الضغط الطبيعي اتبع التعليمات التالية : ";
                diteText2 = "الحمية الغذائية :  * تجنب الأكلات المالحة و الدهنية  * اشرب احتياجك اليومي من الماء ";
                exerciseText2 = "التمارين المساعدة : * لمزيد من المعلومات حول التمارين المناسبة قم باستشارة طبيبكً . * قم بممارسة المشي لمدة لا تقل عن 20 دقيقة يومياً .";

                resultText3 = "ضغط الدم لديك مرتفع ";
                diteText3 = "الرجاء التوجه لأقرب مستشفى أو عيادة طبية في حيك في اسرع وقت ممكن . ";
                exerciseText3 = "التمارين المساعدة : يرجى منك عدم القيام بأي مجهود جسدي أو نفسي , قم بالاسترخاء حتى وصولك إلى أقرب مستشفى لديك ( حفظكم الله و حماكم من كل مكروه ). ";

                writer.write("3");
                writer.write(System.lineSeparator());
                writer.write(resultText);
                writer.write(System.lineSeparator());
                writer.write(diteText);
                writer.write(System.lineSeparator());
                writer.write(exerciseText);
                writer.write(System.lineSeparator());
                writer.write(resultText2);
                writer.write(System.lineSeparator());
                writer.write(diteText2);
                writer.write(System.lineSeparator());
                writer.write(exerciseText2);
                writer.write(System.lineSeparator());
                writer.write(resultText3);
                writer.write(System.lineSeparator());
                writer.write(diteText3);
                writer.write(System.lineSeparator());
                writer.write(exerciseText3);


                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            // JOptionPane.showMessageDialog(null, "Is Exist File : " + filePath);
        }
    }

    public static String[][] advices;

    public static void readAdviceFileToArray()
    {
        advices = new String[3][9];

        try
        {
            File file1 = new File(filePath);
            Scanner input = new Scanner(file1);

            int i = 0, j = 0;

            while(input.hasNextLine())
            {
                String line = input.nextLine();

                // JOptionPane.showMessageDialog(null, "codePoint : " + line.trim().codePointAt(0));

                if(line != null && !line.trim().equals(""))
                {
                    int ASCII = line.trim().codePointAt(0);
                    if(
                            (ASCII > 48 && ASCII < 58)
                                    && line.trim().length() < 3
                                    && !line.trim().isEmpty()
                                    && !line.equals("")
                            )
                    {
                        int val = Integer.parseInt(line);
                        i = val - 1;
                        j = 0;
                        continue;
                    }

                }

                advices[i][j] = line;
                j++;

                // JOptionPane.showMessageDialog(null,"line : " + line);
            }

            input.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
