package ru.gvozdilin.springcourse.entity;

public class Purchase {
    private int id;
    private String date;

    public Purchase(){

    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate()
    {
        return date;
    }
}



