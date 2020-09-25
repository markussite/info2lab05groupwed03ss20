package de.htwberlin;

public class Main {

    private static int n = 100; // n > 100 fragment output von ns auf ms ändern
    private static int sum = 0;


    public static void main(String[] args) {
        for(int i = 0; i<101; i++) {
            n = i;
            System.out.println(fragments1Sum());
        }
        /*fragments2();
        fragments3();
        fragments4();
        fragments5();
        fragments6();
        fragments7();
        bitnumber20();
        bitnumber40();*/


    }

    public static void fragments1() {
        // Fragment #1
        long startTime1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sum++;
        }
        long endTime1 = System.nanoTime();
        double totalTime1 = endTime1 - startTime1;
        int totalTime1int = (int)totalTime1;
        System.out.println("fragment 1 runtime: " + totalTime1int + " nanoseconds or: " + (totalTime1 / 1000000) + " milliseconds");
    }
    public static int fragments1Sum() {// Fragment #1
        int sum = 0;
        for ( int i = 1; i < n; i ++)
            for ( int j = 0; j < n*n; j ++)
                if (j % i == 0)
                    for (int k = 0; k < j; k++)
                        sum++;
        return sum;
    }
        public static void fragments2() {
            // Fragment #2
            long startTime2 = System.nanoTime();
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    sum++;
            long endTime2 = System.nanoTime();
            double totalTime2 = endTime2 - startTime2;
            int totalTime2int = (int)totalTime2;
            System.out.println("fragment 2 runtime: " + totalTime2int + " nanoseconds or: " + (totalTime2 / 1000000) + " milliseconds");
        }
    public static void fragments3() {
        // Fragment #3
        long startTime3 = System.nanoTime();
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                sum++;
        long endTime3 = System.nanoTime();
        double totalTime3 = endTime3 - startTime3;
        int totalTime3int = (int)totalTime3;
        System.out.println("fragment 3 runtime: " + totalTime3int + " nanoseconds or: " + (totalTime3 / 1000000) + " milliseconds");
    }
    public static void fragments4() {
        // Fragment #4
        long startTime4 = System.nanoTime();
        for (int i = 0; i < n; i++)
            sum++;
        for (int j = 0; j < n; j++)
            sum++;
        long endTime4 = System.nanoTime();
        double totalTime4 = endTime4 - startTime4;
        int totalTime4int = (int)totalTime4;
        System.out.println("fragment 4 runtime: " + totalTime4int + " nanoseconds or: " + (totalTime4 / 1000000) + " milliseconds");
    }
    public static void fragments5() {
        // Fragment #5
        long startTime5 = System.nanoTime();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n * n; j++)
                sum++;
        long endTime5 = System.nanoTime();
        double totalTime5 = endTime5 - startTime5;
        int totalTime5int = (int)totalTime5;
        System.out.println("fragment 5 runtime: " + totalTime5int + " nanoseconds or: " + (totalTime5 / 1000000) + " milliseconds");
    }
    public static void fragments6() {
        // Fragment #6
        long startTime6 = System.nanoTime();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < i; j++)
                sum++;
        long endTime6 = System.nanoTime();
        double totalTime6 = endTime6 - startTime6;
        int totalTime6int = (int)totalTime6;
        System.out.println("fragment 6 runtime: " + totalTime6int + " nanoseconds or: " + (totalTime6 / 1000000) + " milliseconds");
    }
    public static void fragments7(){
    // Fragment #7
        long startTime7 = System.nanoTime();
     for ( int i = 1; i < n; i ++)
            for ( int j = 0; j < n*n; j ++)
            if (j % i == 0)
            for (int k = 0; k < j; k++)
         sum++;
        long endTime7   = System.nanoTime();
        double totalTime7 = endTime7 - startTime7;
        int totalTime7int = (int)totalTime7;
        System.out.println("fragment 7 runtime: " + totalTime7int + " nanoseconds or: " + (totalTime7/1000000) + " milliseconds or: " + (totalTime7 / 1000000000) + " seconds");
    }


     public static void bitnumber20(){
     int z=0;
         long startTime8 = System.nanoTime();
     for (double vari=1048475;vari<=1048575;vari++) {
            if (isPrime(vari))
         {
            z++;
         }
      }
         long endTime8   = System.nanoTime();
         double totalTime8 = endTime8 - startTime8;
         int totalTime8int = (int)totalTime8;
     System.out.println(z+ " primes and "+ totalTime8int + " nanoseconds execution time or: " + (totalTime8/1000000) + " milliseconds");

    }
    public static void bitnumber40(){
        int z=0;
        long startTime9 = System.nanoTime();
        for (double vari=(Math.pow(2,40)-101);vari<=(Math.pow(2,40)-1);vari++) {
            if (isPrime(vari))
            {
                z++;
            }
        }
        long endTime9   = System.nanoTime();
        double totalTime9 = endTime9 - startTime9;
        int totalTime9int = (int)totalTime9;
        System.out.println(z+ " primes and "+ totalTime9int + " nanoseconds execution time or: " + (totalTime9/1000000) + " milliseconds or: " + (totalTime9 / 1000000000) + " seconds");
    }

    //prime ja oder ne
    public static boolean isPrime(double vari){
        if(vari%2==0)return false;
        for(int i=3; i<=Math.sqrt(vari); i+=2)
        {
            if(vari%i==0) return false;
        }
        return true;
    }


}
