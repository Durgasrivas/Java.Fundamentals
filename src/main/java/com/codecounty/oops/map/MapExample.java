package com.codecounty.oops.map;

import javax.swing.text.html.parser.Entity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
    public static void main(String... args){

        HashMap<Integer,String>map=new HashMap<>();
        map.put(341,"Amit");
        map.put(1,"Suman");
        map.put(2,"Rajesh");
        map.put(3,"Amit");
        map.put(2,"Ajay");

        System.out.println(map);
        Set<Integer>keys=map.keySet();

        //Hashing->keys
        //Key->Unique
        //Value->Duplicate

        Collection<String>values=map.values();
        System.out.println(values);

        map.remove(10);
        map.remove(2);
        System.out.println(map);

        System.out.println(map.get(4));
        System.out.println(map.get(1));

        Set<Entry<Integer,String >> entries=map.entrySet();
        for (Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
//            System.out.println(entry);
        }
    }
}





