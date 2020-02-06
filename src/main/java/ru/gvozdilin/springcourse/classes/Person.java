package ru.gvozdilin.springcourse.classes;

import java.util.List;



public class Person {
    String fullName;
    int balance = 0;

    static int count;
    Purchase purchase;

    {
        count++;
    }

    Person(String fullName){
        this.fullName=fullName;
    }

    public String sale(Purchase purchase, List<Person> list){


        for(Person s : list){
            s.balance -= purchase.sale/count;
            this.balance+=purchase.sale/count;
        }



        return purchase.nameOfProduct;

    }




}
