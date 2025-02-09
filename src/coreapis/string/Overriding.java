package coreapis.string;

public class Overriding {
    private int name = 3;

    public int getName() {
        return name;
    }

    public String toString() {
        return "toStringifying" + name;
    }

    public boolean equals(Object anObject) {
        if (anObject instanceof Overriding) {
            Overriding x = (Overriding)anObject;
            if (this.name == x.getName()) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public int hashCode() {
        return Integer.valueOf(name).hashCode();
    }
}
