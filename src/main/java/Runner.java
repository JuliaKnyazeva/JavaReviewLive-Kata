public class Runner {

    public static void main(String[] args) {
        Person person = new Person("Alex", "alex@mail.ru", "123-456-789");

        if(person.isFirstNameValid()) {
            System.out.println("First name is valid!");
        } else {
            System.out.println("First name is not valid!");
        }

        if(person.isEmailValid()) {
            System.out.println("First email is valid!");
        } else {
            System.out.println("First email is not valid!");
        }






    }


}
