package weblab;

class PatternBuilder {
  
    public static String buildPattern(int d) {
        String out = "";
        for (int i = 0; i < d ; i++) {
            for (int j = 0; j < d; j++) {
                if (i + j + 1 == d)  out += "@";
                else out += "*";
            }
            out += "\n";
        }
        return out;
    }
  
}