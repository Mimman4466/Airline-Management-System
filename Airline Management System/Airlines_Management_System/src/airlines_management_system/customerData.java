
package airlines_management_system;

import java.sql.Date;


public class customerData {
    
    private Integer customerNum;
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNum;
    private Integer planeId;
    private String location;
    private String type;
    private Integer seatNum;
    private Double total;
    private Date date;
    
    public customerData(Integer customerNum, String firstName, String lastName, String gender, String phoneNum, Integer planeId, String location, String type, Integer seatNum, Double total, Date date){
        this.customerNum = customerNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.planeId = planeId;
        this.location = location;
        this.type = type;
        this.seatNum = seatNum;
        this.total = total;
        this.date = date;
    }
    
    public Integer getCustomerNum(){
        return customerNum;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getGender(){
        return gender;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public Integer getPlaneId(){
        return planeId;
    }
    public String getLocation(){
        return location;
    }
    public String getType(){
        return type;
    }
    public Integer getSeatNum(){
        return seatNum;
    }
    public Double getTotal(){
        return total;
    }
    public Date getDate(){
        return date;
    }
    
}
