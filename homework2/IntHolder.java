import java.util.Objects;

public class IntHolder {
    private int x;

    public IntHolder(int x) {
        this.x = x;
    }

    public static IntHolder build(int x) {
        return new IntHolder(x);
    }

    public void sum(IntHolder a) {
        this.x += a.x;
    }

    public void sub(IntHolder a) {
        this.x -= a.x;
    }

    public void mul(IntHolder a) {
        this.x *= a.x;
    }

    public void div(IntHolder a) {
        this.x /= a.x;
    }

    public void rem(IntHolder a) {
        this.x %= a.x;
    }

    public static void swap(IntHolder i, IntHolder j) {
        int d = i.x;
        i.x = j.x;
        j.x = d;
    }

    @Override
    public boolean equals(Object Su){
        if (this == Su) {
            return true;
        }
        if (Su == null || getClass()!=Su.getClass()) {
            return false;
        }
        IntHolder supremum = (IntHolder) Su;
        return x == supremum.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}

