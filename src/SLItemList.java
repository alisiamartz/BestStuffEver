/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

@param Item
 */
/**
 * BY: 
 * @author Alisia Martinez
 */
public class SLItemList<SItem> {

    private SItem header;
    private SLItemList<SItem> head, tail;
    protected long size;
    
    public SLItemList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    
    // Method to add SItem to the list. Storage space for 
    // the SItem is already allocated in the calling method
    public void addFirst(SItem Node) {
        // Set the tail only if this is the very first SItem
        if (tail == null) {
        //    tail = Node;    // Make next of the new SItem refer to the head
        }
        
    }
    
   // public Item header; 
    
        //    initially its next attribute points to itself
        // can be used to store sentinel when searching list
      
    
    
}
/*
//**************Class SLItemList - Singly Linked Item List*****************\\

    Attributes and methods - only those needed to support UIMS
    header:Item 
        initially its next attribute points to itself
        // can be used to store sentinel when searching list
        
    pushFront(uid:string, cid:number)
        Inserts new item _it_ at the beggining of the list;
        it.userId := uid
        it.customerId := cid

    find:(uid:string)
        returns the item with item.userId = uid
        // if using sentinel in header, returning header means uid was not found
*/