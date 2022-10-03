/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.time.LocalDate;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author chaitanya
 */
public class ViewEmployeeDetails extends javax.swing.JPanel {

    
    /**
     * Creates new form ViewEmployeeDetails
     */
    
    EmployeeHistory history;
    
    public ViewEmployeeDetails(EmployeeHistory history) {
        initComponents();
        this.history = history;
        
        populateTable();
        
        
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        LabelPhoto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableEmp = new javax.swing.JTable();
        FieldStDate = new javax.swing.JTextField();
        FieldLevel = new javax.swing.JTextField();
        FieldTeamInfo = new javax.swing.JTextField();
        FieldPosTitle = new javax.swing.JTextField();
        FieldNumber = new javax.swing.JTextField();
        FieldEmail = new javax.swing.JTextField();
        LabelName = new javax.swing.JLabel();
        LabelEmpID = new javax.swing.JLabel();
        LabelAge = new javax.swing.JLabel();
        LabelGender = new javax.swing.JLabel();
        LabelStDate = new javax.swing.JLabel();
        LabelLevel = new javax.swing.JLabel();
        LabelTeamInfo = new javax.swing.JLabel();
        txtPhoto = new javax.swing.JLabel();
        LabelPoTitle = new javax.swing.JLabel();
        LabelNumber = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        FieldName = new javax.swing.JTextField();
        FieldEmpId = new javax.swing.JTextField();
        FieldAge = new javax.swing.JTextField();
        FieldGender = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        FieldName1 = new javax.swing.JTextField();
        UpdatePhotoBtn = new javax.swing.JButton();
        SearchBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 214, 132));
        setPreferredSize(new java.awt.Dimension(1140, 930));

        ViewBtn.setText("View");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        LabelPhoto.setBackground(new java.awt.Color(255, 255, 255));
        LabelPhoto.setForeground(new java.awt.Color(255, 255, 255));

        TableEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NAME", "EMAIL ID", "EMPLOYEE ID", "LEVEL", "POISITION TITILE", "TEAM INFO", "PHONE NUMBER", "GENDER", "AGE", "START DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableEmp);

        FieldStDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        FieldStDate.setPreferredSize(new java.awt.Dimension(164, 30));
        FieldStDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldStDateActionPerformed(evt);
            }
        });

        FieldLevel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));

        FieldTeamInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));

        FieldPosTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));

        FieldNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        FieldNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNumberActionPerformed(evt);
            }
        });

        FieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        FieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldEmailActionPerformed(evt);
            }
        });

        LabelName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelName.setText("Name:");

        LabelEmpID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelEmpID.setText("Employee ID:");

        LabelAge.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelAge.setText("Age:");

        LabelGender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelGender.setText("Gender:");

        LabelStDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelStDate.setText("Start Date:");

        LabelLevel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelLevel.setText("Level:");

        LabelTeamInfo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelTeamInfo.setText("Team Information:");

        txtPhoto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPhoto.setText("Photo:");

        LabelPoTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelPoTitle.setText("Position Title:");

        LabelNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelNumber.setText("Cell Phone Number:");

        LabelEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelEmail.setText("Email Address:");

        FieldName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        FieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNameActionPerformed(evt);
            }
        });

        FieldEmpId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));

        FieldAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        FieldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldAgeActionPerformed(evt);
            }
        });

        FieldGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("VIEW EMPLOYEE DETAILS");

        FieldName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        FieldName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldName1ActionPerformed(evt);
            }
        });

        UpdatePhotoBtn.setText("Update Photo");
        UpdatePhotoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePhotoBtnActionPerformed(evt);
            }
        });

        SearchBtn1.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(SearchBtn1)
                                .addGap(18, 18, 18)
                                .addComponent(FieldName1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelNumber)
                                            .addComponent(LabelName)
                                            .addComponent(LabelGender)
                                            .addComponent(txtPhoto))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FieldEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(LabelAge)
                                    .addComponent(LabelEmpID))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelLevel)
                                        .addGap(74, 74, 74))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelStDate)
                                        .addGap(44, 44, 44))
                                    .addComponent(LabelTeamInfo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelPoTitle)
                                            .addComponent(LabelEmail))
                                        .addGap(23, 23, 23)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldStDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldTeamInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldPosTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(166, 166, 166))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(UpdatePhotoBtn)
                                .addGap(47, 47, 47)
                                .addComponent(ViewBtn)
                                .addGap(59, 59, 59)
                                .addComponent(DeleteBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DeleteBtn, SearchBtn1, UpdateBtn, ViewBtn});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {FieldAge, FieldEmpId, FieldGender, FieldName, FieldNumber});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {FieldEmail, FieldLevel, FieldPosTitle, FieldStDate, FieldTeamInfo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldStDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelName)
                            .addComponent(LabelStDate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelEmpID)
                            .addComponent(FieldEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelLevel)
                            .addComponent(FieldLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTeamInfo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelGender)
                            .addComponent(LabelPoTitle)
                            .addComponent(FieldPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNumber)
                            .addComponent(LabelEmail)
                            .addComponent(FieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FieldName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchBtn1)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdatePhotoBtn)
                        .addComponent(ViewBtn)
                        .addComponent(DeleteBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPhoto)
                        .addGap(293, 293, 293))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {FieldAge, FieldEmpId, FieldGender, FieldName, FieldNumber});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {FieldEmail, FieldLevel, FieldPosTitle, FieldStDate, FieldTeamInfo});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DeleteBtn, FieldName1, SearchBtn1, UpdateBtn, UpdatePhotoBtn, ViewBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = TableEmp.getSelectedRow();
        
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
                
        }
        
        DefaultTableModel model = (DefaultTableModel) TableEmp.getModel();
        Employee selectedRecords = (Employee) model.getValueAt(selectedRowIndex, 0);

        FieldName.setText(String.valueOf(selectedRecords.getName()));
        FieldEmpId.setText(selectedRecords.getEmployee_ID());
        FieldAge.setText(String.valueOf(selectedRecords.getAge()));
        FieldGender.setText(selectedRecords.getGender());
        FieldStDate.setText(String.valueOf(selectedRecords.getStart_Date()));
        FieldLevel.setText(selectedRecords.getLevel());
        FieldTeamInfo.setText(selectedRecords.getTeam_Info());
        FieldPosTitle.setText(selectedRecords.getPosition_Title());
        FieldNumber.setText(String.valueOf(selectedRecords.getCell_Phone_Number()));
        FieldEmail.setText(selectedRecords.getEmail_Address());   
        LabelPhoto.setIcon(selectedRecords.getPhoto());

        
    }//GEN-LAST:event_ViewBtnActionPerformed

    
    
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = TableEmp.getSelectedRow();
        
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
                
        }
        
        DefaultTableModel model = (DefaultTableModel) TableEmp.getModel();
        Employee selectedRecords = (Employee) model.getValueAt(selectedRowIndex, 0);

        history.deleteRecords(selectedRecords);

        JOptionPane.showMessageDialog(this, "Employee record deleted");

        populateTable();
        
        FieldName.setText("");
        FieldEmpId.setText("");
        FieldAge.setText("");
        FieldGender.setText("");
        FieldStDate.setText("");
        FieldLevel.setText("");
        FieldTeamInfo.setText("");
        FieldPosTitle.setText("");
        FieldNumber.setText("");
        FieldEmail.setText("");  
        LabelPhoto.setIcon(null);    

       
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = TableEmp.getSelectedRow();
        
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
                
        }
        
        
        DefaultTableModel model = (DefaultTableModel) TableEmp.getModel();
        Employee EU = (Employee) model.getValueAt(selectedRowIndex, 0);
        
        if (selectedRowIndex>=0) {
            
            EU.setName(FieldName.getText());
            EU.setEmployee_ID(FieldEmpId.getText());
            EU.setAge(Integer.parseInt(FieldAge.getText()));
            EU.setGender(FieldGender.getText());
            EU.setStart_Date(FieldStDate.getText());
            EU.setLevel(FieldLevel.getText());
            EU.setTeam_Info(FieldTeamInfo.getText());
            EU.setPosition_Title(FieldPosTitle.getText());
            EU.setCell_Phone_Number(Integer.parseInt(FieldNumber.getText()));
            EU.setEmail_Address(FieldEmail.getText());
            EU.setPhoto((ImageIcon) LabelPhoto.getIcon());

            

        
        }
         
        JOptionPane.showMessageDialog(this, "Employee Information Updated");
        
        
        populateTable();
        
        FieldName.setText("");
        FieldEmpId.setText("");
        FieldAge.setText("");
        FieldGender.setText("");
        FieldStDate.setText("");
        FieldLevel.setText("");
        FieldTeamInfo.setText("");
        FieldPosTitle.setText("");
        FieldNumber.setText("");
        FieldEmail.setText("");  
        LabelPhoto.setIcon(null);
        
        
        
        
        
         
         
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void FieldNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNumberActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_FieldNumberActionPerformed

    private void FieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldEmailActionPerformed
        // TODO add your handling code here:

        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", FieldEmail.getText())))
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_FieldEmailActionPerformed

    private void FieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNameActionPerformed
        // TODO add your handling code here:
        if (!Pattern.matches("([A-Z][a-z]*)([\\\\s\\\\\\'-][A-Z][a-z]*)*", FieldName.getText()))
        {
            JOptionPane.showMessageDialog(null, "Name should start with a capital letterl \n Name should not contain NUMBERS or SPECIAL CHARACTERS.\n Please enter a valid name", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_FieldNameActionPerformed

    private void FieldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldAgeActionPerformed
        // TODO add your handling code here:
        if (!Pattern.matches("^\\d+$", FieldAge.getText()))
        {
            JOptionPane.showMessageDialog(null, "Age cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!Pattern.matches("^(1[89]|[2-9]\\d)$", FieldAge.getText()))
        {
            JOptionPane.showMessageDialog(null, "Age should be between 18 to 99", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_FieldAgeActionPerformed

    private void FieldStDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldStDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldStDateActionPerformed

    private void FieldName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldName1ActionPerformed

    private void UpdatePhotoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePhotoBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Only three extensions supported","jpg","jpeg","png");
        fileChooser.setFileFilter(filter);
        int selected = fileChooser.showOpenDialog(this);
        if(selected == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            String getselectedImage = file.getAbsolutePath();
            JOptionPane.showMessageDialog(null,getselectedImage);
            ImageIcon imgIcon = new ImageIcon(getselectedImage);
            Image imgFit = imgIcon.getImage();
            Image imageFit = imgFit.getScaledInstance(LabelPhoto.getWidth(), LabelPhoto.getHeight(), Image.SCALE_SMOOTH);
            LabelPhoto.setIcon(new ImageIcon(imageFit));
            
    }//GEN-LAST:event_UpdatePhotoBtnActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField FieldAge;
    private javax.swing.JTextField FieldEmail;
    private javax.swing.JTextField FieldEmpId;
    private javax.swing.JTextField FieldGender;
    private javax.swing.JTextField FieldLevel;
    private javax.swing.JTextField FieldName;
    private javax.swing.JTextField FieldName1;
    private javax.swing.JTextField FieldNumber;
    private javax.swing.JTextField FieldPosTitle;
    private javax.swing.JTextField FieldStDate;
    private javax.swing.JTextField FieldTeamInfo;
    private javax.swing.JLabel LabelAge;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelEmpID;
    private javax.swing.JLabel LabelGender;
    private javax.swing.JLabel LabelLevel;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelNumber;
    private javax.swing.JLabel LabelPhoto;
    private javax.swing.JLabel LabelPoTitle;
    private javax.swing.JLabel LabelStDate;
    private javax.swing.JLabel LabelTeamInfo;
    private javax.swing.JButton SearchBtn1;
    private javax.swing.JTable TableEmp;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton UpdatePhotoBtn;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtPhoto;
    // End of variables declaration//GEN-END:variables

    

    private void populateTable() {
        
        int selectedRowIndex = TableEmp.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) TableEmp.getModel();
        model.setRowCount(0);
        for (Employee e  : history.getHistory()){
            
            Object[] row = new Object[10];
            row[0] = e;
            row[1] = e.getEmail_Address();
            row[2] = e.getEmployee_ID();
            row[3] = e.getLevel();
            row[4] = e.getPosition_Title();
            row[5] = e.getTeam_Info();
            row[6] = e.getCell_Phone_Number();
            row[7] = e.getGender();
            row[8] = e.getAge();
            row[9] = e.getStart_Date();
            
            model.addRow(row);
            
        
        }
    }
    
    
}
        
        
        
    
        
    
        
    
        
        
    
        
             
    



