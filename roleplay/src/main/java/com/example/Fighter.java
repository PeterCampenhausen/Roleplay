package com.example;
public class Fighter extends Classes{
    String name;
    final String hit_point_die = "D10";

    public Fighter(){
        
    }

    public Fighter(String name){
        this.name = name;
        this.level = 1;
    }
}