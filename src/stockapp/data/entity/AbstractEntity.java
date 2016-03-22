package stockapp.data.entity;

/**
 * @author 
 * 
 */
public abstract class AbstractEntity 
{
    protected int id;
    
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
}
