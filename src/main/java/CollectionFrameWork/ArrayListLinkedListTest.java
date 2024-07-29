package CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * p.596
 * 배열은 가장 기본적인 형태의 자료구주로 구조가 간단하며  사용하기 쉽고 데이터를 읽어 오는데 걸리는 시간(접근시간, access time)이 가장 빠라다는 장점을
 * 가지고 있지만 다음과 같은 단점도 가지고 있다.
 * 1. 크기를 변경할 수 없다.
 * - 크기를 변경할 수 없으므로 새로운 배열을 생성해서 데이터를 복사해야한다.
 * - 실행속도를 향상시키기 위해서는 충분히 큰 크기의 배열을 생성해야 하므로 메모리가 낭비된다.
 *
 * 2. 비 순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸린다.
 * - 차례대로 데이터를 추가하고 마지막에서부터 데이터를 삭제하는 것은 빠르지만,
 * - 중간에 데이터를 추가하려면, 빈자리를 만들기 위해 다른 데이터들을 복사해서 이동해야 한다.
 *
 * 이를 보완하기 위해 LinkedList라는 자료구조가 고안되었다. 배열은 모든 데이터가 연속적으로 존재하지만 링크드 리스트는 불연속적으로 존재하는 데이터를 서로 연결(link)한 형태로 구성되어 있다.
 */
public class ArrayListLinkedListTest {
    public static void main(String[] args) {
        //추가할 데이터의 개수를 고려하여 충분히 잡아야한다.
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();

        System.out.println("= 순차적으로 추가하기 ="); //순차적으로 추가 삭제할 경우에는 ArrayList가 LinkedList보다 빠르다.
        System.out.println("ArrayList : "+add1(al));
        System.out.println("LinkedList : "+add1(ll));
        System.out.println();
        System.out.println("= 중간에 추가하기 ="); //중간 추가 삭제는 LinkedList가 상당히 더 빠르다.
        System.out.println("ArrayList : " + add2(al));
        System.out.println("LinkedList : " + add2(ll));
        System.out.println();
        System.out.println("= 중간에서 삭제하기 =");
        System.out.println("ArrayList : " + remove2(al));
        System.out.println("LinkedList : " + remove2(ll));
        System.out.println();
        System.out.println("= 순차적으로 삭제하기 =");
        System.out.println("ArrayList : " + remove1(al));
        System.out.println("LinkedList : " + remove1(ll));
        //데이터의 양이 많지 않은 경우에는 두 개의 큰 차이는 없지만 장단점을 이해하고 상황에 따라 적합한 것을 선택하는 것이 좋다.
    }



    public static long add1(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) list.add(i+"");
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long add2(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) list.add(500, "X");
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long remove1(List list){
        long start = System.currentTimeMillis();
        for(int i = list.size()-1; i <= 0; i--) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove2(List list){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
