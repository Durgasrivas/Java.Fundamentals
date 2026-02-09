package com.codecounty.oops.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsAndList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() {{
            add(21);
            add(12);
            add(32);
            add(4);
        }};
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(list);
//        Collections.copy(list2,list);
        System.out.println(list);
        System.out.println(list2);

        list.replaceAll(x -> x * 2);
        System.out.println(list);

    }
}
