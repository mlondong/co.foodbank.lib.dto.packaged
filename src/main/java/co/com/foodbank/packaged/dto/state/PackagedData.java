package co.com.foodbank.packaged.dto.state;

import java.util.Collection;
import java.util.Date;
import co.com.foodbank.packaged.dto.interfaces.IPackaged;
import co.com.foodbank.packaged.dto.item.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PackagedData implements IPackaged {

    private String id;
    private Collection<Item> item;
    private Long units;
    private Date datePackage;
    private IStatePackaged state;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Collection<Item> getItem() {
        return item;
    }

    @Override
    public Long getUnits() {
        return units;
    }

    @Override
    public Date getDatePackage() {
        return datePackage;
    }


}
