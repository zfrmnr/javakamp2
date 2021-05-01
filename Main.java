package KAMP;

public class Main{
    public static void main(String[] args){
        Courses course1 =new Courses(1,"TEMEL","ZAFER",1,"beginner");
        Courses course2 =new Courses(2,"orta","ZAFER",2,"mid");
        Courses course3 =new Courses(3,"zor","ZAFER",3,"hard");

        Courses[] courses = {course1,course2,course3};

        for (Courses course: courses) {
            System.out.println(course.Kursadi);

        }
        System.out.println(courses.length);

    }



}
