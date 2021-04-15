package userregistration;
import java.util.Scanner;
import java.util.regex.*;

public class UserRegist {
    //@Description User Registration System needs to ensure all validations are in place during the User Entry

    public static void validateFirstName()
    {

        System.out.println("*******FIRST NAME*******\n * First Name should start with a capital lettler \n * First Name should have minimum 3 characters \n");
        System.out.println("Enter a valid First Name :");

        Scanner sc = new Scanner(System.in);
        String firstName=sc.nextLine();
        String regexfirstName = "[A-Z]{1}[a-z]{2,}";
        boolean firstNameValidator = firstName.matches(regexfirstName);
        if(firstNameValidator)
        {
            System.out.println(firstName+" is a valid First Name");
        }
        else
        {
            System.out.println(firstName+" is not a valid First Name");
            validateFirstName();
        }


    }
    public static void validateLastName()
    {
        System.out.println("*******LAST NAME*******\n * Last Name should start with a capital lettler \n * Last Name should have minimum 3 characters \n");
        System.out.println("Enter a valid Last Name :");

        Scanner sc = new Scanner(System.in);
        String lastName=sc.nextLine();
        String regexlastName = "[A-Z]{1}[a-z]{2,}";
        boolean lastNameValidator = lastName.matches(regexlastName);
        if(lastNameValidator)
        {
            System.out.println(lastName+" is a valid Last Name");
        }
        else
        {
            System.out.println(lastName+" is not a valid Last Name");
            validateLastName();
        }
    }
    public static void validateEmail() {
        System.out.println("*******EMAIL ID *******\n Email has 3 mandatory parts (abc, bl\r\n precise @ and . positions )\n");
        System.out.println("Enter a valid EMAIL-ID :");

        Scanner sc = new Scanner(System.in);
        String emailID=sc.nextLine();
        String regexemailId = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

        boolean emailIdValidator = emailID.matches(regexemailId);
        if(emailIdValidator)
        {
            System.out.println(emailID+" is a valid Email Id");
        }
        else
        {
            System.out.println(emailID+" is not a valid Email Id");
            validateEmail();
        }
    }
    public static void mobilevalidation()
    {
        System.out.println("*******MOBILE NUMBER*******\n * Mobile Format - Country code follow by space and 10 digit number\n");
        System.out.println("Enter a valid MOBILE NUMBER :");

        Scanner sc = new Scanner(System.in);
        String mobile=sc.nextLine();
        String regexmobile = "[9]{1}[1]{1}[0-9]{10}";
        boolean mobileValidator = mobile.matches(regexmobile);
        if(mobileValidator)
        {
            System.out.println(mobile+" is a valid Mobile Number");
        }
        else
        {
            System.out.println(mobile+" is not a valid Mobile Number");
            mobilevalidation();
        }
    }
    public static void passwordValidation()
    {
        System.out.println("*******PASSWORD*******\n RULE-1 : Minimum 8 Characters \n RULE-2 : Should have at least Upper Case \n RULE-3 : Should have at least 1 numeric number in the password  the password \n RULE-4 : Has exactly 1 Special Character\n" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid Password : ");
        String password = sc.nextLine();
        String regexPassword = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z0-9$&+,:;=?@#|'<>.^*()%!-]{8,}$";
        boolean passwordValidator = password.matches(regexPassword);
        if(passwordValidator)
        {
            System.out.println(password+" is a valid Password \n*****ALL RULES ARE PASSED*****\n");
        }
        else
        {
            System.out.println(password+" is not a valid Password");
            passwordValidation();
        }
    }
    public static void validateEmailSamples()
    {
        System.out.println("Enter a valid EMAIL-ID :");
        Scanner sc = new Scanner(System.in);
        String emailID=sc.nextLine();
        String regexemailId = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+){2,}$";

        boolean emailIdValidator = emailID.matches(regexemailId);
        if(emailIdValidator)
        {
            System.out.println(emailID+" is a valid Email Id");
        }
        else
        {
            System.out.println(emailID+" is not a valid Email Id");
            validateEmailSamples();
        }
    }


    public static void main(String args[]) {
        System.out.println("WELCOME TO USER REGISTRATION VALIDATION");
        UserRegistration userreg = new UserRegistration();
        userreg.validateFirstName();
        userreg.validateLastName();
        userreg.validateEmail();
        mobilevalidation();
        passwordValidation();
        validateEmailSamples();


    }
}