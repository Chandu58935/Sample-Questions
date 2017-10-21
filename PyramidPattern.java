import java.io.*;
import java.util.*;

public class PyramidPattern {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //No. of rows
    System.out.print("No of Rows:-");
    int rows = scan.nextInt();
    //calculate no of spaces
    int space = rows+4-1;
    int a=1;
    for (int i=1;i <= rows ;i++ ) {
      for (int k=space;k>=1 ;k-- ) {
        System.out.printf(" ");
      }
      for (int j=1;j<=i ;j++ ) {
        /*
        You can print numbers by disabling comment lines
        of below line
        */
        System.out.print("* ");
        //System.out.print(a++ +" ");
      }
      System.out.printf("\n");
      space--;
    }
  }
}
