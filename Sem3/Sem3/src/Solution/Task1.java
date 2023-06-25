// Задание 1. 
// Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

package Solution;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void filler() {
        ArrayList<Integer> array=new ArrayList<>();
        Random rnd =new Random();
        for (int i=0; i<10; i++){
            array.add(rnd.nextInt(100));
        }
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
       
    }
    
}
