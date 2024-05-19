package ArrayStack;

import java.util.*;

public class test {

    public static void main(String[] args) throws Exception {
        MyArrayStack st = new MyArrayStack(2);
        st.push(0);
        st.push(1);
        st.displayAll();
//        System.out.println(st.peek());
//        st.push(3);
//        st.displayAll();
//        System.out.println(st.isFull());
        System.out.println(st.search(0));
        st.grow();
        st.push(3);
        st.displayAll();
        System.out.println(st.isFull());
    }
}
