package javaStarter.lessons.lesson8;

public class C04_MethodsMainOverload {
    public static void main(String[] args) {
        if(args.length > 0)  // если через консоль были введены аргументы
            System.out.println(args[0]);  //то вывести на консоль первый элемент из массива
        else {  //иначе —
            main(); // и использовать обычный метод с названием Task6_main()
        }
    }

    public static void main() {  // это обычный метод с названием Task6_main()
        System.out.println("it's usual Task6_main method without String[] args!");
    }
}
