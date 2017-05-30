package q1ugly;

import java.util.Scanner;

public class q1ugly {
    public static void main(String[] args) {
        System.out.print("Enter a positive number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        int C;
         int N =0;
        System.out.println("fac"+"\t"+ "Times");
        for (int i = 2; i<=(number); i++) {
            C = 0;
           
            while (number % i == 0) {
                number /= i;
                C++;
                System.out.println(i+ "*\t*" + C);//print prime factors

            }
        if (!(C == 0)){
        
        if (!(i==2|i==3|i==5)){N = ++N;}
        else N=N;}
        
 
        
        }
        if (N>=1){System.out.println(".........RESULT..........INPUT NUMBER::::  Not ugly");}
        else System.out.println(".........RESULT..........INPUT NUMBER::::   ugly");
       
        
       }
    }

