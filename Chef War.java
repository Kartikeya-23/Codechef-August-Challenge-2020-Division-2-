/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		try {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int H = sc.nextInt();
                int P = sc.nextInt();
                boolean canDefeat = false;
                while (P > 0) {
                    H = H - P;
                    if (H <= 0) {
                        canDefeat = true;
                        break;
                    }
                    P /= 2;
                }
                if (canDefeat) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }

            }
        } catch (Exception e) {
            return;
        }
		
		
		
	}
}
