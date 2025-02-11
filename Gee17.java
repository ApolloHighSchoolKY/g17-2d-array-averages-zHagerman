public class Gee17{
  public static void main(String[] args){

    int[][] ray = new int[7][7];

    //populate the array with sequental numbers
    int counter = 0;
    for(int row2 = 0; row2 < ray.length; row2++)
    {
      for(int col = 0; col < ray[row2].length; col++)
      {
        ray[row2][col] = counter;
        counter++;
      }
    }

    ArrayAverages twoDee = new ArrayAverages(ray);
    System.out.println(twoDee);

    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
