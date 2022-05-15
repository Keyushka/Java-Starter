package javaEssential.homework.hw1.task5;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(11111);
        address.setCountry("Ukraine");
        address.setCity("Kiev");
        address.setStreet("Kalush");
        address.setHouse("12K");
        address.setApartment(439);
        System.out.println("Index:     " + address.getIndex() +"\nCountry:   " + address.getCountry() + "\nCity:      " + address.getCity() +
                "\nStreet:    " + address.getStreet() +"\nHouse:     " + address.getHouse() + "\nApartment: " + address.getApartment());
    }
}
