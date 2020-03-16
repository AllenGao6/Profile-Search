import java.awt.Graphics;
import java.io.File;
public class Government extends Employee
{
    private String cityName;
    
    public Government(String name, String PhotoFile, String JobTitle, String cityName)
    {
        super(name, PhotoFile, JobTitle);
        this.cityName = cityName;
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
        return super.toString() + " ;city name : " + cityName;
    }

}