package com.company;

public class Encyclopedia
        <B extends Number,A extends Number> implements Printable<B>  {
    B Page;
    A Cost;

    public (B page, A cost) {
        Page = page;
        Cost = cost;
    }

    public B getPage() {
        return Page;
    }

    public A getCost() {
        return Cost;
    }


    @Override
    public void print(){

        System.out.println(" Cost  " + getCost() + "   Page on encyclopedia  " + getPage());



    }
}


