import java.util.*;
public class GradeMenu{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Press 1 to Proceed:");
      int n=sc.nextInt();
      
      do{
          if(n==1){
              System.out.print("Enter your marks out of 100:");
              int marks=sc.nextInt();
              if(marks>=91 & marks<=100){
                  System.out.println("A++");
              }
              else if(marks>=81 & marks<=90){
                  System.out.println("A+");
              }
              else if(marks>=71 & marks<=80){
                  System.out.println("A");
              }
              else if(marks>=61 & marks<=70){
                  System.out.println("B");
              }
              else if(marks>=51 & marks<=60){
                  System.out.println("C");
              }
              else if(marks>=41 & marks<=50){
                  System.out.println("D");
              }
              else if(marks>=31 & marks<=40){
                  System.out.println("E");
              }
              else if(marks>=0 & marks<=30){
                  System.out.println("F");
              }
              else{
                  System.out.println("Invalid");
              }
          }
          System.out.print("Want to continue? YES(1) or NO(0): ");
          n=sc.nextInt();
      }
      while(n==1);
    }  
}