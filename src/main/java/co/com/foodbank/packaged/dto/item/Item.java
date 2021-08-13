package co.com.foodbank.packaged.dto.item;

import co.com.foodbank.contribution.dto.response.ContributionData;
import co.com.foodbank.product.dto.request.ProductData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.packaked.item 26/07/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private ProductData product;
    private ContributionData contribution;
    private Long units;

}
