package com.cybertek.tests.com.cybertek.tests.day14_excel_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path ="shopping_list.txt";
        File file = new File(path);
        //check if file exists
        System.out.println(file.exists()); //true
        //we can read lines of file with Scanner class
        //System.in- for keyboard input
        //file object-for reading file


        Scanner scanner = new Scanner(file);

        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());


        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

        //#############################################

        String path2 = "grades.csv";
        File file2 = new File(path2);

        Scanner scanner1 = new Scanner(file2);

        while(scanner1.hasNext()){
            System.out.println(scanner1.nextLine());
        }


    }
}
