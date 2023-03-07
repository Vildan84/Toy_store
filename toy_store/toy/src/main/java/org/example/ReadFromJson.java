package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class ReadFromJson {


    public static ArrayList<Toy> read(String path){

        JSONParser parser = new JSONParser();
        ArrayList<Toy> toys = new ArrayList<>();

        try (Reader reader = new FileReader(path)) {

            JSONObject js = (JSONObject) parser.parse(reader);
            Set keys = js.keySet();

            for(Object obj: keys) {
                String id = String.valueOf(obj);
                JSONArray arr = (JSONArray) js.get(obj);
                Iterator iterator = arr.iterator();
                ArrayList<String> str = new ArrayList<>();
                while (iterator.hasNext()) {
                    String s = String.valueOf(iterator.next());
                    str.add(s);
                }
                Toy toy = new Toy(Integer.parseInt(id), str.get(0), str.get(1), Integer.parseInt(str.get(2)),
                        Integer.parseInt(str.get(3)));
                toys.add(toy);
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return toys;
    }
}
