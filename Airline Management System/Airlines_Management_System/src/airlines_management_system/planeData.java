
package airlines_management_system;

import java.sql.Date;


public class planeData {
    
    private Integer planeId;
    private String location;
    private String status;
    private Double price;
    private Date date;
    
    public planeData(Integer planeId, String location, String status, Double price, Date date){
        this.planeId = planeId;
        this.location = location;
        this.status = status;
        this.price = price;
        this.date = date;
    }
    
    public Integer getPlaneId(){
        return planeId;
    }
    public String getLocation(){
        return location;
    }
    public String getStatus(){
        return status;
    }
    public Double getPrice(){
        return price;
    }
    public Date getDate(){
        return date;
    }
}
