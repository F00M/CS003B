import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Library {
    //consts
    private static int WIDTH = 1280;        // init window width
    private static int HEIGHT = 720;        // init window height
    
    private Bookstore bkstr;
    private Customer currentCust;
    public static void main(String[] args) {
        Library lib = new Library();
        lib.bkstr = new Bookstore();
        InnerLibrary comp = lib.new InnerLibrary();

        // start components
        comp.initComponents();

        // check if returning customer
        int selection = comp.checkReturnCustomer();
        if (selection == 0) {
            comp.showRegWindow();
        }
        else {
            comp.showLoginWindow();
        }
    }
    
    public class InnerLibrary {
        private JFrame mainWin;
        private JFrame loginWin;
        private JFrame regWin;
        private boolean registered;

        public InnerLibrary() {
            registered = true;
        }
        
        public void initComponents() {
            // Register window
            regWin = new JFrame("Register");
            SpringLayout regPanelLayout = new SpringLayout();
            JPanel regPanel = new JPanel(regPanelLayout);
            JTextField nameField = new JTextField("John Doe",10);
            JTextField phoneField = new JTextField("6261231234",10);
            JTextField addressField = new JTextField(10);
            JLabel nameLabel = new JLabel("Name:");
            JLabel phoneLabel = new JLabel("Phone:");
            JLabel addressLabel = new JLabel("Address:");
            JButton regButton = new JButton("Register");
            
            regPanel.add(nameLabel);
            regPanel.add(nameField);
            regPanel.add(phoneLabel);
            regPanel.add(phoneField);
            regPanel.add(addressLabel);
            regPanel.add(addressField);
            regPanel.add(regButton);
            regButton.addActionListener(e -> regButtonPressed(nameField.getText(), phoneField.getText(), addressField.getText()));
            
            regPanelLayout.putConstraint(SpringLayout.WEST, nameLabel, 5, SpringLayout.WEST, regPanel);
            regPanelLayout.putConstraint(SpringLayout.NORTH, nameField, 5, SpringLayout.NORTH, regPanel);
            regPanelLayout.putConstraint(SpringLayout.EAST, nameField, -5, SpringLayout.EAST, regPanel);
            regPanelLayout.putConstraint(SpringLayout.WEST, nameField, 5, SpringLayout.EAST, nameLabel);
            regPanelLayout.putConstraint(SpringLayout.VERTICAL_CENTER, nameLabel, 0, SpringLayout.VERTICAL_CENTER, nameField);
            
            regPanelLayout.putConstraint(SpringLayout.WEST, phoneLabel, 5, SpringLayout.WEST, regPanel);
            regPanelLayout.putConstraint(SpringLayout.EAST, phoneField, -5, SpringLayout.EAST, regPanel);
            regPanelLayout.putConstraint(SpringLayout.NORTH, phoneField, 5, SpringLayout.SOUTH, nameField);
            regPanelLayout.putConstraint(SpringLayout.WEST, phoneField, 5, SpringLayout.EAST, phoneLabel);
            regPanelLayout.putConstraint(SpringLayout.VERTICAL_CENTER, phoneLabel, 0, SpringLayout.VERTICAL_CENTER, phoneField);
            
            regPanelLayout.putConstraint(SpringLayout.WEST, addressLabel, 5, SpringLayout.WEST, regPanel);
            regPanelLayout.putConstraint(SpringLayout.EAST, regPanel, 5, SpringLayout.EAST, addressField);
            regPanelLayout.putConstraint(SpringLayout.NORTH, addressField, 5, SpringLayout.SOUTH, phoneField);
            regPanelLayout.putConstraint(SpringLayout.WEST, addressField, 5, SpringLayout.EAST, addressLabel);
            regPanelLayout.putConstraint(SpringLayout.VERTICAL_CENTER, addressLabel, 0, SpringLayout.VERTICAL_CENTER, addressField);
            
            regPanelLayout.putConstraint(SpringLayout.EAST, regButton, -5, SpringLayout.EAST, regPanel);
            regPanelLayout.putConstraint(SpringLayout.NORTH, regButton, 5, SpringLayout.SOUTH, addressField);
            regPanelLayout.putConstraint(SpringLayout.SOUTH, regPanel, 5, SpringLayout.SOUTH, regButton);
            
            regWin.add(regPanel);
            regWin.pack();

            // login window
            loginWin = new JFrame("Login");
            SpringLayout loginWinLayout = new SpringLayout();
            JPanel loginPanel = new JPanel(loginWinLayout);
            JButton loginButton = new JButton("Login");
            JLabel phoneLabel2 = new JLabel("Phone:");
            JTextField phoneField2 = new JTextField("6261231234",10);
            loginPanel.add(phoneLabel2);
            loginPanel.add(phoneField2);
            loginPanel.add(loginButton);

            loginButton.addActionListener(e -> loginButtonPressed(loginButton.getText()));
            
            loginWinLayout.putConstraint(SpringLayout.WEST, phoneLabel2, 5, SpringLayout.WEST, loginPanel);
            loginWinLayout.putConstraint(SpringLayout.NORTH, phoneField2, 5, SpringLayout.NORTH, loginPanel);
            loginWinLayout.putConstraint(SpringLayout.EAST, loginPanel, 5, SpringLayout.EAST, phoneField2);
            loginWinLayout.putConstraint(SpringLayout.WEST, phoneField2, 5, SpringLayout.EAST, phoneLabel2);
            loginWinLayout.putConstraint(SpringLayout.VERTICAL_CENTER, phoneLabel2, 0, SpringLayout.VERTICAL_CENTER, phoneField2);

            loginWinLayout.putConstraint(SpringLayout.NORTH, loginButton, 5, SpringLayout.SOUTH, phoneField2);
            loginWinLayout.putConstraint(SpringLayout.EAST, loginButton, -5, SpringLayout.EAST, loginPanel);
            loginWinLayout.putConstraint(SpringLayout.SOUTH, loginPanel, 5, SpringLayout.SOUTH, loginButton);

            loginWin.add(loginPanel);
            loginWin.pack();
            
            // main window
            mainWin = new JFrame("Library");
            GridLayout mainWinLayout = new GridLayout(1, 2);
            mainWin.setLayout(mainWinLayout);
            
        }
        
        public int checkReturnCustomer() {
            return JOptionPane.showConfirmDialog(null, "New Customer?", null, JOptionPane.YES_NO_OPTION);
        }

        public void showRegWindow() {
            regWin.setLocationRelativeTo(null);
            regWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            regWin.setVisible(true);
        }

        public void showLoginWindow() {
            loginWin.setLocationRelativeTo(null);
            loginWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginWin.setVisible(true);
        }
        
        public void showMainWindow() {
            mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainWin.setSize(WIDTH, HEIGHT);
            mainWin.setLayout(null);
            mainWin.setLocationRelativeTo(null);

            regWin.dispose();

            mainWin.setVisible(true);
        }
        
        public void regButtonPressed(String name, String phone, String address) {
            bkstr.registerCustomer(name, phone, address);
            currentCust = bkstr.getCustomer(phone);
            showMainWindow();
        }

        public void loginButtonPressed(String phone) {
            if (bkstr.checkExistingCustomer(phone)) {
                currentCust = bkstr.getCustomer(phone);
                showMainWindow();
            }
            else {
                JOptionPane.showMessageDialog(loginWin, "Invalid phone number");
            }
        }

    }
    
    

}