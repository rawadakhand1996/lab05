
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
    private String SSN;//152-22-1564
    private String address;//-- 6063 Cedar Swamp Rd. Glen Head NY11545
    private int myDOB;// 05/03/1996
    private String phoneNumber;
    
    /* 
     Description: Constructor
     Input: first and last name
     Output:no output
     Example:-----
     */
public PersonCreator(String myFirstName, String myLastName)
    {
        firstName = myFirstName;// sets first name
        lastName = myLastName;// sets last name
        phoneNumber ="000-000-0000";
        SSN="000-00-0000";
} 

/*
 Description: sets age
 Input: the person's age
 Output: age
 Example: 20
 
 */public void setAge(int myAge)
{
    age=myAge;
}

/*
 Description: sets gender
 Input: user's gender
 Output: purpose is set to whatever the user identifies 
 Example: male
 */public void setSex(String gender)
{
    sex=gender;// sets gender
}

/*
 Description: sets height
 Input: user's height
 Output: whatever height was given
 Example: 69
 */public void setHeight(int inches)
{
    height=inches;// sets height
}

/*
 Description: sets the weight of the user
 Input: user's weight
 Output: the weight
 Example:174
 */public void setWeight(int lbs)
{
    weight=lbs;// sets weight
}

/*
 Description: changes the phone number
 Input: users input their numbers and area code in format
 Output:Only outputs if error but purpose is to change to phone number from 000-00-000 to something the user wants
 Example: 609-123-1155
 */public void changeNumber(int areaCode, int numBegin, int numEnd)
{
    //if areaCode is bad, tell user to input something else,
    if(areaCode < 100 ||areaCode > 999){
        System.err.println("Print use a valid number,");
    } else if (numBegin < 100 || numBegin> 999){
        System.err.println("Please use a valid number.");
    } else if (numEnd < 1000 || numEnd > 9999){
        System.err.println("Please use a valid number.");
    } else {// ifnot (areaCode < 100 || areaCode > 999) is not true,do
        phoneNumber = areaCode + "-" + numBegin + "-" + numEnd;
    }
    // Once an if statement is true, the program with do it is told// and then skip to here.
}




/*
 * 
 */public void setSSN(int firstThreeDigits, int secondThreeDigits, int thirdFourDigits)
{
     //if areaCode is bad, tell user to input something else,
    if(firstThreeDigits < 100 ||firstThreeDigits > 999){
        System.err.println("Print use a valid number,");
    } else if (secondThreeDigits < 10 || secondThreeDigits> 99){
        System.err.println("Please use a valid number.");
    } else if (thirdFourDigits< 1000 ||thirdFourDigits > 9999){
        System.err.println("Please use a valid number.");
    } else {// ifnot (areaCode < 100 || areaCode > 999) is not true,do
        SSN = firstThreeDigits + "-" + secondThreeDigits + "-" + thirdFourDigits;
    }
    // Once an if statement is true, the program with do it is told// and then skip to here.
    
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
    System.out.println("SSN: " + SSN);
    System.out.println("address: " +address);

}
    }