package _01Review;

/*
1,class structure
class className{
    variables
    methods
    constructor;
}

2,object
className variableName = new className;

3, set a Student Class, includes name, age, gender, create Student object

 */
public class demo01 {
    public static void main(String[] args) {
        Student s1 = new Student("李耕",18,"Male");
        s1.print();

    }

}
