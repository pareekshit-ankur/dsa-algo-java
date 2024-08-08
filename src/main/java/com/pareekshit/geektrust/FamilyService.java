package main.java.com.pareekshit.geektrust;

import java.util.List;

public interface FamilyService {
    String addChild(String mothersName, Gender gender);

    List<Person> getRelationshipOfPerson(String name, Relationship relationship);
}
