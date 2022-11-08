package prob1pack;

public class FullTimeFaculty extends Faculty{
    private double basic;
    private double allowance;

    FullTimeFaculty(int facultyid,double basic,double allowance){
        this.setFacultyid(facultyid);
        this.basic=basic;
        this.allowance=allowance;
        this.salary=this.basic+this.allowance;
    }
    void facultyData(){
        System.out.println("Full time faculty");
        System.out.println("ID: "+this.getFacultyid() +"\nBasic pay: "+this.basic +"\nAllowance: "+this.allowance+"\nSalary: "+this.salary);
        System.out.println("---------------------------------------");
    }


}
