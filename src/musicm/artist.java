/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ankush
 */
public class artist extends javax.swing.JFrame {

    /**
     * Creates new form artist
     */
    String artistID;
    String areaID;
    String groupID;
    String[] strlist = new String[20];
    int trackID1;
    
    public artist() {
        initComponents();
        artistID = "1";
        viewArtist(artistID);
    }

    public artist(String artistID) {
        initComponents();
        this.artistID = artistID;
        viewArtist(artistID);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ARTIST");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 20, 103, 48);

        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 100, 166, 29);

        jLabel3.setText("Area");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 130, 129, 34);

        jLabel4.setText("Gender");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 220, 63, 26);

        jLabel5.setText("Begin Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 170, 109, 14);

        jLabel6.setText("End Date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 190, 118, 34);

        jLabel7.setText("Group");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 250, 100, 27);

        jLabel8.setText("Track");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(320, 220, 57, 14);

        jLabel9.setText("Album");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(640, 220, 60, 14);

        jButton1.setText("BACK TO SEARCH PAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 310, 260, 23);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(462, 260, 0, 0);

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(640, 240, 118, 29);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(320, 240, 135, 30);

        jLabel10.setText("Area:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 140, 60, 14);

        jLabel12.setText("Begin date");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 170, 90, 14);

        jLabel13.setText("End date:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 200, 90, 14);

        jLabel14.setText("Gender:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 230, 90, 14);

        jLabel15.setText("Group");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(50, 260, 80, 14);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicm/imagesrr.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(390, 0, 430, 270);

        jLabel17.setText("Name:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(50, 110, 31, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new search().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here: select album's song
        String alSong = (String)jComboBox1.getSelectedItem();
        
        //area
        try {
            String sql="Select track_id from tracks where name = '"+alSong+"';";
            Class.forName("com.mysql.jdbc.Driver");
            //Connection con= (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=music;user=root;password=dbpass");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/music??autoReconnect=true&useSSL=false"+"&user=root&password=dbpass");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                trackID1 = rs.getInt("track_id");
            }
            this.dispose();
           // new track(trackID1).setVisible(true);
        }catch (Exception e){
            System.out.println("error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    public void viewArtist(String artist_id){
        
        //artist
        try {
            String sql="Select * from artist where artist_id='"+artist_id+"';";
            Class.forName("com.mysql.jdbc.Driver");
            //Connection con= (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=music;user=root;password=dbpass");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/music??autoReconnect=true&useSSL=false"+"&user=root&password=dbpass");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                //id=rs.getInt("ID");
       
//                String uname=rs.getString("name");
//                //Username is the coloumn name in the database table 
//                String password=rs.getString("password");    
//                System.out.println(rs.getString("name"));
       
                jLabel2.setText(rs.getString("name"));
                areaID = rs.getString("area_id");
                groupID = rs.getString("g_id");
                System.out.println("rs.getString" + rs.getString("g_id") +"groupID" + groupID);
                jLabel5.setText(rs.getString("begin_date"));
                jLabel6.setText(rs.getString("end_date"));
                jLabel4.setText(rs.getString("gender"));
            }
        }catch (Exception e){
            System.out.println("error");
            e.printStackTrace();
        }
        
        //area
        try {
            String sql="Select name from area where area_id='"+areaID+"';";
            Class.forName("com.mysql.jdbc.Driver");
            //Connection con= (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=music;user=root;password=dbpass");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/music??autoReconnect=true&useSSL=false"+"&user=root&password=dbpass");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                jLabel3.setText(rs.getString("name"));
            }
        }catch (Exception e){
            System.out.println("error");
            e.printStackTrace();
        }
        System.out.println(groupID+" wertyuiedfgh");
        
        //group
        if(!groupID.equals("-1")){
        try {
            String sql="Select name from groups where g_id='"+groupID+"';";
            Class.forName("com.mysql.jdbc.Driver");
            //Connection con= (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=music;user=root;password=dbpass");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/music??autoReconnect=true&useSSL=false"+"&user=root&password=dbpass");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                jLabel7.setText(rs.getString("name"));
            }  
        }catch (Exception e){
            System.out.println("error");
            e.printStackTrace();
        }
        }else{
            jLabel7.setText("----");
        }
        
        
           
        //track
        try {
            String sql="Select t.name from tracks t,artist_release_track a where t.track_id = a.track_id and a.artist_id = '"+artistID+"';";
            Class.forName("com.mysql.jdbc.Driver");
            //Connection con= (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=music;user=root;password=dbpass");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/music??autoReconnect=true&useSSL=false"+"&user=root&password=dbpass");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int i=0;
            while(rs.next()) {
                //jLabel3.setText(rs.getString("name"));
                jComboBox2.addItem(rs.getString("name"));
            }
//            if(i>3){
//                i=3;
//            }
//            switch(i){
//                case 3:
//                    jLabel12.setText(strlist[--i]);
//                case 2:
//                    jLabel11.setText(strlist[--i]);
//                case 1:
//                    jLabel10.setText(strlist[--i]);
//            }
//                
        }catch (Exception e){
            System.out.println("error");
            e.printStackTrace();
        }
        
        //album
        try {
            String sql="Select al.name as nm from ARTIST_RELEASE_ALBUM1 t,album al where t.album_id = al.album_id and t.artist_id = '"+artistID+"';";
            Class.forName("com.mysql.jdbc.Driver");
            //Connection con= (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=music;user=root;password=dbpass");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/music??autoReconnect=true&useSSL=false"+"&user=root&password=dbpass");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
                
            jComboBox1.removeAllItems();
            jComboBox1.addItem("--Select--");
            while(rs.next()) {
                //jLabel3.setText(rs.getString("name"));
                System.out.println("tytywsd == "+rs.getString("nm"));
                jComboBox1.addItem(rs.getString("nm"));
            }
        }catch (Exception e){
            System.out.println("error");
            e.printStackTrace();
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new artist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
