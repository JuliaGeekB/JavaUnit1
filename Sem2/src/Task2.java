// Задача 2. Метод, который сжимает строку

public class Task2 {
    public static String compressStringInput (String input){
        char sbl=input.charAt(0);
        int count=1;
        StringBuilder sp = new StringBuilder();
        for (int i=1; i<input.length(); i++){
            char nextChar=input.charAt(i);
            if(nextChar==sbl){
                count++;
            }else{
                sp.append(sbl);
                sp.append(count);
                sbl=nextChar;
                count=1;
            }
        }
        sp.append(sbl);
        sp.append(count);
        return sp.toString();
        }
}
