package ru.gvozdilin.springcourse.entity;

public class Merge {


   public Merge(){

    }

    public int user_id;
    public int purchase_id;

    public void setUser_id(int user_id){
        this.user_id=user_id;
    }

    public int getUser_id(){
        return user_id;
    }

    public void setPurchase_id(int purchase_id){
        this.purchase_id=purchase_id;
    }

    public int getPurchase_id(){
        return purchase_id;
    }



}
