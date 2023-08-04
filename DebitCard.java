class DebitCard extends BankCard
{
private int pinNumber; 
private int withdrawalAmount; 
private String dateOfWithdrawal; 
private boolean hasWithdrawn;
//This is a constructor method initializes the object by calling the constructor of the BankCard class
public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String
clientName, int pinNumber)
{
super(cardId, clientName, issuerBank, bankAccount, balanceAmount); 
this.pinNumber = pinNumber; 
this.withdrawalAmount = 0; 
this.dateOfWithdrawal = ""; 
this.hasWithdrawn = false;
}
//The is a getter method to returns the value of pinNumber 
public int getPinNumber()
{
return pinNumber;
}
//The is a getter method to returns the value of WithdrawalAmount 
public int getWithdrawalAmount()
{
return withdrawalAmount;
}
//The is a setter method to sets the value of withdrawalAmount to the provided argument 
public void setWithdrawalAmount(int withdrawalAmount)
{
this.withdrawalAmount = withdrawalAmount;
}
//The is a getter method to returns the value of DateofWithdrawl 
public String getDateOfWithdrawal() { 
    return dateOfWithdrawal;
}
//The is a getter method to returns the value of HasWithdrawn 
public boolean getHasWithdrawn() { 
    return hasWithdrawn;
}
//this method withdraws the specified amount from the card's balance if the provided PIN is correct
public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber)
{
if (this.pinNumber == pinNumber)
{
if (withdrawalAmount <= this.getBalanceAmount()) { this.withdrawalAmount = withdrawalAmount; this.dateOfWithdrawal = dateOfWithdrawal; this.hasWithdrawn = true; this.setBalanceAmount(this.getBalanceAmount() - withdrawalAmount);
} else {
System.out.println("Insufficient balance amount.");
System.out.println("To continue with the transaction, we recommend you to deposit money in your account.");
}
System.out.println("Your transaction is successfully done");
System.out.println("Your remaining balance in this account is : "+ this.getBalanceAmount()); } else {
System.out.println("The PIN you entered is incorrect.");
}
}
//This method call the method of bankCard class and print the value
public void display()
{
super.display();
if (hasWithdrawn) {
System.out.println("Pin number: " + pinNumber);
System.out.println("Withdrawal amount: " + withdrawalAmount);
System.out.println("Date of withdrawal: " + dateOfWithdrawal);
} else {
System.out.println("No transaction has been made yet.");
}
}
}
