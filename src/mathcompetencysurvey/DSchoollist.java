package mathcompetencysurvey;

import java.util.ArrayList;
public class DSchoollist {
    ArrayList<School> schools = new ArrayList<> ();

    public void addSchool(School sc) {
        schools.add(sc);
    }
    public void display(){
        for (int i=0; i<schools.size(); i++){

            System.out.println(schools.get(i).getName());
        }
    }
    public static void main(String args[]){
        DSchoollist dl= new DSchoollist();

        School sc = new School();
        sc.setName("St anne");
        dl.addSchool(sc);
        dl.display();

        School sc2 = new School();
        sc2.setName("St Patrick");
        dl.addSchool(sc2);
        dl.display();

        System.out.println("Name of school is "+sc.getName());
        System.out.println("Name of school is "+sc2.getName());
    }
}
