import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();


        try {
            FileWriter file = new FileWriter("notlar.txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print(metin);
            file.close();
            printWriter.close();

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            FileReader fileReader = new FileReader("notlar.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String okunanMetin = bufferedReader.readLine();
            while (okunanMetin !=null){
                System.out.println(okunanMetin);
                okunanMetin= bufferedReader.readLine();

            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}