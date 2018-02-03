package com.hfad.beerapp;
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List <String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("light")) {
            brands.add("Namysłów Pils");
            brands.add("Harnaś Jasne Pełne");
            brands.add("Żywiec Jasne Pełne");
        } else if (color.equals("dark")) {
            brands.add("Kormoran Irish Beer");
            brands.add("Konstancin Czarny Dąb");
            brands.add("Okocim Porter");
        } else {
            brands.add("Raciborskie Rżnięte");
            brands.add("Anchor Brekle");
            brands.add("Mc Chouffe");
        }
        return brands;
    }
}

