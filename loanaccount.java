package Bank_details;

public abstract class loanaccount implements Bank_details {
    long deposit = 800000;
    int r=10;
    int yr=4;
    int interest = (int) ((deposit * r * yr)/100);

    @Override
    public void createaccount() {
        System.out.println("Your deposit is: Rs."+deposit);

    }

    @Override
    public void interestrate() {
        System.out.println("The interest rate is:"+r);
        System.out.println("The years given is:"+yr);
        System.out.println("The interest for loan account is:"+interest);

    }
}
