
import java.util.ArrayList;

public class RegisterDeleteForm extends javax.swing.JFrame {
    private ArrayList<Employee> employeeData;

    public RegisterDeleteForm(ArrayList<Employee> employeeData) {
        initComponents();
        this.employeeData = employeeData;
    }


    private void initComponents() {

        firstNameTextbox = new javax.swing.JTextField();
        lastNameTextbox = new javax.swing.JTextField();
        uIDTextbox = new javax.swing.JTextField();
        passwordTextbox = new javax.swing.JTextField();
        addressTextbox = new javax.swing.JTextField();
        phoneNumbTextbox = new javax.swing.JTextField();
        salaryTextbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        firstNameDelTextbox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lastNameDelTextbox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        uIDDelTextbox = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        reasonTextbox = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        jLabel3.setText("uID:");

        jLabel4.setText("Password:");

        jLabel5.setText("Address:");

        jLabel6.setText("Phone #:");

        jLabel7.setText("Salary:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Register");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Delete");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("First Name:");

        jLabel11.setText("Last Name:");

        jLabel12.setText("uID: ");

        jLabel13.setText("Reasoning:");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup().addGap(167, 167, 167).addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9).addGap(57, 57, 57).addComponent(backButton).addContainerGap())
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout
                                        .createSequentialGroup().addGap(64, 64, 64).addGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1).addComponent(
                                                        jLabel2)
                                                        .addComponent(jLabel3).addComponent(jLabel4)
                                                        .addComponent(jLabel5).addComponent(jLabel6)
                                                        .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(firstNameTextbox,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 162,
                                                                Short.MAX_VALUE)
                                                        .addComponent(lastNameTextbox,
                                                                javax.swing.GroupLayout.Alignment.LEADING))
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel10,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel11,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(addressTextbox,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 203,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 95, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(uIDTextbox).addComponent(passwordTextbox)
                                                        .addComponent(phoneNumbTextbox).addComponent(salaryTextbox,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 133,
                                                                Short.MAX_VALUE))
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel12,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel13,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)))))
                                .addGroup(layout.createSequentialGroup().addGap(159, 159, 159).addComponent(
                                        registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                                .createSequentialGroup().addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(reasonTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(firstNameDelTextbox, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lastNameDelTextbox)
                                        .addComponent(uIDDelTextbox, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(63, 63, 63))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(88, 88, 88)))));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel8).addComponent(jLabel9)))
                                .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(backButton)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(firstNameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(firstNameDelTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lastNameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(lastNameDelTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(uIDTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(uIDDelTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(passwordTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4).addComponent(jLabel13))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(addressTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(phoneNumbTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(salaryTextbox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7)))
                                .addComponent(reasonTextbox))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(registerButton).addComponent(deleteButton))
                        .addContainerGap()));

        pack();
    }

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String firstName = firstNameTextbox.getText();
        String lastName = lastNameTextbox.getText();
        String phoneNumber = phoneNumbTextbox.getText();
        int employeeUID = Integer.parseInt(uIDTextbox.getText());
        String address = addressTextbox.getText();
        String password = passwordTextbox.getText();
        System.out.println("employeeData.size() = " + employeeData.size());
        employeeData.add(new Employee(firstName, lastName, phoneNumber, employeeUID, address, password));
        System.out.println("employeeData.size() = " + employeeData.size());

        PopupForm popup = new PopupForm("Employee Registered");
        popup.setVisible(true);
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("test");
        String firstName = firstNameDelTextbox.getText();
        String lastName = lastNameDelTextbox.getText();
        int employeeUID = Integer.parseInt(uIDDelTextbox.getText());
        for (int i = 0; i < employeeData.size(); i++) {
            if (firstName.equals(employeeData.get(i).getFirstName()) && lastName.equals(employeeData.get(i).getLastName()) && (employeeUID == employeeData.get(i).getEmployeeUID())) {
                employeeData.remove(i);
                PopupForm popup = new PopupForm("Deleted Employee");
                popup.setVisible(true);
            }
        }
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        MenuForm frame = new MenuForm(employeeData);
        frame.setVisible(true);
    }

    private javax.swing.JTextField addressTextbox;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField firstNameDelTextbox;
    private javax.swing.JTextField firstNameTextbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameDelTextbox;
    private javax.swing.JTextField lastNameTextbox;
    private javax.swing.JTextField passwordTextbox;
    private javax.swing.JTextField phoneNumbTextbox;
    private javax.swing.JTextField reasonTextbox;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField salaryTextbox;
    private javax.swing.JTextField uIDDelTextbox;
    private javax.swing.JTextField uIDTextbox;

}
