package entities.accounts;


public interface IAccount {
	
	void withdrawal(Double value);
	
	void deposit(Double value);
	
	void transfer(Double value, Account account);
	
	void display();

}
