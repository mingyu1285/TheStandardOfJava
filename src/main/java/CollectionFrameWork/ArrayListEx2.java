package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;


/**
 * p.587
 * 긴 문자열 데이터를 원하는 길이로 잘라서 ArrayList에 담은 다음 출력하는 예제이다.
 * 단순히 문자열을 특정크기로 잘라서 출력하는 것이라면, charAt(int i)와 for문을 이용하겠지만 ArrayList에 잘라서 담아놓음으로써 ArrayList의 기능을 이용해서 다양한 작업을 간단하게 처리할 수 있다.
 */
public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10; //자르고자 하는 글자의 개수를 지정한다.
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        List list = new ArrayList(length/LIMIT + 10); //크기를 약간 여유 있게 잡는다.

        for(int i=0; i < length; i+=LIMIT){
            if (i + LIMIT < length)
                list.add(source.substring(i, i+LIMIT));
            else
                list.add(source.substring(i));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
