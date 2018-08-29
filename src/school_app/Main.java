package school_app;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double array[]=new double[4];
      String moduleName[]=new String[4];
      double highest=0;
      double lowest=100;
     int temp;
      Scanner sc=new Scanner(System.in);
      
      for(int x=0;x<array.length;x++)
      {
    	  System.out.print("Enter the module name" + (x +1));
    	  moduleName[x]=sc.next();
    	  System.out.println();
    	  System.out.print("Enter your mark" + (x +1));
    	  array[x]=sc.nextDouble();
    	  System.out.println();
    	  if(array[x]>highest)
    	  {
    		  highest=array[x];
    	  }
    	  if(array[x]<lowest)
    	  {
    		  lowest=array[x];
    	  }
    	  

    	  
    	   

      }
      
      Arrays.sort(array);
      for(int y=0;y<4;y++)
      {
    	  System.out.println("The ordered list is" + array[y]); 
      }
      
      
      System.out.println("The highest mark is" + highest);
      System.out.println("The lowest is"+lowest);
      //System.out.println("The ordered is"+a);
      
      /*for(int y=0;y<array.length;y++)
      {
    	  if(array[y]>)
      }
      */
      
	}

}
