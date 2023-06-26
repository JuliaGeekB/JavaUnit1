// Задание 0. 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов. 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void TimeTest(int size){
        
        List<Integer> simpleList=new ArrayList<>();
        List<Integer> linkList=new LinkedList<>();
        long curTime=System.currentTimeMillis();
        System.out.println(curTime);
        

        for (int i = 0; i < size; i++) {
            simpleList.add(1);
        }
        System.out.println(System.currentTimeMillis()-curTime);
         for (int i = 0; i < size; i++) {
            linkList.add(1);
            
        }
        System.out.println(System.currentTimeMillis()-curTime);

    }

    private static void currentTimeMillis() {
    }
}
