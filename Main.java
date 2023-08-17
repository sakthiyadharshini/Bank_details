import Bank_details.currentacc;
import Bank_details.loanacc;
import Bank_details.saveacc;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your bank account type \'currentaccount\' \'savingsaccount\' \'loanaccount\'");
        Scanner sc=new Scanner(System.in);
        String ch=sc.next();

        switch(ch)
        {
            case "currentaccount":
            {
                currentacc c=new currentacc();
                c.createaccount();
                c.interestrate();
                c.curracc();
                break;

            }
            case "savingsaccount":
            {
                saveacc s = new saveacc();
                s.createaccount();
                s.interestrate();
                s.savacc();
                break;
            }
            case "loanaccount":
            {
                loanacc l =new loanacc();
                l.createaccount();
                l.interestrate();
                l.loanacc();
                break;
            }
            default:
            {
                System.out.println("Wrongly selected!! please enter correctly..");
            }

        }

    }
}