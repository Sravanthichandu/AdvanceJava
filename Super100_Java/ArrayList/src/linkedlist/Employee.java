package linkedlist;

public class Employee {
    
    private String EmpName;
    private int EmpId;


    public Employee()
    {

    }

    public Employee(String EmpName,int EmpId)
    {
        this.EmpName=EmpName;
        this.EmpId=EmpId;
   
    }

    public void setEname(String EmpName)
    {
        this.EmpName=EmpName;
    }

    public String getEname()
    {
        return EmpName;
    }

    public void setEmpID(String EmpId)
    {
        this.EmpId=EmpId;
    }





}
