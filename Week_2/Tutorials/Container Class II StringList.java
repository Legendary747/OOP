package weblab;
import java.util.Objects;

class StringList {

    private String[] elements;
    private int amount;

    public StringList(int n) {
        this.amount = 0;
        n = n<0 ? 0 : n;
        elements = new String[n];
    }

    public void add(String el) {
        if (amount < elements.length) {
            elements[amount++] = el;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String get(int i) {
        if (i < amount && i >= 0) {
            return elements[i];
        } else {
            return null;
        }
    }

    public void set(int i, String el) {
        if (i >= 0 && i < amount) {
            // i = i == 0 ? 0 : i-1;
            elements[i] = el;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int index(String el) {
        for (int i = 0; i < elements.length; i++) {
            if (Objects.equals(elements[i], el)) return i;
        }
        return -1;
    }

    public boolean contains(String el) {
        for (int i = 0; i < elements.length ; i++) {
            if (Objects.equals(elements[i], el)) return true;
        }
        return false;
    }

    public int getSize() {
        return amount;
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other instanceof StringList) {
            StringList that = (StringList) other;
            if(!(this.elements.length == that.elements.length 
                    && this.amount == that.amount)) return false;
            for (int i = 0; i < amount; i++) {
                if (Objects.equals(this.elements[i], that.elements[i]) == false) {
                    return false;
                }
            }
            return true;
        }
        return false;
        
    }

    public String toString() {
        String s = "";
        for (int i = 0 ; i < elements.length; i++) {
            if (i != elements.length-1) {
                s += elements[i] + ", ";
            } else {
                s += elements[i] + ".";
            }
        }
        return s;
    }
}