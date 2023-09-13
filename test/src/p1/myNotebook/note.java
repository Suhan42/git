package p1.myNotebook;


import java.util.HashMap;
import java.util.Map;


class note{
    public static void main(String[] args){
    	Map<Integer, String> map = new HashMap<>();
    	//在最后 添加键值对
    	map.put(1, "Google");
    	map.put(2, "suhan");
    	System.out.println(map);
    	
       //get(key) 获取 key 对应的 value
    	System.out.println(map.get(2));
    	
    	//KeySet() 获取 key[]
    	for (Integer i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
        }
    	
    	//vlaues() 获取 values[]
    	for(String value: map.values()) {
            System.out.print(value + ",");
        }
    	System.out.print("\n");
    	
    	//remove(key) 删除 key 对应的键值对(key-value)
    	map.remove(2);
    	System.out.println(map);
    	
    	//size() 计算 HashMap 中的元素数量
    	System.out.println(map.size());
    	
    	//clear() 删除所有键值对(key-value)
    	map.clear();
    	System.out.println(map);
    	
    	
    }
}