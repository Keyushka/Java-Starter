package javaEssential.lessons.l8.generic.models;

public class Account<T, S, F> {
    private T t;
    private S s;
    private Integer id;
    private Integer amount;

    public Account(Integer id, Integer amount) {
        this.id = id;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "t=" + t +
                ", s=" + s +
                ", id=" + id +
                ", amount=" + amount +
                '}';
    }
}
