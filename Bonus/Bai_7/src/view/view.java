// code:
// name:
package view;

import controller.IOFile;
import controller.TrongException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DuAn;
import model.NhanVien;

/**
 *
 * @author Pom
 */
public class view extends javax.swing.JFrame {
    DefaultTableModel tmDA, tmNV;
    String fDA, fNV;
    List<DuAn> listDA;
    List<NhanVien> listNV;
    /**
     * Creates new form view
     */
    public view() {
        initComponents();
        fDA ="src/controller/DA.DAT";
        fNV ="src/controller/NV.DAT";
        String [] da={"ma du an","Ten du an","kieu du an","tong chi phi"};
        String [] nv={"mã NV", "Họ tên"," địa chỉ"," chuyên môn"};
        tmDA = new DefaultTableModel(da,0); 
        tmNV = new DefaultTableModel(nv,0); 
        jTable1.setModel(tmDA);
        jTable2.setModel(tmNV);
        loadDA();
        loadNV();
        showDA(listDA);
        showNV(listNV);
    }
    private void  loadDA(){
        File f= new File(fDA);
        if(f.exists()){
            listDA =IOFile.doc(fDA);
        } else listDA = new ArrayList<>();
    }
    private void  loadNV(){
        File f= new File(fNV);
        if(f.exists()){
            listNV =IOFile.doc(fNV);
        } else listNV = new ArrayList<>();
    }
    private void showDA(List<DuAn> list){
        tmDA.setRowCount(0);
        for(DuAn i:list)
            tmDA.addRow(i.toObjects());
    }
    private void showNV(List<NhanVien> list){
        tmNV.setRowCount(0);
        for(NhanVien i:list)
            tmNV.addRow(i.toObjects());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ma du an");

        jLabel2.setText("ten du an");

        jLabel3.setText("kieu du an");

        jLabel4.setText("tong kinh phi");

        jTextField1.setEditable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nhỏ", "trung bình", "lớn" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jButton1.setText("Them du an");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xoa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("luu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(64, 64, 64)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(0, 53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Du An", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setText("ma nhan vien");

        jLabel6.setText("ho ten");

        jLabel7.setText("dia chi");

        jLabel8.setText(" chuyen mon");

        jTextField4.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6)
                    .addComponent(jTextField7))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel6))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jButton4.setText("them nv");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("sua");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("luu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("tim iem");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addGap(64, 64, 64)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(0, 53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nhan vien", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int n = listDA.size();
        if(n>0)
            DuAn.setSma(listDA.get(n-1).getMa()+1);
        jTextField1.setText(DuAn.getSma()+"");
        String tenda,kieuda;
        double cphi;
        try{
            tenda=jTextField2.getText();
            kieuda=jComboBox1.getSelectedItem().toString();
            cphi=Double.parseDouble(jTextField3.getText());
            DuAn da = new DuAn(tenda, kieuda, cphi);
            tmDA.addRow(da.toObjects());
            listDA.add(da);
        }catch(TrongException e){
            JOptionPane.showMessageDialog(this, "Khong de trong");
            return;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Nhap vao so");
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        IOFile.viet(fDA, listDA);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int r=jTable1.getSelectedRow();
        if(r>=0 && r<jTable1.getRowCount()){
            tmDA.removeRow(r);
            listDA.remove(r);
        }
        else{
            JOptionPane.showMessageDialog(this, "Chon dich vu de xoa");
            return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int n = listNV.size();
        if(n>0)
            NhanVien.setSma(listNV.get(n-1).getMa()+1);
        jTextField1.setText(NhanVien.getSma()+"");
        String tennv,dchi,cmon;
        try{
            tennv=jTextField5.getText();
            dchi=jTextField6.getText();
            cmon=jTextField7.getText();

            NhanVien nv = new NhanVien(tennv, dchi, cmon);
            tmNV.addRow(nv.toObjects());
            listNV.add(nv);
        }catch(TrongException e){
            JOptionPane.showMessageDialog(this, "Khong de trong");
            return;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        IOFile.viet(fNV, listNV);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int r=jTable2.getSelectedRow();
        if(r>=0 && r<jTable2.getRowCount()){
            String tennv=jTextField5.getText();
            String dchi=jTextField6.getText();
            String cmon=jTextField7.getText();
            tmNV.setValueAt(tennv, r, 1);
            tmNV.setValueAt(dchi, r, 2);
            tmNV.setValueAt(cmon, r, 3);
            int ma=Integer.parseInt(jTextField4.getText());
            NhanVien nv=new NhanVien(ma, tennv, dchi, cmon);
            listNV.set(r, nv);
        }
        else{
            JOptionPane.showMessageDialog(this, "Chon dich vu de sua");
            return;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int r=jTable2.getSelectedRow();
        jTextField4.setText(tmNV.getValueAt(r, 0).toString());
        jTextField5.setText(tmNV.getValueAt(r, 1).toString());
        jTextField6.setText(tmNV.getValueAt(r, 2).toString());
        jTextField7.setText(tmNV.getValueAt(r, 3).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String key=jTextField8.getText().trim().toLowerCase();
        List <NhanVien> l=new ArrayList<>();
        for(NhanVien i: listNV)
            if( i.getTennv().toLowerCase().contains(key) || i.getDchi().toLowerCase().contains(key))
                l.add(i);
        showNV(l);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
                    
//
//    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
//        // TODO add your handling code here:
//    }                                           
//
//    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
//        // TODO add your handling code here:
//    }                                           
//
//    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
//        
//    }                                           
//
//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        int n = listDA.size();
//        if(n>0)
//            DuAn.setSma(listDA.get(n-1).getMa()+1);
//        jTextField1.setText(DuAn.getSma()+"");
//        String tsach,tgia,cnganh,nxban;
//        try{
//            tsach=jTextField2.getText();
//            tgia=jTextField3.getText();
//            nxban=jTextField4.getText();
//            cnganh=jComboBox1.getSelectedItem().toString();
//            DuAn sach = new DuAn(tsach, tgia, cnganh, nxban);
//            tmDA.addRow(sach.toObjects());
//            listDA.add(sach);
//        }catch(TrongException e){
//            JOptionPane.showMessageDialog(this, "Khong de trong");
//            return;
//        }catch(DienThoaiException e){
//            JOptionPane.showMessageDialog(this, "Nhap vao so");
//            return;
//        }
//    }                                        
//
//    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        int r=jTable1.getSelectedRow();
//        if(r>=0 && r<jTable1.getRowCount()){
//            tmDA.removeRow(r);
//            listDA.remove(r);
//        }
//        else{
//            JOptionPane.showMessageDialog(this, "Chon dich vu de xoa");
//            return;
//        }
//    }                                        
//
//    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        IOFile.viet(fDA, listDA);
//    }                                        
//
//    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        int n=listKE.size();
//        if(n>0)
//            KeDuAn.setSma(listKE.get(n-1).getMa()+1);
//        jTextField5.setText(KeDuAn.getSma()+"");
//        String ten,lke,sltda;
//        try {
//            ten=jTextField6.getText();
//            sltda=jTextField7.getText();
//            lke=jComboBox2.getSelectedItem().toString();
//            KeDuAn ke=new KeDuAn(ten, lke, sltda);
//            tmKE.addRow(ke.toObjects());
//            listKE.add(ke);
//        } catch (TrongException e) {
//            JOptionPane.showMessageDialog(this, "khong de trong");
//            return;
//        } catch (DienThoaiException e){
//            JOptionPane.showMessageDialog(this, "Nhap vao so");
//            return;
//        }
//    }                                        
//
//    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        int r=jTable2.getSelectedRow();
//        if(r>=0 && r<jTable2.getRowCount()){
//            String ten=jTextField6.getText();
//            String lke=jComboBox2.getSelectedItem().toString();
//            String sltda=jTextField7.getText();
//            tmKE.setValueAt(ten, r, 1);
//            tmKE.setValueAt(lke, r, 2);
//            tmKE.setValueAt(sltda, r, 3);
//            int ma=Integer.parseInt(jTextField5.getText());
//            KeDuAn ke=new KeDuAn(ma, ten, lke, sltda);
//            listKE.set(r, ke);
//        }
//        else{
//            JOptionPane.showMessageDialog(this, "Chon dich vu de sua");
//            return;
//        }
//    }                                        
//
//    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        IOFile.viet(fKE, listKE);
//    }                                        
//
//    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {                                     
//        int r=jTable2.getSelectedRow();
//        jTextField5.setText(tmKE.getValueAt(r, 0).toString());
//        jTextField6.setText(tmKE.getValueAt(r, 1).toString());
//        jTextField7.setText(tmKE.getValueAt(r, 3).toString());
//        jComboBox2.setSelectedItem(tmKE.getValueAt(r, 2).toString());
//    }                                    
//
//    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        String key=jTextField8.getText().trim().toLowerCase();
//        List <DuAn> l=new ArrayList<>();
//        for(DuAn i: listDA)
//            if( i.getTsach().toLowerCase().contains(key) || i.getCnganh().toLowerCase().contains(key))
//                l.add(i);
//        showDA(l);
//    }