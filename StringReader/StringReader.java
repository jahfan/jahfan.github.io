//
// Name: Anthony Jackson
// Class: ITSE 1302
// Program: Exercise 14
// Description: Program with functions for recieving a string, returning a string and counting the vowels in a string.
//

public class StringReader {

    //String the hold String recieved from Driver class.
    String strWord;
    // Testing int int blah;

    //Function that recieves and stores a String from the Driver class
    public void setWord(String pstrWord) {
        strWord = pstrWord;
    }

    //Function that returns a string to the Driver class.
    public String getWord() {
        return this.strWord;
    }

    //Function that counts the vowels in a string and outputs the results to the driver class
    public void countVowels() {
        
        //Initializes the variables needed to run the function.
        int intCount = 0;
        int intA = 0;
        int intE = 0;
        int intI = 0;
        int intO = 0;
        int intU = 0;
        int intNonVowel = 0;
        

        /*
        do {
            switch{
                case A
                    ACount +1
                case E
                    ECount +1
                case I
                    ICount +1
                case O
                    OCount +1
                case U
                    UCount +1
            }
            intCount++;
        } while(Counter < string length)
        */
        do {
            switch(strWord.charAt(intCount)) {
                case 'a': case 'A':
                    intA += 1;
                    break;
                case 'e': case 'E':
                    intE += 1;
                    break;
                case 'i': case 'I':
                    intI +=1;
                    break;
                case 'o': case 'O':
                    intO += 1;
                    break;
                case 'u': case 'U' :
                    intU += 1;
                    break;
                default:
                    intNonVowel += 1;
                    break;
            }
            intCount++;
        } while(intCount < this.strWord.length());

        //Outputs the word and then the results of the vowel count.
        System.out.println("Your word was " + strWord);
        System.out.println("There were " + intNonVowel + " non-vowels in your word. Your word had " 
                           + intA + " A(s)," + intE + " E(s)," + intI + " I(s)," + intO + " O(s), and " + intU + " U(s)."); 
    }
}