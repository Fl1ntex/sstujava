import packege2_1.packege2_1_4.Rifle;
import packege2_2.packege2_2_1.Pistol;
import packege2_3.packege2_3_8.Shooter;
import packege2_3.packege2_3_8.Shooting;
import packege2_3.packege2_3_9.Rule;
import packege2_3.packege2_3_9.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("dadw");
        s1.setRule(new Rule() {
            @Override
            public boolean rule(Object obj) {
                return true;
            }
        });

        Student s2 = new Student("gfkawfj");
        s2.setRule(new Rule() {
            @Override
            public boolean rule(Object obj) {
                return (int)obj >= 2 && (int)obj <= 5;
            }
        });

        s1.add(5);
        s2.add(5);
        s1.add("F");

        System.out.println(s1);
        System.out.println(s2);

    }
}