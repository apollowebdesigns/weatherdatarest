package weather;

import javax.persistence.*;

/**
 * Creates a table for the weather data
 */
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "data")
public class data {
    private static final long serialVersionUID = -3009157732242241606L;

    /**
     * The date is currently being used as a primary key
     */
    @Id
    @Column(name = "date")
    private String date;

    @Column(name = "temperature")
    private String temperature;

    @Column(name = "pressure")
    private String pressure;

    @Column(name = "humidity")
    private String humidity;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }


    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}