/*
Name: Breden Hulse
Class: Computer Science 2
Program: Will go through an array and see what two values add up to a certain sum.
*/
import java.io.*;
import java.util.*;
public class TwoPac{
    public static void main(String[]args)throws IOException{
		Scanner scan = new Scanner(new File("src/text.dat"));
        for(int i = scan.nextInt(); i > 0; i--){
            int size = scan.nextInt();
            int[] nums = new int[size]; 
            for(int g = 0; g < size; g++){//Create Array
                nums[g] = scan.nextInt();
            }
            int sum = scan.nextInt();//What it should equal
            String answer = "";
            int numb = 0;
            for(int j = 0; j < size; j++){
                for(int b = j + 1; b < size; b++){
                    if(nums[j] + nums[b] == sum){
                        answer = j + "," + b;
                        numb = sum;
                        break;
                    }  
                }  
                if(numb == sum){
                    System.out.println(answer);//Prints answer
                    break;
                }     
            }
        }
	}
}