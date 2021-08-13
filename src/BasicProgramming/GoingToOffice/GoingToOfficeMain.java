package BasicProgramming.GoingToOffice;

import java.util.Scanner;

public class GoingToOfficeMain {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);

        long d = scan.nextLong();
        long oc = scan.nextLong();
        long of = scan.nextLong();
        long od = scan.nextLong();
        long cs = scan.nextLong();
        long cb = scan.nextLong();
        long cm = scan.nextLong();
        long cd = scan.nextLong();


        if(oc + (d-of)*od<=cb+((d/cs) * cm) +(d*cd)){
            System.out.println("Online Taxi");
        }
        else{
            System.out.println("Classic Taxi");
        }

    }
}
