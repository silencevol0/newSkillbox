public abstract class Client {

    private double account = 0;

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public abstract void getInformation();

    public abstract double getAmount();

    public abstract void put(double amountToPut);

    public abstract void take(double amountToTake);

}
