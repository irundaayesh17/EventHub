/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;

/**
 *
 * @author User
 */
public class EventUpdateUI extends javax.swing.JFrame {

    /**
     * Creates new form EventUpdateUI
     */
    public EventUpdateUI() {
        initComponents();
        getContentPane().setBackground(new Color(43, 43, 43, 255));
        cmb_eventid.setBackground(new Color(35, 35, 35, 255));
        txt_eventname.setBackground(new Color(35, 35, 35, 255));
        txt_description.setBackground(new Color(35, 35, 35, 255));
        txt_location.setBackground(new Color(35, 35, 35, 255));
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_eventid = new javax.swing.JLabel();
        btn_deleteform = new javax.swing.JButton();
        lbl_eventname = new javax.swing.JLabel();
        lbl_location = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_description = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_description = new javax.swing.JTextArea();
        txt_location = new javax.swing.JTextField();
        btn_regoform = new javax.swing.JButton();
        txt_eventname = new javax.swing.JTextField();
        btn_updatevent = new javax.swing.JButton();
        calender_date = new de.wannawork.jcalendar.JCalendarComboBox();
        cmb_eventid = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btn_logout1 = new javax.swing.JButton();
        btn_dashboard = new javax.swing.JButton();
        lbl_coverimage = new javax.swing.JLabel();
        btn_viewform = new javax.swing.JButton();
        btn_report = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EventHub - Event Management System");
        setPreferredSize(new java.awt.Dimension(715, 725));

        lbl_eventid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_eventid.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eventid.setText("Event ID");

        btn_deleteform.setBackground(new java.awt.Color(205, 0, 255));
        btn_deleteform.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_deleteform.setForeground(new java.awt.Color(255, 255, 255));
        btn_deleteform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bin.png"))); // NOI18N
        btn_deleteform.setText("Delete");

        lbl_eventname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_eventname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eventname.setText("Event Name");

        lbl_location.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_location.setForeground(new java.awt.Color(255, 255, 255));
        lbl_location.setText("Location");

        lbl_date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_date.setText("Date");

        lbl_description.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_description.setForeground(new java.awt.Color(255, 255, 255));
        lbl_description.setText("Description");

        txt_description.setColumns(20);
        txt_description.setForeground(new java.awt.Color(255, 255, 255));
        txt_description.setRows(5);
        jScrollPane1.setViewportView(txt_description);

        txt_location.setForeground(new java.awt.Color(255, 255, 255));

        btn_regoform.setBackground(new java.awt.Color(205, 0, 255));
        btn_regoform.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_regoform.setForeground(new java.awt.Color(255, 255, 255));
        btn_regoform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btn_regoform.setText("Register");

        txt_eventname.setForeground(new java.awt.Color(255, 255, 255));

        btn_updatevent.setBackground(new java.awt.Color(205, 0, 255));
        btn_updatevent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_updatevent.setForeground(new java.awt.Color(255, 255, 255));
        btn_updatevent.setText("Update");

        cmb_eventid.setForeground(new java.awt.Color(255, 255, 255));
        cmb_eventid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        btn_logout1.setBackground(new java.awt.Color(204, 8, 25));
        btn_logout1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_logout1.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout.png"))); // NOI18N
        btn_logout1.setText("Logout");

        btn_dashboard.setBackground(new java.awt.Color(205, 0, 255));
        btn_dashboard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dashboard.png"))); // NOI18N

        lbl_coverimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/covrpic.jpg"))); // NOI18N

        btn_viewform.setBackground(new java.awt.Color(205, 0, 255));
        btn_viewform.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_viewform.setForeground(new java.awt.Color(255, 255, 255));
        btn_viewform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/view.png"))); // NOI18N
        btn_viewform.setText("View");

        btn_report.setBackground(new java.awt.Color(205, 0, 255));
        btn_report.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/report.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_coverimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_eventid)
                            .addComponent(lbl_eventname)
                            .addComponent(lbl_date)
                            .addComponent(lbl_location)
                            .addComponent(lbl_description))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_updatevent, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_eventname, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calender_date, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_location, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_eventid, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_regoform, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_deleteform, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_viewform, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_coverimage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_eventid)
                            .addComponent(cmb_eventid))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_eventname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_eventname))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(calender_date, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lbl_date)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_location, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_location))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lbl_description)))
                        .addGap(28, 28, 28)
                        .addComponent(btn_updatevent, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn_viewform, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_regoform)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_deleteform)
                            .addComponent(btn_logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EventUpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventUpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventUpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventUpdateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventUpdateUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_deleteform;
    private javax.swing.JButton btn_logout1;
    private javax.swing.JButton btn_regoform;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_updatevent;
    private javax.swing.JButton btn_viewform;
    private de.wannawork.jcalendar.JCalendarComboBox calender_date;
    private javax.swing.JComboBox<String> cmb_eventid;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_coverimage;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_description;
    private javax.swing.JLabel lbl_eventid;
    private javax.swing.JLabel lbl_eventname;
    private javax.swing.JLabel lbl_location;
    private javax.swing.JTextArea txt_description;
    private javax.swing.JTextField txt_eventname;
    private javax.swing.JTextField txt_location;
    // End of variables declaration//GEN-END:variables
}
