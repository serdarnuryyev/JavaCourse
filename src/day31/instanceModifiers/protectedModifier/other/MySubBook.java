package day31.instanceModifiers.protectedModifier.other;

import day31.instanceModifiers.protectedModifier.same.Book;

public class MySubBook extends Book {

    public static void main(String[] args) {
        MySubBook subBook = new MySubBook();
        subBook.name = "Lord Of The Rings";
        subBook.print();
    }
}
