package com.codecounty.oops.collections.set;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetExample {
    public static void main(String... args) {

        List<Integer> nums = List.of(55, 42, 2, 4, 24, 2, 45, 31, 5, 2, 1, 5, 2);

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        System.out.println(list);

//        HashSet<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();//for in order

        for (int num : nums) {
            set.add(num);
        }
        System.out.println(set);
//        set.add(null);
//        set.add(null);
        System.out.println(set);

        for (Integer num : set) {
            System.out.print(num);
        }
        Set<Integer> collects = list.stream().collect(Collectors.toSet());
//        list.parallelStream().forEach(System.out::println);

        System.out.println(set.contains(5));//almost O(1)

//        Collections.sort(set);

        TreeSet<Integer> treeset=new TreeSet<>(set);//treeset stores in sorted order
        System.out.println(treeset);
    }
}
