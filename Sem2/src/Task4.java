// Задача 4. Метод, который составит строку, состоящую из 100 повторений слова Тест и 
// метод, который запишет эту строку в простой текстовый файл
// обработайте исключения

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Task4 {
    public static void writeTestToFile(int n) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("output.txt"))){
            pw.println(generateString("Test",n));
        }
        
    }
    public static String generateString(String s, int repeatCount) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
