package demo;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        //int arr[]={10, 30, 40,50,70,10};
        String s[]={"Masseeha","Mariyam","Melroy","Masseeha"};
        HashMap<String,Integer> map=new HashMap();
        for(int i=0;i<s.length;i++)
        {
            String n=s[i];
            //char ch=s.charAt(i);
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
        }
        System.out.println(map);
        for(String key:map.keySet())
        {
            if(map.get(key)>1)
            {
                System.out.println(key+":"+map.get(key));
            }
        }
    }
}
