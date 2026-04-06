public class U05aShoesApp {
    public static void main(String[] args) {
      Shoes fav = new Shoes();
      fav.setColor("Blue");
      fav.setBrand("Nike");
      fav.setType("Golf");
      fav.setSize(9.5);
      System.out.println(fav.toString());
      
      /* Create a 2nd unique test of Shoes here */
      Shoes secondFav = new Shoes();
      secondFav.setColor("Green");
      fav.setBrand("Adidas");
      fav.setType("Running");
      fav.setSize(10.5);
      System.out.println(fav.toString());
    }
  }
