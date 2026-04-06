public class Shoes {
    // instance variables go here
    // create private instance vars for brand, type, and size
    private String color;
    private String brand;
    private String type;
    private boolean size;
    private int modelNumber;
  
    // methods go here
    // create public methods setBrand, setType, setSize, getModelNumber
    public void setColor(String _color){
      color = _color;
    }
  
    // setBrand
    public void setBrand(String _brand){
      brand = _brand;
    }

    // setType
    public void setType(String _type){
      type = _type;
    }

    // setSize
    public void setSize(double _size){
      size = _size;
    }

    // getModelNumber
    public void getModelNumber(int _modelNumber){
      modelNumber = _modelNumber;
    }

    // update the toString method to return expected output
    // NOTE: do NOT include the model number here!
    public String toString(){
      return
      brand.substring(0, 1).toLowerCase() +
      type.substring(0, 1).toLowerCase() +
      ;
    }
  
  }
