package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person ("Tom", "Tomov", "MALE");
        Person person2 = new Person ("Mil", "Milov", "MALE");
        Person person3 = new Person ("Stim", "Stimov", "MALE");
        Person person4 = new Person ("Ann", "Bond", "FEMALE");
        Person person5 = new Person ("Kate", "Bond", "FEMALE");

        List <Person> list = new ArrayList<>();
        list.add (person1);
        list.add (person2);
        list.add (person3);
        list.add (person4);
        list.add (person5);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));



    }
}
