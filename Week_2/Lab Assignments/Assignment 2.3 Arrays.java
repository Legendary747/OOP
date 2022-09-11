package weblab;

class ArrayMethods {

    public static void println(int[] seq) {
        String s = "";
        for (int i = 0; i<seq.length; i++) {
            if (i != seq.length - 1) {
                s += seq[i] + " ";
            }
            s += seq[i];
        }
        System.out.println(s);
    }

    public static void swap(int[] seq) {
        if(seq.length >=2) {
            int tmp = seq[0];
            seq[0] = seq[1];
            seq[1] = tmp;
        } else {
            throw new IllegalArgumentException();
        }
    }

    static int[] copy(int[] seq) {
        int[] copy = new int[seq.length];
        for (int i = 0 ; i<copy.length ; i++) {
            copy[i] = seq[i];
        }
        return copy;
    }

    public static void rotate(int[] seq) {
        if (seq.length < 1) throw new IllegalArgumentException(); // bell out
        // Algorithm like one
        // Space Complexity O(1);
        // Time Complexity O(n);
        int tmp = seq[seq.length-1];
        for (int i = seq.length - 1; i >= 0; i--) {
            if (i == 0) seq[i] = tmp;
            else seq[i] = seq[i-1];
        }


        // logical One
        // Space Complexity O(n);
        // Time Complexity O(n);
        // int[] copy = new int[seq.length];
        // copy[0] = seq[seq.length-1];
        // for (int i = 1; i < seq.length; i++){
        //     copy[i] = seq[i-1];
        // }
        // for (int i = 0; i < seq.length; i++){
        //     seq[i] = copy[i];
        // }
    }

    public static void printer(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length ; i++) {
            s += arr[i] + " ";
        }
        System.out.println(s);
    }

    public static void rotate(int[] seq, int n) {
        if (seq.length < 1 || n <= 0) throw new IllegalArgumentException();
        while(n-- > 0) rotate(seq);
    }
}