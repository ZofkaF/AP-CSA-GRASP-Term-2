import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Grasp extends JFrame {

    public static void initialize() {
    
    // Creating the Frame
        JFrame frame = new JFrame("Term 2 Grasp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        JLabel background=new JLabel(new ImageIcon("cat.jpg"));
        

    //WelcomeLabel
    JLabel WelcomeLabel = new JLabel ("Welcome to the simple calculator! Please pick a button to visit different calculators!");

    // Creating the EdenRedActionPanel and adding components
        JPanel EdenRedPanel = new JPanel(); // the panel is not visible in output
        EdenRedPanel.setVisible(false);

        JLabel label = new JLabel("Enter your current card balance");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JLabel labelA = new JLabel("Enter the day of the month");
        JTextField tfA = new JTextField(10);

        JPanel ResultsPanel = new JPanel();
        ResultsPanel.setBackground(new Color(255, 255, 255));
        ResultsPanel.setVisible(false);
        ResultsPanel.setBorder(new EmptyBorder(50, 50, 50, 50)); 
        JTextArea Result = new JTextArea();
        ResultsPanel.add(Result);
  
 
        JButton calculate = new JButton("Calculate");
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                //method calculations
                String Balance = tf.getText();
                String MonthDay = tfA.getText();
                double FinalBalance = Double.parseDouble(Balance);
                double FinalDay = 27 - Double.parseDouble(MonthDay);
                double result = FinalBalance / FinalDay;
                String FinalResult = Double.toString(result);

                Result.setText(FinalResult  + "€");
                Result.setVisible(true);
            }
        });

        EdenRedPanel.add(label);  
        EdenRedPanel.add(tf);
        EdenRedPanel.add(labelA);
        EdenRedPanel.add(tfA);
        EdenRedPanel.add(calculate);
        EdenRedPanel.add(ResultsPanel);



    // Creating the StudyHoursActionPanel and adding components
        JPanel StudyHoursPanel = new JPanel(); // the panel is not visible in output
        StudyHoursPanel.setVisible(false);
        
        JLabel label2 = new JLabel("Please input your current year of study");
        JTextField tf2 = new JTextField(10); // accepts upto 10 characters
        JLabel label2A = new JLabel("Please input your the current term of the school year");
        JTextField tf2A = new JTextField(10); 

        JPanel ResultsPanel1 = new JPanel();
        ResultsPanel1.setBackground(new Color(255, 255, 255));
        ResultsPanel1.setVisible(false);
        ResultsPanel1.setBorder(new EmptyBorder(50, 50, 50, 50)); 
        JTextArea Result1 = new JTextArea();
        ResultsPanel1.add(Result1);

        JButton calculate2 = new JButton("calculate");
        calculate2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                //method calculations
                String InputYear = tf2.getText();
                String InputTerm = tf2A.getText();

                int year = Integer.parseInt(InputYear);
                int term = Integer.parseInt(InputTerm);

                if(year < 5 && term < 5){
                    if (year == 1){
                        Result1.setText("Yes, checkin is at 7 pm.");
                    }
                    else if (year == 2 && term < 3){
                        Result1.setText("Yes, checkin is at 7 pm.");
                    }
                    else if (year == 2 && term > 2){
                        Result1.setText("No unless otherwise stated, enjoy a free evening.");
                    }
                    else if (year == 3 && term == 1){
                        Result1.setText("Yes, checkin is at 7 pm.");
                    }
                    else if (year == 3 && term > 1){
                        Result1.setText("No unless otherwise stated, enjoy a free evening.");
                    }
                    else if (year == 4 && term < 5){
                        Result1.setText("No unless otherwise stated, enjoy a free evening.");
                    }
                }
                else{
                    Result1.setText("Please enter a valid year or term.");
                }

                Result1.setVisible(true);
            }
        });

        StudyHoursPanel.add(label2); 
        StudyHoursPanel.add(tf2);
        StudyHoursPanel.add(label2A); 
        StudyHoursPanel.add(tf2A);
        StudyHoursPanel.add(calculate2);
        StudyHoursPanel.add(ResultsPanel1);
         



    // Creating the AnimalAgeActionPanel and adding components
    JPanel AnimalAgePanel = new JPanel(); // the panel is not visible in output
    AnimalAgePanel.setVisible(false);

    JRadioButton radioDog = new JRadioButton("Dog");
    JRadioButton radioCat = new JRadioButton("Cat");
    JRadioButton radioChicken = new JRadioButton("Chicken");
    JLabel label3A = new JLabel("Enter your current age");
    JTextField tf3A = new JTextField(10);

    JPanel ResultsPanel2 = new JPanel();
    ResultsPanel2.setBackground(new Color(255, 255, 255));
    ResultsPanel2.setVisible(false);
    ResultsPanel2.setBorder(new EmptyBorder(50, 50, 50, 50)); 
    JTextArea Result2 = new JTextArea();
    ResultsPanel2.add(Result2);


    JButton calculate3 = new JButton("Calculate");
    calculate3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            //method calculations
            boolean DogSelected = radioDog.isSelected(); 
            boolean CatSelected = radioCat.isSelected(); 
            boolean ChickenSelected = radioChicken.isSelected(); 

            String Dog = String.valueOf(DogSelected);
            String Cat = String.valueOf(CatSelected);
            String Chicken = String.valueOf(ChickenSelected);


            String InputAge = tf3A.getText();
            int Age = Integer.parseInt(InputAge);

            if(Dog == "true" && Cat == "false" && Chicken == "false"){
                double DogAge = Age * 3.64;
                Result2.setText("Your age in dog years is " + DogAge);
            }
            else if (Cat == "true" && Dog == "false" && Chicken == "false"){
                double CatAge = Age * 3.2;
                Result2.setText("Your age in cat years is " + CatAge);
            }
            else if (Chicken == "true" && Cat == "false" && Dog == "false"){
                double ChickenAge = Age * 5.33;
                Result2.setText("Your age in chicken years is " + ChickenAge);
            }
            else{
                Result2.setText("Make sure to fill in all the fields correctly!");
            }

            Result2.setVisible(true);
        }
    });

    AnimalAgePanel.add(radioDog);  
    AnimalAgePanel.add(radioCat);  
    AnimalAgePanel.add(radioChicken);  
    AnimalAgePanel.add(label3A);
    AnimalAgePanel.add(tf3A);
    AnimalAgePanel.add(calculate3);
    AnimalAgePanel.add(ResultsPanel2);






    // Creating the ButtonsPanel and adding components
        JPanel buttonsPanel = new JPanel();

    //Edenred button
       JButton btn1 = new JButton("EdenRed");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EdenRedPanel.setVisible(true);
                ResultsPanel.setVisible(true);

                //make sure other panels don't intterupt
                WelcomeLabel.setVisible(false);
                StudyHoursPanel.setVisible(false);
                AnimalAgePanel.setVisible(false);

            }
        });

        //btn1 style
        btn1.setBackground(new Color(0, 0, 0));
        btn1.setForeground(Color.WHITE);
        btn1.setFont(new Font("Karla", Font.BOLD, 13));
        btn1.setBorderPainted(false);
        btn1.setFocusPainted(false);



    //StudyHours button
        JButton btn2 = new JButton("StudyHours");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudyHoursPanel.setVisible(true);
                ResultsPanel1.setVisible(true);

                //make sure other panels don't intterupt
                WelcomeLabel.setVisible(false);
                EdenRedPanel.setVisible(false);
                AnimalAgePanel.setVisible(false);

            }
        });

        //btn2 style
        btn2.setBackground(new Color(0, 0, 0));
        btn2.setForeground(Color.WHITE);
        btn2.setFont(new Font("Karla", Font.BOLD, 13));
        btn2.setBorderPainted(false);
        btn2.setFocusPainted(false);



        //AnimalAge button
        JButton btn3 = new JButton("AnimalAge");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomeLabel.setVisible(false);
                AnimalAgePanel.setVisible(true);
                ResultsPanel2.setVisible(true);

                //make sure other panels don't intterupt
                EdenRedPanel.setVisible(false);
                StudyHoursPanel.setVisible(false);
            }
        });
        
        //btn3 style
        btn3.setBackground(new Color(0, 0, 0));
        btn3.setForeground(Color.WHITE);
        btn3.setFont(new Font("Karla", Font.BOLD, 13));
        btn3.setBorderPainted(false);
        btn3.setFocusPainted(false);
 
        //adding buttons to the buttonsPanel
        buttonsPanel.add(btn1);
        buttonsPanel.add(btn2);
        buttonsPanel.add(btn3);

        //Creating MainPanel and adding components
        JPanel MainPanel = new JPanel();
        MainPanel.add(EdenRedPanel);
        MainPanel.add(StudyHoursPanel);
        MainPanel.add(AnimalAgePanel);
        MainPanel.add(WelcomeLabel);
        MainPanel.setBorder(new EmptyBorder(80, 10, 10, 10));



        // Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.CENTER, MainPanel);
        frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
        frame.setVisible(true);
        frame.add(BorderLayout.SOUTH, background);

    }

    public static void main(String args[]) {

        initialize();
    }
}
