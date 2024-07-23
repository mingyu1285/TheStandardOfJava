package ClassAndObject;

/**
 * p.247
 * 클래스변수와 인스턴스변수
 * 둘의 차이를 이해하기 위해서 카드로 예시를 들어보자.
 *
 * 카트 클래스를 작성하기 위해서는 먼저 카드를 분석해서 속성과 기능을 알아야한다.
 * 속성으로는 카드의 무늬, 숫자, 폭, 높이 정도를 생각할 수 있을 것이다.
 *
 * 이 중에서 어떤 속성을 클래스 변수로 선언할 것이며, 또 어떤 속성들을 인스턴스변수로 선언할 것인지 생각해보자.
 */


class CardTest{
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width); // 현재 100
        System.out.println("Card.width = " + Card.height); // 현재 250

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 "+ c1.kind + "," + c1.number);
        System.out.println("c2은 "+ c2.kind + "," + c2.number);

        System.out.println("c1의 width와 height 값을 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println(c2.width);

        //모두 같은 저장공간을 참조하므로 항상 같은 값을 갖게 된다.

    }
}




public class Card {

    //인스턴스변수
    String kind; //무늬
    int number; //숫자

    //클래스변수
    static int width = 100; //폭
    static int height = 250; //높이
    //Card 클래스의 클래스변수(static)변수인 width, height는 Card클래스의 인스턴스를 생성하지 않고도 '클래스이름, 클래스변수'와 같은 방식으로 사용할 수 있다.
    //Card인스턴스인 c1과 c2는 클래스변수인 width와 height 값을 공유하기 때문에, c1의 width와 height를 변경하면 c2의 width와 height값도 바뀐 것과 같은 결과를 만든다.

    //각 Card 인스턴스는 자신만의 무늬와 숫자를 유지하고 있어야하므로 인스턴스변수로 선언.
    //각 카드의 폭, 높이는 모든 인스턴스가 공통적으로 같은 값을 유지해야하므로 클래스변수로 선언.
    //카드의 폭을 변경해야할 필요가 있을 경우, 모든 카드의 width 값을 변경하지 않고 한 카드의 width값만 변경해도 모든 카드의 width값이 변경되는 셈이다.

}
