/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Neha N
 */
public class Class_Doctor extends Class_Person{
    private int D_id;
    private String cnic;
    private String specialization;
    private String joiningdate;
    private String leavingdate;
    private String timing;
    private String days;
    private String bloodgrp;
    private String mstatus;
    private String city;
    private byte[]imagedata;
    private String username;
    private String password;
    
    public int search(String doctorid){
        System.out.println("In Class_Doctor.search");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem?useSSL=false","root","");
            PreparedStatement pst = conn.prepareStatement( "select *from doctor where D_id=?");
            pst.setString(1,doctorid);
            ResultSet rs=pst.executeQuery();

            if(rs.next()){
                setFname(rs.getString("firstname"));
                setLname(rs.getString("secondname"));
                setAge(rs.getString("age"));
                setMstatus(rs.getString("maritialstatus"));
                setGender(rs.getString("gender"));
                setAddress(rs.getString("address"));
                setCnic(rs.getString("cnic"));
                setBloodgrp(rs.getString("bloodgroup"));
                setJoiningdate(rs.getString("joiningdate"));
                setLeavingdate(rs.getString("leavingdate"));
                setPhoneno(rs.getString("phoneno"));
                setCity(rs.getString("city"));
                setUsername(rs.getString("username"));
                setPassword(rs.getString("password"));
                setSpecialization(rs.getString("specialization"));
                setImagedata(rs.getBytes("doctorphoto"));
                setTiming(rs.getString("timing"));
                setDays(rs.getString("days"));
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
     * @return the D_id
     */
    public int getD_id() {
        return D_id;
    }

    /**
     * @param D_id the D_id to set
     */
    public void setD_id(int D_id) {
        this.D_id = D_id;
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
     * @return the specialization
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * @param specialization the specialization to set
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * @return the joiningdate
     */
    public String getJoiningdate() {
        return joiningdate;
    }

    /**
     * @param joiningdate the joiningdate to set
     */
    public void setJoiningdate(String joiningdate) {
        this.joiningdate = joiningdate;
    }

    /**
     * @return the leavingdate
     */
    public String getLeavingdate() {
        return leavingdate;
    }

    /**
     * @param leavingdate the leavingdate to set
     */
    public void setLeavingdate(String leavingdate) {
        this.leavingdate = leavingdate;
    }

    /**
     * @return the timing
     */
    public String getTiming() {
        return timing;
    }

    /**
     * @param timing the timing to set
     */
    public void setTiming(String timing) {
        this.timing = timing;
    }

    /**
     * @return the days
     */
    public String getDays() {
        return days;
    }

    /**
     * @param days the days to set
     */
    public void setDays(String days) {
        this.days = days;
    }

    /**
     * @return the bloodgrp
     */
    public String getBloodgrp() {
        return bloodgrp;
    }

    /**
     * @param bloodgrp the bloodgrp to set
     */
    public void setBloodgrp(String bloodgrp) {
        this.bloodgrp = bloodgrp;
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
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
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

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
