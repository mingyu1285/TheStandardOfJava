package CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * p.602
 * 배열의 경우 만일 인덱스가 n인 요소의 값을 얻어 오고자 한다면 단순히 아래와 같은 수식을 계산함으로써 해결된다.
 * 인덱스가 n인 데이터의 주소 = 배열의 주소 + n * 데이터 타입의 크기이다.
 */
public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();
        add(al);
        add(ll);

        System.out.println("= 접근시간테스트 =");
        System.out.println("ArrayList : "+ access(al));
        System.out.println("LinkedList : "+ access(ll));

    }

    public static void add(List list){
        for (int i = 0; i < 100000; i++) list.add(i+"");
    }

    public static long access(List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) list.get(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
