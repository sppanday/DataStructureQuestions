package personapp;
import java.util.*;

public class PersonApp {
public static void main(String[] args) {
Person[] persons = buildPersons();

Arrays.sort(persons);


String actual = persons[0].getName();
assert ("Albert".equals(actual)) : String.format("Expected Albert but was <%s>%n", actual);

print(persons);

System.exit(0);
}

private static Person[] buildPersons() {
Person[] persons = new Person[4];
persons[0] = new Person("Zena", 50);
persons[1] = new Person("Albert", 55);
persons[2] = new Person("Marmaduke", 5);
persons[3] = new Person("Gilbert", 17);
return persons;
}

private static void print(Person[] persons) {
for (int i = 0; i < persons.length; i++) {
System.out.println(persons[i]);
}
}
}

class Person implements Comparable<Person> {
private String name;
private int age;

public Person(String name, int age) {
setName(name);
setAge(age);
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getAge() {
return age;
}

public void setAge(int age) {
this.age = age;
}

@Override
public int compareTo(Person other) {
int result = this.getName().compareTo(other.getName());
if (result == 0) {
result = this.getAge() - other.getAge();
}
return result;
}

@Override
public String toString() {
return String.format("%s (%d)", getName(), getAge());
}
}