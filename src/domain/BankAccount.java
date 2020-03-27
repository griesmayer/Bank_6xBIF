package domain;

import java.time.LocalDateTime;

public class BankAccount
{
	private Long           accountNumber;
	private LocalDateTime  openingDate;
	private String         firstName;
	private Double         amount;
	private Double         creditLimit;
	
	public BankAccount(Long accountNumber, LocalDateTime openingDate, String firstName, Double amount,
			Double creditLimit)
	{
		super();
		setAccountNumber (accountNumber);
		setOpeningDate (openingDate);
		setFirstName (firstName);
		setAmount (amount);
		setCreditLimit (creditLimit);
	}
	
	public BankAccount(String firstName, Double amount)
	{
		this(null, null, firstName, amount, null);
	}

	public Long getAccountNumber()
	{
		return accountNumber;
	}
	
	public void setAccountNumber(Long accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public LocalDateTime getOpeningDate()
	{
		return openingDate;
	}
	
	public void setOpeningDate(LocalDateTime openingDate)
	{
		this.openingDate = openingDate;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public Double getAmount()
	{
		return amount;
	}
	
	public void setAmount(Double amount)
	{
		this.amount = amount;
	}
	public Double getCreditLimit()
	{
		return creditLimit;
	}
	
	public void setCreditLimit(Double creditLimit)
	{
		this.creditLimit = creditLimit;
	}
	
	@Override
	public String toString()
	{
		return "BankAccount [accountNumber=" + accountNumber + ", openingDate=" + openingDate + ", firstName="
				+ firstName + ", amount=" + amount + ", creditLimit=" + creditLimit + "]\n";
	}	
}
