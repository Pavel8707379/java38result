package com.belhard.util;

import java.io.*;

public class FileTxt {
    public static void parserTeacher() {

        FileReader fileReader = null;
        FileWriter fileWriter = null;
            try {
                fileReader = new FileReader("teacher.txt");
                fileWriter = new FileWriter("teacherCopy.txt");
                int x;
                while ((x = fileReader.read()) != -1) {
                    System.out.println(x);
                    fileWriter.write((char) x);
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

        public static void parserStudent() {
            try {
                FileInputStream fileInputStream = new FileInputStream("student.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("studentCopy.txt");
                int i;
                String data = "";
                while ((i = fileInputStream.read()) != -1) {
                    fileOutputStream.write(i);
                    data += (char) i;
                }
                String[] str = data.split("\n");
                for (String st : str) {
                    String[] massStr = st.split(" ");
                    System.out.println("Имя " + massStr[0]);
                    System.out.println("Фамилия " + massStr[1]);
                    System.out.println("# дома " + massStr[4]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}





