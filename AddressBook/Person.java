public class Person {
    private String strFirstName = "";
    private String strLastName = "";
    private String strMiddleName = "";
    private int intBirthYear = 0;
    private int intBirthMonth = 0;
    private int intBirthDay = 0;
    private char chrGender = ' ';
    private int intHeightIN = 0;
    private int intWeightLBS =0;

    public void setFirstName(String pstrFirstName) {
        this.strFirstName = pstrFirstName;
    }
    public String getFirstName() {
        return this.strFirstName;
    }

    public void setLastName(String pstrLastName) {
        this.strLastName = pstrLastName;
    }
    public String getLastName() {
        return this.strLastName;
    }

    public void setMiddleName(String pstrMiddleName) {
        this.strMiddleName = pstrMiddleName;
    }
    public String getMiddleName() {
        return this.strMiddleName;
    }

    public void setName(String pstrFirstName, 
                        String pstrMiddleName,
                        String pstrLastName) {
        this.setFirstName(pstrFirstName);
        this.setMiddleName(pstrMiddleName);
        this.setLastName(pstrLastName);
    }

    public String getName() {
        return this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
    }

    //sets the Birth Year to whatever pintBirthYear is.
    public void setBirthYear(int pintBirthYear) {
        this.intBirthYear = pintBirthYear;
    }

    //returns the BirthYear.
    public int getBirthYear() {
        return this.intBirthYear;
    }

    //sets the intBirthMonth to whatever pintBirthMonth is.
    public void setBirthMonth(int pintBirthMonth) {
        this.intBirthMonth = pintBirthMonth;
    }

    //returns intBirthMonth when called
    public int getBirthMonth() {
        return this.intBirthMonth;
    }

    //sets intBirthDay to pintBirthDay when called
    public void setBirthDay(int pintBirthDay) {
        this.intBirthDay = pintBirthDay;
    }

    //returns intBirthDay when called
    public int getBirthDay() {
        return this.intBirthDay;
        
    }

    //sets Birth day, birth month and birth year when called
    public void setBirthDate(int pintBirthDay,
                            int pintBirthMonth,
                            int pintBirthYear) {
        this.setBirthDay(pintBirthDay);
        this.setBirthMonth(pintBirthMonth);
        this.setBirthYear(pintBirthYear);                    
    }

    //returns Birth day, birth month and birth year when called
    public String getBirthDate() {
        return this.getBirthDay() + "/" + this.getBirthMonth() + "/" + this.getBirthYear();                  
    }
    
    //sets chrGender to pchrGender when called
    public void setGender(char pchrGender) {
        this.chrGender = pchrGender;
    }

    //returns chrGender when called
    public char getGender() {
        return this.chrGender;
    }

    //sets intHeightINS to pintHeightINS when called
    public void setHeight(int pintHeightIN) {
        this.intHeightIN = pintHeightIN;
    }

    //returns intHeightINS when called
    public int getHeight() {
        return this.intHeightIN;
    }

    //sets intWeightLBS to pintweightLBS when called
    public void setWeight(int pintWeightLBS) {
        this.intWeightLBS = pintWeightLBS;
    }

    //returns intWeightLBS when called
    public int getWeight() {
        return this.intWeightLBS;
    }

    //sets the gender height and weight when called.
    public void setGHW(char pchrGender,
                       int pintHeightIN,
                       int pintWeightLBS) {
        this.setGender(pchrGender);
        this.setHeight(pintHeightIN);
        this.setWeight(pintWeightLBS);
    }

    //returns gender, height and weight when called
    public String getGHW() {
        return "Gender: " + getGender() + ", Height: " + getHeight() + "in, Weight: " + getWeight() + "lbs.";
    }
}