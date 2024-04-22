import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.net.*;
import java.io.*;

public class Server777 implements ActionListener {
Panel sub;
JPanel p;
JPanel p6;
JPanel p7;
JPanel p8;

    JButton ser;
    JTextField text;
    JPanel a1;
    static Box vertical = Box.createVerticalBox();
    static JFrame f = new JFrame();
    static DataOutputStream dout;
    
    
    Server777() {
        
        f.setLayout(null);
        
        JPanel p1 = new JPanel();
	p1.setVisible(false);
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        p1.setLayout(null);
        f.add(p1);
        
        ImageIcon i1 = new ImageIcon("E:/icons/3.png");
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new  JLabel(i3);
        back.setBounds(5, 20, 25, 25);
        p1.add(back); //image i3 add on p1 panel
	
        
        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
                a1.setVisible(false);
		p1.setVisible(false);
		p.setVisible(true);
		
            }
        });

        p=new JPanel();
	p.setBounds(5, 75, 440, 570);
	p.setBackground(Color.WHITE);
	//p.setLayout(new BorderLayout());
	f.add(p);
	p.setVisible(true);

	ImageIcon i123 = new ImageIcon("E:/arroww.PNG");
        Image i22 = i123.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i34 = new ImageIcon(i22);
        JLabel backk = new  JLabel(i34);
        backk.setBounds(5, 10, 25, 5);
        p.add(backk); //image i3 add on p1 panel
	backk.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
             System.exit(0);

 }
        });
	JLabel w= new JLabel("CommuniCation");
	w.setBounds(5, 85, 20, 24);
	/*JButton c=new JButton("Chat");
	//c.setBounds(110, 35, 10, 18);
	c.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
             ser.setVisible(true);
 }});*/
 
	
	/*JButton st=new JButton("Status");
	//st.setBounds(60, 105, 23, 40);
	
	p.add(w);p.add(c);p.add(st);
	ser=new JButton("Server");
	//ser.setBounds(320, 655, 23, 40);
	ser.setVisible(false);
	p.add(ser);
	ser.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
		p.setVisible(false);
		p1.setVisible(true);
                a1.setVisible(true);
		
}
});*/
p6=new JPanel(); 
ser=new JButton("Server");
p6.add(ser); 
ser.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
		p.setVisible(false);
		p1.setVisible(true);
                a1.setVisible(true);
		
}
});
 //p6.setBounds(70,70,220,220);

JTextArea ta=new JTextArea(20,20);  


     p7=new JPanel();
p7.add(ta);

 p8=new JPanel();  
JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(70,80,120,120);  
    tp.add("Chat",p6);  
    tp.add("Status",p7);  
    tp.add("Calls",p8);    
    p.add(tp);  
    

        ImageIcon i4 = new ImageIcon("E:/wall1.jpg");
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40, 10, 50, 50);
        p1.add(profile); //i6 image add on p1 panel 
        
        ImageIcon i7 = new ImageIcon("E:/video.png");
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(300, 20, 30, 30);
        p1.add(video);//i9 video image add on p1 panel 
        
        ImageIcon i10 = new ImageIcon("E:/phone.png");
        Image i11 = i10.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        phone.setBounds(360, 20, 35, 30);
        p1.add(phone); //i12 phone image add on p1 panel 
        
        ImageIcon i13 = new ImageIcon("E:/3icon.png");
        Image i14 = i13.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel morevert = new JLabel(i15);
        morevert.setBounds(420, 20, 10, 25);
        p1.add(morevert); //i15 more:image add on p1 panel 
         
        

        JLabel name = new JLabel("server");
        name.setBounds(110, 15, 100, 18);
        name.setForeground(Color.WHITE);
        //name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p1.add(name); //name label
        
        JLabel status = new JLabel("Active Now");
        status.setBounds(110, 35, 100, 18);
        status.setForeground(Color.WHITE);
     // status.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        p1.add(status);// active now status
        
        a1 = new JPanel();// all msg show on a1 panel
        a1.setBounds(5, 75, 440, 570);
	a1.setVisible(false);
        
	/*JScrollPane scrollPane = new JScrollPane(a1); 
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	f.getContentPane().add(scrollPane ); //new panel a1*/
	f.add(a1);
        
        text = new JTextField();
        text.setBounds(5, 655, 310, 40);
       // text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        f.add(text); // users input which is on add directly frame not panel
        
        JButton send = new JButton("Send");
        send.setBounds(320, 655, 123, 40);
        send.setBackground(new Color(7, 94, 84));
        send.setForeground(Color.WHITE);
        send.addActionListener(this);
       // send.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        f.add(send); // users msg send btn which is on add directly frame not panel
        
        f.setSize(450, 700);
        f.setLocation(200, 50);
        f.setUndecorated(true);
        f.getContentPane().setBackground(Color.WHITE);
        f.setVisible(true);
}
    
    public void actionPerformed(ActionEvent ae) {
         try {
            String out = text.getText();

            JPanel p2 = formatLabel(out);

            a1.setLayout(new BorderLayout());

            JPanel right = new JPanel(new BorderLayout());
            right.add(p2, BorderLayout.LINE_END);
            vertical.add(right);
            vertical.add(Box.createVerticalStrut(15));

            a1.add(vertical, BorderLayout.PAGE_START);

            dout.writeUTF(out);

            text.setText("");

            f.repaint();
            f.invalidate();
            f.validate();   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static JPanel formatLabel(String out) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JLabel output = new JLabel("<html><p style=\"width: 150px\">" + out + "</p></html>");
        //output.setFont(new Font("Tahoma", Font.PLAIN, 16));
        output.setBackground(new Color(37, 211, 102));
        output.setOpaque(true);
        output.setBorder(new EmptyBorder(15, 15, 15, 50));
        
        panel.add(output);
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        
        JLabel time = new JLabel();
        time.setText(sdf.format(cal.getTime()));
        
        panel.add(time);
        
        return panel;
    }
    
    public static void main(String[] args) {
        new Server777();
        
         try {
            ServerSocket skt = new ServerSocket(6001);
            while(true) {
                Socket s = skt.accept();
                DataInputStream din = new DataInputStream(s.getInputStream());
                dout = new DataOutputStream(s.getOutputStream());
                
                while(true) {
                    String msg = din.readUTF();
                    JPanel panel = formatLabel(msg);
                    
                    JPanel left = new JPanel(new BorderLayout());
                    left.add(panel, BorderLayout.LINE_START);
                    vertical.add(left);
                    f.validate();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
                      
