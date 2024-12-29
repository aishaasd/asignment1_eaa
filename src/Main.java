//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package models;
import models.Person;
import models.School;
import models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Locale.setDefault(Locale.US);
        File file1=new File("src/input/students.txt");
        File file2=new File("src/input/teachers.txt");
    }
}