package stockapp.data.entity;

/**
 * @author M. Sorokina
 * Описание сущности Продажа, отвечающая за фиксацию продаж товара со склада
 * 
 */

public class Sale extends AbstractEntity
{
    protected String saleDate;
    protected int itemId;
    protected int itemCount;
    
    public String getSaleDate()
    {
        return this.saleDate;
    }
    public void setSaleDate(String saleDate)
    {
        this.saleDate = saleDate;
    }
    
    public int getItemId()
    {
        return this.itemId;
    }
    public void setItemId(int itemId)
    {
        this.itemId = itemId;
    }
    
    public int getItemCount()
    {
        return this.itemCount;
    }
    public void setItemCount(int itemCount)
    {
        this.itemCount = itemCount;
    }    
    @Override
    public String toString()
    {
        return String.format("%d;%s;%d;%d", this.id, this.saleDate, this.itemId, this.itemCount);
    }
}
