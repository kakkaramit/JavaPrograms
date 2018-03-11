package oopsConcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class User implements Comparable<User> {

    public String name;
    public int age;
    public String pass;

     public User(String name, int age, String pass) {
        this.name = name;
        this.age = age;
        this.pass = pass;
    }
    public void f1(){}

    public static void main(String[] args) {
        User user = new User("A", 10, "No");
        User user1 = new User("A", 10, "No");
        User user2 = new User("B", 11, "No");
        User user3 = new User("c", 13, "No");
        User user4 = new User("B", 14, "No");
        Set<Integer> list = new TreeSet<Integer>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(0);
        int a=011;
        System.out.println(a+1);
        
        List<Integer> integers =new ArrayList<Integer>();
        
        for (Integer l : list) {
            System.out.println(l);
        }
        System.out.println( "Equals Method - "+ user.equals(user1) );
        Set<String> set = new HashSet<String>();
        set.add("about us");
        set.add("home");
        set.add("training");
        set.add("contact us");
        System.out.println( "Set Size - "+ set );
        set.iterator();
        
        TreeSet< Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(9); //3 [4] 5 8 9 [10]
        SortedSet<Integer> ss = treeSet.subSet(3, 10);
        System.out.println( "SetTree - "+ treeSet.subSet(3, 10) );
        treeSet.add(4);
        treeSet.add(10);
        System.out.println( "SetTree - "+ treeSet.subSet(3, 10) );
        }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        if (this.age == user.age)
            return true;
        return false;
    }
    @Override
     public int hashCode() {
        return age;
        }

    @Override
    public int compareTo(User o) {

        return 0;
    }

}

class compate implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o1.name.equals(o2.name)) {
            if (o1.age < o2.age) {
                return -1;
            } else {
                if (o1.age == o2.age)
                    return 0;
                else
                    return 1;
            }
        } else {
            return 1;
        }
    }

}