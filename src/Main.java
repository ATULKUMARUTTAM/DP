import java.util.Arrays;

class fibonacci{

    public static int fib_brute_force(int n)
    {
        if (n<=1)
            return n;
        else
            return fib_brute_force(n-1)+fib_brute_force(n-2);
    }


    public static int fib_memoization(int n, int memory[])
    {
                  if(n<=1)
                      return n;
                  if(memory[n]!=-1)
                  {
                      return memory[n];
                  }
                  return memory[n]= fib_memoization(n-1, memory)+fib_memoization(n-2, memory);
    }

    public static int fib_tabulation(int n)
    {
        int table[] = new int[n+1];
        table[0] = 0;
        if(n>0)
        table[1] = 1;
        for(int i = 2;i<=n;i++)
        {
            table[i] = table[i-1]+table[i-2];
        }
        return table[n];
    }


}

public class Main {
    public static void main(String[] args) {

        System.out.println("BruteForce Approach!!!!");
        for(int i=0; i<10;i++)
            System.out.println(fibonacci.fib_brute_force(i));

        System.out.println("Memoization Approach!!!!");
       for(int i=0; i<10;i++) {
            int arr[] = new int[i+1];
            Arrays.fill(arr, -1);
            System.out.println(fibonacci.fib_memoization(i, arr));
        }

        System.out.println("Tabulation Approach!!!!");
        for(int i=0; i<10;i++)
            System.out.println(fibonacci.fib_tabulation(i));
    }
}