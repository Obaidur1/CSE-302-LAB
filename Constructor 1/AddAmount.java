public class AddAmount {

  int amount = 50;

  AddAmount() {
    System.out.println("No amount added! Current balance is $" + amount);
  }

  AddAmount(int deposit) {
    amount = amount + deposit;
    System.out.println("Amount $" + deposit + " is added to your account.");
    System.out.println("Current balance is $" + amount);
  }
}
