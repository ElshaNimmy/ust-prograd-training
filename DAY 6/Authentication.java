public class ValidUsernameException extends Exception {
    int usernameCondition = 0;
    public ValidUsernameException(int invalidUserName){
        super("Invalid Username: ");
        usernameCondition = invalidUserName;
    }
    public String printMessage(){
        switch(usernameCondition){
            case 1: return ("A username must be of length 6-15 characters");

            case 2: return ("A username must start with an uppercase English alphabet A to Z");

            case 3: return ("There cannot be any types of parentheses or whitespaces in a valid username");

            default: return ("No Exception");
        }

    }
}

class UsernameValidator {
    public void isValid(String username) throws ValidUsernameException {
        if (username.length()<6 || username.length()>15 ){
            throw new ValidUsernameException(1);
        }
        if (username.contains(" ") || username.contains("{") || username.contains("}") || username.contains("(") || username.contains(")") || username.contains("[") || username.contains("]") ){
            throw new ValidUsernameException(3);
        }
        if (username.charAt(0) > 'a' && username.charAt(0)<'z'){
            throw new ValidUsernameException(2);
        }
    }
}
public class ValidPasswordException extends  Exception{
    int passwordCondition = 0;
    public ValidPasswordException (int invalidPassword){
        super("Invalid Password");
        passwordCondition = invalidPassword;
    }
    public String printMessagePassword(){
        switch (passwordCondition){
            case 1: return ("A password must not be shorter than 8 characters but must not exceed 256");

            case 2: return ("There cannot be any types of parentheses or whitespaces in a valid Password");

            case 3: return ("A password cannot contain or be the same as its associated username");

            default: return ("No Exception");
        }
    }
}
class PasswordValidator{
    public void isValidPassword(String password, String name) throws ValidPasswordException{
        if(password.length()<8 || password.length()>256){
            throw new ValidPasswordException(1);
        }
        if (password.contains(" ") || password.contains("{") || password.contains("}") || password.contains("(") || password.contains(")") || password.contains("[") || password.contains("]") ){
            throw new ValidPasswordException(2);
        }
        if (password.equals(name)){
            throw new ValidPasswordException(3);
        }
    }
}
import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        UsernameValidator usernameValidator = new UsernameValidator();
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            usernameValidator.isValid(username);
            passwordValidator.isValidPassword(password,username);

        }catch (ValidUsernameException vn){
            System.out.println(vn.printMessage());
        } catch (ValidPasswordException vpe){
            System.out.println(vpe.printMessagePassword());
        }

    }
}
