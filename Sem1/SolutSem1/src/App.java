import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //task1();
        task2();
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

}
