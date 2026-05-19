package app.University;

public class Main {
    
    public static void main(String[] args) {
        

        Student student = new Student(1, "Yitbarek Yonas", "Computer Science", 'A', 2024);
        Teacher teacher = new Teacher(101, "Yibeltal Maire", "Computer Science", "Java Programming", 5);
        
        System.out.println("\nSample Student:");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Section: " + student.getSection());
        System.out.println("Year: " + student.getYear());
        
        System.out.println("\nSample Teacher:");
        System.out.println("ID: " + teacher.getId());
        System.out.println("Name: " + teacher.getName());
        System.out.println("Department: " + teacher.getDepartment());
        System.out.println("Subject: " + teacher.getSubject());
        System.out.println("Experience: " + teacher.getExperience() + " years");
    }
}
