import java.io.*;
import java.util.*;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Give the Number:-");
    int num = scan.nextInt();
    int sum=0,r,temp;
    for (temp = num;num!=0 ;num/=10 ) {
      r = num%10;
      sum += (r*r*r);
    }
    if (sum == temp) {
      System.out.println(temp + " is an ArmstrongNumber.\n");
    }
    else {
      System.out.println(temp + " is not an ArmstrongNumber.\n");
    }
  }
}
