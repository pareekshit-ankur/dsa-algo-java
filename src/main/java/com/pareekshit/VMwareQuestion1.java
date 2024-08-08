package main.java.com.pareekshit;

import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class VMwareQuestion1 {
    public static void main(String[] args) throws IllegalAccessException {
        /*Object[] array = {
                new Student1("Rob", "London", "uk", 35),
                new Student1("Rob", "London", "uk", 35),
                new Student1("Bob", "London", "uk", 35),
                new Student1("Rob", "London", "uk", 36)};
        System.out.println(getCombined(array));
        Student1[] users = {
                new Student1("Rob", "London", "uk", 34),
                new Student1(null, "London", "uk", 35),
                new Student1("Bob", "London", "uk", 35),
                new Student1("Rob", "London", "uk", 36)};*/
        /*Comparator<User> userComparator = Comparator
                .comparing(User::getName, Comparator.reverseOrder())
                .thenComparing(User::getAge, Comparator.nullsLast(Integer::compareTo));
        Arrays.sort(users, userComparator.reversed());*/
        /*System.out.println(Arrays.toString(users));
        Set<Integer> set = new TreeSet<>((s1,s2)->s2.compareTo(s1));
        set.addAll(Arrays.asList(10,0,2,15,20));
        Set<Integer> set1 = set.stream().sorted().collect(Collectors.toSet());
        System.out.println(set);*/
    }

    public static Map<String, Object> getCombined(Object[] array) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        Field[] fields = array[0].getClass().getDeclaredFields();
        for (Field field : fields) {
            map.putIfAbsent(field.getName(), field.get(array[0]));
        }
        for (Object obj : array) {
            Field[] objFields = obj.getClass().getDeclaredFields();
            for (Field field : objFields) {
                Object value = field.get(obj);
                if (!map.containsKey(field.getName()) || !map.get(field.getName()).equals(value)) {
                    map.remove(field.getName());
                }
            }
        }
        return map;
    }
}

class User implements Comparator<Student> {
    String name;
    String city;
    String country;
    int age;

    public User(String name, String city, String country, int age) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }

    byte x = 0;

}

