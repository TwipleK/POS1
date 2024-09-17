package net.htlgkr.pos2.eratosthenesPrimeSieve;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private int N;
    boolean[] primes;


    @Override
    public boolean isPrime(int p) {
        return false;
    }

    public EratosthenesPrimeSieve(int N) {
        this.N = N;
        for (int i = 2; i < N+1; i++) {
            primes[i] = true;
        }
    }

    @Override
    public void printPrimes() {

    }
}
