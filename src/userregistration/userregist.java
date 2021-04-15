package userregistration;
        import java.util.Scanner;
        import java.util.regex.*;

//@Description User Registration System needs to ensure all validations are in place during the User Entry

public class Userregist{
    private static String firstName;
    private static String lastName;
    Scanner sc=new Scanner(System.in);

    //Method to get First Name
    public String getFirstName()
    {
        System.out.println("*******FIRST NAME*******\n * First Name should start with a capital lettler \n * First Name should have minimum 3 characters \n");
        System.out.println("Enter a valid First Name :");
        String fname=sc.nextLine();
        return fname;
    }
    //Method to get Last Name
    public String getLastName()
    {
        System.out.println("*******LAST NAME*******\n * Last Name should start with a capital lettler \n * Last Name should have minimum 3 characters \n");
        System.out.println("Enter a valid Last Name :");
        String lname=sc.nextLine();
        return lname;
    }

    //Method to check whether First name is valid
    public void validateFirstName(String name) {
        String regexfirstName = "[A-Z]{1}[a-z]{2,}";
        boolean firstNameValidator = name.matches(regexfirstName);
        if(firstNameValidator)
        {
            System.out.println(name+" is a valid First Name");
        }
        else
        {
            System.out.println(name+" is not a valid First Name");
        }
    }
    //Method to check whether Last name is valid
    public void validateLastName(String name) {
        String regexlastName = "[A-Z]{1}[a-z]{2,}";
        boolean lastNameValidator = name.matches(regexlastName);
        if(lastNameValidator)
        {
            System.out.println(name+" is a valid Last Name");
        }
        else
        {
            System.out.println(name+" is not a valid Last Name");
        }
    }


    public static void main(String[] args) {
        UserRegistration usereg=new UserRegistration();
        firstName=usereg.getFirstName();
        usereg.validateFirstName(firstName);
        lastName=usereg.getLastName();
        usereg.validateLastName(lastName);
    }

}