public class CreditCard {
    private int nomer;
    private int expYear;
    private int cvv;
    private int balance;

    public CreditCard(int nomer, int expYear, int cvv) {
        this.balance = 100_000;
        this.nomer = nomer;
        this.expYear = expYear;
        this.cvv = cvv;
    }

    public int getBalance() {
        return balance;
    }

    public boolean minus(int amount){
        if (amount <= this.balance){
            this.balance = this.balance - amount;
            return true;
        }else{
            System.out.println("Недостаточно средств.");
            return false;
        }
    }
}
