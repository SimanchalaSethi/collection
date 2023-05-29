import java.util.*;


class Practice{
    public static void main(String[] args) {
     /* 
      // ArrayList
      List<Integer> al = new ArrayList<Integer>();
      //adding value into array list
      al.add(12);
      al.add(423);
      al.add(3);
     //printing data
     for(Integer i: al){
        System.out.println(i);
     }
     //removing element 
     al.remove(0);
     //adding element in a particular index
     al.add(2,23);
     //getting element in a particular index
     System.out.println(al.get(2));
      */       

      //linked list
 Product p1=new Product(1200, 1, "waterbottle");
Product p2=new Product(1400, 3, "Shampoo");
LinkedList<Product> lst = new LinkedList<Product>();
lst.add(p1);
lst.add(p2);
Product p10=new Product(5000, 1, "Mobile");
lst.add(1, p10);
for(Product p:lst) {
System.out.println(p.qty+" "+p.type+" "+p.price);
}

//set
        Set<String> set = new HashSet<String>();
        set.add("red");
        set.add("yellow");
        set.add("white");
        set.add("red");
        set.add(null);
        set.add("orange");
        set.add(null);
        System.out.println(set);

//Linked Hash set
        Set<String> set = new LinkedHashSet<String>();
        set.add("red");
        set.add("yellow");
        set.add("white");
        set.add("red");
        set.add(null);
        set.add("orange");
        set.add(null);
        System.out.println(set);

        //tree set
        Set<String> set = new TreeSet<String>();
        set.add("Babu");
        set.add("Suresh");
        set.add("Arun");
        set.add("Zain");
        System.out.println(set);


        //map
        Map<Integer,String> indmap = new HashMap<Integer,
                String>();
        indmap.put(7, "Dohni");
        indmap.put(8, "Virat");
        System.out.println(indmap);
        indmap.put(8, "Rohit");//replace
        System.out.println(indmap);
    }
}