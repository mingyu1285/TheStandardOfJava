package ClassAndObject;

/**
 * p.235
 * 예제 6-1/ch6/ClassAndObject.TvTest.java
 * 인스턴스의 생성과 사용
 * 이 예제는 ClassAndObject.Tv 클래스로부터 인스턴스를 생성하고 인스턴스의 속성(channel)과 메서드를 사용하는 방법을 보여준 것이다.
 */
public class TvTest{
    public static void main(String[] args) {
        Tv t; //Tv인스턴스를 참조하기 위한 변수 t를 선언
        // 메모리에 참조변수 t를 위한 공간이 마련된다. 아직 인스턴스가 생성되지 않았으므로 참조변수로 아무 것도 할 수 없다.
        t = new Tv(); //Tv인스턴스 생성
        // 연산자 new에 의해 Tv클래스의 인스턴스가 메모리의 빈 공간에 생성된다. 주소가 0x100인 곳에 생성되었다고 가정하자.
        // 이 때, 멤버변수는 각 자료형에 해당하는 기본 값으로 초기화된다.
        // color는 null로 power는 false로 channel은 0으로 초기화된다.
        t.channel = 7; //ClassAndObject.Tv 인스턴스의 멤버변수 channel 값을 7로 설정
        t.channelDown(); //Tv인스턴스의 메서드 channelDown()을 호출
        System.out.println("현재 채널은 "+ t.channel + "입니다.");
    }
}

/**
 * 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야 한다.
 */

class Tv {
    //Tv의 속성(멤버변수)
    String color; // 색상
    boolean power; // 전원상태(on/off)
    int channel; // 채널

    //Tv의 기능 (메서드)
    void power() { power = !power; } //TV를 켜거나 끄는 기능을 하는 메서드
    void channelUp() { channel++; } //TV 채널 높이는 기능
    void channelDown() { channel--; } //TV 채널 낮추는 기능
}

