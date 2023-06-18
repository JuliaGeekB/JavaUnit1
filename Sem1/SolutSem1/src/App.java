import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //task1();
        //task2();
        //task3();
        // task4
        String[] lines ={"дом", "домовой", "домашний"};
        int prefixLen=findPfx(lines);
        System.out.println(prefixLen);
        System.out.println(lines[0].substring(0,findPfx(lines)));
        // task5. Во фразе переставить слова в обратном порядке
        task5();
        
        // Task8. Задан массив, например, nums = [1,7,3,6,5,6]. Написать программу, которая 
        // найдет индекс i для этого массива такой, что сумма элементов с индексами < i равна сумме элементов с индексами > i
        //task8();
    }
    private static void task1() {
        Scanner iScanner=new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name=iScanner.nextLine();
        // System.out.println("Hello, "+name);
        Depends(name);
    }
    public static void Depends(String name) {
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        if (lt.getHour()>=18 && lt.getHour()<23) {
            System.out.printf("Good evening, %s!\n", name);
        } else if (lt.getHour()>=23 || lt.getHour()<5) {
            System.out.printf("Good night, %s!\n", name);
        } else if (lt.getHour()>=5 || lt.getHour()<12) {
            System.out.printf("Good morning, %s!\n", name);   
        } else if (lt.getHour()>=12 || lt.getHour()<18) {
            System.out.printf("Good afternoon, %s!\n", name);    
        }
    }
    private static void task2() {
        // Дан массив двоичных чисел, вывести макс. количество подряд идущих 1
        int[]arr={1,1,0,1,1,1};
        int cnt=0;
        int max_cnt=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==1)
                cnt++;
            else {
                if(cnt>max_cnt)
                    max_cnt=cnt;
                cnt=0;
            }
        }
        System.out.println(cnt);
        System.out.println(max_cnt);
    }
    private static void task3() {
        // Дан массив двоичных чисел и число 3, Если в массиве есть число 3, то переносим в конец.
        int[]mass={1,1,0,3,1,3,0,1,0,3};
        int [] newMass=new int [mass.length];
        int count=0;
        int index=0;
        for(int i=0; i<mass.length; i++) {
            if(mass[i] !=3){
                newMass[index++]=mass[i];
            }else{
                count++;
            }
            }
        for(int i=mass.length-count; i<mass.length; i++) {
            newMass[i]=3;
        }
        for (int item: newMass)
            System.out.printf("%d\t", item);
    }
    private static int findPfx (String[] lines) {
        // Метод, который находит самую длинную строку общего префикса среди массива строк. 
        // Если общего префикса нет - вернуть пустую строку.
        int res=0;
        boolean pfxExis=true;
        while(pfxExis){
            res++;
            for (int i = 0; i < lines.length-1; i++) {
                if(res<=lines[i].length()&&res<=lines[i+1].length()){
                    if(lines[i].substring(0,res).compareTo(lines[i+1].substring(0,res)) !=0){
                        res--;
                        pfxExis=false;
                        break;
                    }
                }else{
                    res--;
                    pfxExis=false;
                    break;
                }
            }
        }
        return res;

    }
    private static void task8() {
        int[] num = {1,7,3,6,5,6};
        System.out.println(meanIndex(num));
    }

    private static int meanIndex(int[] num) {
        int index = 1;
        while(lowSum(num,index)<higSum(num, index))
        {
            index++;
        }
        if(lowSum(num,index)==higSum(num, index))
        {
            return index;
        }
        else{
        return -1;
        }
    }

    private static int higSum(int[] num, int index) {
        int sum = 0;
        for(int i=num.length-1;i>index;i--)
        {
            sum+=num[i];
        }
        return sum;
    }


    private static int lowSum(int[] num, int index) {
        int sum = 0;
        for(int i=0;i<index;i++)
        {
            sum+=num[i];
        }
        return sum;
    }

    private static void task5() {
        String sourceLn = "Welcome To Java Cource";
        String[] splitLn = sourceLn.split(" ");
        String outLn = "";
        for(int i = splitLn.length-1; i>=0; i--)
        {
            outLn = outLn+splitLn[i]+" ";
        }
        System.out.println(sourceLn);
        System.out.println(outLn);
    }
}
