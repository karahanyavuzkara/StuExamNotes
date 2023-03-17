public class Student {
     int StuNumber;
     String StuName;
     String StuSurname;
     double midTerm;
     double finalexam;
     double note;

    public Student(int StuNumber, String StuName, String StuSurname, double midTerm, double finalexam) {
        this.StuNumber = StuNumber;
        this.StuName = StuName;
        this.StuSurname = StuSurname;
        this.midTerm = midTerm;
        this.finalexam = finalexam;
    }

    public void calculateNote() {
        note = midTerm * 0.3 + finalexam * 0.7;
    }

    public double getNote() {
        return note;
    }

    public String getName() {
        return StuName + " " + StuSurname;
    }
    // getters and setters...
    public int getStuNumber() {
        return StuNumber;
    }


}
