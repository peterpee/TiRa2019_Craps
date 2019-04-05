
/*
 * Customized HashMap for Statistics
 * 
 * 
 */

// // Tallennetaan heitot tsekattava toiminta

package tira2019_craps;

public class CustomHash <Key, Value> {
    
    private Entry <Key, Value> [] results;  
    private int diceresults = 25; // Mikä arvoksi
    private int putcounter = 0;
    
    static class Entry <Key, Value> {
        
        Key key;
        Value value;
        Entry <Key, Value> next;
     
        public Entry(Key key, Value value, Entry <Key, Value> next){
            
            this.key = key;
            this.value = value;
            this.next = next;
         }
    }
     
    public CustomHash(){
        
       results = new Entry[diceresults];
    }
    
    public int hash(Key key){
        return Math.abs(key.hashCode()) % diceresults;
    }
    
    public void put(Key key, Value value) {
        
        putcounter++;
        int hash = hash(key);

       Entry<Key, Value> newEntry = new Entry<Key, Value>(key, value, null);
      
        if (results[hash] == null){
            results[hash] = newEntry;
        } else {
            Entry<Key,Value> previous = null;
            Entry<Key,Value> current = results[hash];
           
            while(current != null){ 
            if(current.key.equals(key)){           
                if(previous == null){  
                    newEntry.next = current.next;
                    results[hash] = newEntry;
                    return;
               }else{
                    newEntry.next = current.next;
                    previous.next = newEntry;
                    return;
               }
            }
            previous = current;
            current = current.next;
         }
         previous.next = newEntry;
        }
    }

// Tsekattava toiminta
        
    public void showResults() {
         
        System.out.println("Heitto\t\t\tTulos"); 
       
        for(int i = 0; i < diceresults; i++){
            if(results[i] != null){
                Entry<Key, Value> entry = results[i];
                while(entry != null){  
                    


                        System.out.println(entry.key + "\t\t" + entry.value);
                        entry = entry.next;}
                  }
           }
       }             
    }
