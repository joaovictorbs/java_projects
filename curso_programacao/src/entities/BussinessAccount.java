package entities;

public class BussinessAccount extends Account {

    private Double loanLimit;

    public BussinessAccount(){
        super(); //caso possua alguma logica dentro do construtor da classe base
    }

    public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //chama construtor da classe base
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
            //deposit(amount);
        }
    }
}
