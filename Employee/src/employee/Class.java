/*
 firstName, lastName, age, jobTitle, salary, supervisor, department 
Jane Blake, 24 years old, is a programmer in the Chemistry department and works for Mary Peacock.
 */
package employee;

/**
 *
 * @author sabri
 */
public class Class {
    private String FirstName, LastName, JobTitle, Supervisor, Department;
    private int Age;
    private double Salary;
    
    public void GetInfo(String F, String L, String J, String S, String D, int A, double Sa )
    {
        FirstName = F;
        LastName = L;
        JobTitle = J;
        Supervisor = S;
        Department = D;
        Age = A;
        Salary = Sa;
    }
    public void report()
    {
        System.out.println(FirstName + " ," + Age + " years old, is a "+ JobTitle+ " in the " + Department+ " and works for "+ Supervisor);
    }
    public String Get_First()
    {
        return FirstName;
    }
    public String Get_Last()
    {
        return LastName;
    }
    public String Get_JobTitle()
    {
        return JobTitle;
    }
    public String Get_Supervisor()
    {
        return Supervisor;
    }
    public String Get_Department()
    {
        return Department;
    }
    public int Get_Age()
    {
        return Age;
    }
    public double Get_Salary()
    {
        return Salary;
    }
    public boolean isJonior()
    {
        boolean value = this.Age <= 25;
        return value;
    }
}
