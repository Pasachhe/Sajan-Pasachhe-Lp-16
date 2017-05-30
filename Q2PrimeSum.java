
package q2primesum;

/**
 *
 * @author sajan_pife76e
 */
public class Q2PrimeSum {

   
    
       public static void main(String[] args){
        int i,count;
        int sum = 0, num;

        for(num = 1; num <= 2000000; num++){
            count = 0;
            for(i = 2; i <= num / 2; i++){
                if(num % i == 0){
                    count++;
                    break;
                }
            }
            if(count == 0 && num != 1)
                sum = sum + num;
        }
        System.out.println("Sum of prime numbers is: "+ sum);

    }
}
// the answer produced is "Sum of prime numbers is: 1179908154"