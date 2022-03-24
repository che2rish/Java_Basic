package chapter08;

public class UnsupportedFunctionException extends RuntimeException{

    final private int ERR_CODE;

    UnsupportedFunctionException(String msg, int errCode){
        super(msg); // 조상의 생성자 RuntimeException (String msg)를 호출
        ERR_CODE = errCode;
    }

    UnsupportedFunctionException(String msg){
        this(msg,100); // ERR_CODE를 100(기본값)으로 초기화한다.
    }

    public int getErrorCode(){
        return ERR_CODE;
    }

    public String getMessage(){
        return "[" + getErrorCode() + "]" + super.getMessage() ;
    }
}
