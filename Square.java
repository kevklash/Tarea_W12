public class Square
extends GeometricObject{
  private double side;

  /* *Constructor */
  public Square(){
    this.name = "";
    this.side = 0;
    this.identifier = 0;
  }

  /* *Parameterized Constructor */
  public Square(String name, double side, int identifier){
    this.side = side;
    this.identifier = identifier;
    this.name = name;
  }

  /* *Getters */
  public double getSide(){
    return side;
  }

   /* *Setters */
  public void setSide(double side){
    this.side = side;
  }

  /* *Overriding Parent Methods */
  @Override
  public double getArea(){
    return Math.pow(this.side, 2);
  }

}