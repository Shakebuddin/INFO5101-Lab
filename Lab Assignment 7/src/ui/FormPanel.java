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
import util.DatabaseConnector;

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
        submitButton = new javax.swing.JButton();
        firstNameErrorMsg = new javax.swing.JLabel();
        lastNameErrorMsg = new javax.swing.JLabel();
        ageErrorMsg = new javax.swing.JLabel();
        emailErrorMsg = new javax.swing.JLabel();

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

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        firstNameErrorMsg.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        firstNameErrorMsg.setForeground(new java.awt.Color(255, 0, 0));

        lastNameErrorMsg.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        lastNameErrorMsg.setForeground(new java.awt.Color(255, 0, 0));

        ageErrorMsg.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        ageErrorMsg.setForeground(new java.awt.Color(255, 0, 0));

        emailErrorMsg.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        emailErrorMsg.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameErrorMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(firstNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(379, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addContainerGap(251, Short.MAX_VALUE))
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
//private ImageIcon uploadedImageIcon;
//private String FilePath;
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        Patient newUser = new Patient();
        
        newUser.setFirstName(firstNameInput.getText());
        newUser.setLastName(lastNameInput.getText());
        newUser.setEmail(emailInput.getText());
        newUser.setAge(ageInput.getText());
        newUser.setGender(genderGroup.getSelection().getActionCommand());
//        newUser.setMessage(messageInput.getText());
//        newUser.setCustomerType(customerTypeInput.getSelectedItem().toString());
//        newUser.setFilePath(FilePath);
        DatabaseConnector.addUser(newUser);
        JOptionPane.showMessageDialog(null, "User Registered Successfully", "Successful Registrstion", JOptionPane.PLAIN_MESSAGE);
//        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + gender + " ");
//        String displayText = "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Age: " + age + "\n" + "Gender: " + gender + "\n" + "Email: " + email + "\n" + "Message: " + message ;

//        JOptionPane.showMessageDialog(firstNameInput, displayText, "Patient Information", JOptionPane.INFORMATION_MESSAGE, uploadedImageIcon);
//        JOptionPane.showMessageDialog(firstNameInput, message, age, HEIGHT, uploadedImageIcon);
//        ViewPanel newViewPanel = new ViewPanel(newUser);
//        BottomPanel.add(newViewPanel);
//        CardLayout layout=(CardLayout) BottomPanel.getLayout();
//        layout.next(BottomPanel);
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageErrorMsg;
    private javax.swing.JTextField ageInput;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel emailErrorMsg;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel firstNameErrorMsg;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastNameErrorMsg;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
