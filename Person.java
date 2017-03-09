public class Person {
    private String strFirstName = "";
    private String strLastName = "";
    private String strMiddleName = "";
    private int intBirthYear = 1993;
    private int intBirthMonth = 11;
    private int intBirthDay = 29;
    private char chrGender = ' ';
    private int intHeightIN = 74;
    private int intWeightLBS =275;

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

    public void setBirthYear(int pintBirthYear) {
        this.intBirthYear = pintBirthYear;
    }

    public int getBirthYear() {
        return this.intBirthYear;
    }

    public void setBirthMonth(int pintBirthMonth) {
        this.intBirthMonth = pintBirthMonth;
    }

    public int getBirthMonth() {
        return this.intBirthMonth;
    }

    public void setBirthDay(int pintBirthDay) {
        this.intBirthDay = pintBirthDay;
    }

    public int getBirthDay() {
        return this.intBirthDay;
        
    }

    public int setBirthDate(int pintBirthDay,
                            int pintBirthMonth,
                            int pintBirthYear) {
        this.setBirthDay(pintBirthDay);
        this.setBirthMonth(pintBirthMonth);
        this.setBirthYear(pintBirthYear);                    
    }
    
}