//
// Name: Anthony Jackson
// Course: COSC 1336
// Date Last Edited: 3/14/17
// Assignment: Exercise 12
// Description: A program that contains instance data for the title, author, publisher, and copyright date. 
//              Defines the Book constructor to accept and initialize this data. Includes setter and getter 
//              methods for all instance data. Includes a toString method that returns a nicely formatted, multi-line description of the book.
//

public class Book {

    private String strTitle = "no title";
    private String strAuthor = "not available";
    private String strPublisher = "not published";
    private int intCopyright = 0;
    
    public void setTitle(String pstrTitle) {
        this.strTitle = pstrTitle;
    }

    public String getTitle() {
        return this.strTitle;
    }


    public void setAuthor(String pstrAuthor) {
        strAuthor = pstrAuthor;
    }

    public String getAuthor() {
        return this.strAuthor;
    }


    public void setPublisher(String pstrPublisher) {
        this.strPublisher = pstrPublisher;
    }

    public String getPublisher() {
        return this.strPublisher;
    }


    public void setCopyright(int pintCopyright) {
        this.intCopyright = pintCopyright;
    }

    public int getCopyright() {
        return this.intCopyright;
    }

    public String toString() {
        return "Title: " + this.strTitle + "\nAuthor: " + this.strAuthor + "\nPublisher: " + this.strPublisher + "\nCopyright Date: " + this.intCopyright;
    }

    
}