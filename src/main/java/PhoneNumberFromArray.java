import java.util.Arrays;

public class PhoneNumberFromArray {

    public static String createPhoneNumber(int[] numbers) {
        return "("
                 + numbers[0]
                 + numbers[1]
                 + numbers[2]
                 + ") "
                 + numbers[3]
                 + numbers[4]
                 + numbers[5]
                 + "-"
                 + numbers[6]
                 + numbers[7]
                 + numbers[8]
                 + numbers[9];
    }

    public static String createPhoneNumberRegEx(int[] numbers) {
        String numberStr = Arrays.toString(numbers);
        System.out.println(numberStr);


        numberStr.replaceAll("[, \\[\\]]", "");
        System.out.println(numberStr);


        return "";
    }



}
