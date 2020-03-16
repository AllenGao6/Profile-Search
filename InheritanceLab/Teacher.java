import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Color;
public class Teacher extends Government
{
    private BufferedImage PhotoImage;
    private String School;
    public Teacher(String name, String PhotoFile, String JobTitle, String cityName, String School)
    {
        super(name, PhotoFile, JobTitle, cityName);
        this.School = School;
        try {
                PhotoImage = ImageIO.read(new File(PhotoFile));
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    public double getSalary()
    {
        return 6000.0;
    }
    /*public String JobTitle()
    {
        return JobTitle;
    }*/
    public void drawPhoto(Graphics g, int width, int height)
    {
        g.setColor(Color.red);
        g.drawImage(PhotoImage, width, height, null);
        g.drawString(this.toString(),width+60,height+30);
    }
    public String toString()
    {
        return super.toString() + "; Salary: " + this.getSalary() + " ;School: " + this.School;
    }

}