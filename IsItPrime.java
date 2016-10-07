
package isitprime;

import java.util.ArrayList;

/**
 *
 * @author Chad Smith
 */
public class IsItPrime {
    
    public static void main(String[] args) {
        primeCheck();
    }
        public static void primeCheck(){
            ArrayList<String> primeNum = new ArrayList<String>();
            boolean isPrime = false;
            int prime;
            for(double i = 2; i < 30; i++){
            double sqr = Math.sqrt(i);

            for(int x = 2; x < 30; x++){
		isPrime = false;
		if(i == x){
		    isPrime = true;
                    
		}
		if (i % x == 0){
                    break;
		}
		isPrime = true;
            }
            if(isPrime == true){
                prime = (int)i;
                primeNum.add(Integer.toString(prime));
            }
	}
			
	System.out.println(primeNum.toString());
        }
}