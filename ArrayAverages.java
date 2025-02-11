import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    int avg = 0;
    int sum = 0;
    for(int row = 0; row < ray.length; row++)
    {
      sum = 0;
      avg = 0;
      for(int col = 0; col < ray[row].length; col++)
      {
        sum += ray[row][col];
        avg++;
      }
      avg = sum/avg;
      System.out.println("The average of row " + row + " is: " + avg);
    }
    System.out.println("\n");
  }

  public void columnAverages(){

    //Column outside loop row on inside loop top to bottom then left to right
    int avg = 0;
    int sum = 0;
    for(int col = 0; col < ray[0].length; col++)
    {
      sum = 0;
      avg = 0;
      for(int row = 0; row < ray.length; row++)
      {
        sum += ray[row][col];
        avg++;
      }
      avg = sum/avg;
      System.out.println("The average of column " + col + " is: " + avg);
    }
    System.out.println("\n");
  }

  public void arrayAverage(){
    int avg = 0;
    int sum = 0;
    for(int col = 0; col < ray[0].length; col++)
    {
      for(int row = 0; row < ray.length; row++)
      {
        sum += ray[row][col];
        avg++;
      }
      
    }
    avg = sum/avg;
    System.out.println("The average of the entire array is: " + avg);
    System.out.println("\n");
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
