package set;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEqualsMethodExample {
    public static void main(String[] args) {

    Map<Student, String> map= new HashMap<>();
    Student s1 = new Student("Awej", 1);
    Student s2 = new Student("Bruce", 2);
    Student s3 = new Student("Awej", 3);

    map.put(s1, "Engineer");
    map.put(s2, "Backend Dev");
    map.put(s3, "Manager");
    System.out.println("Map Size:" +map.size());
    System.out.println("Value For s1:"+map.get(s1));
    System.out.println("Value For s3:"+map.get(s3));
    System.out.println(s1);

    Map<String, Integer> map1 = new HashMap<>();
    map1.put("Awej", 90); //hashcode 1 --> Index 1
    map1.put("Bruce", 92); //hashcode 2 --> Index 2
    map1.put("Awej", 90); //hashcode 2 --> Index 3
    System.out.println("Map1 Size:"+ map1.size());
    for(String key: map1.keySet()) {
        System.out.println("Key: "+ key + ", Roll no:" + map1.get(key));
    }
    }

}
















































































class Student {
    String name;
    int id;
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Student other = (Student) obj;
        return id == other.getId() && name.equals(other.getName());
    }

    @Override
    public int hashCode() {
        return super.hashCode()+ Integer.hashCode(id);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "id:"+id+", "+ "name:"+ name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    

    

}