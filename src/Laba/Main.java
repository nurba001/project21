package Laba;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String alphabetBig = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String num = "0123456789";
        creatFile("Nurbek.txt",alphabetBig,num);
        fileReader("Nurbek.txt");
    }
           public static void creatFile (String nameFile, String text, String num){
       try (FileWriter writer=new FileWriter(nameFile)){

           for (int i = 0; i < text.length(); i++) {

              writer.append('\n');
               writer.write(text, i, 1);
               writer.write(text.toLowerCase(Locale.ROOT),i,1);

           }
           for (int i = 0; i < num.length(); i++) {
               writer.append('\n');
               writer.write(num,i,1);
           }

           writer.close();
       } catch (IOException e) {
           e.printStackTrace();
       }}
    public static void fileReader(String nameFile){
        try(FileReader reader=new FileReader(nameFile)) {

               Scanner scan=new Scanner(reader);
               while (scan.hasNextLine()){
                   System.out.println(scan.next());
               }

       } catch (IOException e) {
           e.printStackTrace();
       }}




}
