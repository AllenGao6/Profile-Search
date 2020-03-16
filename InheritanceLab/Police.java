import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Color;
public class Police extends Government
{
    private BufferedImage PhotoImage;
    private String office;
    public Police(String name, String PhotoFile, String JobTitle, String cityName, String office)
    {
        super(name, PhotoFile, JobTitle, cityName);
        this.office = office;
        try {
                PhotoImage = ImageIO.read(new File(PhotoFile));
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    public double getSalary()
    {
        return 24000.0;
    }
    
    public void drawPhoto(Graphics g, int width, int height)
    {
        g.setColor(Color.red);
        g.drawImage(PhotoImage, width, height, null);
        g.drawString(this.toString(),width+60,height+30);
    }
    public String toString()
    {
        return super.toString() + "; Salary: " + this.getSalary() + " ;office: " + this.office;
    }

}