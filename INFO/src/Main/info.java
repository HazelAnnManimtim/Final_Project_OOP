/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Shanel Manimtim
 */
public class info {
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private String price;
    private String phonenumber;

    public info (int pid, String Name, String LastName, String Address, String Price, String PhoneNumber)
    {
        this.id = pid;
        this.firstname = Name;
        this.lastname = LastName;
        this.address = Address;
        this.price = Price;
        this.phonenumber = PhoneNumber;   
    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getPrice() {
        return price;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

}
