package Task1;

public interface IntSequence {

  static IntSequence of(int... args) {
    return new IntSequence() {
      private int i = 0;

      @Override
      public boolean hasNext() {
        if (i < args.length) {
          return true;
        }
        return false;
      }

      @Override
      public int next() {
        if (hasNext()) {
          i++;
          return args[i - 1];
        } else {
          throw new ArrayIndexOutOfBoundsException("index out of bounds");
        }
      }
    };
  }

  static IntSequence constant(int arg) {
    return new IntSequence() {
      @Override
      public boolean hasNext() {
        return true;
      }

      @Override
      public int next() {
        return arg;
      }
    };
  }

  boolean hasNext();

  int next();

}