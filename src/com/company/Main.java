package com.company;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

        public static void main(String[] args) {
        Person person1 = new Person ("Tom", "Tomov", Gender.MALE);
        Person person2 = new Person ("Mil", "Milov", Gender.MALE);
        Person person3 = new Person ("Stim", "Stimov", Gender.MALE);
        Person person4 = new Person ("Ann", "Bond", Gender.FEMALE);
        Person person5 = new Person ("Kate", "Bond", Gender.FEMALE);

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

        System.out.println (list.size());

            System.out.println ();

        Person person6 = new Person ("Tom", "Tomov", Gender.MALE);
        Person person7 = new Person ("Tom", "Tomov", Gender.MALE);
        Person person8 = new Person ("Stim", "Stimov", Gender.MALE);
        Person person9 = new Person ("Ann", "Bond", Gender.FEMALE);
        Person person10 = new Person ("Ann", "Bond", Gender.FEMALE);

         Set <Person> set = new HashSet<>();
        set.add (person6);
        set.add (person7);
        set.add (person8);
        set.add (person9);
        set.add (person10);

        for (Person person : set)
            System.out.println(person);

        System.out.println (set.size());

            System.out.println ();

            Person person11 = new Person ("Tom", "Tomov", Gender.MALE);
            Person person12 = new Person ("Mil", "Milov", Gender.MALE);
            Person person13 = new Person ("Stim", "Stimov", Gender.MALE);
            Person person14 = new Person ("Ann", "Bond", Gender.FEMALE);
            Person person15 = new Person ("Kate", "Bond", Gender.FEMALE);

            Map <Integer, Person> map = new HashMap <Integer, Person>();

            map.put(3,person11);
            map.put(5,person12);
            map.put(1,person13);
            map.put(8,person14);
            map.put(10,person15);

            System.out.println(map.entrySet());

            System.out.println (map.size());

        }


        }

