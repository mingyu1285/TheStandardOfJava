package CollectionFrameWork;

import java.util.*;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        Collections.sort(list1); //list1과 list2를 정렬한다.
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");

        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);


        // list1에서 list2 겹치는 부분만 남기고 나머지는 삭제한다.
        // retainAll에 의해 list1에 변화가 있었으므로 true를 반환한다.
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));

        // list2에서 list1에 포함된 객체들을 삭제한다.
        // list2에서 list1과 공통되는 요소들을 찾아서 삭제하는 부분이다.
        // 여기서는 list2의 각 요소를 접근하기 위해 get(int index)메서드와 for문을 사용하였는데, for문의 변수 i를 0부터 증가시킨 것이 아니라, 'list2.size()-1' 부터 감소시키면서 거꾸로 반복시켰다.
        // 만일 변수 i를 증가시켜가면서 삭제하면, 한 요소가 삭제될 때마다 빈 공간을 채우기 위해 나머지 요소들이 자리이동을 하기 때문에 올바른 결과를 얻을 수 없다. 그래서 제어변수를 감소시키면서
        // 삭제를 해야 자리이동이 발생해도 영향을 받지 않고 작업이 가능하다.
        for (int i = list2.size()-1; i >= 0; i-- ){
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }






        System.out.println(list1);
        System.out.println(list2);
        //main의 끝
    }



    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);
        System.out.println();
    }
} // class
