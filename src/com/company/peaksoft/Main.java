package com.company.peaksoft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static final GsonBuilder GSON_BUILDER = new GsonBuilder();
    public static final Gson GSON = GSON_BUILDER.setPrettyPrinting().create();

    public static void main(String[] args) {

        Car [] car = {
                Car.method("KG", Type.GOLF)
        };


        String nm = GSON.toJson(car);
        System.out.println(nm);
        System.out.println("---------------------------------------------");

//        Car [] car2 = {
//                car2.method2("Japan", Type.TOYOTA)
//        };
//        String nm2 = GSON.toJson(car2);
//        System.out.println(nm2);
//        System.out.println("---------------------------------------------");
//        System.out.println(GSON.toJson(car2));


    }
}
