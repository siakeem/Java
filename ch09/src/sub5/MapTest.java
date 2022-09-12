package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 날짜 : 2022/09/08
 * 이름 : 김시아
 * 내용 : 자료구조 Map 실습하기
 * 
 * Map
 */
public class MapTest {
      public static void main(String[] args) {
		
    	  //Map 생성
    	  HashMap<String, String> map1 = new HashMap<>();
    	  
    	  map1.put("A", "Apple");
    	  map1.put("B", "Banana");
    	  map1.put("C", "Cherry");
    	  
    	  //Map 크기
    	  System.out.println("map1 크기 : "+map1.size());
    	  
    	  //Map 출력
    	  System.out.println(map1);
    	  
    	  for(String k : map1.keySet()) {
    		  
    		  System.out.println(k +" : "+map1.get(k));
    	  }
    	  
    	  //Map 응용
    	  List< Map<Integer, Apple>> maplist = new ArrayList<>();
    	   
    	  Map<Integer, Apple> m1 = new HashMap<>();
    	  
    	  m1.put(101, new Apple("한국",3000));
    	  m1.put(102, new Apple("중국",2000));
    	  m1.put(103, new Apple("일본",1000));
    	  
          Map<Integer, Apple> m2 = new HashMap<>();
    	  
    	  m2.put(201, new Apple("미국",3000));
    	  m2.put(202, new Apple("영국",2000));
    	  m2.put(203, new Apple("호주",1000));
    	  
    	  
          Map<Integer, Apple> m3 = new HashMap<>();
    	  
    	  m3.put(301, new Apple("태국",3000));
    	  m3.put(302, new Apple("대만",2000));
    	  m3.put(303, new Apple("홍콩",1000));
    	  
    	  
    	  maplist.add(m1);
    	  maplist.add(m2);
    	  maplist.add(m3);
    	  
    	  //한국사과 
    	  Map<Integer, Apple> map = maplist.get(0);
    	  Apple apple = map.get(101);
    	  apple.show();
    	  
    	  
    	  //호주사과
    	  maplist.get(1).get(203).show();
    	  
    	  //대만사과
    	  maplist.get(2).get(302).show();
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	}
}
