package com.example.ewgen.hugelibrary.run;

import com.example.ewgen.hugelibrary.entity.BaseClasses.Book;
import com.example.ewgen.hugelibrary.logic.LogicImplementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String separator = File.separator;
        String pathEwgen = separator + "home" + separator + "ewgen" + separator + "Документы"+ separator + "testfileTry.csv";
        String path = separator + "Users" + separator + "qauser" + separator + "Desktop" + separator + "testfile.csv";

        LogicImplementation lg = new LogicImplementation();

        File file = new File(pathEwgen);

        System.out.println("Type 'title' if you want to search by title, type 'author' to see all books of the author or print 'all':");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        try {

            List<String[]> list = lg.readingFromFile(file);
            List<Book> listOfObjects = lg.createObjects(list);

            if (line.equals("title")) {
                System.out.println("Please enter title:");

                Scanner scannerTitle = new Scanner(System.in);
                String title = scannerTitle.nextLine();

                Book resultBook = lg.searchForBookByTitle(listOfObjects, title);
                lg.printBook(resultBook);

            } else if (line.equals("author")) {

                System.out.println("Please enter author name, surname or both:");

                Scanner scannerAuthor = new Scanner(System.in);
                String author = scannerAuthor.nextLine();

                List<Book> result = lg.searchByAuthor(listOfObjects, author);
                lg.printListOfTextBooks(result);


            } else if (line.equals("all")) {

                lg.printListOfTextBooks(listOfObjects);
            }

            else {
                System.out.println("Invalid data, please enter 'author','title' or 'all'");
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }












}
