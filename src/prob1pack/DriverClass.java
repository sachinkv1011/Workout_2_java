package prob1pack;

public class DriverClass {
    public static void main(String[] args) {
        FullTimeFaculty ft1=new FullTimeFaculty(001,15000,6000);
        FullTimeFaculty ft2=new FullTimeFaculty(002,20000,8000);
        PartTimeFaculty pt1=new PartTimeFaculty(005,4,500);
        PartTimeFaculty pt2=new PartTimeFaculty(007,3,600);

        ft1.facultyData();
        ft2.facultyData();

        pt1.facultyData();
        pt2.facultyData();
    }
}
