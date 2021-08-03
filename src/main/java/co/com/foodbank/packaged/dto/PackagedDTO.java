package co.com.foodbank.packaged.dto;

import java.util.Date;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.packaged.dto 12/07/2021
 */
public class PackagedDTO {

    @Pattern(regexp = "^[0-9]{1,8}$",
            message = "Num of units must be numeric between 1-8 digits.")
    private String units;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date datePackage;


    /**
     * Default constructor.
     */
    public PackagedDTO() {}

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Date getDatePackage() {
        return datePackage;
    }

    public void setDatePackage(Date datePackage) {
        this.datePackage = datePackage;
    }



}
