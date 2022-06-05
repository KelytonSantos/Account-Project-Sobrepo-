package entities;

public class BusinessAccount extends Account{
    private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
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
		}
	}

	@Override
	public void withdraw(double amount){
		super.withdraw(amount);//efetuei o saque normal
		balance -= 2.0; //Na linha 33 eu reutilizei código(em vez de criar outro). Na linha 34 eu acrescentei um desconto de 2.0
	}
}