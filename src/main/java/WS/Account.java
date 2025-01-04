package WS;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private Date creationDate;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(int id, double balance, Date creationDate) {
        this.id = id;
        this.balance = balance;
        this.creationDate = creationDate;
    }
}
