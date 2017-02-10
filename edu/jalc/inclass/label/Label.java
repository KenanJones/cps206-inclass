public class Label{

  //private Color color;
  private double height;
  private double width;
  //private Image logo;

  /*private Label(){
    color = null;
    height = width = 0;
    logo = null;
  }*/

  public Label(double height, double width){
  //  this.color = color;
    this.height = height;
    this.width = width;
    //this.logo = logo;
  }

  public static void main(String... args){
  Label label = new Label();
  }
}
