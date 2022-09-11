package weblab;
import java.util.Objects;

class StringSet {

    private String[] elements;
    private int amount;

    public StringSet(int n) {
        this.amount = 0;
        n = n < 0 ? 0 : n;
        this.elements = new String[n];
    }

    public void add(String el) {
        if (amount >= elements.length) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < elements.length; i++) {
            if (Objects.equals(el, elements[i])) {
                throw new IllegalArgumentException();
            }
        }
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = el;
                amount++;
                break;
            }
        }
    }

    public String get(int i) {
        if (i < 0 || i >= amount) return null;
        return elements[i];
    }

    public void set(int i, String el) {
        if (i < 0 || i >= amount) throw new IllegalArgumentException();
        if (elements[i] == null) amount++;
        elements[i] = el;
    }

    public int index(String el) {
        int r = -1;
        for (int i = 0; i < elements.length; i++) {
            if (Objects.equals(el, elements[i])) return i;
        }
        return r;
    }

    public boolean contains(String el) {
        for (int i = 0; i < elements.length; i++) {
            if (Objects.equals(el, elements[i])) return true;
        }
        return false;
    }

    public int getSize() {
        return amount;
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other instanceof StringSet) {
            StringSet that = (StringSet) other;
            if (this.amount != that.amount || this.elements.length != that.elements.length) return false;
            for (int i = 0 ; i < this.elements.length;i++) {
                if (!Objects.equals(this.elements[i], that.elements[i]))return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Caonima";
    }
}