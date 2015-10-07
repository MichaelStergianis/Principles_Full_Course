public class Lec07 
{
  public static void main(String[] args) {
    MyVec2D v = new MyVec2D(2, 3);
    System.out.println("v = " + v);
    v.swap();
    System.out.println("v (after swap) = " + v);

    // We want to be able to do this:
    // 
    MyVec2DG<Integer> v1 = new MyVec2DG<Integer>(2, 3);
    System.out.println("v = " + v1);
    v1.swap();
    System.out.println("v (after swap) = " + v1);
    
    MyVec2DG<Double> v2 = new MyVec2DG<Double>(2.4, 3.445);
    System.out.println("v = " + v2);
    v2.swap();
    System.out.println("v (after swap) = " + v2);
  }
}

// Create a generic class MyVec2DG modeled after the following
// class.             
class MyVec2DG<T>
{
  public T x, y;

  public MyVec2DG(T x, T y) {
    this.x = x;
    this.y = y;
  }

  public T x() { return x; }
  public T y() { return y; }

  public void swap() { T tmp = x; x = y; y = tmp; }

  public String toString() { 
    String s = "(" + x + "," + y + ")";
    return s;
  }	
}
class MyVec2D
{
  public int x, y;

  public MyVec2D(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int x() { return x; }
  public int y() { return y; }

  public void swap() { int tmp = x; x = y; y = tmp; }

  public String toString() { 
    String s = "(" + x + "," + y + ")";
    return s;
  }	
}
