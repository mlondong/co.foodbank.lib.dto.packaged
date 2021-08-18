package co.com.foodbank.packaged.request;

import java.util.Collection;
import java.util.Date;
import co.com.foodbank.packaged.dto.interfaces.IPackaged;
import co.com.foodbank.packaged.dto.item.Item;
import co.com.foodbank.packaged.dto.state.IStatePackaged;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestPackaged implements IPackaged {
    private String id;
    private Collection<Item> item;
    private Long units;
    private Date datePackage;
    private IStatePackaged state;


    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public Collection<Item> getItem() {
        // TODO Auto-generated method stub
        return item;
    }

    @Override
    public Long getUnits() {
        // TODO Auto-generated method stub
        return units;
    }

    @Override
    public Date getDatePackage() {
        // TODO Auto-generated method stub
        return datePackage;
    }


}
