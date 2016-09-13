
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    //
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private int height;
    private int weight;
    private int firstDigitSSN;
    private int secondDigitSSN;
    private int thirdDigitSSN;
    private String address;
    private int myDOB;// 05/03/1996
    
    public PersonCreator(String myFirstName, String myLastName)
    {
        firstName = myFirstName;
        lastName = myLastName;
} 

public void setAge(int myAge)
{
    age=myAge;
}

public void setSex(String gender)
{
    sex=gender;
}

public void setHeight(int inches)
{
    height=inches;
}

public void setWeight(int lbs)
{
    weight=lbs;
}




public void setSSN(int firstThreeDigits, int secondThreeDigits, int thirdFourDigits)
{
    
    
}

public void setAddress(String street)
{
   address=street;
}

public void setDOB(int DOB)
{
    DOB=myDOB;
}



public void PersonCreator()
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