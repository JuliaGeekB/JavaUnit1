import java.util.HashMap;
import java.util.TreeMap;

import BracketTest.*;
import HashMapTest.Test;
import TreeMapTest.Test;
import RomNumConv.*;


public class App {
    public static void main(String[] args) throws Exception {
        HashMap<Integer,String> map= HashMapTest.Test.fill();
        HashMapTest.Test.printHM(map, "Иванов");

        HashMap<String, Integer> open = new HashMap<>();
        open.put("(", 0);
        open.put("[", 1);
        open.put("{", 2);
        open.put("<", 3);

        HashMap<String, Integer> close = new HashMap<>();
        close.put(")", 0);
        close.put("]", 1);
        close.put("}", 2);
        close.put(">", 3);

        System.out.println(BracketTest.Tester.validation(open, close, "a+(d*3)"));
        System.out.println(BracketTest.Tester.validation(open, close, "[a+(1*3)"));
        System.out.println(BracketTest.Tester.validation(open, close, "[6+(3*3)] "));
        System.out.println(BracketTest.Tester.validation(open, close, "{a}[+]{(d*3)} "));
        System.out.println(BracketTest.Tester.validation(open, close, "<{a}+{(d*3)}>"));
        System.out.println(BracketTest.Tester.validation(open, close, "{a+]}{(d*3)} "));

        String line = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] sLine = line.split(" ");
        HashMap<String,Integer> map2 = new HashMap<>();
        for(String s : sLine)
            {
                map2.put(s, s.length());
            }

        TreeMap sortMap = TreeMapTest.Test.sortHashMap(map2);
        // sortMap.entrySet().forEach(s->System.out.println(s));
        sortMap.entrySet().forEach(System.out::println);

        System.out.println(RomNumConv.Converter.arabicToRoman(2023));
        System.out.println(RomNumConv.Converter.romanToArabic("MMXXIII"));
    }
}
