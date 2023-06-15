package basic;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

// Noi dung: dung code
/**
 *
 * @author Pom
 */
public class Gui_1 extends JFrame 
        implements ActionListener, DocumentListener {

    private JLabel lbln1, lbln2, lblkq;
    private JTextField txtn1, txtn2;
    private JButton bt1, bt2,bt3;

    public Gui_1() {
        initGUI();
    }

    private void initGUI() {
        setTitle("Tinh toan");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(null);
        //khởi tạo
        lbln1 = new JLabel("Nhap so 1:");
        lbln2 = new JLabel("Nhap so 2:");
        lblkq = new JLabel("Ket qua:");
        lbln1.setBounds(50, 50, 120, 20);
        lbln2.setBounds(50, 100, 120, 20);
        lblkq.setBounds(80, 150, 200, 20);
        add(lbln1);
        add(lbln2);
        add(lblkq);
        txtn1 = new JTextField();
        txtn2 = new JTextField();
        txtn1.setBounds(200, 50, 150, 20);
        txtn2.setBounds(200, 100, 150, 20);
        add(txtn1);
        add(txtn2);
        bt1=new JButton("NHAP LAI");
        bt2=new JButton("TINH");
        bt1.setBounds(100, 200, 150, 20);
        bt2.setBounds(300, 200, 150, 20);
        add(bt1);
        add(bt2);
        Font f = new Font("arial", Font.PLAIN, 20);
        lbln1.setFont(f);
        lbln2.setFont(f);
        lblkq.setFont(f);
        txtn1.setFont(f);
        txtn2.setFont(f); 
        bt1.setFont(f); 
        bt2.setFont(f);
        bt3=new JButton("DONG");
        bt3.setBounds(200, 250, 150, 20);
        add(bt3);
        bt3.setFont(f);
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        txtn1.getDocument().addDocumentListener(this);
        txtn2.getDocument().addDocumentListener(this);

    }

    public static void main(String[] args) {
        Gui_1 m = new Gui_1();
        m.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1){
            txtn1.setText("");
            txtn2.setText("");
        }
        if(e.getSource()==bt2){
            int n1= Integer.parseInt(txtn1.getText());
            int n2= Integer.parseInt(txtn2.getText());
            lblkq.setText("Tong: "+(n1+n2));
        }
        if(e.getSource()==bt3){
            if(JOptionPane.showConfirmDialog(this, "Co dong y thoat khong", "Thoat", JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }
        
    }
    private void check(){
        String s1 = txtn1.getText();
        String s2 = txtn2.getText();
        if(s1.isEmpty() && s2.isEmpty())
            bt1.setEnabled(false);
        if(!s1.isEmpty()|| !s2.isEmpty())
            bt1.setEnabled(true);
        String reg ="\\d++";
        if(s1.matches(reg)&& s2.matches(reg)){
            bt2.setEnabled(true);
        } else bt2.setEnabled(false);
    }
    @Override
    public void insertUpdate(DocumentEvent e) {
        check();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        check();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        
    }
}
