package prob1pack;

public class PartTimeFaculty extends Faculty{
    private int hour ;
    private float rate;

    public PartTimeFaculty(int facultyid,int hour,float rate){
        this.setFacultyid(facultyid);
        this.hour=hour;
        this.rate=rate;
        this.salary=this.hour*this.rate;
    }
    void facultyData(){
        System.out.println("Part time faculty");
        System.out.println("ID: "+this.getFacultyid() +"\nBasic hours: "+this.hour +"\nRatePerHour: "+this.rate+"\nSalary: "+this.salary);
        System.out.println("---------------------------------------");
    }
}
