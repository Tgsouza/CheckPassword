
package checkpassword;

import java.util.Scanner;

/**
 *
 * @author tgome
 */
public class CheckPassword {

    /**
     * @param args the command line arguments
     */
    
    //Define the minimun length for the password
    public static int length = 10;
    
    /*
    * Validate the password
    *Boolean because is going to check if is true or false (valid or not)
    */
    public static boolean password_isValid(String password)
    {
        if(password.length()<length)
        {
            return false;
        }
        
        //create local variables 
        int digit_length = 0, letter_length =0;
        
        //check the lenght of the password with the variables
        for(int i=0;i< password.length(); i++)
        {
            char ch = password.charAt(i);
            
            if(char_isNumber(ch))
            {
                digit_length++;
            }
            else if(char_isLetter(ch))
            {
                letter_length++;
            }
            else{
                return false;
            }
        }
        return(digit_length>=2 && letter_length >=2);
    }
    
    /*
    Check if the character is letter
    */
    public static boolean char_isLetter(char ch)
    {
        ch = Character.toUpperCase(ch);
        
        return (ch>='A' && ch<='Z');
    }
    
     /*
    Check if the character is number
    */
    public static boolean char_isNumber(char ch)
    {
        return (ch>='0' && ch<='9');
    }
    
    public static void main(String[] args) {
        
        //print the rules on the console 
        System.out.println("Rules of Password\n"
                + "1.A password must have at least ten characters\n"
                + "2.A password must contain at least two digits\n"
                + "3. A password must contain only letters\n\n"
                + "Enter password: ");
        
        Scanner pass = new Scanner(System.in);
        String password = pass.nextLine();
        
        //Check if the password is correct
        if(password_isValid(password))
        {
            System.out.println("Youre password is strong");
            
        }else
        {
            System.out.println("Youre password is weak");
        }
    }
    
}
