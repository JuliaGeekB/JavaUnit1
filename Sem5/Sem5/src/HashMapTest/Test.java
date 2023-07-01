// Task1. Создать структуру для хранения номеров паспортов и фамилий. Вывести данные по сотрудникам.

package HashMapTest;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static HashMap<Integer, String> fill (){
        HashMap<Integer, String> outMap= new HashMap();
        outMap.put (123456, "Иванов");
        outMap.put (456123, "Петров");
        outMap.put (789456, "Иванов");
        outMap.put (127894, "Иванов");
        outMap.put (456786, "Сидоров");
        return outMap;
    }

    public static void printHM(HashMap<Integer, String> map, String searchValue){
        for (Map.Entry<Integer, String> item: map.entrySet()){
            if (item.getValue()==searchValue){
                System.out.println(item.getValue()+" - "+item.getKey());
            }
        }
        System.out.println(map);
    }
}
