import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    System.out.println("This program creates 3 geometric objects and returns their areas.");
    
    /* *Creating the ArrayList */
    ArrayList<GeometricObject>geometricObjects = new ArrayList<>();
    geometricObjects.add(new Circle("Circle", 10, 156));
    geometricObjects.add(new Square("Square", 2, 237));
    geometricObjects.add(new Triangle("Triangle", 4, 3, 212));

    System.out.printf("%10s %5s\n", "Identifier", "Area");

    for(GeometricObject i : geometricObjects) {
      System.out.format( "%3s\t\t\t%6.2f sq. inches \n", i.getIdentifier(), i.getArea());
    }
    System.out.println("Goodbye.");
  }
}