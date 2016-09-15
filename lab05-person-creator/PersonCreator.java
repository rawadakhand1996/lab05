
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    //
    private String firstName;// first name---Rawad
    private String lastName;// last name--- Akhand
    private int age;//---- 20
    private String sex;//--- male
    private int height;//--69
    private int weight;//--176
    private int firstDigitSSN;//-- 123
    private int secondDigitSSN;//--12
    private int thirdDigitSSN;//--1234
    private String address;//-- 6063 Cedar Swamp Rd. Glen Head NY11545
    private int myDOB;// 05/03/1996
    
    public PersonCreator(String myFirstName, String myLastName)
    {
        firstName = myFirstName;// sets first name
        lastName = myLastName;// sets last name
} 

public void setAge(int myAge)
{
    age=myAge;// sets age
}

public void setSex(String gender)
{
    sex=gender;// sets gender
}

public void setHeight(int inches)
{
    height=inches;// sets height
}

public void setWeight(int lbs)
{
    weight=lbs;// sets weight
}




public void setSSN(int firstThreeDigits, int secondThreeDigits, int thirdFourDigits)
{
    //sets the SSN in the correct format
    
}

public void setAddress(String street)
{
   address=street; // sets street address according to the user's will
}

public void setDOB(int DOB)
{
    DOB=myDOB; // sets date of birth
}



public void PersonCreator()// prints out all the information
{
    System.out.println("Name: " + firstName +" " + lastName);
    System.out.println("Age: " + age);
    System.out.println("Sex: " + sex);
    System.out.println("Height:" + height);
    System.out.println("Weight: " + weight + " lbs ");
    System.out.println("SSN: " + firstDigitSSN + "-" + secondDigitSSN + "-" + thirdDigitSSN);
    System.out.println("address: " +address);

}
    }