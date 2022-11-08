import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Grasp extends JFrame {

    public static void initialize() {

        // Creating the Frame
        JFrame frame = new JFrame("Term 2 Grasp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // WelcomeLabel
        JLabel WelcomeLabel = new JLabel("<html>Welcome to the Extreme School Calculator!<br/> Please pick a button to visit different calculators!</html>");
        WelcomeLabel.setFont(new Font ("Karla", Font.PLAIN, 25));

        // Creating the EdenRedActionPanel and adding components
        JPanel EdenRedPanel = new JPanel(); // the panel is not visible in output
        EdenRedPanel.setVisible(false);
        EdenRedPanel.setFont(new Font("karla", Font.PLAIN, 15));
        EdenRedPanel.setPreferredSize(new Dimension(400, 200));
        EdenRedPanel.setBackground(Color.lightGray);
        EdenRedPanel.setLayout(new FlowLayout(FlowLayout.CENTER ,30, 15)); 


        JLabel IntroLabel1 = new JLabel("<html>Welcome to the EdenRed Expenditure Calculator. <br/> After inputing your current balance and the day of the month, <br/> we will calculate how much money you can use per day!</html>");
        JLabel label = new JLabel("Enter your current card balance");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JLabel labelA = new JLabel("Enter the day of the month");
        JTextField tfA = new JTextField(10);

        JPanel ResultsPanel = new JPanel();
        ResultsPanel.setBackground(new Color(255, 255, 255));
        ResultsPanel.setVisible(false);
        ResultsPanel.setBorder(new EmptyBorder(5, 40, 5, 40));
        JTextArea Result = new JTextArea();
        ResultsPanel.add(Result);

        JButton calculate = new JButton("Calculate");
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // method calculations
                String Balance = tf.getText();
                String MonthDay = tfA.getText();
                double FinalBalance = Double.parseDouble(Balance);
                double FinalDay = 27 - Double.parseDouble(MonthDay);
                double result = FinalBalance / FinalDay;
                String FinalResult = Double.toString(result);

                Result.setText(FinalResult + "€");
                Result.setVisible(true);
            }
        });

        EdenRedPanel.add(IntroLabel1);
        EdenRedPanel.add(label);
        EdenRedPanel.add(tf);
        EdenRedPanel.add(labelA);
        EdenRedPanel.add(tfA);
        EdenRedPanel.add(calculate);
        EdenRedPanel.add(ResultsPanel);

        // Creating the StudyHoursActionPanel and adding components
        JPanel StudyHoursPanel = new JPanel(); // the panel is not visible in output
        StudyHoursPanel.setVisible(false);
        StudyHoursPanel.setPreferredSize(new Dimension(400, 200));
        StudyHoursPanel.setBackground(Color.lightGray);
        StudyHoursPanel.setLayout(new FlowLayout(FlowLayout.CENTER ,30, 15)); 

       
        JLabel IntroLabel2 = new JLabel("<html>Welcome to the Study Hours Predictor. <br/> After inputing your current year and term, <br/> we will accuratelly predict whether you have study hours or not!</html>");
        JLabel label2 = new JLabel("Enter your current year of study");
        JTextField tf2 = new JTextField(10); // accepts upto 10 characters
        JLabel label2A = new JLabel("Enter the current term of the school year");
        JTextField tf2A = new JTextField(10);

        JPanel ResultsPanel1 = new JPanel();
        ResultsPanel1.setBackground(new Color(255, 255, 255));
        ResultsPanel1.setVisible(false);
        ResultsPanel1.setBorder(new EmptyBorder(5, 30, 5, 30));
        JTextArea Result1 = new JTextArea();
        ResultsPanel1.add(Result1);

        JButton calculate2 = new JButton("calculate");
        calculate2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // method calculations
                String InputYear = tf2.getText();
                String InputTerm = tf2A.getText();

                int year = Integer.parseInt(InputYear);
                int term = Integer.parseInt(InputTerm);

                if (year < 5 && term < 5) {
                    if (year == 1) {
                        Result1.setText("Yes, checkin is at 7 pm.");
                    } else if (year == 2 && term < 3) {
                        Result1.setText("Yes, checkin is at 7 pm.");
                    } else if (year == 2 && term > 2) {
                        Result1.setText("No unless otherwise stated, enjoy a 'free' evening.");
                    } else if (year == 3 && term == 1) {
                        Result1.setText("Yes, checkin is at 7 pm.");
                    } else if (year == 3 && term > 1) {
                        Result1.setText("No unless otherwise stated, enjoy a 'free' evening.");
                    } else if (year == 4 && term < 5) {
                        Result1.setText("No unless otherwise stated, enjoy a 'free' evening.");
                    }
                } else {
                    Result1.setText("Please enter a valid year or term.");
                }

                Result1.setVisible(true);
            }
        });

        StudyHoursPanel.add(IntroLabel2);
        StudyHoursPanel.add(label2);
        StudyHoursPanel.add(tf2);
        StudyHoursPanel.add(label2A);
        StudyHoursPanel.add(tf2A);
        StudyHoursPanel.add(calculate2);
        StudyHoursPanel.add(ResultsPanel1);





        // Creating the AnimalAgeActionPanel and adding components
        JPanel AnimalAgePanel = new JPanel(); // the panel is not visible in output
        AnimalAgePanel.setVisible(false);
        AnimalAgePanel.setPreferredSize(new Dimension(400, 200));
        AnimalAgePanel.setBackground(Color.lightGray);
        AnimalAgePanel.setLayout(new FlowLayout(FlowLayout.CENTER ,30, 15)); 

       
        JLabel IntroLabel3 = new JLabel("<html>Welcome to the Animal Age Calculator. <br/> After inputing your current age and picking an animal, <br/> we will calculate your age in that specific animal's years!</html>");        JRadioButton radioDog = new JRadioButton("Dog");
        JRadioButton radioCat = new JRadioButton("Cat");
        JRadioButton radioChicken = new JRadioButton("Chicken");
        JLabel label3A = new JLabel("Enter your current age");
        JTextField tf3A = new JTextField(10);

        JPanel ResultsPanel2 = new JPanel();
        ResultsPanel2.setBackground(new Color(255, 255, 255));
        ResultsPanel2.setVisible(false);
        ResultsPanel2.setBorder(new EmptyBorder(5, 100, 5, 100));
        JTextArea Result2 = new JTextArea();
        ResultsPanel2.add(Result2);

        JButton calculate3 = new JButton("Calculate");
        calculate3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // method calculations
                boolean DogSelected = radioDog.isSelected();
                boolean CatSelected = radioCat.isSelected();
                boolean ChickenSelected = radioChicken.isSelected();

                String Dog = String.valueOf(DogSelected);
                String Cat = String.valueOf(CatSelected);
                String Chicken = String.valueOf(ChickenSelected);

                String InputAge = tf3A.getText();
                int Age = Integer.parseInt(InputAge);

                if (Dog == "true" && Cat == "false" && Chicken == "false") {
                    double DogAge = Age * 3.64;
                    Result2.setText("Your age in dog years is " + DogAge);
                } else if (Cat == "true" && Dog == "false" && Chicken == "false") {
                    double CatAge = Age * 3.2;
                    Result2.setText("Your age in cat years is " + CatAge);
                } else if (Chicken == "true" && Cat == "false" && Dog == "false") {
                    double ChickenAge = Age * 5.33;
                    Result2.setText("Your age in chicken years is " + ChickenAge);
                } else {
                    Result2.setText("Make sure to fill in all the fields correctly!");
                }

                Result2.setVisible(true);
            }
        });

        AnimalAgePanel.add(IntroLabel3);
        AnimalAgePanel.add(radioDog);
        AnimalAgePanel.add(radioCat);
        AnimalAgePanel.add(radioChicken);
        AnimalAgePanel.add(label3A);
        AnimalAgePanel.add(tf3A);
        AnimalAgePanel.add(calculate3);
        AnimalAgePanel.add(ResultsPanel2);

        // Creating the ApWellbeingActionPanel and adding components
        JPanel ApWellbeingPanel = new JPanel();  
        ApWellbeingPanel.setVisible(false);
        ApWellbeingPanel.setPreferredSize(new Dimension(480, 600));
        ApWellbeingPanel.setBackground(Color.lightGray);
        ApWellbeingPanel.setLayout(new FlowLayout(FlowLayout.LEADING ,30, 15)); 


        JLabel IntroLabel4 = new JLabel("<html>Welcome to the Wellbeing Predictor. <br/> After inputing your APs from each block, <br/> we will assign a wellbeing points (out of 5) <br/> and predict your wellbeing for the year!</html>");

        //Block1
        JLabel label4 = new JLabel("<html><br/>How many of these classes did you choose this year?</html>");
        JLabel Block1 = new JLabel("<html>AP Statistics,<br/> AP Computer Science Principles, <br/> AP Computer Science A,<br/> AP English,<br/> AP Human Geography</html>");
        JTextField tf4 = new JTextField(10); // accepts upto 10 characters

       
        //Block2
        JLabel label4A = new JLabel("<html><br/>How many of these classes did you choose this year?</html>");
        JLabel Block2 = new JLabel("<html>AP Economics, <br/> AP Studio Art, <br/> AP French Language,<br/> AP Literature, <br/> AP German Language</html>");
        JTextField tf4A = new JTextField(10);
        tf4A.setLayout(new FlowLayout(FlowLayout.CENTER)); 


        //Block3
        JLabel label4B = new JLabel("<html><br/>How many of these classes did you choose this year?</html>");
        JLabel Block3 = new JLabel("<html>AP Comparative Government, <br/> AP Biology,<br/> AP Calculus, <br/> AP Psychology, <br/> AP Art History, <br/> AP Seminar/Research, <br/> AP European History, <br/> AP Physics</html>");
        JTextField tf4B = new JTextField(10);
        tf4B.setLayout(new FlowLayout(FlowLayout.CENTER)); 


        JPanel ResultsPanel4 = new JPanel();
        ResultsPanel4.setBackground(new Color(255, 255, 255));
        ResultsPanel4.setVisible(false);
        ResultsPanel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        ResultsPanel4.setBorder(new EmptyBorder(5, 80, 5, 80));         
        JTextArea Result5 = new JTextArea();
        Result5.setSize(200, 5);
        ResultsPanel4.add(Result5);
        Result5.setLineWrap(true);
        Result5.setWrapStyleWord(true);


        JButton calculate4 = new JButton("Calculate");
        calculate4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double fullWellScore = 5;
                String Block1 = tf4.getText();
                String Block2 = tf4A.getText();
                String Block3 = tf4B.getText();

                double FinalBlock1 =  Double.parseDouble(Block1);
                double FinalBlock2 =  Double.parseDouble(Block2);
                double FinalBlock3 =  Double.parseDouble(Block3);

                double userWellScore = fullWellScore - 0.25*FinalBlock1 - 0.5*FinalBlock2 - 1*FinalBlock3;
                
                
                if (userWellScore >= 4){
                    Result5.setText("Your predicted wellbeing score for this year is " + userWellScore + "/5. Enjoy your year!");
                }
                else if (userWellScore > 3 && userWellScore < 5){
                    Result5.setText("Your predicted wellbeing score for this year is " + userWellScore + "/5. It is good to challenge yourself");
                }
                else if (userWellScore > 1 && userWellScore <= 3){
                    Result5.setText("Your predicted wellbeing score for this year is" + userWellScore + "/5. Forget Friday nights!");
                }
                else if (userWellScore <= 0){
                    Result5.setText("Your predicted wellbeing score for this year is " + userWellScore + "/5. Good luck!");
                }

                 Result5.setVisible(true);

            }
        });

        ApWellbeingPanel.add(IntroLabel4);
        ApWellbeingPanel.add(label4);
        ApWellbeingPanel.add(Block1);
        ApWellbeingPanel.add(tf4);
        ApWellbeingPanel.add(label4A);
        ApWellbeingPanel.add(Block2);
        ApWellbeingPanel.add(tf4A);
        ApWellbeingPanel.add(label4B);
        ApWellbeingPanel.add(Block3);
        ApWellbeingPanel.add(tf4B);
        ApWellbeingPanel.add(calculate4);
        ApWellbeingPanel.add(ResultsPanel4);



         // Creating the HowLeafActionPanel and adding components
         JPanel HowLeafPanel = new JPanel(); // the panel is not visible in output
         HowLeafPanel.setVisible(false);
         HowLeafPanel.setPreferredSize(new Dimension(400, 200));
         HowLeafPanel.setBackground(Color.lightGray);
         HowLeafPanel.setLayout(new FlowLayout(FlowLayout.CENTER ,30, 15)); 
 
 
         JLabel IntroLabel5 = new JLabel("<html>Welcome to the 'how Leaf is your text' Predictor. <br/> After inputing your text, <br/> we will tell you how many times it included the word COMMUNITY!</html>");
         JLabel label5 = new JLabel("Enter your text");
         JTextArea tf5 = new JTextArea();  
         tf5.setLineWrap(true);
         tf5.setWrapStyleWord(true);
 
         JPanel ResultsPanel5 = new JPanel();
         ResultsPanel5.setBackground(new Color(255, 255, 255));
         ResultsPanel5.setVisible(false);
         ResultsPanel5.setBorder(new EmptyBorder(5, 100, 5, 100));
         JTextArea Result6 = new JTextArea();
         ResultsPanel5.add(Result6);
 
         JButton calculate5 = new JButton("Calculate");
         calculate5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
 
                // method calculations
                
                char c = 'c'; 
                char o = 'o';
                char m = 'm';
                char u = 'u';
                char n = 'n';    
                char i = 'i';
                char t = 't';
                char y = 'y';


                int a = 0; //count that keeps the value of how many symbols were correct
                int b = 0; //the amount of cd*e we found in the string

                String In = tf5.getText();            
                String[] Array = In.split(""); //convert our string to array so we can go trough every character in the array


                for (int k = 0; k < Array.length; k++) { //go trough every character in the array
                    
                    char ch = In.charAt(k);
            
                    if(ch == c){ //is character with index k 'c'? 
                        a++; 
                        char ch2 = In.charAt(k+1); 
                        
                        if(ch2 == o){ //is character with index k+1 'o'?
                            a++;
                            char ch3 = In.charAt(k+2);

                            if(ch3 == m){ //is character with index k+2 'm'?
                            a++;
                            char ch4 = In.charAt(k+3);

                                if(ch4 == m){ //is character with index  k+3 'm'?
                                a++;
                                char ch5 = In.charAt(k+4);
                                    if(ch5 == u){ //is character with index k+4 'u'?
                                    a++;
                                    char ch6 = In.charAt(k+5);
                                        if(ch6 == n){ //is character with index k+5 'n'?
                                        a++;
                                        char ch7 = In.charAt(k+6);
                                            if(ch7 == i){ //is character with index k+6 'i'?
                                            a++;
                                            char ch8 = In.charAt(k+7);
                                                if(ch8 == t){ //is character with index k+7 't'?
                                                a++;
                                                char ch9 = In.charAt(k+8);
                                                    if(ch9 == y){ //is character with index k+8 'y'?
                                                    a++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } 
                            }
                        }
                    }
                    if(a == 9){ //if all three conditions are met then add one to b
                        b++;
                    }
                    
                    a = 0; //flush down a
                }
                    String Final = Integer.toString(b);
                    Result6.setText(Final);
                    Result6.setVisible(true);
             }
         });
 
        HowLeafPanel.add(IntroLabel5);
         HowLeafPanel.add(label5);
         HowLeafPanel.add(tf5);
         HowLeafPanel.add(calculate5);
         HowLeafPanel.add(ResultsPanel5);
       
        // Creating the ButtonsPanel and adding components
        JPanel buttonsPanel = new JPanel();

        // Edenred button
        JButton btn1 = new JButton("EdenRed");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EdenRedPanel.setVisible(true);
                ResultsPanel.setVisible(true);

                // make sure other panels don't intterupt
                WelcomeLabel.setVisible(false);
                StudyHoursPanel.setVisible(false);
                AnimalAgePanel.setVisible(false);
                ApWellbeingPanel.setVisible(false);
                HowLeafPanel.setVisible(false);

            }
        });

        // btn1 style
        btn1.setBackground(new Color(0, 0, 0));
        btn1.setForeground(Color.WHITE);
        btn1.setFont(new Font("Karla", Font.BOLD, 13));
        btn1.setBorderPainted(false);
        btn1.setFocusPainted(false);

        // StudyHours button
        JButton btn2 = new JButton("StudyHours");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomeLabel.setVisible(false);
                StudyHoursPanel.setVisible(true);
                ResultsPanel1.setVisible(true);

                // make sure other panels don't intterupt
                EdenRedPanel.setVisible(false);
                AnimalAgePanel.setVisible(false);
                ApWellbeingPanel.setVisible(false);
                HowLeafPanel.setVisible(false);

            }
        });

        // btn2 style
        btn2.setBackground(new Color(0, 0, 0));
        btn2.setForeground(Color.WHITE);
        btn2.setFont(new Font("Karla", Font.BOLD, 13));
        btn2.setBorderPainted(false);
        btn2.setFocusPainted(false);

        // AnimalAge button
        JButton btn3 = new JButton("AnimalAge");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomeLabel.setVisible(false);
                AnimalAgePanel.setVisible(true);
                ResultsPanel2.setVisible(true);

                // make sure other panels don't intterupt
                EdenRedPanel.setVisible(false);
                StudyHoursPanel.setVisible(false);
                ApWellbeingPanel.setVisible(false);
                HowLeafPanel.setVisible(false);

            }
        });

        // btn3 style
        btn3.setBackground(new Color(0, 0, 0));
        btn3.setForeground(Color.WHITE);
        btn3.setFont(new Font("Karla", Font.BOLD, 13));
        btn3.setBorderPainted(false);
        btn3.setFocusPainted(false);

        // AnimalAge button
        JButton btn4 = new JButton("Wellbeing");
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomeLabel.setVisible(false);
                ResultsPanel4.setVisible(true);
                ApWellbeingPanel.setVisible(true);

                // make sure other panels don't intterupt
                EdenRedPanel.setVisible(false);
                StudyHoursPanel.setVisible(false);
                AnimalAgePanel.setVisible(false);
                HowLeafPanel.setVisible(false);


            }
        });

        // btn4 style
        btn4.setBackground(new Color(0, 0, 0));
        btn4.setForeground(Color.WHITE);
        btn4.setFont(new Font("Karla", Font.BOLD, 13));
        btn4.setBorderPainted(false);
        btn4.setFocusPainted(false);


        JButton btn5 = new JButton("How Leaf?");
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HowLeafPanel.setVisible(true);
                ResultsPanel5.setVisible(true);

                // make sure other panels don't intterupt
                WelcomeLabel.setVisible(false);
                StudyHoursPanel.setVisible(false);
                AnimalAgePanel.setVisible(false);
                ApWellbeingPanel.setVisible(false);
                EdenRedPanel.setVisible(false);


            }
        });

        // btn5 style
        btn5.setBackground(new Color(0, 0, 0));
        btn5.setForeground(Color.WHITE);
        btn5.setFont(new Font("Karla", Font.BOLD, 13));
        btn5.setBorderPainted(false);
        btn5.setFocusPainted(false);



        // adding buttons to the buttonsPanel
        buttonsPanel.add(btn1);
        buttonsPanel.add(btn2);
        buttonsPanel.add(btn3);
        buttonsPanel.add(btn4);
        buttonsPanel.add(btn5);


        // Creating MainPanel and adding components
        JPanel MainPanel = new JPanel();
        MainPanel.add(EdenRedPanel);
        MainPanel.add(StudyHoursPanel);
        MainPanel.add(AnimalAgePanel);
        MainPanel.add(ApWellbeingPanel);
        MainPanel.add(HowLeafPanel);
        MainPanel.add(WelcomeLabel);
        MainPanel.setBorder(new EmptyBorder(80, 10, 10, 10));

        // Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.CENTER, MainPanel);
        frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
        frame.setVisible(true);
    }

    public static void main(String args[]) {

        initialize();
    }
} 
