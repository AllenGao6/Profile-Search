import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.imageio.ImageIO;
 
public class Screen extends JPanel implements ActionListener {
    
    private ArrayList<Employee> ep;
    private Company cp;
    private Government gv;
    private JButton TeacherButton;
    private JButton BankerButton;
    private JButton EngineerButton;
    private JButton PoliceButton;
    private JButton NameButton;
    private JButton DeleteButton;
    private JTextField Login;
    int number;
    int x = 60;
    int y = 65;
public Screen() {

    this.setLayout(null);
    number = 0;
    ep = new ArrayList<Employee>();
    //Private Banker
    PrivateBanker John = new PrivateBanker("John","John.png","Private banker","Bank Of America");
    PrivateBanker Peter = new PrivateBanker("Peter","Peter.jpg","Private banker","City Bank");
    //Private Engineer
    PrivateEngineer Allen = new PrivateEngineer("Allen","Allen.png","Private Engineer","Apple");
    PrivateEngineer Alan = new PrivateEngineer("Alan","Alan.png","Private Engineer","Google");
    //Teacher
    Teacher Andy = new Teacher("Andy","Andy.jpg","Teacher","Mountain View","MVHS");
    Teacher Lucy = new Teacher("Lucy","Lucy.jpg","Teacher","Los Altos","LAHS"); 
    //police officers
    Police Brandon = new Police("Police","Brandon.jpg","Police","Mountain View","Office 112");
    Police Bob = new Police("Police","Bob.jpg","Police","Los Altos","Office 666");
    /////////////////////////////////////////////////////////////////////////////////////
    //private bankers
    ep.add(John);
    ep.add(Peter);
    //Private Engineers
    ep.add(Allen);
    ep.add(Alan);
    //Teacher
    ep.add(Andy);
    ep.add(Lucy);
    //police
    ep.add(Brandon);
    ep.add(Bob);
    ////////////////////////////////////////////////////////////////////////////////////
    //Teacher
    TeacherButton = new JButton("Teacher");
    TeacherButton.setBounds(250,15,80, 25); //sets the location and size
    TeacherButton.addActionListener(this); //add the listener
    this.add(TeacherButton); //add to JPanel
    //changepinButton.setVisible(false);
    //Police
    PoliceButton = new JButton("Police");
    PoliceButton.setBounds(350,15,80, 25); //sets the location and size
    PoliceButton.addActionListener(this); //add the listener
    this.add(PoliceButton); //add to JPanel
    //Engineer
    EngineerButton = new JButton("Engineer");
    EngineerButton.setBounds(450,15,80, 25); //sets the location and size
    EngineerButton.addActionListener(this); //add the listener
    this.add(EngineerButton); //add to JPanel
    //Banker
    BankerButton = new JButton("Banker");
    BankerButton.setBounds(550,15,80, 25); //sets the location and size
    BankerButton.addActionListener(this); //add the listener
    this.add(BankerButton); //add to JPanel
    
    NameButton = new JButton("Search Name");
    NameButton.setBounds(750,15,160, 25); //sets the location and size
    NameButton.addActionListener(this); //add the listener
    this.add(NameButton); //add to JPanel
    
    DeleteButton = new JButton("Delete");
    //DeleteButton.setBounds(new (650,500,80,25));
    //DeleteButton.setBounds(new (750,360,80,25)); //sets the location and size
    DeleteButton.addActionListener(this); //add the listener
    this.add(DeleteButton); //add to JPanel
    
    Login = new JTextField(20);
    Login.setBounds(650,15, 80, 30);
    this.add(Login);
        
    this.setFocusable(true);
 
    }
 
    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(1000,700);
    }
 
   
   
    
    public void paintComponent(Graphics g) {
        //draw background
        g.setColor(Color.black);
        g.fillRect(0,0,1000,700);
        g.setColor(Color.green);
        g.fillRect(50,50,900,600);
        g.drawLine(0,0,50,50);
        g.drawLine(0,700,50,650);
        g.drawLine(1000,0,950,50);
        g.drawLine(1000,700,950,650);
        
        if(number == 0){
            for(int i = 0; i<ep.size();i++)
            {
                ep.get(i).drawPhoto(g, x, y*(i+1));
            }
        }
        else if(number == 1){
            for(int i = 0; i<ep.size();i++)
            {
                if(ep.get(i).getJobTitle().equals("Teacher"))
                {
                    ep.get(i).drawPhoto(g, x, y*(i+1));
                }
            }
        }
        else if(number == 2){
            for(int i = 0; i<ep.size();i++)
            {
                if(ep.get(i).getJobTitle().equals("Police"))
                {
                    ep.get(i).drawPhoto(g, x, y*(i+1));
                }
            }
        }
        else if(number == 3){
            for(int i = 0; i<ep.size();i++)
            {
                if(ep.get(i).getJobTitle().equals("Private banker"))
                {
                    ep.get(i).drawPhoto(g, x, y*(i+1));
                }
            }
        }
        else if(number == 4){
            for(int i = 0; i<ep.size();i++)
            {
                if(ep.get(i).getJobTitle().equals("Private Engineer"))
                {
                    ep.get(i).drawPhoto(g, x, y*(i+1));
                }
            }
        }
        else if(number == 5){
            String text = Login.getText();
            for(int i = 0; i<ep.size();i++)
            {
                if(ep.get(i).getName().equals(text))
                {
                    ep.get(i).drawPhoto(g, x, y*(i+1));
                }
            }
        }
        
    }
 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == TeacherButton) 
        {
            System.out.println("TeacherButton");
            number = 1;
             repaint();
        }
            
        
        else if(e.getSource() == PoliceButton) {
            System.out.println("PoliceButton");
            number = 2;
            repaint();
        }
         else if(e.getSource() == BankerButton) {
            System.out.println("bankerButton");
            number = 3;
            repaint();
        }
         else if(e.getSource() == EngineerButton) {
            System.out.println("EngineerButton");
            number = 4;
            repaint();
        }
        else if(e.getSource() == NameButton) {
            System.out.println("NameButton");
            number = 5;
            repaint();
        }
        else if(e.getSource() == DeleteButton) {
            System.out.println("DeleteButton");
            //number = 5;
            repaint();
        }
    }
        
       
}
    
 
 
