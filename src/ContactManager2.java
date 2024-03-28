
    //Import Statements
import javax.swing.*;//provides classes for building GUI(graphic user interface)
import java.awt.*;//provides classes for managing GUI components
import java.awt.event.*;//provides classes and interfaces for handling events generated by user interactions
import java.sql.*;//provides classes and interfaces for accessing and processing data stored in a database

    public class ContactManager2 extends JFrame implements ActionListener {
        //Defines class 'ContactManagerGUI4'
        //extends 'JFrame' [class]
        //implements 'ActionListener' interface

        //Instance Variables
        private JButton searchButton, inputButton;  //Declares two private instance variables
        //private--> can only be accessed with the class where they declared
        //JButton --> button for searching and inputting contact information
        //JButton--> CLASS from 'java.swing' package, creates push button in a GUI
        //JButton--> DATA TYPE of the VARIABLES 'searchButton' and 'inputButton'
        //'searchButton' and 'inputButton' wills store references to instances of the 'JButton class'
        //Not initialized, b/c JButton not declared. Okay, b/c external framework 'java.swing' has been imported
        private JPanel mainPanel;//Declares private instance variable, [type:JPanel]
        //JPanel- from 'java.swing' package, generic container, holds GUI components (like main window)
        //JPanel-data type of the variable 'mainPanel'
        //mainPanel--> will be gain container for GUI components, stores
        //Can use 'mainPanel' to add other GUI components like buttons. text fields, labels, etc.


        public ContactManager2() {//Constructor for 'ContactManagerGUI4' class
            setTitle("Contact Manager");
            //sets Title of GUI window, displays on window's title bar
            setSize(400, 150);
            //Sets size of GUI window
            //Width: 400 pixels
            //Height, 150 pixels
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //sets default close operation for the window
            //'JFrame.EXIT_ON_CLOSE' -->indicates when user closes window (click 'close / x') application should exit/terminate
            //Constructor-initializes GUI window w/ title + close op. | called when 'ContactManagerGUI4' class is created


            // Create buttons
            searchButton = new JButton("Search for Contact"); //creates JButton object
            //'new JButton'--> creates new instance of 'JButton' class
            //'JButton("Search for Contact")' = constructor
            //text on Button: "Search for Contact"


            inputButton = new JButton("Input Contact Information");//creates JButton object

            // Add action listeners
            searchButton.addActionListener(this);
            //Adds ActionLister to the 'searchButton' object
            //'addActionListener' method in 'JButton class'
            //When 'searchButton' is clicked--> actionPerformed method of obj. that implements the ActionListener interface
            //(ContactManagerGUI4 class) will be called/executed.

            //(this)=argument--> actionListener-->current instance of the class in which it is in (ContactManagerGUI4 class)
            //current instance of 'ContactManagerGUI4' class (instance handling button clicks) will also handle the button click events (i.e., implement the ActionListener interface).

            inputButton.addActionListener(this);
            //Adds ActionLister to the 'inputButton' object

            //Why do you need action listeners?
            //used to handle events--> button clicks, menu selections, keyboard shortcuts
            //when a user interacts with components (i.e. buttons, ect) app. needs to respond
            //allows you to define what app. does in response to user actions
            //button clicked--> triggers action event


            // Create panel for buttons
            JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
            //creates new 'JPanel' named 'buttonPanel'
            //sets layout to 'GridLayout' w/ 1 row + 2 columns
            //'GridLayout' --> components added to panel will be arranged in grid, specified # of rows and columns
            //'GridLayout' - not a method, but class included in 'java.awt' package

            //Review - 'java.awt' package contains classes for creating graphical user interfaces (GUIs) in Java,
            //GridLayout is one of the layout managers provided by this package.

            //Add search and input button to button panel
            buttonPanel.add(searchButton);//adds 'searchButton' component to 'buttonPanel
            //search button will be displayed in button panel according to layout defined by 'GridLayout'
            buttonPanel.add(inputButton);//adds 'inputButton' component to 'buttonPanel

            // Create main panel
            mainPanel = new JPanel(new BorderLayout());
            //'mainPanel' = name of the JPanel

            //'BorderLayout' --> layout manager, divides container into 5 regions: N, S, E, W, Center
            //               --> Each region can only contain one component (compo. @ N positioned at top of container, etc..)
            //               --> found in 'java.swing'

            //Container-component, can contain + manage other components (buttons. text fields, labels, + panels)
            //         -parent container for child components
            //         -provide structure and organization for building GUIs

            mainPanel.add(new JLabel("Please select an action:"), BorderLayout.NORTH);
            //Adds JLabel w/ text to 'mainPanel' container
            //JLabel --> java.swing component | displays single line of read only text or an image icon
            //'BorderLayout.NORTH' --> parameter, JLabel positioned to North region of 'mainPanel'
            mainPanel.add(buttonPanel, BorderLayout.CENTER);
            //Adds JLabel component to 'mainPanel' container
            //'BorderLayout.CENTER' --> parameter, JLabel positioned to Center region of 'mainPanel'


            // Add main panel to the frame
            getContentPane().add(mainPanel);
            //adds 'mainPanel' container to frame's content pane.  --> mainPanel's compo.'s (label + button panel) display w/in frame
            //'getContentPane()'- retrieves content of the frame.
            //ContentPane--> special container, location to add components in Swing Applications
        }//End: Constructor

        @Override //indicates method overrides a superclass method -->
        //'actionPerformed' method overrides method defined in 'ActionListener' interface
        public void actionPerformed(ActionEvent e) {//Defines 'actionPerformed' method-->part of 'ActionListener' interface implementation
            //method activates when action event occurs--> pressing a button
            //Action Event--> object | Stores information about the event that occurred
            //e--> parameter, represents an 'ActionEvent' object + event that occurred (such as button click, menu selection, or keypress)
            if (e.getSource() == searchButton) {
                openSearchGUI();//calls method if search button is pressed
                //'e.getSource()'--> returns the object that fired the event (event source)
                //'searchButton' is compared to event source using == --> means event triggered by clicking search button
            } //End: if
            else if (e.getSource() == inputButton) {
                openInputGUI();
            }//End:else if
        }//End: actionPerformed [method]

        // Method to open GUI for searching contact
        private void openSearchGUI() {
            dispose(); // Close the current window, closes JFrame so a new window can be opened | housecleaning
            JFrame searchFrame = new JFrame("Search for Contact");
            //creates a new JFrame instance named searchFrame with the title "Search for Contact".
            //window used for searching contacts.
            searchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //sets the default close operation for the searchFrame. In this case,
            //'JFrame.EXIT_ON_CLOSE'--> user closes the window, application exits.

            // Create input fields
            JTextField firstNameField = new JTextField(20);
            JTextField lastNameField = new JTextField(20);
            //'columns: 20' --> initial width of 20 columns
            //'JTextField' -->GUI component that allows the user to enter text.

            // Create buttons
            JButton searchButton = new JButton("Search");
            JButton backButton = new JButton("Back");

            // Add action listeners
            searchButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    searchContact(firstNameField.getText(), lastNameField.getText());
                }
            });
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    searchFrame.dispose(); // Close the search window
                    openMainGUI(); // Re-open the main GUI
                }
            });

            // Create panel for input fields and buttons
            JPanel inputPanel = new JPanel(new GridLayout(3, 2));
            inputPanel.add(new JLabel("First Name:"));
            inputPanel.add(firstNameField);
            inputPanel.add(new JLabel("Last Name:"));
            inputPanel.add(lastNameField);
            inputPanel.add(searchButton);
            inputPanel.add(backButton);

            // Add input panel to the search frame
            searchFrame.getContentPane().add(inputPanel);
            searchFrame.pack();
            searchFrame.setLocationRelativeTo(null); // Center the search frame
            searchFrame.setVisible(true);
        }

        // Method to open GUI for inputting contact information
        private void openInputGUI() {
            dispose(); // Close the current window
            JFrame inputFrame = new JFrame("Input Contact Information");
            inputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create input fields
            JTextField firstNameField = new JTextField(20);
            JTextField lastNameField = new JTextField(20);
            JTextField zipCodeField = new JTextField(20);
            JTextField phoneNumberField = new JTextField(20);
            JTextField emailField = new JTextField(20);

            // Create buttons
            JButton inputButton = new JButton("Input");
            JButton backButton = new JButton("Back");

            // Add action listeners
            inputButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    insertContact(firstNameField.getText(), lastNameField.getText(), zipCodeField.getText(), phoneNumberField.getText(), emailField.getText());
                }
            });
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    inputFrame.dispose(); // Close the input window
                    openMainGUI(); // Re-open the main GUI
                }
            });

            // Create panel for input fields and buttons
            JPanel inputPanel = new JPanel(new GridLayout(6, 2));
            inputPanel.add(new JLabel("First Name:"));
            inputPanel.add(firstNameField);
            inputPanel.add(new JLabel("Last Name:"));
            inputPanel.add(lastNameField);
            inputPanel.add(new JLabel("Zip Code:"));
            inputPanel.add(zipCodeField);
            inputPanel.add(new JLabel("Phone Number:"));
            inputPanel.add(phoneNumberField);
            inputPanel.add(new JLabel("Email:"));
            inputPanel.add(emailField);
            inputPanel.add(inputButton);
            inputPanel.add(backButton);

            // Add input panel to the input frame
            inputFrame.getContentPane().add(inputPanel);
            inputFrame.pack();
            inputFrame.setLocationRelativeTo(null); // Center the input frame
            inputFrame.setVisible(true);
        }

        // Method to open the main GUI
        private void openMainGUI() {
            JFrame mainFrame = new JFrame("Contact Manager");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.getContentPane().add(mainPanel);
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(null); // Center the main frame
            mainFrame.setVisible(true);
        }

        // Method to insert a new contact into the database
        private void insertContact(String firstName, String lastName, String zipCode, String phoneNumber, String email) {
            try {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/mukuwa.baffoe/MB.accdb");
                String query = "INSERT INTO Student (FirstName, LastName, ZipCode, PhoneNumber, Email) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, firstName);
                ps.setString(2, lastName);
                ps.setString(3, zipCode);
                ps.setString(4, phoneNumber);
                ps.setString(5, email);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Contact added successfully!");
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }

        // Method to search for a contact based on first name and last name
        private void searchContact(String firstName, String lastName) {
            try {
                Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/mukuwa.baffoe/MB.accdb");
                String query = "SELECT * FROM Student WHERE FirstName = ? AND LastName = ?";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, firstName);
                ps.setString(2, lastName);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String foundFirstName = rs.getString("FirstName");
                    String foundLastName = rs.getString("LastName");
                    String zipCode = rs.getString("ZipCode");
                    String phoneNumber = rs.getString("PhoneNumber");
                    JOptionPane.showMessageDialog(null, "Contact found:\n" +
                            "First Name: " + foundFirstName + "\n" +
                            "Last Name: " + foundLastName + "\n" +
                            "Zip Code: " + zipCode + "\n" +
                            "Phone Number: " + phoneNumber);
                } else {
                    JOptionPane.showMessageDialog(null, "Contact not found.");
                }
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                ContactManager2 gui = new ContactManager2();
                gui.setVisible(true);
            });
        } //close main
    } //close class
