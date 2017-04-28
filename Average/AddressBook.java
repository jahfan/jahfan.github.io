//
// Name: Anthony Jackson
// Date Last Editied: 3/9/17
// Description: Practice using a driver class to access getter and setter functions in a different class.
//


public class AddressBook {

    public static void main(String [] strArgs) {
        //testing by calling the smaller functions and then outputting with the larger functions.
        Person objPersonOne = new Person();
        System.out.println(objPersonOne.getName());
        //changed to my own name for testing.
        objPersonOne.setFirstName("Anthony");
        objPersonOne.setMiddleName("Leon");
        objPersonOne.setLastName("Jackson");
        System.out.println(objPersonOne.getName());
        //setting the birth: day, month and year.
        objPersonOne.setBirthDay(29);
        objPersonOne.setBirthMonth(11);
        objPersonOne.setBirthYear(1993);
        //using the birthdate function to output the birth: day, month and year all at once.
        System.out.println(objPersonOne.getBirthDate());
        //setting gender height and weight using the set functions in the Person.java class
        objPersonOne.setGender('M');
        objPersonOne.setHeight(74);
        objPersonOne.setWeight(278);
        // GHW -> gender/height/weight
        // using the GHW function to expedite the outputing of gender height and weight 
        System.out.println(objPersonOne.getGHW());


        //testing using the larger functions on their own.
        objPersonOne.setName("Anthony", "Leon", "Jackson Sr.");
        System.out.println(objPersonOne.getName());
        objPersonOne.setBirthDate(7, 3, 1966);
        System.out.println(objPersonOne.getBirthDate());
        objPersonOne.setGHW('M', 70, 225);
        System.out.println(objPersonOne.getGHW());
    }
}