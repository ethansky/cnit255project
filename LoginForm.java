import java.util.ArrayList;

public class LoginForm extends javax.swing.JFrame {
    private ArrayList<Employee> employeeData;

    public LoginForm() {
        initComponents();
        employeeData = new ArrayList<>();

        employeeData.add(
                new HR("Cole", "Hutchcraft", "8121233456", 001, "400 Northwestern Ave", "CHutchcraft", 34, 50000, 25));
        employeeData.add(new Manager("Ethan", "Emmons", "3456885998", 002, "1234 Easy Way", "EEmmons", 5, 15000, 60000));
        employeeData.add(new Sales("James", "Klezynski", "9874732216", 003, "1564 Big Road Ln", "JKlezinsky", 4, 45000,
                500, 45, 45000, "Marketing"));
        employeeData.add(new Sales("Justin", "Petersen", "2437879008", 004, "600 Stadium Ave", "JPetersen", 5, 60000,
                345, 30, 30000, "Hardware"));
        employeeData.add(new Employee("Jerry", "Lee", "8674937464", 005, "1100 Grant St", "JLee"));
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        usernameTextbox = new javax.swing.JTextField();
        passwordTextbox = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Login");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(loginButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(passwordTextbox)
                                                        .addComponent(usernameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addComponent(jLabel1)))
                                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(usernameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addComponent(loginButton)
                                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }

    private String[][] loginDatabase = {

            {"C001", "Chutchcraft"}, {"E002", "EEmmons"}, {"J003", "JKlezynski"}, {"J004", "JLee"}, {"J005", "JPetersen"}
    };

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        String employeeUID = usernameTextbox.getText();
        String password = new String(passwordTextbox.getPassword());

        for (String[] strings : loginDatabase) {
            if (employeeUID.equals(strings[0]) && password.equals(strings[1])) {
                this.setVisible(false);
                MenuForm frame = new MenuForm(employeeData);
                frame.setVisible(true);

            }

        }

    }

    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordTextbox;
    private javax.swing.JTextField usernameTextbox;
}
