// ********************************************************************
// Student.java Author: Lewis/Loftus
//
// Represents a college student.
// ********************************************************************

package Semester_1.Assignment_02;

public class ProvidedStudent {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;

    // -----------------------------------------------------------------
    // Constructor: Sets up this student with the specified values.
    // -----------------------------------------------------------------
    public ProvidedStudent(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }

    // -----------------------------------------------------------------
    // Returns a string description of this Student object.
    // -----------------------------------------------------------------
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress;

        return result;
    }
}
