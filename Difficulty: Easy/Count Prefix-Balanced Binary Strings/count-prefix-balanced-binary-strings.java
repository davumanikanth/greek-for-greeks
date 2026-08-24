// class Solution {
//     public int prefixStrings(int n) {
//         // code here
        
//     }
// }
class Solution {
    static final long MOD = 1000000007;

    static long power(long a, long b) {
        long ans = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                ans = (ans * a) % MOD;
            }

            a = (a * a) % MOD;
            b /= 2;
        }

        return ans;
    }

    static int prefixStrings(int n) {
        long fact2n = 1;
        long factN = 1;

        // (2n)!
        for (int i = 1; i <= 2 * n; i++) {
            fact2n = (fact2n * i) % MOD;
        }

        // n!
        for (int i = 1; i <= n; i++) {
            factN = (factN * i) % MOD;
        }

        // Denominator = n! × n! × (n + 1)
        long denominator = factN * factN % MOD;
        denominator = denominator * (n + 1) % MOD;

        // Division using modular inverse
        long inverse = power(denominator, MOD - 2);

        return (int)(fact2n * inverse % MOD);
    }
}