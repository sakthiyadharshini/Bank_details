package Bank_details;

public abstract class savingsaccount implements Bank_details {
    long deposit = 500000;
    int r=6;
    int yr=5;
    int interest = (int) ((deposit * r * yr)/100);

    @Override
    public void createaccount() {
        System.out.println("Your deposit is: Rs."+deposit);

    }

    @Override
    public void interestrate() {
        System.out.println("The interest rate is:"+r);
        System.out.println("The years given is:"+yr);
        System.out.println("The interest for savings account is:"+interest);

    }
}
