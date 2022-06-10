package javaEssential.lessons.l3_inheritance_and_polymorphism.models3;

public final class Database {
    private static Database instance;
    public String connection;

    private Database(String connection) {
        this.connection = connection;
    }

    public static Database getInstance(String connection){
        if(instance == null) {
            instance = new Database(connection);
        }
        return instance;
    }

    private static Database getInstance() {
        return instance;
    }

    private static void setInstance(Database instance) {
        Database.instance = instance;
    }

    private String getConnection() {
        return connection;
    }

    private void setConnection(String connection) {
        this.connection = connection;
    }
}
