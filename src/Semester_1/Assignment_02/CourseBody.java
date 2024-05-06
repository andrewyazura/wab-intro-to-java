package Semester_1.Assignment_02;

public class CourseBody {
    public static void main(String[] args) {
        Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
        Address jHome = new Address("21 Jump Street", "Blacksburg", "VA", 24551);
        Student john = new Student("John", "Smith", jHome, school, 44, 45, 46);

        Address mHome = new Address("123 Main Street", "Euclid", "OH", 44132);
        Student marsha = new Student("Marsha", "Jones", mHome, school, 95, 84, 90);

        Course math_course = new Course("Mathematical Analysis 101");

        math_course.addStudent(marsha);
        math_course.addStudent(john);
        math_course.roll();

        System.out.println();
        System.out.println("Average score for " + math_course.name + ": " + math_course.average());
    }
}
