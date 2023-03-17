
public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(61, "Karahan Yavuz", "Kara", 61.0, 61.0);
        student1.calculateNote();
        System.out.println("Student 1 - Name: " + student1.getName() + ",  Number : " + student1.getStuNumber() +
                ",  Note: " + student1.getNote());

        Student student2 = new Student(1, "Aykut", "Eren", 82.0, 90.0);
        student2.calculateNote();
        System.out.println("Student 2 - Name: " + student2.getName() + ",  Number : " + student2.getStuNumber() +
                ", Note: " + student2.getNote());

        Student student3 = new Student(23, "Berke", "Caglar", 84.0, 50.0);
        student3.calculateNote();
        System.out.println("Student 3 - Name: " + student3.getName() + ",  Number : " + student3.getStuNumber() +
                ", Note: " + student3.getNote());


        Student student4 = new Student(33, "Baturhan", "Akar", 70.0, 90.0);
        student4.calculateNote();
        System.out.println("Student 4 - Name: " + student4.getName() + ",  Number : " + student4.getStuNumber() +
                ", Note: " + student4.getNote());



        Student student5 = new Student(32, "Jamalemir", "Ferrahoglu", 100.0, 90.0);
        student5.calculateNote();
        System.out.println("Student 5 - Name: " + student5.getName() + ",  Number : " + student5.getStuNumber() +
                ", Note: " + student5.getNote());


        Student student6 = new Student(43, "Sami", "Boyraz", 40.0, 100.0);
        student6.calculateNote();
        System.out.println("Student 6 - Name: " + student6.getName() + ",  Number : " + student6.getStuNumber() +
                ", Note: " + student6.getNote());

        Student student7 = new Student(21, "Berke", "Yüce", 83.0, 92.0);
        student7.calculateNote();
        System.out.println("Student 7 - Name: " + student7.getName() + ",  Number : " + student7.getStuNumber() +
                ", Note: " + student7.getNote());


        Student student8 = new Student(52, "Harun", "Özaslan", 85.0, 94.0);
        student8.calculateNote();
        System.out.println("Student 8 - Name: " + student8.getName() + ",  Number : " + student8.getStuNumber() +
                ", Note: " + student8.getNote());


        Student student9 = new Student(51, "Eren can", "Torlak", 85.0, 92.0);
        student9.calculateNote();
        System.out.println("Student 9 - Name: " + student9.getName() + ",  Number : " + student9.getStuNumber() +
                ", Note: " + student9.getNote());


        Student student10 = new Student(34, "EMRE ", "KIRACBEDEL", 60.0, 90.0);
        student10.calculateNote();
        System.out.println("Student 10 - Name: " + student10.getName() + ",  Number : " + student10.getStuNumber() +
                ", Note: " + student10.getNote());
        // ... add more students as needed
    }
}
