package com.belhard;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("file.txt");
            fileWriter = new FileWriter("fileReaderCopy11.txt");
            int a ;
            while ((a = fileReader.read()) != -1) {
                System.out.print((char) a);
                fileWriter.write(a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public static void fileByte(){
        try {
            FileInputStream fileInputStream = new FileInputStream("file.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("fileCopy.txt");
            int a;
            String name = "";
            while ((a = fileInputStream.read()) !=-1) {
                fileOutputStream.write(a);
//                System.out.print((char) a);

                name += (char) a;
            }
            String[] massStr = name.split("\n");
            for (String str : massStr){
                String[] nameMass = str.split(" ");
                System.out.println("Имена: " + nameMass[0]);
                System.out.println("Фамилия: " + nameMass[1]);
            }
//            System.out.println("Имя:" + mass[0]);
//            System.out.println("Ффмилия:" + mass[1]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

