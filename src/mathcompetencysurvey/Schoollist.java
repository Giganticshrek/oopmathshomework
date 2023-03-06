package mathcompetencysurvey;

public class Schoollist
{
    private School schools[] = new School[10];
    private int currnum;

    //operations
    public void addSchool(School sc){
        schools[currnum] = sc;
        currnum ++;
    }
    public static void main(String args[]){
        Schoollist moelist = new Schoollist();
        moelist.addSchool(new School());
    }

}
