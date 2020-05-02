import java.util.ArrayList;

public class MenuForm extends javax.swing.JFrame {
    private ArrayList<Employee> employeeData;

    public MenuForm(ArrayList<Employee> employeeData) {
        initComponents();
        this.employeeData = employeeData;

    }

    private void initComponents() {

        registerButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        createFormButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerButton.setText("Here");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Here");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        createFormButton.setText("Here");
        createFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFormButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Register/Delete");

        jLabel2.setText("Search Employee");

        jLabel3.setText("Create Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(56, 56, 56)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(9, 9, 9)
                                                                                .addComponent(registerButton)
                                                                                .addGap(11, 11, 11))
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addGap(80, 80, 80)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(searchButton)
                                                                                .addGap(15, 15, 15))
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(142, 142, 142)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(createFormButton))))
                                                .addGap(0, 52, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(exitButton)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(exitButton)
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(registerButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(searchButton)))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(createFormButton)
                                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        RegisterDeleteForm frame = new RegisterDeleteForm(employeeData);
        frame.setVisible(true);
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        SearchForm frame = new SearchForm(employeeData);
        frame.setVisible(true);
    }

    private void createFormButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        CreateReportForm frame = new CreateReportForm(employeeData);
        frame.setVisible(true);
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {

        System.exit(0);
    }

    private javax.swing.JButton createFormButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton searchButton;

}
