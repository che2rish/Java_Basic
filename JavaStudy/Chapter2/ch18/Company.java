package ch18;

// 싱글톤패턴 -> 유일한 객체를 제공할 때 사용
public class Company {

    // 유일한 인스턴스
    private static Company instance = new Company();

    // 외부에서 Company를 마음대로 new 할 수 X
    private Company(){
    }

    // 유일한 인스턴스 접근 (public) , 외부에서 class이름으로 호출해서 사용 가능 (static)
    public static Company getInstance(){
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }
}
