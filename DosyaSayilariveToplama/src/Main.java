import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {

            FileReader fileReader = new FileReader("dosya.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int result=0;
            while ((line = bufferedReader.readLine()) !=null){
                result=result+Integer.parseInt(line);

            }
            System.out.println(result);
            fileReader.close();
            bufferedReader.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}