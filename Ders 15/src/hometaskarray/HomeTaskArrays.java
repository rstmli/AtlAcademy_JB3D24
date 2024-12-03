package hometaskarray;

import java.util.*;

public class HomeTaskArrays {
    public static void main(String[] args) {
//        removeELements();
//        searchElements();
//        sizeArrays();
//        reverseArray();
//        addElements();
    }

    public static void removeELements(){
        List<String> arrayString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<7;i++){
            System.out.print((i+1) + ". elementi daxil edin: ");
            arrayString.add(scanner.next());
        }
        arrayString.remove(2);
        arrayString.remove(3);
        System.out.println(arrayString);

    }

    public static void searchElements(){
        List<Integer> intArray = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            System.out.print((i+1) + ". elementi daxil edin: ");
            intArray.add(scanner.nextInt());
        }
        System.out.print("arrayda axtiralacaq elementi daxil edin: ");
        int searchnum = scanner.nextInt();
        for(int i = 0; i < intArray.size(); i++){
            if(intArray.get(i) == scanner.nextInt()) {
                index.add(i);
            }
        }
        if(index.size()>1){
            System.out.println(searchnum + " elementinin index nomresi: " + index);
        }else{
            System.out.println(searchnum + " elementi arrayda tapilmadi!");
        }

    }

    public static void sizeArrays(){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> array = new LinkedList<>();
        for(int i = 0;i<6;i++){
            System.out.print((i+1) + ". elementi daxil edin: ");
            array.add(scanner.nextInt());
        }
        if(array.contains(3)){
            System.out.print("listede 3 reqemi var ");
        }else{
            System.out.print("listede 3 yoxdu! ");
        }
        System.out.println("arrayin uzunlugu: " + array.size() + " arrayin ilk elementi: " + array.getFirst() + " arrayin son elementi: " + array.getLast());
    }
    public static void reverseArray(){
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> array = new LinkedList<>();
        for(int i = 0;i<5;i++){
            System.out.print((i+1) + ". elementi daxil edin: ");
            array.add(scanner.nextInt());

        }
        Iterator<Integer> iterator =  array.descendingIterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);

        }
    }
    public static void addElements(){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> array = new LinkedList<>();
        for(int i = 0;i<5;i++){
            System.out.print((i+1) + ". elementi daxil edin: ");
            array.add(scanner.next());
        }
        System.out.println("Arraydaki elementler: " + array);
        array.add(0,"Aytac");
        array.add(array.size(),"Aytac");
        System.out.println("Arraydaki yeni elementler: " + array);

    }
}
