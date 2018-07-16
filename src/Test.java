import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * chouchan
 */
public class Test {
    private HashMap<String,Integer> map= new HashMap<String,Integer>();

    public synchronized void add(String key){
        Integer value=map.get(key);
        if (value==null){
            map.put(key,1);
        }
        else{
            map.put(key,value+1);
        }
    }
    private ConcurrentHashMap<String,Integer> map1 = new ConcurrentHashMap<>();
    public void add1(String key){
        Integer value = map1.get(key);
        if(value==null){
            map1.put(key,1);
        }else{
            map1.put(key,value+1);
        }
    }
}
