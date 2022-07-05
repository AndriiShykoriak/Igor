public class Student extends Person{
    private String studyPlace;
    private int studyYears;

    public Student(String name, String studyPlace, int studyYears) {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }

    public String getStudyPlace() {
        return studyPlace;
    }

    public void setStudyPlace(String studyPlace) {
        this.studyPlace = studyPlace;
    }

    public int getStudyYears() {
        return studyYears;
    }

    public void setStudyYears(int studyYears) {
        this.studyYears = studyYears;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "studyPlace='" + studyPlace + '\'' +
                ", studyYears=" + studyYears +
                '}';
    }
}
