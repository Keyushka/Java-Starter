package javaEssential.homework.hw1.task3;

public class Book {
    private static Title title = new Title();
    private static Author author = new Author();
    private static Content content = new Content();

    public static void main(String[] args) {
        title.setTitle("Java 8. Полное руководство");
        author.setAuthor("Герберт Шилдт");
        content.setContent("\n- Типы данных и операторы\n" +
                "- Управляющие операторы\n" +
                "- Классы и объекты\n" +
                "- Конструкторы и методы\n" +
                "- Перегрузка и переопределение метода\n" +
                "- Интерфейсы и пакеты\n" +
                "- Наследование\n" +
                "- Обработка исключений\n" +
                "- Обобщения\n" +
                "- Автоупаковка\n" +
                "- Перечисления\n" +
                "- Аннотации\n" +
                "- Оператор try-с-ресурсами\n" +
                "- Список аргументов переменной длины\n" +
                "- Многопоточность\n" +
                "- Классы ввода-вывода\n" +
                "- Работа с сетями\n" +
                "- Инфраструктура Collections Framework\n" +
                "- Аплеты и сервлеты\n" +
                "- JavaBeans\n" +
                "- AWT и Swing\n" +
                "- Параллельные API");
        title.show();
        author.show();
        content.show();
    }
}
