package net.htlgkr.Pos.HaslingerR21080;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private int max;
    private  boolean[] PrimesAndNoPrimes;

    @Override
    public boolean isPrime(int a) {
        if (a < 2){
            return false;
        }
        for (int i = 2;i<= Math.sqrt(max); i++){
            
        }

        return false;
    }

    @Override
    public void printPrimes() {

    }
}
