package javaEssential.lessons.l8;

public class MyArrayList  <E> {
    private  final  int DEFAULT_SIZE = 10;
    // обьявить шаг насколько будем увеличивать свой массив (1.5 раза)
    // contaons - перебирать циклом
    private Object[] myData = new Object[DEFAULT_SIZE];

    public boolean add(E data) {
        return true;
    }
}
