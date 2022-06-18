package javaEssential.lessons.l8.generic;

import javaEssential.lessons.l8.generic.models.Account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, 500));
        accounts.add(new Account(2, 500));
        Map<String, String> hashMap = new HashMap<>();
        Fruit<String> fruit = new Fruit<>("dynamic", "name");
        System.out.println(fruit.getT());



    }

    public int getSum(List<Account> accounts) {
        int sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            Object account = accounts.get(i);
            /*if (account instanceof Account) {
                sum+= ((Account) account).getAmount();
            }*/
        }
        return sum;
    }

    static class Fruit<T>{
        private T t;
        private String name;

        public Fruit(T t, String name) {
            this.t = t;
            this.name = name;
        }

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
