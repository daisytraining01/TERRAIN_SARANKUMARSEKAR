package drilltwo;
public class cons {
  public cons() {
    this("JAVA");
    System.out.println("Default const...");
  }

  public cons(int id) {
    this(3456.5678f);
    System.out.println(id);
  }

  public cons(String name) {
    this(12);
    System.out.println(name);
  }

  public cons(float sal) {
    System.out.println(sal);
  }

  public static void main(String[] args) {
    cons a = new cons();
  }
}

