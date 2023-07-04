package org.example.BehavorialPatterns.Template;

public class Main {
    public static void main(String[] args) {


        NormalHogie normalHogie = new NormalHogie();
        normalHogie.makeSandwich();
        System.out.println();
        VeggieHoagie veggieHoagie = new VeggieHoagie();
        veggieHoagie.makeSandwich();
    }
}
