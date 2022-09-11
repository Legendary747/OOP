package weblab;

class Assignment1_5 {
  
    public static String squareBuilder(int n) {
        String s = new String();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                s += "*";
            }
            s += "\n";
        }
        return s;
    }
  
}