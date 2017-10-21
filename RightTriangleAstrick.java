import java.io.*;
import java.util.*;

public class RightTriangleAstrick {
  public static void main(String[] args) {
    int k=1;
    Scanner scan = new Scanner(System.in);
    int rows = scan.nextInt();
    for (int i = 1;i<=rows ;i++ ) {
      for (int j=1;j<=i ;j++ ) {
        System.out.print("*");
        //System.out.print(i);
        //System.out.print(j);
        /* by adding the below line it will print
        numbers int he pattern of
        1
        2 3
        4 5 6
        7 8 9 10*/
        //System.out.print(k++);
      }
      System.out.println();
    }
  }
}
