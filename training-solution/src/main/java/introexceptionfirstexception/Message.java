package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {
    private StringBuilder st = new StringBuilder("Az üzenet: ");

    public void stringToNumber (List<String> code) {
        for (String s: code) {
            int num = Integer.parseInt(s);
            st.append(num);
        }

        System.out.println(st);

    }

    public static void main(String[] args) {

        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122",  "110", "101", "116", "46", "1O1");
        Message message = new Message();
        message.stringToNumber(codedMessage);
        message.stringToNumber(anotherCodedMessage);

    }
}
