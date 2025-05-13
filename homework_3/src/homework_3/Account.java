package homework_3;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote; // default (package-private)

    public double getBalance() {
        return balance;
    }

    public void changePin(int oldPin, int newPin) {
        if (this.pin == oldPin) {
            this.pin = newPin;
        }
    }
}