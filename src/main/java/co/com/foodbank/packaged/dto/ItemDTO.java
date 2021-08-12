package co.com.foodbank.packaged.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import co.com.foodbank.contribution.dto.ContributionPK;
import co.com.foodbank.product.dto.ProductPK;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.packaged.dto 27/07/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {

    @NotNull
    @Pattern(regexp = "^[0-9]{1,5}$",
            message = "Quantity must be numeric between 1-5 digits.")
    private String quantity;

    @Valid
    private ContributionPK contribution;

    @Valid
    private ProductPK product;



}
