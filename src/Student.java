import java.util.ArrayList;
import java.util.Comparator;

public class Student {
    import java.util.ArrayList;
import java.util.Comparator;

    public class Student extends Person {
        private int studentID;
        private static int id_gen = 1;
        private List<Integer>grades;

        public Student(String firstName, String lastName, int studentID, List<Integer> grades, double gpa) {
            super(name,surname,age,gender);
            this.studentID = id_gen++;
            this.grades = new ArrayList<>();
        }

        public void addGrade(int grade) {
            if (grade>=0 && grade<=100) {
                grade.add(grade);
            }
        }
        public double calculateGPA() {
            int sum = 0;
            for (Integer grade : grades) {
                sum += grade;
            }
            return sum /grades.size();
        }
        public String GpaDigit(){
            double gpa = calculateGPA();
            if(gpa>=95 && gpa<=100){
                return "4.0 A";
            }
            else if(gpa>=90 && gpa<=94.0){
                return "3.67 A-";
            } else if(gpa>=85.0 && gpa<=89.0){
                return "3.33 B+";
            } else if(gpa>=80.0 && gpa<=84.0){
                return "3.30 B";
            } else if(gpa>=75.0 && gpa<=79.0){
                return "2.67 B-";
            } else if(gpa>=70.0 && gpa<=74.0){
                return "2.33 C+";
            } else if(gpa>=65.0 && gpa<=69.0){
                return "2.0 C";
            } else if(gpa>=60.0 && gpa<=64.0){
                return "1.67 C-";
            } else if(gpa>=55.0 && gpa<=59.0){
                return "1.33 D+";
            }else if(gpa>=50.0 && gpa<=54.0){
                return "1.0 D";
            }else if(gpa>=25.0 && gpa<=49.0){
                return "0 FX";
            }else if(gpa>=0 && gpa<=24){
                return "0 F";
            }
        }
        public static Comparator<Student> compareByGpa() {
            return new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if (o1.getGpa() > o2.getGpa()) {
                        return 1;
                    }
                    if (o1.getGpa() < o2.getGpa()) {
                        return -1;
                    }
                    return 0;
                }
            };
        }
        @Override
        public String toString() {
            return super.toString() + "\nGPA: " + gpa;
        }
    }
}
