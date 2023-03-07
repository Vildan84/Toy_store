package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToJson {

    public static void write(ArrayList<Toy> toys, String path){
        JSONObject js = new JSONObject();

        for(Toy toy: toys){
            JSONArray list = new JSONArray();
            list.add(toy.getName());
            list.add(toy.getColor());
            list.add(toy.getRate());
            list.add(toy.getRemain());
            js.put(toy.getId(), list);
        }

        try (FileWriter file = new FileWriter(path)) {
            file.write(js.toJSONString());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
