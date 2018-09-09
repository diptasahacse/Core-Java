
package CoreJava;

import java.util.Scanner;

public class Lcm_Using_The_Concept_of_Aptitude {
    public static void main(String[] args) {
        int num1,num2,num3;
        int choice;
        int arr[] = new int[10];
        int ans=0;
        Scanner scan = new Scanner (System.in);
        System.out.println("You Should Have To Input Different Number,Otherwise LCM is Not Working Properly.");
        System.out.print("How many number You have to input...?\n2 or 3...?\nchoice=");
        choice = scan.nextInt();
        if (choice == 2) {
            System.out.print("Enter Num 1 :");
            num1 = scan.nextInt();
            System.out.print("Enter Num 2 :");
            num2 = scan.nextInt();
            
             
        if( num2 > num1)
        {
            for (int i = 0; i < 10; i++) {
                arr[i] = num2*(i+1);
                
                
            }
            
            for (int i = 0; i < 10; i++) {
                if (arr[i] % num1 == 0) {
                    ans = arr[i];
                    break;
                }
                
                
            }
            
        }
        else
        {
            for (int i = 0; i < 10; i++) {
                arr[i] = num1*(i+1);
                
                
            }
            
            for (int i = 0; i < 10; i++) {
                if (arr[i] % num2 == 0) {
                    ans = arr[i];
                    break;
                }
                
                
            }
        }
        System.out.printf("The Answer of LCM is %d From (%d,%d) ",ans,num1,num2);  
        }
        else if(choice == 3)
        {
            System.out.print("Enter Num 1 :");
            num1 = scan.nextInt();
            System.out.print("Enter Num 2 :");
            num2 = scan.nextInt();
            System.out.print("Enter Num 3 :");
            num3 = scan.nextInt();
            
            
            
            
            
            if( num3 > num1 && num3 > num2)
        {
            for (int i = 0; i < 10; i++) {
                arr[i] = num3*(i+1);
                
                
            }
            
            for (int i = 0; i < 10; i++) {
                if ((arr[i] % num1 == 0) && (arr[i] % num2 == 0)) {
                    ans = arr[i];
                    break;
                }
                
                
            }
            System.out.printf("The Answer of LCM is %d From (%d,%d,%d) ",ans,num1,num2,num3);
            
        }
            else if(num2 > num1 && num2 > num3)
        {
            for (int i = 0; i < 10; i++) {
                arr[i] = num2*(i+1);
                
                
            }
            
            for (int i = 0; i < 10; i++) {
                if ((arr[i] % num1 == 0) && (arr[i] % num3 == 0)) {
                    ans = arr[i];
                    break;
                }
                
                
            }
            System.out.printf("The Answer of LCM is %d From (%d,%d,%d) ",ans,num1,num2,num3);
        }
        else
            {
                 for (int i = 0; i < 10; i++) 
                 {
                        arr[i] = num1*(i+1);
                 }
            
                    for (int i = 0; i < 10; i++) {
                        if ((arr[i] % num2 == 0) && (arr[i] % num3 == 0)) {
                            ans = arr[i];
                            break;
                        }


                    }
                    System.out.printf("The Answer of LCM is %d From (%d,%d,%d) ",ans,num1,num2,num3);
            }
        
            
        }
        else
        {
            System.out.println("Wrong Choice...!");
        }
                
       
    }
    
}
