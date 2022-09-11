package weblab;

class Obfuscation {
    public static void run() {
        int number1 = 3;
        int number2 = number1;

        if (number2 < number1++) {
            System.out.println("number2 is smaller than number1");
        } else {
            System.out.println("number2 is greater than or equal to number1");
            System.out.println("number1 is: " + number1 + ", and number2 is: " + number2);
        }   
    }
}
