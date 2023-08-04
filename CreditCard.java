class CreditCard extends BankCard

{
  private int CVCNumber; // variable to store the CVC number of the credit card

  private double
      creditLimit; // variable to store the credit limit of the card private

  double
      interestRate; // variable to store the interest rate of the card private

  String expirationDate; // variable to store the expiration date of the card

  private int gracePeriod; // variable to store the grace period of the card

  private boolean
      isGranted; // variable to check if credit card is granted or not

  // This is the constructor for this CreditCard class

  public CreditCard(int cardId, String clientName, String issuerBank,
      String bankAccount,
      int

          balanceAmount,
      int CVCNumber, double interestRate, String expirationDate)

  {
    super(cardId, clientName, issuerBank, bankAccount, balanceAmount);

    this.CVCNumber = CVCNumber;

    this.interestRate = interestRate;

    this.expirationDate = expirationDate;

    this.isGranted = false;
  }

  public int getCVCNumber()

  {
    return CVCNumber; // method to get the CVC number of the credit card
  }

  public double getCreditLimit()

  {
    return creditLimit; // method to get the credit limit of the credit card
  }

  public double getInterestRate() {
    return interestRate; // method to get the credit limit of the credit card
  }

  public String getExpirationDate() {
    return expirationDate; // method to get the expiration date of the credit
                           // card
  }

  public int getGracePeriod() {
    return gracePeriod; // method to get the grace period of the credit card
  }

  public boolean getIsGranted() {
    return isGranted; // method to check if credit card is granted or not
  }

  // This method sets the credit limit and grace period of the credit card

  public void setCreditLimit(double newCreditLimit, int newGracePeriod) {
    if (newCreditLimit <= 2.5 * this.getBalanceAmount()) {
      this.creditLimit = newCreditLimit;

      this.gracePeriod = newGracePeriod;

      this.isGranted = true;
      System.out.println("Credit has been issued.");

    } else {
      System.out.println("Credit cannot be issued");
    }
  }

  // This method cancels the credit card public void cancelCreditCard()

  public void cancelCreditCard()
  {
    
      this.CVCNumber = 0;

      this.creditLimit = 0;

      this.gracePeriod = 0;

      this.isGranted = false;
    

    System.out.println("The CreditCard has been canceled");
  }

  // This method display the details of the credit card

  public void display()

  {

    if (isGranted==true)

    {
    super.display();

      System.out.println("CVC number: " + CVCNumber);

      System.out.println("Interest rate: " + interestRate);

      System.out.println("Expiration date: " + expirationDate);

      System.out.println("Credit limit: " + creditLimit);

      System.out.println("Grace period: " + gracePeriod);

    } else {
      System.out.println("Interest Rate: "+getInterestRate());
      System.out.println("Expiration Date: "+getExpirationDate());

    }
  }
}