package ClassAndObject;


/**
 * JVM 메모리 구조에 대해서 알아보자.
 *
 * CallStack
 * 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다.
 * 메서드가 수행을 마치고나면 사용했던 메모리를 반환하고 스택에서 제거된다.
 * 호출스택의 제일 위에 있는 메서드가 현재 실행되고 있는 메서등리다.
 * 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.
 */
public class CallStackTest {
    public static void main(String[] args) {
        //main()이 firstMethod()를 호출하고 firstMethod()는 secondMethod()를 호출한다. 객체를 생성하지 않고도 메서드를 호출할 수 있으려면, 메서드 앞에 'static'을 붙여야 한다.
        firstMethod();
    }




    static void firstMethod(){
        secondMethod();
    }

    static void secondMethod(){
        System.out.println("secondMethod()");
    }


}
