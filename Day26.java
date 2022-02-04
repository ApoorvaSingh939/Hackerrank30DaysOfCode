import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int returned_date = sc.nextInt();
        int returned_month = sc.nextInt();
        int returned_year = sc.nextInt();
        
        
        int due_date = sc.nextInt();
        int due_month = sc.nextInt();
        int due_year = sc.nextInt();
        
        int fine = 0;
       
        if(returned_year < due_year){
            fine = 0;
        }
        else{
            if(returned_year > due_year ){
                fine = 10000;
            }
            else if(returned_month > due_month){
                fine = 500*(returned_month - due_month);
            }
            
            else if(returned_date > due_date){
                fine = 15*(returned_date - due_date);
            }
        }
        
        System.out.println(fine);
    }
}
