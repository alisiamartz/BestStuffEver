/*
 * Class:SItem 
 * Used to store info about 
 */

/**
 *  BY:
 * @author alisiamartinez
 */
public class SItem<Item> {
    
    private Item customerid;        // customer ID 
    private Item userid;            // user ID     
    private SItem<Item> next;   //next node
    
    
    public SItem() {
        this(null, null, null);
    }
    
    public SItem(Item customerid, Item userid, SItem<Item> next) {
        this.customerid = customerid;
        this.userid = userid;
        this.next = next;
    }
    
    public Item getCustomerID() {
        return this.customerid;
    }
    
    public Item getUserID() {
        return this.userid;
    }
    
    public void setData(Item customerid) {
        this.customerid = customerid;
    }
    
    public SItem getNext() {
        return this.next;
    }
    
    public void setNext(SItem nextSItem){
        this.next = nextSItem;
    }
}
/*
//**************Class SItem*****************\\

    Attributes and methods
    
    userId: string
    customerId: number
    next: Item
*/
