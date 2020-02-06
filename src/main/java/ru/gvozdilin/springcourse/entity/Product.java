package ru.gvozdilin.springcourse.entity;

public class Product {
    private int id;
    private String productName;
    private int cost;

    public Product(){

    }



    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setProductName(String productName){
        this.productName=productName;
    }

    public String getProductName(){
      return productName;
    }

    public void setCost(int cost){
        this.cost=cost;
    }

    public int getCost(){
        return cost;
    }


}
