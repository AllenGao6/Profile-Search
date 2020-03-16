import java.awt.Graphics;
public abstract class Employee{
    
    private String name;
    private String PhotoFile;
    private String JobTitle;
    
    public Employee(String name, String PhotoFile, String JobTitle)
    {
        this.name = name;
        this.PhotoFile = PhotoFile;
        this.JobTitle = JobTitle;
    }

    public abstract double getSalary();
    
    public abstract void drawPhoto(Graphics g, int width, int height);
    
    public String getJobTitle()
    {
        return JobTitle;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return "Name : " + name + "; Job Title : " + JobTitle;
    }
}