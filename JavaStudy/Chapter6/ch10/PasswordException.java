package ch10;

// 패스워드에 대한 예외 처리 하기
public class PasswordException extends IllegalArgumentException{

    public PasswordException(String message){
        super(message);
    }

}
