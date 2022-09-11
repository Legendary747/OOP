package weblab;

class PrimeNumbers {

    public static int max(int[] seq) {
        int r = Integer.MIN_VALUE;
        for (int i = 0 ; i < seq.length; i++) {
            if (seq[i] > r) r = seq[i];
        }
        return r;
    }

    public static int index(int[] seq, int el) {
        int r = -1;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == el) return i;
        }
        return r;
    }

    public static boolean contains(int[] seq, int el) {
        for (int i = 0; i < seq.length ; i++) {
            if (seq[i] == el) return true;
        }
        return false;
    }

    public static boolean isPrime(int el) {
        if (el <= 1) throw new IllegalArgumentException();
        if (el == 2) return true;
        if (el % 2 == 0) return false;
        for (int i = 3 ; i <= Math.ceil(Math.sqrt(el)); i+=2) {
            if (el % i == 0) return false;
        }
        return true;
    }

    public static int countPrimes(int[] seq) {
        int cnt = 0;
        for (int i = 0 ; i < seq.length; i++) {
            if (isPrime(seq[i])) cnt++;
        }
        return cnt;
    }
    
    public static int[] primesIn(int[] seq) {
        int[] p = new int[countPrimes(seq)];
        int j = 0;
        for (int i = 0;i<seq.length;i++) {
            if (isPrime(seq[i])) p[j++] = seq[i];
        }
        return p;
    }

    public static int[] primesUpTo(int n) {
        int[] arr = new int[n-2];
        if (n <= 1) return new int[0];
        if (n == 2) return new int[]{2};
        for (int i = 0; i < n-2; i++) {
            arr[i] = i+2;
        }
        return primesIn(arr);
    }

}
