package javaEssential.lessons.l7.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserNotFoundExceptions("User is not found");
        } catch (UserNotFoundExceptions e) {
            System.out.println(e.getMessage());
        }
    }
}
