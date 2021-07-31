package hello.core.singleton;

public class SingletonService {

    //1. 자기 자신을 static영역으로 가지면 객체가 하나만 존재한다.
    private static final SingletonService instance = new SingletonService();

    //2. public 으로 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회되도록 한다.
    public static SingletonService getInstance() {
        return instance;
    }

    //3. 외부에서 new 연산자로 객체 생성하는 것을 막는다.
    private SingletonService(){}

    public void logic () {
        System.out.println("싱글톤 객체 호출");
    }

}
