package entities.accounts;
import entities.user.Client;
public class Account implements IAccount {
	private static final int DEFFAULT_AGENCY = 1;
	private static int sequential=1;
	protected Integer number;
	protected Integer agency;
	protected Double balance=0.0;
	protected Client client;
	

	public Account(Client client) {
		super();
		this.number = sequential++;
		this.agency = Account.DEFFAULT_AGENCY;
		this.client=client;
		
	}
	public Account() {
		
	}
	
	@Override
	public void withdrawal(Double value) {
		this.balance-=value;
		
	}
	@Override
	public void deposit(Double value) {
		this.balance+=value;
		
	}
	@Override
	public void transfer(Double value, Account account) {
		this.withdrawal(value);
		account.deposit(value);
	}
	
	@Override
	public void display() {
		System.out.println("Cliente:"+ client.getName()+ "\nNumero: "+this.number+"\nAgencia: "+this.agency+"\nSaldo: "+this.balance);
	}
	
}
