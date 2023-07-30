// code:
// name:
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Pom
 */
public class IOFile {
    public static <T> List <T> doc (String file ){
        List <T> list = new ArrayList<>();
        try{
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
            list =(List<T>) o.readObject();
            o.close();
        }catch(IOException e){
            System.out.println(e);
        } catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }
    public static <T> void viet(String file, List<T> arr){
        try{
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(arr);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}




//public static <T> List<T> doc(String file) {
//        List<T> list = new ArrayList<>();
//        try {
//            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
//            list =(List<T>)o.readObject();
//            o.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//    }
//    
//    public static <T> void viet(String file, List<T> arr){
//        try {
//            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
//            o.writeObject(arr);
//            o.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
////Khach Hang
//public class KhachHang implements Serializable{
//    private int ma;
//    private String ten,dc,sdt,loai;
//    private static int sma=1000;
//
//    public KhachHang() {
//    }
//
//    public KhachHang(String ten, String dc, String sdt, String loai) throws TrongException,SoException{
//        if(ten.isEmpty()) throw new TrongException();
//        if(!sdt.matches("\\d+")) throw new SoException();
//        this.ma = sma++;
//        this.ten = ten;
//        this.dc = dc;
//        this.sdt = sdt;
//        this.loai = loai;
//    }
//
//    public int getMa() {
//        return ma;
//    }
//
//    public void setMa(int ma) {
//        this.ma = ma;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public void setTen(String ten) {
//        this.ten = ten;
//    }
//
//    public String getDc() {
//        return dc;
//    }
//
//    public void setDc(String dc) {
//        this.dc = dc;
//    }
//
//    public String getSdt() {
//        return sdt;
//    }
//
//    public void setSdt(String sdt) {
//        this.sdt = sdt;
//    }
//
//    public String getLoai() {
//        return loai;
//    }
//
//    public void setLoai(String loai) {
//        this.loai = loai;
//    }
//
//    public static int getSma() {
//        return sma;
//    }
//
//    public static void setSma(int sma) {
//        KhachHang.sma = sma;
//    }
//    
//    
//    public Object[] toObject(){
//        return new Object[]{
//            ma,ten,dc,sdt,loai
//        };
//    }
//    
//}
//
////Phòng
//public class Phong implements Serializable{
//    private int ma;
//    private String ten,loai;
//    private static int sma=100;
//
//    public Phong() {
//    }
//
//    public Phong(String ten, String loai)throws TrongException {
//        if (ten.isEmpty()) throw new TrongException();
//        this.ma = sma++;
//        this.ten = ten;
//        this.loai = loai;
//    }
//
//    public Phong(int ma, String ten, String loai) {
//        this.ma = ma;
//        this.ten = ten;
//        this.loai = loai;        
//    }
//
//    public int getMa() {
//        return ma;
//    }
//
//    public void setMa(int ma) {
//        this.ma = ma;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public void setTen(String ten) {
//        this.ten = ten;
//    }
//
//    public String getLoai() {
//        return loai;
//    }
//
//    public void setLoai(String loai) {
//        this.loai = loai;
//    }
//
//    public static int getSma() {
//        return sma;
//    }
//
//    public static void setSma(int sma) {
//        Phong.sma = sma;
//    }
//       
//    public Object[] toObject(){
//        return new Object[]{
//            ma,ten,loai
//        };
//    }
//    
//    
//}
//
//
////phan đầu
//DefaultTableModel tmKH,tmP;
//    String fKH,fP;
//    List<KhachHang> listKH;
//    List<Phong> listP;
//    public Main() {
//        initComponents();
//        fKH="src/controller/KH.dat";
//        fP="src/controller/P.dat";
//        String[] kh={"ma KH","ten KH","dia chi","so dien thoai","loai khach hang"};
//        String[] p={"ma Phong","ten Phong","loai phong"};
//        tmKH=new DefaultTableModel(kh,0);
//        tmP=new DefaultTableModel(p,0);
//        jTable1.setModel(tmKH);
//        jTable2.setModel(tmP);
//        loadKH();showKH(listKH);
//        loadP();showP(listP);
//    }
//    private void loadKH(){
//        File f=new File(fKH);
//        if(f.exists()){
//            listKH=IOFile.doc(fKH);
//        } else
//            listKH=new ArrayList<>();
//    }
//    private void loadP(){
//        File f=new File(fP);
//        if(f.exists()){
//            listP=IOFile.doc(fP);
//        } else
//            listP=new ArrayList<>();
//    }
//    private void showKH(List<KhachHang> list){
//        tmKH.setRowCount(0);
//        for(KhachHang i:list)
//            tmKH.addRow(i.toObject());        
//    }
//    private void showP(List<Phong> list){
//        tmP.setRowCount(0);
//        for(Phong i:list)
//            tmP.addRow(i.toObject());        
//    }
//
//private void btThemKHActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        // TODO add your handling code here:
//        int n=listKH.size();
//        if(n>0)
//            KhachHang.setSma(listKH.get(n-1).getMa()+1);
//        jMAKH.setText(KhachHang.getSma()+" ");
//        String ten,dc,sdt,loai;
//        try {
//            ten=jTENKH.getText();
//            dc=jDIACHI.getText();
//            sdt=jSDT.getText();
//            loai=jComboBox1.getSelectedItem().toString();
//            KhachHang kh=new KhachHang(ten,dc,sdt,loai);
//            tmKH.addRow(kh.toObject());
//            listKH.add(kh);
//        } catch (TrongException e) {
//            JOptionPane.showMessageDialog(this," khong duoc bo trong ");
//            return ;
//        } catch (SoException e) {
//            JOptionPane.showMessageDialog(this," nhap vao so ");
//            return ;
//        }
//    }                                        
//
//    private void btXoaKHActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        // TODO add your handling code here:
//        int r=jTable1.getSelectedRow();
//        if(r>=0 && r<jTable1.getRowCount()){
//            tmKH.removeRow(r);
//            listKH.remove(r);
//        }else{
//            JOptionPane.showMessageDialog(this,"chon khach hang can xoa");
//            return ;
//        }
//    }                                       
//
//    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        // TODO add your handling code here:
//        IOFile.viet(fKH, listKH);
//    }                                     
//
//    private void btTHEMPHONGActionPerformed(java.awt.event.ActionEvent evt) {                                            
//        // TODO add your handling code here:
//        int n=listP.size();
//        if(n>0)
//            Phong.setSma(listP.get(n-1).getMa()+1);
//        jMAPHONG.setText(Phong.getSma()+" ");
//        String ten,loai;
//        try {
//            ten=jTENPHONG.getText();
//            loai=jComboBox2.getSelectedItem().toString();
//            Phong p=new Phong(ten,loai);
//            tmP.addRow(p.toObject());
//            listP.add(p);
//        } catch (TrongException e) {
//            JOptionPane.showMessageDialog(this," khong duoc bo trong ");
//            return ;
//        }
//    }                                           
//
//    private void btLuuPhongActionPerformed(java.awt.event.ActionEvent evt) {                                           
//        // TODO add your handling code here:
//        IOFile.viet(fP, listP);
//    }                                          
//
//    private void btSUAPHONGActionPerformed(java.awt.event.ActionEvent evt) {                                           
//        // TODO add your handling code here:
//        int r=jTable2.getSelectedRow();
//        if(r>=0 && r<jTable2.getRowCount()){
//            String ten=jTENPHONG.getText();
//            String loai=jComboBox2.getSelectedItem().toString();
//            tmP.setValueAt(ten, r, 1);
//            tmP.setValueAt(loai, r, 2);
//            int ma=Integer.parseInt(jMAPHONG.getText());
//            Phong p=new Phong(ma,ten,loai);
//            listP.set(r, p);            
//        }else{
//            JOptionPane.showMessageDialog(this,"chon phong can sua");
//            return ;
//        }
//    }                                          
//
//    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {                                     
//        // TODO add your handling code here:
//        int r=jTable2.getSelectedRow();
//        jMAPHONG.setText(tmP.getValueAt(r,0).toString());
//        jTENPHONG.setText(tmP.getValueAt(r,1).toString());
//        jComboBox2.setSelectedItem(tmP.getValueAt(r,2).toString());
//    }                                    
////nút tìm
//    private void btTIMActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        // TODO add your handling code here:
//        String key =jTIM.getText().trim().toLowerCase();
//        List<KhachHang> l = new ArrayList<>();
//        for (KhachHang i:listKH)
//            if(i.getTen().toLowerCase().contains(key)|| i.getSdt().toLowerCase().contains(key))
//                l.add(i);
//        showKH(l);
//    }

// IOFILE PHUOC


//public static <T> List <T> doc (String file ){
//        List <T> list = new ArrayList<>();
//        try{
//            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
//            list =(List<T>) o.readObject();
//            o.close();
//        }catch(IOException e){
//            System.out.println(e);
//        } catch(ClassNotFoundException e){
//            System.out.println(e);
//        }
//        return list;
//    }
//    public static <T> void viet(String file, List<T> arr){
//        try{
//            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
//            o.writeObject(arr);
//            o.close();
//        }catch(IOException e){
//            System.out.println(e);
//        }
//    }