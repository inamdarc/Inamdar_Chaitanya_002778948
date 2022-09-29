/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Employee;

/**
 *
 * @author chaitanya
 */
public class CreateEmployeeDetails extends javax.swing.JPanel {

    /**
     * Creates new form CreateEmployeeDetails
     */
    Employee employee;
   
    public CreateEmployeeDetails(Employee employee) {
        initComponents();
        this.employee = employee;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LabelName = new javax.swing.JLabel();
        LabelEmpID = new javax.swing.JLabel();
        LabelAge = new javax.swing.JLabel();
        LabelGender = new javax.swing.JLabel();
        LabelStDate = new javax.swing.JLabel();
        LabelLevel = new javax.swing.JLabel();
        LabelTeamInfo = new javax.swing.JLabel();
        LabelPoTitle = new javax.swing.JLabel();
        LabelNumber = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        FieldName = new javax.swing.JTextField();
        FieldEmpId = new javax.swing.JTextField();
        FieldAge = new javax.swing.JTextField();
        FieldGender = new javax.swing.JTextField();
        FieldStDate = new javax.swing.JTextField();
        FieldLevel = new javax.swing.JTextField();
        FieldTeamInfo = new javax.swing.JTextField();
        FieldPosTitle = new javax.swing.JTextField();
        FieldNumber = new javax.swing.JTextField();
        FieldEmail = new javax.swing.JTextField();
        ButtonCreate = new javax.swing.JButton();

        jLabel1.setText("Create Employee Details");

        LabelName.setText("Name:");

        LabelEmpID.setText("Employee ID:");

        LabelAge.setText("Age:");

        LabelGender.setText("Gender:");

        LabelStDate.setText("Start Date:");

        LabelLevel.setText("Level:");

        LabelTeamInfo.setText("Team Information:");

        LabelPoTitle.setText("Position Title:");

        LabelNumber.setText("Cell Phone Number:");

        LabelEmail.setText("Email Address:");

        FieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNameActionPerformed(evt);
            }
        });

        ButtonCreate.setText("Create");
        ButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelNumber)
                            .addComponent(LabelEmpID)
                            .addComponent(LabelName)
                            .addComponent(LabelStDate)
                            .addComponent(LabelLevel)
                            .addComponent(LabelTeamInfo)
                            .addComponent(LabelPoTitle)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(LabelEmail))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(FieldEmpId)
                            .addComponent(FieldAge)
                            .addComponent(FieldGender)
                            .addComponent(FieldStDate)
                            .addComponent(FieldLevel)
                            .addComponent(FieldTeamInfo)
                            .addComponent(FieldPosTitle)
                            .addComponent(FieldNumber)
                            .addComponent(FieldEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(ButtonCreate)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName)
                    .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmpID)
                    .addComponent(FieldEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelGender)
                    .addComponent(FieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelStDate)
                    .addComponent(FieldStDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLevel)
                    .addComponent(FieldLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTeamInfo)
                    .addComponent(FieldTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPoTitle)
                    .addComponent(FieldPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNumber)
                    .addComponent(FieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmail)
                    .addComponent(FieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonCreate)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNameActionPerformed

    private void ButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateActionPerformed
        // TODO add your handling code here:
        
        employee.setName(FieldName.getText());
        employee.setAge(FieldAge.getText());
        employee.setEmail_Address(FieldEmail.getText());
        employee.setCell_Phone_Number(FieldNumber.getText());
        employee.setLevel(FieldLevel.getText());
        employee.setPosition_Title(FieldPosTitle.getText());
        employee.setStart_Date(FieldStDate.getText());
        employee.setTeam_Info(FieldTeamInfo.getText());
        employee.setGender(FieldGender.getText());
        employee.setEmployee_ID(FieldEmpId.getText());
       

        JOptionPane.showMessageDialog(this, "Employee Information Saved");
    }//GEN-LAST:event_ButtonCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JLabel AgeLabel1;
    private javax.swing.JButton ButtonCreate;
    private javax.swing.JLabel CellPhnLabel;
    private javax.swing.JLabel CellPhnLabel1;
    private javax.swing.JLabel EmpDetails;
    private javax.swing.JLabel EmpDetails1;
    private javax.swing.JLabel EmpIdLabel;
    private javax.swing.JLabel EmpIdLabel1;
    private javax.swing.JTextField FieldAge;
    private javax.swing.JTextField FieldEmail;
    private javax.swing.JTextField FieldEmpId;
    private javax.swing.JTextField FieldGender;
    private javax.swing.JTextField FieldLevel;
    private javax.swing.JTextField FieldName;
    private javax.swing.JTextField FieldNumber;
    private javax.swing.JTextField FieldPosTitle;
    private javax.swing.JTextField FieldStDate;
    private javax.swing.JTextField FieldTeamInfo;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel GenderLabel1;
    private javax.swing.JLabel LabelAge;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelEmpID;
    private javax.swing.JLabel LabelGender;
    private javax.swing.JLabel LabelLevel;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelNumber;
    private javax.swing.JLabel LabelPoTitle;
    private javax.swing.JLabel LabelStDate;
    private javax.swing.JLabel LabelTeamInfo;
    private javax.swing.JLabel LevelLabel;
    private javax.swing.JLabel LevelLabel1;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField NameField1;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JLabel PosTitleLabel;
    private javax.swing.JLabel PosTitleLabel1;
    private javax.swing.JLabel StDateLabel;
    private javax.swing.JLabel StDateLabel1;
    private javax.swing.JLabel TeamInfoLabel;
    private javax.swing.JLabel TeamInfoLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}