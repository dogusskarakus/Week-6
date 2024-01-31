
import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {


       /* File dosya = new File("patika.txt");
       *//* try {
            if (dosya.createNewFile()){
                System.out.println(dosya.getName()+" dosyası oluşturuldu.");
            }else {
                System.out.println(dosya.getName()+" dosyası zaten mevcut");
            }
            dosya.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*//*
        *//*dosya.delete();*//*

        File dizin = new File("patika/dev");
        System.out.println(dizin.mkdirs()); //klasör oluşturur.*/


        //FİLEINPUTSTREAM

   /*   try {
            FileInputStream input = new FileInputStream("patika.txt");
            System.out.println("kullanılabilr bytr: "+ input.available());
            int i = input.read();
            while (i != -1){
                System.out.print((char) i);
                i= input.read();
            }
            input.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

     /*   String yazi = "OutputStrem öğreniyorum.\n dogus";
        try {
            File dosya = new File("patika.txt");
            FileOutputStream output = new FileOutputStream(dosya,true);
            byte[] yaziByte = yazi.getBytes();
            output.write(yaziByte);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

      /*  byte[] array = {1,2,3,4};
        ByteArrayInputStream input = new ByteArrayInputStream(array);
        System.out.println("Kullanılan byte sayısı : " + input.available());
        int i = input.read();
        while (i !=-1){
            System.out.println(i);
            i=input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        //BYTEARRAYOUTPUTSTREAM

       /* String arr = "java 102 öğreniyorum" ;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte [] dataByte = arr.getBytes();
        try {
            outputStream.write(dataByte);
            String newdata = outputStream.toString();
            System.out.println("çıkış : "+ newdata);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        Car c1 = new Car("Audi","A3");


        //Dosya oluşturduk.

        /*try {
            FileOutputStream outputFile = new FileOutputStream("araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        //Yazma işlemini yapacağız inputla dosyayı lamam lazım

       /* try {
            FileInputStream inputFile = new FileInputStream("araba.txt");
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);
            Car newCar = (Car) inputStream.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());

            inputFile.close();
            inputStream.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        // İNPUT İÇİN BUFFEREDSTRESAM

     /*   try {
            FileInputStream fileInput= new FileInputStream("patika.txt");
            BufferedInputStream newBuff = new BufferedInputStream(fileInput);
            int i = newBuff.read();
            while (i !=-1){
                System.out.print((char) i);
                i = newBuff.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/








        /* File file = new File ("kod.txt");
         if (!file.exists()){
             file.createNewFile();
         }
         String val = "Kodlama vakti";

         FileWriter fileWriter = new FileWriter(file,false);
         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
         bufferedWriter.write(val);
         bufferedWriter.close();

         FileReader fileReader = new FileReader(file);
         String line;
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         while ((line=bufferedReader.readLine()) !=null ){
             System.out.println(line);
         }
         bufferedReader.close();*/
       /* try {

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
        }*/

/*
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
        }*/






    }
}