package Bank_details;

public abstract class currentaccount implements Bank_details {
    long deposit = 100000;
    int r=7;
    int yr=3;
    int interest = (int) ((deposit * r * yr)/100);

    @Override
    public void createaccount() {
        System.out.println("Your deposit is: Rs."+deposit);

    }

    @Override
    public void interestrate() {
        System.out.println("The interest rate is:"+r);
        System.out.println("The years given is:"+yr);
        System.out.println("The interest for current account is:"+interest);

    }
}
