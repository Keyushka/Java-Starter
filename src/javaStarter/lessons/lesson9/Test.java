package javaStarter.lessons.lesson9;

public class Test {
    public static void main(String[] args) {
        String str = new String("5646");
        summ(str);
    }
    private static void summ(String str){
        int summ = 0;

        for (int i = 0; i < str.length(); i++) {
            summ += str.charAt(i) - '0';
            //summ += Integer.parseInt(str.trim());
        }
        System.out.println(summ);
    }
}
