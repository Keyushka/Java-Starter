package javaStarter.lessons.lesson7;

public class Animal {
    private int id;
    private String name;
    private String color;

    public void setId (int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
class Test2 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setId(1);
        cat.setName("Barsic");

        System.out.println(cat.getId());
        System.out.println(cat.getName());
    }
}
