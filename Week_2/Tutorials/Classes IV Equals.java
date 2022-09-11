class Student {
    private String name;
    private int studentNumber;

    /**Constructor: creates a new Student with a name and a studentNumber.
    * @param name - A String value representing the name coordinate of the student
    * @param studentNumber - An int value representing the studentNumber coordinate of the student
    */
    public Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    /**Getter for the name coordinate of the Student.
    * @return the value of name.
    */
    public String getName() {
        return this.name;
    }
    
    /**Getter for the studentNumber of the Student.
    * @return the value of studentNumber.
    */
    public int getStudentNumber() {
        return this.studentNumber;
    }
    
    /**Compares this Student to another object and assesses whether they are 
    * both students with equal values.
    * @param other - an Object that is to be compared to this.
    * @return a boolean value which is true when both objects are of type Student
    * with the same name and studentNumber values, and false otherwise. 
    */
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other instanceof Student) {
            Student that = (Student) other;
            if (this.name.equals(that.name) && this.studentNumber == that.studentNumber) {
                return true;
            } 
        }
        return false;
    }
        

}