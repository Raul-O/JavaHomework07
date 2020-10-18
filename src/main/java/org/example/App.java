package org.example;

import java.security.Permission;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {

        SortedSet<Persoana> personTreeSet = new TreeSet<>(new AgeComp());
        Persoana p1 = new Persoana("George ", 12);
        Persoana p2 = new Persoana("Andrei", 55);
        Persoana p3 = new Persoana("Alin", 33);
        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);

        for (Persoana persoana : personTreeSet) {
            System.out.println(persoana.toString());
        }

        Adresa adresa1 = new Adresa("Adresa1", Tara.ES);
        Adresa adresa2 = new Adresa("Adresa2", Tara.IT);
        Adresa adresa3 = new Adresa("Adresa3", Tara.RO);

        Hobby hobby1 = new Hobby("football");
        hobby1.setAddresses(adresa1);
        hobby1.setAddresses(adresa2);

        Hobby hobby2 = new Hobby("swimming");
        hobby2.setAddresses(adresa1);
        hobby2.setAddresses(adresa2);
        hobby2.setAddresses(adresa3);


        Map<Persoana, List<Hobby>> map = new HashMap<>();
        map.put(p1, new ArrayList<Hobby>());
        List<Hobby> list = map.get(p1);
        list.add(hobby1);
        list.add(hobby2);
        map.put(p1, list);
        System.out.println(list);


        System.out.println(p1.toString() + "likes " +  map.get(p1).toString().replaceAll("\\[","").replaceAll("]",""));

    }

}
