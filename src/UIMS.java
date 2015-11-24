/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alisiamartinez
 */
public class UIMS {
    
    // size of currently allocated hash table
    public int m = 2;   // a prime number or power of 2, depending on hash fam used
    // init 2 if hash table is dynamically growing
    
    public int customerId = 0;
    public int[] userT = new int[m-1];
    
    
    
    
    
    boolean isAvailable(String uid) {
        //uid = proposed user id
        // if uid is available
        /*
        if (uid is available){
            return true;
        }
        //if otherwise
        //return false
        }else {
            return false;
        }
        */
        return true;
    }
    
    /*
    void add(String uid) {
        //precondition
        // 
        if (uid.isAvailable && customerId = cid) {  // if available and Id is on last box of table (max amount)
            //uid is in hash table userT associated with cid
            //and customerId = cid+1;
        }
    }
    */
    
    public int lookupCustomerId(String uid) {
        /*
        
        
        if (uid in in hashtable) {
            return customer id associated w user id uid
        } else {
            return 0;
         }
        
        */
        return 0;
        
    }
    
    
    
    public int hash(String uid) {
        
        //returns the hash value for user user id uid
            // a value between 0 and m - 1
        //define using helper functions
        
        return 0;
    }
    
    void reallocate() {
        
    }
    
    void clear(){
        
    }
    
    boolean isEmpty() {
        
    }
    
    
}
 /*
//**************Class UIMS - user id management system*****************\\

    Attributes and Methods:
    
    isAvailable(uid:string):Boolean
        uid:proposed user id
        returns true if the uid is available, 
            false otherwise

    add(uid:string)
        precondition: uid is available and customerId = cid
        post condition: uid is in hash table userT associated with cid 
        and customerId = cid + 1
    public void add(Item data) {
        SItem temp = new SItem(data);
        SItem curr = head;
        if (head == null) {
            head = temp;
        } else {
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(temp);
        }

    }

    lookupCustomerId(uid:string):integer
        returns the customer id associated with user id uid;    
        returns 0 if uid is not an assigned user id
        
    customerId: int     // max # of ids
        initially: 0 
        increased by 1 each time a user id is added
        // since the value of customerId is always equal to the number user ids issued
        // we will use it to compute the load factor of the hash table (below)

    userT:array[0...m-1] of (pointer to) element list

    m: int 
        size of currently allocated has table;
        a prime number or power of 2, depending on hash family used
        initially:2 (if hash table is dynamically growing)

    hash(uid:string):int
        returns the hash value for the user id uid, a value between 0 and m-1
        define using helper functions

    salt: digitseq[0..k-1] if using Mehlhorn method: k = 1 + n/w
        Integer             if using Erickson 12.5.2
        // for the term salt see Erickson, Section 12.5

    generateSalt()
        Generates random salt
        // if you want a random number in range[0...k-1], use a random number generator
        // to generate an int n and then take n mod k 

    load():number
        load() = customer Id/m
        incariant load() <= 0.75
        // when adding a user id would put the load factor over 0.75 then reallocate
        // the hash table, double its size. You may want to experiemnt w other load factors
        
    reallocate()
        allocates a new array of double the current size;
        transfers all existers user ids (w their associated customer ids) to the new array by
        REHASING ALL CURRENT USER IDS
        // it is not necessarily the case that two user ids that colluded under the hash fuction
        // for table size m with also collide under the function for size 2*m

*/