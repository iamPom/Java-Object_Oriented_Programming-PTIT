package View;

import Controller.DienThoaiException;
import Controller.IOFile;
import Controller.SoLuongException;
import Controller.TrongException;
import Model.thietbi;
import Model.phonghoc;
import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.*;

public class FormPhongHoc extends javax.swing.JPanel {

    DefaultTableModel tm;
    private boolean them, sua;
    private String fbandoc;
    private List<phonghoc> lbandoc;

    public FormPhongHoc() {
        initComponents();
        setSize(800, 600);
        String[] cols = {"ma phong hoc", "ten phong hoc", "so ghe"};
        tm = new DefaultTableModel(cols, 0);
        jTable1.setModel(tm);
        ButtonState(true);
        them = sua = false;
        fbandoc = "src/Controller/PH.dat";
    }

    private void loadData() {
        File f = new File(fbandoc);
        if (f.exists()) {
            lbandoc = IOFile.doc(fbandoc);
        } else {
            lbandoc = new ArrayList<>();
        }
    }

    private void ButtonState(boolean b) {
        btnthem.setEnabled(b);
        btncnhat.setEnabled(!b);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtghe = new javax.swing.JTextField();
        btsearch = new javax.swing.JButton();
        txttimkiem = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnhthi = new javax.swing.JButton();
        btnfile = new javax.swing.JButton();
        btncnhat = new javax.swing.JButton();

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ma phong");

        txtma.setEditable(false);
        txtma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaActionPerformed(evt);
            }
        });

        jLabel2.setText("ten phong");

        jLabel3.setText("so ghe");

        btsearch.setText("tim kiem");
        btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtma))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtten))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtghe))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btsearch)
                        .addGap(38, 38, 38)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtghe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsearch)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        btnthem.setText("Them moi");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sua");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xoa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnhthi.setText("Hien Thi");
        btnhthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhthiActionPerformed(evt);
            }
        });

        btnfile.setText("Luu vao file");
        btnfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfileActionPerformed(evt);
            }
        });

        btncnhat.setText("Cap nhat");
        btncnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncnhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnthem)
                .addGap(18, 18, 18)
                .addComponent(btnsua)
                .addGap(35, 35, 35)
                .addComponent(btnxoa)
                .addGap(34, 34, 34)
                .addComponent(btnhthi)
                .addGap(32, 32, 32)
                .addComponent(btnfile)
                .addGap(44, 44, 44)
                .addComponent(btncnhat)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnhthi)
                    .addComponent(btnfile)
                    .addComponent(btncnhat))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        ButtonState(false);
        them = true;
        if (lbandoc != null && lbandoc.size() > 0) {
            thietbi.setSma(lbandoc.get(lbandoc.size() - 1).getMa() + 1);
        } else {
            lbandoc = new ArrayList<>();
        }

        txtma.setText(thietbi.getSma() + "");
        txtten.requestFocus();
    }//GEN-LAST:event_btnthemActionPerformed

    private void txtmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaActionPerformed

    private void btncnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncnhatActionPerformed
        // TODO add your handling code here:
        if (them) {
            String hoten, dc;
            try {
                hoten = txtten.getText();
                dc = txtghe.getText();
                if (hoten.isEmpty() || dc.isEmpty()) {
                    throw new TrongException();
                }
                
                if (!dc.matches("\\d+")) {
                    throw new DienThoaiException();
                }
                int ma = Integer.parseInt(txtma.getText());
               phonghoc ph = new phonghoc(ma, hoten, dc);
                lbandoc.add(ph);
                tm.addRow(ph.toObjects());
                ButtonState(true);
                them = false;
            } catch (TrongException e) {
                JOptionPane.showMessageDialog(this, "Khong de trong!");
                txtten.requestFocus();
            } catch (DienThoaiException e) {
                JOptionPane.showMessageDialog(this, "Nhap so!");
               
            }

        }
        if (sua) {
            int row = jTable1.getSelectedRow();
            String hoten, dc;
            hoten = txtten.getText();
            dc = txtghe.getText();
            int ma = Integer.parseInt(txtma.getText());

            try {
                if (!dc.matches("\\d+")) {
                    throw new DienThoaiException();
                }

            } catch (DienThoaiException e) {
                JOptionPane.showMessageDialog(this, "Nhap so!");
            }
            phonghoc ph = new phonghoc(ma, hoten, dc);
            tm.setValueAt(ma, row, 0);
            tm.setValueAt(hoten, row, 1);
            tm.setValueAt(dc, row, 2);
//            tm.setValueAt(sdt, row, 3);
            lbandoc.set(row, ph);
            sua = false;
            ButtonState(true);

        }
    }//GEN-LAST:event_btncnhatActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0 || row > jTable1.getRowCount() - 1)
            JOptionPane.showMessageDialog(this, "Chon ban doc de xoa!");
        else {
            tm.removeRow(row);
            lbandoc.remove(row);
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0 || row > jTable1.getRowCount() - 1) {
            JOptionPane.showMessageDialog(this, "Chon sach de xoa!");
        } else {
            txtma.setText(tm.getValueAt(row, 0).toString());
            txtten.setText(tm.getValueAt(row, 1).toString());
            txtghe.setText(tm.getValueAt(row, 2).toString());
           

        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0 || row > jTable1.getRowCount() - 1)
            JOptionPane.showMessageDialog(this, "Chon sinh vien de sua!");
        else {
            sua = true;
            ButtonState(false);
            txtten.requestFocus();
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfileActionPerformed
        // TODO add your handling code here:
        IOFile.viet(fbandoc, lbandoc);
    }//GEN-LAST:event_btnfileActionPerformed

    private void btnhthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhthiActionPerformed
        // TODO add your handling code here:
        loadData();
        tm.setRowCount(0);
        for (phonghoc i : lbandoc) {
            tm.addRow(i.toObjects());
        }
    }//GEN-LAST:event_btnhthiActionPerformed

    private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
        // TODO add your handling code here:
        String txt = txttimkiem.getText();
        tm.setRowCount(0);
        for (phonghoc i: lbandoc) {
            if (i.getTen().contains(txt)) {
                tm.addRow(i.toObjects());
            }
        }
    }//GEN-LAST:event_btsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncnhat;
    private javax.swing.JButton btnfile;
    private javax.swing.JButton btnhthi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtghe;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
