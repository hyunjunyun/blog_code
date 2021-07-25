package optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        OptionalExample ope = new OptionalExample();
        UserDTO userDto = new UserDTO();


        // set을 안한 상태
        userDto.setUserName("윤현준");
        userDto.setPhoneNumber("010-1234-5678");

        Optional<String> userName = Optional.ofNullable(userDto.getUserName());
        System.out.println(userName.orElse("The value is empty."));


        // 번외 처리
        Optional<String> result = ope.getUserName("윤현준");
        System.out.println(result.get());


        // 위의 코드가 이렇게 해야했었음

        try {
            String user = userDto.getUserName();
            System.out.println("저장된 회원의 이름 : " + user);
        } catch (Exception e) { // 강제로 에러를 내는 것은 비효율적
            System.out.println("입력된 값이 없습니다.");
        }

        // 또는
        String user = userDto.getUserName();
        if (user != null) {
            System.out.println("저장된 회원의 이름 : " + user);
        } else {
            System.out.println("입력된 값이 없습니다.");
        }// 매 순간마다 if 처리는 가독성 효율성이 매우 떨어진다

        //https://mangkyu.tistory.com/70 참고 블로그
    }

    public Optional<String> getUserName(String name) {
        return Optional.ofNullable(name)
                .filter(n -> n.equals("윤현준"));
    }
}

@FunctionalInterface
interface CheckName {
    public abstract String getName();
}

class UserDTO {
    private String userName;
    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userNo) {
        this.userName = userName;
    }
}
