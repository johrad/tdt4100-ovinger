package oving2.Account;

/* 
 * Forklar hvorfor metodene over kan sies å være en komplett innkapsling av tilstanden?
 *      Vil påstå at det er en "komplett" inkapsling fordi at alle data-punkter har set/get funksjoner. 
 *      Altså at alt av manipulering skjer via public methods  
 *      
 * Er denne klassen data-orientert eller tjeneste-orientert? Begrunn svaret!
 *      data-orientert, siden klassen primært består av setter og getter metoder.
 * feil.
 */


public class Account {
    private double accountBalance;
    private double interestRate;

    public Account(double accountBalance, double interestRate) {
        if (accountBalance < 0 || interestRate < 0) {
            throw new IllegalArgumentException("Cannot have negative values!");
        } else {
            this.accountBalance = accountBalance;
            this.interestRate = interestRate;
        }
    };

    public void deposit(double toDeposit) {
        if (toDeposit < 0) {
            throw new IllegalArgumentException("Cannot have negative value!");
        } else {
            this.accountBalance += toDeposit;
        }
    };

    public void setInterestRate(double IR) {
        if (IR < 0) {
            throw new IllegalArgumentException("Cannot have negative value!");
        } else {
            this.interestRate = IR;
        }
    };

    public void withdraw(double toWithdraw) {
        if (toWithdraw < 0) {
            throw new IllegalArgumentException("Cannot have negative value!");
        } else if (this.accountBalance - toWithdraw < 0) {
            throw new IllegalArgumentException("Insufficient funds. I guess you're a student huh");
        } else {
            this.accountBalance -= toWithdraw;
        }
    }

    public void addInterest() {
        this.accountBalance += this.accountBalance * this.interestRate;
    }

    public String toString() {
        return "Account Balance: " + this.accountBalance + "\nInterest Rate: " + this.interestRate;
    }

    public static void main(String[] args) {
        Account myAccount = new Account(200, 0.012);

        myAccount.deposit(30);
        myAccount.withdraw(200);
        myAccount.setInterestRate(0.025);
        System.out.println(myAccount.toString());
        myAccount.addInterest();
        System.out.println("-> With interest added <-\n" + myAccount.toString());
        
    }

}

