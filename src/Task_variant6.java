import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Task_variant6 {
    public static void main(String[] args) {
        List<Float> numbers = new ArrayList<>();
        String inputFile = "C:\\Users\\aytal\\Desktop\\Потоки данных\\Lb5\\input.txt";
        String outputFile = "C:\\Users\\aytal\\Desktop\\Потоки данных\\Lb5\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) !=null){
                try {
                    float number = Float.parseFloat(line);
                    numbers.add(number);
                }catch (NumberFormatException e){
                    continue;
                }
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            int negativeCount = 0;
            for (Float number:numbers){
                if(number<0){
                    writer.write(number.toString()+"\n");
                    negativeCount++;
                }
            }
            writer.write("Количество отрицательных чисел: "+negativeCount);
            writer.close();

            System.out.println("отрицательные числа записаны в файл "+outputFile);
        } catch (IOException E) {
            System.out.println("Ошибка");
        }

    }
}
