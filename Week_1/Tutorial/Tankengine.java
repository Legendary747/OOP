package weblab;

class Solution {

    public static void tankEngine(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TankEngine");
            } else if (i % 3 == 0) {
                System.out.println("Tank");
            } else if (i % 5 == 0) {
                System.out.println("Engine");
            } else {
                System.out.println(i);
            }
        }
    }
}