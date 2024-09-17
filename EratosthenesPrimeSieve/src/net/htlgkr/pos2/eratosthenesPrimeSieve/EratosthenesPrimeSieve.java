package net.htlgkr.pos2.eratosthenesPrimeSieve;

import java.sql.Array;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private boolean[] primes;




    public EratosthenesPrimeSieve(int N)
    {

        primes = new boolean[N];

        for (int i = 2; i <= N; i++) {
            primes[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {

            if (primes[i]){

                for (int j = i*i; j <= N; j+=i) {

                    primes[j] = false;

                }
            }
        }


    }


    @Override
    public boolean isPrime(int p) {
        return primes[p];
    }

    @Override
    public void printPrimes() {

    }
}
