package co.com.foodbank.packaged.item;

import co.com.foodbank.contribution.dao.ContributionData;
import co.com.foodbank.product.dto.ProductData;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.packaked.item 26/07/2021
 */
public class Item {

    private ProductData product;
    private ContributionData contribution;
    private Long units;


    /**
     * Default constructor.
     */
    public Item() {}


    public Item(ProductData product, ContributionData contribution,
            Long units) {
        super();
        this.product = product;
        this.contribution = contribution;
        this.units = units;
    }


    public ProductData getProduct() {
        return product;
    }


    public void setProduct(ProductData product) {
        this.product = product;
    }


    public ContributionData getContribution() {
        return contribution;
    }


    public void setContribution(ContributionData contribution) {
        this.contribution = contribution;
    }


    public Long getUnits() {
        return units;
    }


    public void setUnits(Long units) {
        this.units = units;
    }



}
