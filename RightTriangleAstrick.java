import java.io.*;
import java.util.*;

public class RightTriangleAstrick {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int rows = scan.nextInt();
    for (int i = 1;i<=rows ;i++ ) {
      for (int j=1;j<=i ;j++ ) {
        System.out.print("*");
        //System.out.print(i);
        //System.out.print(j);
      }
      System.out.println();
    }
  }
}