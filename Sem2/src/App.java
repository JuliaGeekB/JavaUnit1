import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        //Task1.execute();
        
        //Task2
        // String input="aaaabbbbddddeeee";
        // if (input.isEmpty()){

        // }else{
        //     String compressed=Task2.compressStringInput(input);
        //     System.out.println(compressed);
        // }

        Task4.writeTestToFile(100);
        
        //Task5
        try {
            String[] fldrCnt = Task5.getCrntFldrCnts();
            Task5.wrtArrToFile(fldrCnt, "filenames.txt");
            Task5.dtrmFileExts(fldrCnt);
        } catch (IOException e) {
            Task5.wrtExcptToLogFile(e, "log.txt");
        }
    }
}
