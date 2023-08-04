class BankCard

{
  private int cardId;

  private String clientName;

  private String issuerBank;

  private String bankAccount;

  private int balanceAmount;

  // This is the constructor for the class

  public BankCard(int cardId, String clientName, String issuerBank,
      String bankAccount,
      int balanceAmount)

  {
    this.cardId = cardId;

    this.clientName = clientName;

    this.issuerBank = issuerBank;

    this.bankAccount = bankAccount;

    this.balanceAmount = balanceAmount;
  }

  // This is a getter method that returns the value of "cardId"

  public int getCardId()

  {
    return cardId;
  }

  // This is a getter method that returns the value of "clientName"

  public String getClientName()

  {
    return clientName;
  }

  // This is a setter method to sets the value in"clientName"

  public void setClientName(String clientName)

  {
    this.clientName = clientName;
  }

  // This is a getter method that returns the value of "issuerBank"

  public String getIssuerBank()

  {
    return issuerBank;
  }

  // This is a getter method that returns the value of "bankAccount"

  public String getBankAccount()

  {
    return bankAccount;
  }

  // This is a getter method that returns the value of "balanceAmount"

  public int getBalanceAmount()

  {
    return balanceAmount;
  }

  // This is a setter method that sets the value of "balanceAmount" to the
  // passed value of the parameter "newBalanceAmount".

  public void setBalanceAmount(int newBalanceAmount)

  {
    this.balanceAmount = newBalanceAmount;
  }

  // This is a method to print out the values

  public void display()

  {
    if(this.clientName.equals("")){
        System.out.println("The name of client is unknown.");
    }
    else{
        System.out.println("Card ID: " + cardId);

        System.out.println("Client name: " + clientName);
    
        System.out.println("Issuer bank: " + issuerBank);
    
        System.out.println("Bank account: " + bankAccount);
    
        System.out.println("Balance amount: " + balanceAmount);
    }
   
  }
}
