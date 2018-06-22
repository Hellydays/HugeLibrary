package com.example.ewgen.hugelibrary.logic;

import com.example.ewgen.hugelibrary.entity.BaseClasses.Book;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Album;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Almanac;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Article;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Broshure;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Calendar;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.ChildrenBook;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.ColoringPages;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Comics;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Cookbook;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.CrosswordPuzzle;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Encyclopedia;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Instruction;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Journal;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.LiteraryCollection;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Manuscript;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.MiniatureEditionBook;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Newsletter;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Newspapper;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Postcard;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.ReferenceWork;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Reproduction;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Scanwords;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.SchedulesOfTelecasts;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.ScienceMagazin;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.ScienticArticle;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Sudoku;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.TaxReturn;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.TextBook;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Toybook;
import com.example.ewgen.hugelibrary.entity.ChildrenClasses.Yearbook;

public class CsvBookFactory {

    public Book createBook(String[] columns) { //в аргументы передается массив второго уровня
        // если в переданном массиве элемент под индексом ноль (который является строкой) совпадает с
        // опциями case то создается объект в конструктор которого передаются параметры из массива

        //метод возвращает готовый объект книги

        switch (columns[0]) {
            case "childrenbook":
                return new ChildrenBook(columns[1], columns[2], columns[3], columns[4], columns[5], columns[6]);
            case "encyclopedia":
                return new Encyclopedia(columns[1], columns[2],columns[3],columns[4],columns[5], columns[6]);
            case "cookbook":
                return new Cookbook(columns[1], columns[2],columns[3],columns[4]);
            case "journal":
                return new Journal(columns[1], columns[2],columns[3],columns[4],columns[5],columns[6]);
            case "broshure":
                return new Broshure(columns[1], columns[2],columns[3],columns[4],columns[5],columns[6],columns[7]);
            case "meb":
                return new MiniatureEditionBook(columns[1], columns[2],columns[3],columns[4],columns[5]);
            case "newspaper":
                return new Newspapper(columns[1], columns[2],columns[3],columns[4]);
            case "scienceMagazin":
                return new ScienceMagazin(columns[1], columns[2],columns[3],columns[4],columns[5]);
            case "newsletter":
                return new Newsletter(columns[1], columns[2],columns[3]);
            case "sudoku":
                return new Sudoku(columns[1], columns[2],columns[3],columns[4]);
            case "scanwords":
                return new Scanwords(columns[1], columns[2],columns[3], Boolean.valueOf(columns[4]));
            case "schedules":
                return new SchedulesOfTelecasts(columns[1], columns[2],columns[3]);
            case "crosswords":
                return new CrosswordPuzzle(Integer.parseInt(columns[1]), Integer.parseInt(columns[2]),columns[3],columns[4]);
            case "coloringPages":
                return new ColoringPages(columns[1], columns[2],columns[3],columns[4]);
            case "postcard":
                return new Postcard(columns[1], columns[2],columns[3],columns[4], columns[5],columns[6],columns[7], Boolean.valueOf(columns[8]));
            case "manuscript":
                return new Manuscript(columns[1], columns[2],columns[3],columns[4], columns[5],columns[6]);
            case "textbook":
                return new TextBook(columns[1], columns[2],columns[3],Integer.parseInt(columns[4]));
            case "calendar":
                return new Calendar(columns[1], columns[2],columns[3],columns[4], columns[5],columns[6]);
            case "lc":
                return new LiteraryCollection(columns[1], columns[2],columns[3],columns[4], columns[5],columns[6],columns[7]);
            case "scienticArticle":
                return new ScienticArticle(columns[1], columns[2],columns[3],columns[4]);
            case "album":
                return new Album(columns[1], columns[2],columns[3],columns[4]);
            case "almanac":
                return new Almanac(columns[1], columns[2],columns[3]);
            case "yearbook":
                return new Yearbook(columns[1], columns[2],columns[3],columns[4],columns[5]);
            case "comics":
                return new Comics(columns[1], columns[2],columns[3],columns[4],columns[5],columns[6]);
            case "instruction":
                return new Instruction(columns[1], columns[2],columns[3],columns[4]);
            case "toybook":
                return new Toybook(columns[1], columns[2],columns[3],columns[4],columns[5]);
            case "reproduction":
                return new Reproduction(columns[1], columns[2],columns[3],columns[4],columns[5],columns[6]);
            case "taxReturn":
                return new TaxReturn(columns[1], columns[2],columns[3],columns[4]);
            case "article":
                return new Article(columns[1], columns[2],columns[3],columns[4]);
            case "referencework":
                return new ReferenceWork(columns[1], columns[2],columns[3],columns[4],columns[5]);

                default: throw new IllegalArgumentException("Book type not supported");
        }
    }

}
