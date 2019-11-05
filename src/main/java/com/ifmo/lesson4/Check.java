package com.ifmo.lesson4;

public class Check {
    public static void main(String[] args) {
        Library library = new Library(2);
        library.put(new Book("Stephen King", "Shining"), 2); // return true
        library.put(new Book("Stephen King", "Dark Tower"), 3); // return true

        // Эту книгу добавить не можем, т.к. лимит 2
        library.put(new Book("Tolstoy", "War and peace"), 6); // return false

        // Забираем все книги Тёмной башни, чтобы освободить место.
        System.out.println(library.take(new Book("Stephen King", "Dark Tower"), 3)); // return 3
        // Забираем все книги Тёмной башни, чтобы освободить место.
        System.out.println(library.take(new Book("Stephen Kin777g", "Dark Tower"), 3)); // return 3

        // Теперь мы можем успешно добавить "Войну и мир".
        library.put(new Book("Tolstoy", "War and peace"), 6); // return true


     /*Library library = new Library(2);
      library.put(new Book("Stephen King", "Shining"), 2); // return true

      // Все равно вернет 2, т.к. больше нет.
      System.out.println(library.take(new Book("Stephen King", "Shining"), 10)); // return 2
    */}
}
