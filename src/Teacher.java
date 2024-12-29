public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;
    public Teacher(String firstName, String lastName, int yearsOfExperience, int salary) {
        super(firstName,lastName,age,gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }
    public void giveRaise (int raise) {
        if(percentage >0){
            salary += salary * percentage/100;
        }else{
            System.out.println("Invalid raise");
        }
    }
    public String toString() {
        return super.toString()+" "+"I teach"+" "+subject+".";
    }
}