package weblab;

class Assignment1_6 {
  
    public static String buildTriangle(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                s += "*";
            }
            s += "\n";
        }
        return s;
    }
  
}