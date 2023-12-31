/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import model.Patient;
/**
 *
 * @author lenovo
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    private JPanel BottomPanel;
    public FormPanel(JPanel BottomPanel) {
        initComponents();
        this.BottomPanel =  BottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameInput = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageInput = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        doNotPreferRadio = new javax.swing.JRadioButton();
        profilePictureLabel = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageInput = new javax.swing.JTextArea();
        firstNameErrorMsg = new javax.swing.JLabel();
        lastNameErrorMsg = new javax.swing.JLabel();
        ageErrorMsg = new javax.swing.JLabel();
        emailErrorMsg = new javax.swing.JLabel();
        customerTypeLabel = new javax.swing.JLabel();
        customerTypeInput = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        title.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CUSTOMER REGISTRATION FORM");

        firstNameLabel.setText("First Name:");

        firstNameInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameInputFocusLost(evt);
            }
        });

        lastNameLabel.setText("Last Name:");

        lastNameInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameInputFocusLost(evt);
            }
        });

        ageLabel.setText("Age:");

        ageInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageInputFocusLost(evt);
            }
        });
        ageInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageInputActionPerformed(evt);
            }
        });

        emailLabel.setText("Email:");

        emailInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailInputFocusLost(evt);
            }
        });
        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputActionPerformed(evt);
            }
        });

        genderLabel.setText("Gender:");

        genderGroup.add(maleRadio);
        maleRadio.setText("Male");
        maleRadio.setActionCommand("MALE");

        genderGroup.add(femaleRadio);
        femaleRadio.setText("Female");
        femaleRadio.setActionCommand("FEMALE");

        genderGroup.add(doNotPreferRadio);
        doNotPreferRadio.setText("Prefer not to Say");
        doNotPreferRadio.setActionCommand("PREFER NOT TO SAY");
        doNotPreferRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doNotPreferRadioActionPerformed(evt);
            }
        });

        profilePictureLabel.setText("Profile Picture:");

        uploadButton.setText("Upload Image");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        messageLabel.setText("Message:");

        messageInput.setColumns(20);
        messageInput.setRows(5);
        jScrollPane1.setViewportView(messageInput);

        firstNameErrorMsg.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        firstNameErrorMsg.setForeground(new java.awt.Color(255, 0, 0));

        lastNameErrorMsg.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        lastNameErrorMsg.setForeground(new java.awt.Color(255, 0, 0));

        ageErrorMsg.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        ageErrorMsg.setForeground(new java.awt.Color(255, 0, 0));

        emailErrorMsg.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        emailErrorMsg.setForeground(new java.awt.Color(255, 0, 0));

        customerTypeLabel.setText("Customer Type:");

        customerTypeInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Walk In" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ageErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(73, 73, 73)
                                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firstNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(messageLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(profilePictureLabel)
                                                .addComponent(customerTypeLabel))
                                            .addGap(52, 52, 52)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(uploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(customerTypeInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, Short.MAX_VALUE)
                                    .addComponent(maleRadio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(femaleRadio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(doNotPreferRadio))))))
                .addContainerGap(379, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ageErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio)
                    .addComponent(doNotPreferRadio))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilePictureLabel)
                    .addComponent(uploadButton))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(customerTypeLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(customerTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameInputFocusLost
        // TODO add your handling code here:
        String firstName = firstNameInput.getText();
        String firstNameError = "";
        if(firstName.equals(null) || firstName.equals("")){
            firstNameError = "First Name can not be Empty";
            //            firstNameInput.setBorder(createLineBorder(Color.red));
            //            firstNameInput.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
        else if (!firstName.matches("[A-Za-z]+")) {
            firstNameError = "Please Enter Valid First Name";
        }
        firstNameErrorMsg.setText(firstNameError);

    }//GEN-LAST:event_firstNameInputFocusLost

    private void lastNameInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameInputFocusLost
        // TODO add your handling code here:
        String lastName = lastNameInput.getText();
        String lastNameError = "";

        if(lastName.equals(null) || lastName.equals("")){
            lastNameError = "Last Name can not be Empty";
        }
        else if (!lastName.matches("[A-Za-z]+")) {
            lastNameError = "Please Enter Valid Last Name";
        }
        lastNameErrorMsg.setText(lastNameError);
    }//GEN-LAST:event_lastNameInputFocusLost

    private void ageInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageInputFocusLost
        // TODO add your handling code here:
        String age = ageInput.getText();
        boolean isNumber = true;
        try{
            int ageNumber = Integer.parseInt(age);
        }
        catch(NumberFormatException e){
            isNumber = false;
        }
        String ageError = "";

        if(isNumber == false){
            ageError = "Enter valid age";
        }
        else if(isNumber == true && !age.matches("^(?:1[0-9]{2}|[1-9][0-9]|[1-9])$")){
            ageError = "Age can not be greater than 120 years";
        }
        ageErrorMsg.setText(ageError);
    }//GEN-LAST:event_ageInputFocusLost

    private void ageInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageInputActionPerformed

    private void emailInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailInputFocusLost
        // TODO add your handling code here:
        String email = emailInput.getText();
        String emailError = "";

        if (!email.matches("^[\\w\\.-]+@[\\w\\.-]+\\.\\w+$")) {
            emailError = "Please Enter Valid Email adderss";
        }
        emailErrorMsg.setText(emailError);
    }//GEN-LAST:event_emailInputFocusLost

    private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInputActionPerformed

    private void doNotPreferRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doNotPreferRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doNotPreferRadioActionPerformed
private ImageIcon uploadedImageIcon;
private String FilePath;
    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            FilePath = filePath;

            try {
                ImageIcon originalImageIcon = new ImageIcon(filePath);
                Image originalImage = originalImageIcon.getImage();
                Image resizedImage = originalImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
                ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
                uploadedImageIcon = resizedImageIcon;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        Patient newUser = new Patient();
        
        newUser.setFirstName(firstNameInput.getText());
        newUser.setLastName(lastNameInput.getText());
        newUser.setEmail(emailInput.getText());
        newUser.setAge(ageInput.getText());
        newUser.setGender(genderGroup.getSelection().getActionCommand());
        newUser.setMessage(messageInput.getText());
        newUser.setCustomerType(customerTypeInput.getSelectedItem().toString());
        newUser.setFilePath(FilePath);
//        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + gender + " ");
//        String displayText = "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Age: " + age + "\n" + "Gender: " + gender + "\n" + "Email: " + email + "\n" + "Message: " + message ;

//        JOptionPane.showMessageDialog(firstNameInput, displayText, "Patient Information", JOptionPane.INFORMATION_MESSAGE, uploadedImageIcon);
//        JOptionPane.showMessageDialog(firstNameInput, message, age, HEIGHT, uploadedImageIcon);
        ViewPanel newViewPanel = new ViewPanel(newUser);
        BottomPanel.add(newViewPanel);
        CardLayout layout=(CardLayout) BottomPanel.getLayout();
        layout.next(BottomPanel);
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageErrorMsg;
    private javax.swing.JTextField ageInput;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JComboBox<String> customerTypeInput;
    private javax.swing.JLabel customerTypeLabel;
    private javax.swing.JRadioButton doNotPreferRadio;
    private javax.swing.JLabel emailErrorMsg;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel firstNameErrorMsg;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameErrorMsg;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextArea messageInput;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel profilePictureLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
