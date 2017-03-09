public class AddressBook {

    public static void main(String [] strArgs) {
        Person objPersonOne = new Person();
        System.out.println(objPersonOne.getName());
        objPersonOne.setFirstName("Anthony");
        objPersonOne.setMiddleName("Leon");
        objPersonOne.setLastName("Jackson");
        System.out.println(objPersonOne.getName());
        objPersonOne.setBirthDay(29);
        objPersonOne.setBirthMonth(11);
        objPersonOne.setBirthYear(1993);
        System.out.println(objPersonOne.getBirthDate());
        objPersonOne.setGender('M');
        objPersonOne.setHeight(74);
        objPersonOne.setWeight(278);
        System.out.println(objPersonOne.getGHW());

        objPersonOne.setBirthDate(29, 11, 1993)
        System.out.println(objPersonOne.getBirthDate());
        objPersonOne.setGHW('M', 74, 278);
        System.out.println(objPersonOne.getGHW());
    }
}