/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Neha N
 */
public class Class_Patient extends Class_Person{
    private String P_id;
    private String mstatus;
    private String cnic;
    private String patienttype;
    private String date;
    private String bedno;
    private byte[]imagedata;
    
        public int search(String patientid){
        System.out.println("In Class_Patient.search");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false","root","");
            PreparedStatement pst = conn.prepareStatement( "select *from patient where P_id=?");
            pst.setString(1,patientid);
            ResultSet rs=pst.executeQuery();

            if(rs.next()){
                setFname(rs.getString("firstname"));
                setLname(rs.getString("secondname"));
                setAge(rs.getString("age"));
                setMstatus(rs.getString("maritialstatus"));
                setGender(rs.getString("gender"));
                setAddress(rs.getString("address"));
                setMstatus(rs.getString("MaritialStatus"));
                setCnic(rs.getString("CNIC"));
                setPatienttype(rs.getString("PatientType"));
                setDate(rs.getString("Date"));
                setPhoneno(rs.getString("Phoneno"));
                setImagedata(rs.getBytes("Patientphoto"));
                return 1;

            }
            else{
                return 0;
            }
       }

       catch (Exception e) 
       {
            JOptionPane.showMessageDialog(null, e);
            return 0;
       }
    }                        

    /**
     * @return the P_id
     */
    public String getP_id() {
        return P_id;
    }

    /**
     * @param P_id the P_id to set
     */
    public void setP_id(String P_id) {
        this.P_id = P_id;
    }

    /**
     * @return the mstatus
     */
    public String getMstatus() {
        return mstatus;
    }

    /**
     * @param mstatus the mstatus to set
     */
    public void setMstatus(String mstatus) {
        this.mstatus = mstatus;
    }

    /**
     * @return the cnic
     */
    public String getCnic() {
        return cnic;
    }

    /**
     * @param cnic the cnic to set
     */
    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    /**
     * @return the patienttype
     */
    public String getPatienttype() {
        return patienttype;
    }

    /**
     * @param patienttype the patienttype to set
     */
    public void setPatienttype(String patienttype) {
        this.patienttype = patienttype;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the bedno
     */
    public String getBedno() {
        return bedno;
    }

    /**
     * @param bedno the bedno to set
     */
    public void setBedno(String bedno) {
        this.bedno = bedno;
    }

    /**
     * @return the imagedata
     */
    public byte[] getImagedata() {
        return imagedata;
    }

    /**
     * @param imagedata the imagedata to set
     */
    public void setImagedata(byte[] imagedata) {
        this.imagedata = imagedata;
    }
    }
