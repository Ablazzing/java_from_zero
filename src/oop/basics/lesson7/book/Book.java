package oop.basics.lesson7.book;

//Создать класс книга с атрибутами: Имя книги, имя автора, количество страниц, документальный(да/нет)
//Методы класса книга:
//1. Вывод общего количества строк в книге - без аргументов:
//Результат: Выводит на экран количество страниц * 40
//2. Вывод общего количество строк в книге (количество строк на странице),
//Результат: Выводит на экран количество страниц * количество строк в странице
//3. Вывод информации о книге без аргументов
//Результат: [Имя книги] от [Имя автора] - [документальная/недокументальная]:
public class Book {
    String name;
    String author;
    int pages;
    boolean isNonFiction;

    public Book(String name, String author, int pages, boolean isNonFiction) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.isNonFiction = isNonFiction;
    }

    public void printCountRows() {
        System.out.println("Количество строк в книге: " + this.pages * 40);
    }

    public void printCountRows(int countRowsOnPage) {
        System.out.println("Количество строк в книге: " + this.pages * countRowsOnPage);
    }

    public void printInto() {
        System.out.printf("%s от %s - %s\n", this.name, this.author,
                this.isNonFiction ? "Документальная" : "Недокументальная");
        printCountRows();
    }
}
