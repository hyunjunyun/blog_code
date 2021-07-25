package optional;

import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {

        OptionalPractice op = new OptionalPractice();
        Optional<String> optional = Optional.ofNullable(op.getText());
        String s = optional.orElseGet(() -> {
            return "안녕하세요";
        });

        System.out.println(s);
    }

    public String getText() {
        return null;
    }
}
