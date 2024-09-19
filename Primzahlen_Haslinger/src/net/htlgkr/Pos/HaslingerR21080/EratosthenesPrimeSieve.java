package net.htlgkr.Pos.HaslingerR21080;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private int max;
    private  boolean[] primesAndNoPrimes;

    @Override
    public boolean isPrime(int a) {
        if (a < 2){
            return false;
        }
        for (int i = 2;i<= Math.sqrt(max); i++){
            if (!primesAndNoPrimes[i]){
                for (int j = i*i;j<= max;j+=i){
                    primesAndNoPrimes[j]=true;
                }
            }
        }

        return !primesAndNoPrimes[a];
    }

    @Override
    public void printPrimes() {
        for (int i = 0;i<max;i++){
            isPrime(i);
        }
        for (boolean r : primesAndNoPrimes){
            if (r){
                System.out.println("is no Prime");
            }else {
                System.out.println("is Prime");
            }
        }
    }
}
