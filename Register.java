mport javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class MyFrame
    extends JFrame
    implements ActionListener {
	
	private Container c;
    private JLabel title;
    private JLabel first;
    private JTextField tfirst;
    private JLabel last;
    private JTextField tlast;
    private JLabel add;
    private JTextArea tadd;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year; 
    private JLabel sports;
    private JCheckBox basketball;
    private JCheckBox volleyball;
    private JCheckBox football;
    private JCheckBox soccer;
    private JCheckBox rugby;
    private JLabel hobbies;
    private JCheckBox gaming;
    private JCheckBox reading;
    private JCheckBox exercise;
    private JCheckBox instruments;
    private JCheckBox drawing;
    private JLabel movies;
    private JCheckBox avengers;
    private JCheckBox smurfs;
    private JCheckBox transformers;
    private JCheckBox venom;
    private JCheckBox spiderman;
    private JLabel subjects;
    private JCheckBox math;
    private JCheckBox science;
    private JCheckBox pe;
    private JCheckBox filipino;
    private JCheckBox tle;
    private JButton sub;
    
    private String dates[]
            = { "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30",
                "31" };
        private String months[]
            = { "Jan", "feb", "Mar", "Apr",
                "May", "Jun", "July", "Aug",
                "Sup", "Oct", "Nov", "Dec" };
        private String years[]
            = { "1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019" };
        
        
        public MyFrame()
        {
            setTitle("Registration Form");
            setBounds(300, 90, 900, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
     
            c = getContentPane();
            c.setLayout(null);
            
            title = new JLabel("Registration Form");
            title.setFont(new Font("Arial", Font.PLAIN, 30));
            title.setSize(300, 30);
            title.setLocation(300, 30);
            c.add(title);
            
            first = new JLabel("First Name");
            first.setFont(new Font("Arial", Font.PLAIN, 20));
            first.setSize(100, 20);
            first.setLocation(100, 100);
            c.add(first);
            
            tfirst = new JTextField();
            tfirst.setFont(new Font("Arial", Font.PLAIN, 15));
            tfirst.setSize(190, 20);
            tfirst.setLocation(200, 100);
            c.add(tfirst);
            
            last = new JLabel("Last Name");
            last.setFont(new Font("Arial", Font.PLAIN, 20));
            last.setSize(100, 20);
            last.setLocation(100, 100);
            c.add(last);
            
            tlast = new JTextField();
            tlast.setFont(new Font("Arial", Font.PLAIN, 15));
            tlast.setSize(190, 20);
            tlast.setLocation(200, 100);
            c.add(tlast);
            
            add = new JLabel("Address");
            add.setFont(new Font("Arial", Font.PLAIN, 20));
            add.setSize(100, 20);
            add.setLocation(100, 300);
            c.add(add);
     
            tadd = new JTextArea();
            tadd.setFont(new Font("Arial", Font.PLAIN, 15));
            tadd.setSize(200, 75);
            tadd.setLocation(200, 300);
            tadd.setLineWrap(true);
            c.add(tadd);
            
            gender = new JLabel("Gender");
            gender.setFont(new Font("Arial", Font.PLAIN, 20));
            gender.setSize(100, 20);
            gender.setLocation(100, 200);
            c.add(gender);
     
            male = new JRadioButton("Male");
            male.setFont(new Font("Arial", Font.PLAIN, 15));
            male.setSelected(true);
            male.setSize(75, 20);
            male.setLocation(200, 200);
            c.add(male);
     
            female = new JRadioButton("Female");
            female.setFont(new Font("Arial", Font.PLAIN, 15));
            female.setSelected(false);
            female.setSize(80, 20);
            female.setLocation(275, 200);
            c.add(female);
            
            gengp = new ButtonGroup();
            gengp.add(male);
            gengp.add(female);
            
            dob = new JLabel("DOB");
            dob.setFont(new Font("Arial", Font.PLAIN, 20));
            dob.setSize(100, 20);
            dob.setLocation(100, 250);
            c.add(dob);
     
            date = new JComboBox(dates);
            date.setFont(new Font("Arial", Font.PLAIN, 15));
            date.setSize(50, 20);
            date.setLocation(200, 250);
            c.add(date);
     
            month = new JComboBox(months);
            month.setFont(new Font("Arial", Font.PLAIN, 15));
            month.setSize(60, 20);
            month.setLocation(250, 250);
            c.add(month);
     
            year = new JComboBox(years);
            year.setFont(new Font("Arial", Font.PLAIN, 15));
            year.setSize(60, 20);
            year.setLocation(320, 250);
            c.add(year);
            
            sports = new JLabel("Favorite Sports");
            sports.setFont(new Font("Arial", Font.PLAIN, 20));
            sports.setSize(100, 20);
            sports.setLocation(100, 250);
            c.add(sports);
            
            basketball = new JCheckBox("Basketball");
            basketball.setFont(new Font("Arial", Font.PLAIN, 15));
            basketball.setSize(250, 20);
            basketball.setLocation(150, 400);
            c.add(basketball);
            
            volleyball = new JCheckBox("Volleyball");
            volleyball.setFont(new Font("Arial", Font.PLAIN, 15));
            volleyball.setSize(250, 20);
            volleyball.setLocation(150, 400);
            c.add(volleyball);
            
            football = new JCheckBox("Football");
            football.setFont(new Font("Arial", Font.PLAIN, 15));
            football.setSize(250, 20);
            football.setLocation(150, 400);
            c.add(football);
            
            soccerr = new JCheckBox("Soccerr");
            soccerr.setFont(new Font("Arial", Font.PLAIN, 15));
            soccerr.setSize(250, 20);
            soccerr.setLocation(150, 400);
            c.add(soccerr);
            
            rugby = new JCheckBox("Rugby");
            rugby.setFont(new Font("Arial", Font.PLAIN, 15));
            rugby.setSize(250, 20);
            rugby.setLocation(150, 400);
            c.add(rugby);
            
            
            hobbies = new JLabel("Favorite Hobbies");
            hobbies.setFont(new Font("Arial", Font.PLAIN, 20));
            hobbies.setSize(100, 20);
            hobbies.setLocation(100, 250);
            c.add(hobbies);
            
            gaming = new JCheckBox("Gaming");
            gaming.setFont(new Font("Arial", Font.PLAIN, 15));
            gaming.setSize(250, 20);
            gaming.setLocation(150, 400);
            c.add(gaming);
            
            reading = new JCheckBox("Reading");
            reading.setFont(new Font("Arial", Font.PLAIN, 15));
            reading.setSize(250, 20);
            reading.setLocation(150, 400);
            c.add(reading);
            
            exercise = new JCheckBox("Exercise");
            exercise.setFont(new Font("Arial", Font.PLAIN, 15));
            exercise.setSize(250, 20);
            exercise.setLocation(150, 400);
            c.add(exercise);
            
            instruments = new JCheckBox("Instruments");
            instruments.setFont(new Font("Arial", Font.PLAIN, 15));
            instruments.setSize(250, 20);
            instruments.setLocation(150, 400);
            c.add(instruments);
            
            drawing = new JCheckBox("Drawing");
            drawing.setFont(new Font("Arial", Font.PLAIN, 15));
            drawing.setSize(250, 20);
            drawing.setLocation(150, 400);
            c.add(drawing);
            
            movies = new JLabel("Favorite Movies");
            movies.setFont(new Font("Arial", Font.PLAIN, 20));
            movies.setSize(100, 20);
            movies.setLocation(100, 250);
            c.add(movies);
            
            avengers = new JCheckBox("Avengers");
            avengers.setFont(new Font("Arial", Font.PLAIN, 15));
            avengers.setSize(250, 20);
            avengers.setLocation(150, 400);
            c.add(avengers);
            
            smurfs = new JCheckBox("Smurfs");
            smurfs.setFont(new Font("Arial", Font.PLAIN, 15));
            smurfs.setSize(250, 20);
            smurfs.setLocation(150, 400);
            c.add(smurfs);
            
            transformers = new JCheckBox("Transformers");
            transformers.setFont(new Font("Arial", Font.PLAIN, 15));
            transformers.setSize(250, 20);
            transformers.setLocation(150, 400);
            c.add(exercise);
            
            venom = new JCheckBox("Venom");
            venom.setFont(new Font("Arial", Font.PLAIN, 15));
            venom.setSize(250, 20);
            venom.setLocation(150, 400);
            c.add(venom);
            
            spiderman = new JCheckBox("Spiderman");
            spiderman.setFont(new Font("Arial", Font.PLAIN, 15));
            spiderman.setSize(250, 20);
            spiderman.setLocation(150, 400);
            c.add(drawing);
            
            subjects = new JLabel("Favorite Subjects");
            subjects.setFont(new Font("Arial", Font.PLAIN, 20));
            subjects.setSize(100, 20);
            subjects.setLocation(100, 250);
            c.add(subjects);
            
            math  = new JCheckBox("Math");
            math .setFont(new Font("Arial", Font.PLAIN, 15));
            math .setSize(250, 20);
            math .setLocation(150, 400);
            c.add(math );
            
            science = new JCheckBox("Science");
            science.setFont(new Font("Arial", Font.PLAIN, 15));
            science.setSize(250, 20);
            science.setLocation(150, 400);
            c.add(science);
            
            pe = new JCheckBox("Physical Ed.");
            pe.setFont(new Font("Arial", Font.PLAIN, 15));
            pe.setSize(250, 20);
            pe.setLocation(150, 400);
            c.add(pe);
            
            filipino = new JCheckBox("Filipino");
            filipino.setFont(new Font("Arial", Font.PLAIN, 15));
            filipino.setSize(250, 20);
            filipino.setLocation(150, 400);
            c.add(filipino);
            
            tle = new JCheckBox("TLE");
            tle.setFont(new Font("Arial", Font.PLAIN, 15));
            tle.setSize(250, 20);
            tle.setLocation(150, 400);
            c.add(tle);
            
            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(150, 450);
            sub.addActionListener(this);
            c.add(sub);
            
            setVisible(true);
        }
        
        
        
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == sub) {
                if (term.isSelected()) {
                    String data1;
                    String data
                        = "Name : "
                          + tname.getText() + "\n"
                          + "Mobile : "
                          + tmno.getText() + "\n";
                    if (male.isSelected())
                        data1 = "Gender : Male"
                                + "\n";
                    else
                        data1 = "Gender : Female"
                                + "\n";
                    String data2
                        = "DOB : "
                          + (String)date.getSelectedItem()
                          + "/" + (String)month.getSelectedItem()
                          + "/" + (String)year.getSelectedItem()
                          + "\n";
     
                    String data3 = "Address : " + tadd.getText();
                    tout.setText(data + data1 + data2 + data3);
                    tout.setEditable(false);
                    res.setText("Registration Successfully..");
                }
                else {
                    tout.setText("");
                    resadd.setText("");
                    res.setText("Please accept the"
                                + " terms & conditions..");
                }
            }
     
            else if (e.getSource() == reset) {
                String def = "";
                tname.setText(def);
                tadd.setText(def);
                tmno.setText(def);
                res.setText(def);
                tout.setText(def);
                term.setSelected(false);
                date.setSelectedIndex(0);
                month.setSelectedIndex(0);
                year.setSelectedIndex(0);
                resadd.setText(def);
            }
        }
    }
        class Registration {
        	 
            public static void main(String[] args) throws Exception
            {
                MyFrame f = new MyFrame();
            }
        }
     
