package com.example.ewgen.hugelibrary.logic;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;
import com.example.ewgen.hugelibrary.entity.BaseClasses.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LogicImplementation {

    public List<String[]> readingFromFile(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);

        List<String[]> listOfArrays = new ArrayList<>();

        do {
            String line = scanner.nextLine();
            String[] bookData = line.split(",");
            listOfArrays.add(bookData);

        } while (scanner.hasNextLine());

        return listOfArrays;
    }

    public List<Book> createObjects (List<String[]> listOfArrays) {

        CsvBookFactory csvBookFactory = new CsvBookFactory();
        List<Book> listOfBooksObjects = new ArrayList<>();

        for (String[] strings : listOfArrays) {
            listOfBooksObjects.add((Book) csvBookFactory.createBook(strings));
        }

        return listOfBooksObjects;

    }

    public void printListOfArrays(List<String[]> listOfArrays) {

        for (String[] strings: listOfArrays) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public void printListOfTextBooks (List<Book> textBookList) {
        for (Book book : textBookList) {
            System.out.println(book.toString());
        }
    }

    public Book searchForBookByTitle(List<Book> textBookList, String title) {

        Book resultBook = new Book();
        for (Book book: textBookList) {
            if (book.getTitle() != null) {
                if (book.getTitle().equals(title)) {
                    resultBook = book;
                }
            }
        }
        return resultBook;
    }

    public List<Book> searchByAuthor(List<Book> bookList, String author) {
        List<Book> resultList = new ArrayList<>();
        for (Book book: bookList){
            if (book instanceof AuthorsBook) {
                if (((AuthorsBook) book).getAuthor().equals(author)) {
                    resultList.add(book);
                }

            }
        }

        return resultList;
    }


    public void printBook(Book book) {
        if (book.getTitle()!= null) {
            System.out.println(book.toString());
        } else System.out.println("It looks like book doesn't exist");
    }


}
