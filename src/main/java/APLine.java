public class APLine
{
  private double slope;
  private double nC;
  private double nB;
  private double nA;
  public APLine(double a, double b, int c){
    slope = -a/b;
    nA = a;
    nB = b;
    nC = c;
  }
  public double getSlope(){
    return slope;
  }
  public boolean isOnLine(int x, int y){
    if((nA * x + nB * y + nC) == 0)
      return true;
    return false;
  }
}
