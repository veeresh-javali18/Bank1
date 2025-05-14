
class BankHistory {
  String Customername;
  float AccountNumber;
  int age;

  BankHistory(String Customername, float AccountNumber, int age) {
    this.Customername = Customername;
    this.AccountNumber = AccountNumber;
    this.age = age;
  }

  public void details() {
    System.out.println("Name:  " + Customername);
    System.out.println("AccountNumber  :" + AccountNumber);
    System.out.println("Age:" + age);
  }
}

public class Bank {
  public static void main(String[] args) {
    BankHistory B = new BankHistory("Anish", 022553366, 21);
    B.details();
  }
}
