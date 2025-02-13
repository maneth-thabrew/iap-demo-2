package lk.acpt_maneth.demo;

public class Student {
    private String name;
    private String id;
    private String email;
    private int number;

    public Student(String name, String id, String email, int number) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}



