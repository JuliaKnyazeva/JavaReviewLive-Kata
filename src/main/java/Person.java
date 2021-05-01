public class Person {

    private String firstName;
    private String email;
    private String phoneNumber;

    public Person(String firstName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public boolean isEmailValid() {
        return true;
    }


    public boolean isFirstNameValid() {
        return firstName.matches("^[A-Za-z]+$");
    }

    public boolean isEMailValid() {
        return email.matches("[\\w]+.[a-z]{2,}");
    }


}
