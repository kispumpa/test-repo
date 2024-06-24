package catalogue;

import java.util.Objects;

public class Student {
    private String neptun, name;
    private boolean present;

    public String getNeptun() {
        return neptun;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public Student() {
    }

    public Student(String neptun, String name, boolean present) {
        this.neptun = neptun;
        this.name = name;
        this.present = present;
    }



    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return this.neptun == student.neptun;
    }

    @Override
    public int hashCode() {
        return Objects.hash(neptun, name, present);
    }
}
