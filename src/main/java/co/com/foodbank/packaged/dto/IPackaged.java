package co.com.foodbank.packaged.dto;

import java.util.Collection;
import java.util.Date;
import co.com.foodbank.packaged.item.Item;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.pckage.v1.model 11/07/2021
 */
public interface IPackaged {

    String getId();

    Collection<Item> getItem();

    Long getUnits();

    Date getDatePackage();

}
