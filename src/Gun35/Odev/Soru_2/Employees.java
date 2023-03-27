package Gun35.Odev.Soru_2;


public class Employees {
    private String name;
    private int salary;
    private String dob;


    Employees(String name, int salary, String dob) {
        setName(name);
        setSalary(salary);
        setdob(dob);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setdob(String dob) {
        this.dob = dob;
    }

    public String dogumYiliBulma() {
        String[] dogumYili = dob.split("/");

        return  dogumYili[2];
    }

    public String getdob() {
        return this.dob;
    }
}