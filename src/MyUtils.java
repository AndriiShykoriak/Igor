import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class MyUtils {
    private static List<Student> studentList = new ArrayList<>();
    private static List<Worker> workerList = new ArrayList<>();

    static {
        studentList.add(new Student("Petro", "University", 3));
        studentList.add(new Student("Stepan", "College", 4));
        studentList.add(new Student("Ihor", "University", 4));
        workerList.add(new Worker("Andriy", "Developer", 12));
        workerList.add(new Worker("Ira", "Manager", 8));
    }

    public List<Person> maxDuration() {
        List<Person> personList = new ArrayList<>();
        Student maxDurationStudy = studentList
                .stream()
                .max(Comparator.comparing(Student::getStudyYears)).orElseThrow(NoSuchElementException::new);
        List<Student> allMaxDurationStudy = studentList
                .stream()
                .filter(student -> student.getStudyYears() == maxDurationStudy.getStudyYears())
                .collect(Collectors.toList());
        Worker maxDurationWork = workerList
                .stream()
                .max(Comparator.comparing(Worker::getExperienceYears)).orElseThrow(NoSuchElementException::new);
        List<Worker> allMaxDurationWork = workerList
                .stream()
                .filter(worker -> worker.getExperienceYears() == maxDurationWork.getExperienceYears())
                .collect(Collectors.toList());

        personList.addAll(allMaxDurationStudy);
        personList.addAll(allMaxDurationWork);
        System.out.println(personList);
        return personList;
    }
}
