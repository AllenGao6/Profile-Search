import java.awt.Graphics;
public class Company extends Employee{
    
    private String companyName;
    
    public Company(String name, String PhotoFile, String JobTitle, String companyName)
    {
        super(name, PhotoFile, JobTitle);
        this.companyName = companyName;
    }
    public double getSalary()
    {
        return 0;
    }
    
    //
    public void drawPhoto(Graphics g, int width, int height)
    {
    
    }
    public String toString()
    {
        return super.toString() + "; Company Name : " + companyName;
    }
}