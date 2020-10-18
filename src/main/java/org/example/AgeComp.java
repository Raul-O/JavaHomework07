package org.example;

import java.util.Comparator;

public class AgeComp implements Comparator<Persoana> {

        @Override
        public int compare(Persoana o1, Persoana o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
}
