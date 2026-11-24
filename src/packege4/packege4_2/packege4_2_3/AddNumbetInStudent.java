package packege4.packege4_2.packege4_2_3;

import packege4.packege4_1.packege4_1_1.IncorrectAssessment;
import packege4.packege4_1.packege4_1_1.NotHaveRule;
import packege4.packege4_1.packege4_1_1.Rule;
import packege4.packege4_1.packege4_1_1.Student;

import java.util.Random;

public class AddNumbetInStudent {
    public static void addNumber(Student[] array){
        try {
            Random r= new Random();
            for (Student s:array){
                s.add(r.nextInt(10));
            }
        } catch (IncorrectAssessment e){
            System.out.println("ne dobavili");
        } catch (NotHaveRule e){
            System.out.println(e.getMessage());
        }
    }
}


//Rule r = new Rule() {
//    @Override
//    public boolean rule(Object obj) {
//        return (int)obj >= 2 && (int)obj <= 5 ;
//    }
//};
//
//Student<Integer>[] array = new Student[]{
//        new Student<Integer>("Dawdaw", r),
//        new Student<Integer>("Dawdaw", r),
//        new Student<Integer>("Dawdaw", r),
//        new Student<Integer>("Dawdaw", r),
//};
//        for (int i = 0; i < 4; i++){
//array[i].add(5);
//        }
//
//                AddNumbetInStudent.addNumber(array);
//
//        for (int i = 0; i < 4; i++){
//        System.out.println(array[i]);
//        }