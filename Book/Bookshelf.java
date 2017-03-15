//
// Name: Anthony Jackson
// Course: COSC 1336
// Date Last Edited: 3/14/17
// Assignment: Exercise 12
// Description: Driver class called Bookshelf, whose main method instantiates and updates several Book objects.
//

public class Bookshelf {

    public static void main (String [] strArgs) {
        
        //Instances the first book object
        Book objBook = new Book();
        //Calls book.java setTitle function and changes strTitle to the string in the parenthesis.
        objBook.setTitle("The Rise of Tiamat");
        //Calls book.java setAuthor function and changes strAuthor to the string in the parenthesis.
        objBook.setAuthor("Steve Winter and Alexander Winter");
        //Calls book.java setPublisher function and changes strPublisher to the string in the parenthesis.
        objBook.setPublisher("Wizards of the Coast LLC");
        //Calls book.java setCopyright function and changes strTitle to the integer in the parenthesis.
        objBook.setCopyright(2014);
        //Outputs the toString function of book.java which outputs the results of the get Title/Author/Publisher/Copyright functions.
        System.out.println(objBook.toString());
        //Space for formatting
        System.out.println(" ");

        //repeats the same steps in the comments of the first Book instance for the remaining Book instances.
        
        //Instances a second book object
        Book objBookTwo = new Book();
        objBookTwo.setTitle("Cold Days");
        objBookTwo.setAuthor("Jim Butcher");
        objBookTwo.setPublisher("ROC");
        objBookTwo.setCopyright(2012);
        System.out.println(objBookTwo.toString());
        System.out.println(" ");

        //Instances a third book object
        Book objBookThree = new Book();
        objBookThree.setTitle("Clockwork Angel");
        objBookThree.setAuthor("Cassandra Clare");
        objBookThree.setPublisher("Margaret K. McElderry Books");
        objBookThree.setCopyright(2010);
        System.out.println(objBookThree.toString());
        System.out.println(" ");

        //Instances a fourth book object
        Book objBookFour = new Book();
        objBookFour.setTitle("Violence 101");
        objBookFour.setAuthor("Dennis Wright");
        objBookFour.setPublisher("G. P. Putnam's Sons");
        objBookFour.setCopyright(2010);
        System.out.println(objBookFour.toString());
        System.out.println(" ");
    }
}