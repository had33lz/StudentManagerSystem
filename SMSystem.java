public class SMSystem {
private String name;
private int id;
private double grade;
public SMSystem(String name, int id, double grade) {

    this.name = name;
    this.id = id;
    this.grade = grade;

}
public String getName() {
    return name;
}
public int getId() {
    return id;
}
public double getGrade() {
    return grade;
}
public void setGrade(double grade) {
    this.grade = grade;
}

public void displayInfo(){
    System.out.println("Name: " + this.name);
    System.out.println("Id: " + this.id);
    System.out.println("Grade: " + this.grade);
}
}
