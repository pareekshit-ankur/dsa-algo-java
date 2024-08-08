package main.java.com.pareekshit.geektrust;

import java.util.LinkedHashMap;
import java.util.Map;

public class FamilyDaoImpl implements FamilyDao {

    Map<String, Person> family = new LinkedHashMap<>();

    public Person getPerson(String name) {
        return family.get(name);
    }
}
