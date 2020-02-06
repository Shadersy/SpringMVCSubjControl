package ru.gvozdilin.springcourse.classes;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
    int sale;
    String nameOfProduct;


    Purchase(int sale, String nameOfProduct) {
        this.sale = sale;
        this.nameOfProduct = nameOfProduct;
    }





    public static void main(String[] args) {

        Person person1 = new Person("Stanislav Gvozdilin");
        Person person2 = new Person("Mikhail Ovchinnikov");
        Person person3 = new Person("Artur Kozhevnkiov");
        Person person4 = new Person("Alexey Zavyalov");
        List<Person> personList = new ArrayList();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);


        Purchase purchase1 = new Purchase(150, "Adalya");
        Purchase purchase2 = new Purchase(500, "DarkSeid");
        Purchase purchase3 = new Purchase(400, "Element");
        Purchase purchase4 = new Purchase(180, "Voodoo");




        person1.sale(purchase1, personList);
        person2.sale(purchase2, personList);
//        person3.sale(purchase3, personList);
//        person4.sale(purchase4, personList);


        System.out.println(person1.fullName + " купил " + purchase1.nameOfProduct  + " за " +purchase1.sale + " его текущий баланс составляет: "+ person1.balance);
        System.out.println(person2.fullName + " купил " + purchase2.nameOfProduct  + " за " +purchase2.sale + " его текущий баланс составляет: "+ person2.balance);

        System.out.println(person3.fullName +  " его текущий баланс составляет: "+ person3.balance);
        System.out.println(person4.fullName +  " его текущий баланс составляет: "+ person4.balance);
//        System.out.println(person3.fullName + " купил " + purchase3.nameOfProduct  + " за " +purchase3.sale + " его текущий баланс составляет: "+ person3.balance);
//        System.out.println(person4.fullName + " купил " + purchase4.nameOfProduct  + " за " +purchase4.sale + " его текущий  баланс составляет: "+ person4.balance);
//

    }

}
