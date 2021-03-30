public class GeometricObject{
  public String name;
  public int identifier;

  /* *Contructor */
  public GeometricObject(){
    this.name = "";
  }
  /* *Parameterized Contructor */
  public GeometricObject(String name, int identifier){
    this.name = name;
    this.identifier = identifier;
  }

  /* *Getter */
  public String getName(){
    return name;
  }

  public int getIdentifier(){
    return identifier;
  }

  /* *Setter */
  public void setName(String name){
    this.name = name;
  }

  public void setIdentifier(int identifier){
    this.identifier = identifier;
  }

  /* *Member Method */
  public double getArea(){ return 0;  }
}