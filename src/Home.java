import java.util.*;

/**
 * This Class Represents Home Entity with attributes as:
 * street, unit, city, state, zip, dateLastRented, price.
 *
 */

public class Home {
    String street;
    String unit;
    String city;
    String state;
    Integer zip;
    Date dateLastRented;
    Double price;

    public Home(String street, String unit, String city, String state, Integer zip, Date dateLastRented, Double price) {
        this.street = street;
        this.unit = unit;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.dateLastRented = dateLastRented;
        this.price = price;
    }

    /**
     * @return street value.
     */
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {

        this.unit = unit;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getState() {

        return state;
    }

    public void setState(String state) {

        this.state = state;
    }

    public Integer getZip() {

        return zip;
    }

    public void setZip(Integer zip) {

        this.zip = zip;
    }

    public Date getDateLastRented() {

        return dateLastRented;
    }

    public void setDateLastRented(Date dateLastRented) {

        this.dateLastRented = dateLastRented;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {

        this.price = price;
    }
}
