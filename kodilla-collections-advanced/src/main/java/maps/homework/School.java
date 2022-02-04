package maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
// nie mogę utworzyć 'class' w klasie 'school', bo klasa 'school' jest przeznaczona do 'school'
    private String schoolName;
    private List<SchoolClass> schoolClassList;
    private int totalNumberOfStudentsAtSchool;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.schoolClassList = new ArrayList<>();
        this.totalNumberOfStudentsAtSchool = 0;
    }

    public void addSchoolClass(SchoolClass schoolClass) {
        schoolClassList.add(schoolClass);
        totalNumberOfStudentsAtSchool += schoolClass.getNumberOfStudents();
        // od razu też zliczamy total students, to inaczej zapisane
        // totalNumberOfStudentsAtSchool = totalNumberOfStudentsAtSchool + schoolClass.getNumberOfStudents();
    }

    @Override
    public String toString() {
        return "school " + schoolName +
                ", total number of students: " + totalNumberOfStudentsAtSchool + ".";
    }
}



