package co.com.foodbank.packaged.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import co.com.foodbank.contribution.dto.ContributionPK;
import co.com.foodbank.product.dto.ProductPK;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.packaged.dto 27/07/2021
 */
public class ItemDTO {

    @NotNull
    @Pattern(regexp = "^[0-9]{1,5}$",
            message = "Quantity must be numeric between 1-5 digits.")
    private String quantity;

    @Valid
    private ContributionPK contribution;

    @Valid
    private ProductPK product;


    public ItemDTO() {}


    public String getQuantity() {
        return quantity;
    }


    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


    public ContributionPK getContribution() {
        return contribution;
    }


    public void setContribution(ContributionPK contribution) {
        this.contribution = contribution;
    }


    public ProductPK getProduct() {
        return product;
    }


    public void setProduct(ProductPK product) {
        this.product = product;
    }



}
