import java.util.ArrayList;


public class ArrayLists {
    public static void main(String[] args) {
        new ArrayLists();


    }

    ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayLists(){

//        list.add(2);
//      //  list.remove(0);
//        list.add(27);
//      //  list.remove(27);
//        list.add(1,37);
//        for (int z =0; z < 10; z++){
//            list.add(52);
//        }
//      //  list.clear();
//        if (list.contains(2)){
//            System.out.println(":)");
//        }

        ///add 43 random numbers to the array list from 7 to 81 inclusive

       // printList();
      //  System.out.println(list.lastIndexOf(52)); //3 because that is the location of the FIRST 52

        for(int x = 0; x < 43; x++){
            int randomnum = (int)(Math.random()*74+7);
            list.add(randomnum);
        }
        System.out.print(list);
        System.out.println("avg: " + avgNum2());

    }


    public void printList(){
        for (int i = 0; i < list.size(); i++){
            System.out.println("I = " + list.get(i));
        }
    }


    public double avgNum2() {

        double average = 0;
        int sum = 0;
        for (int a = 0; list.size() > a; a++){
            sum += a;
            }
//        System.out.println(sum);
//        System.out.println(list.size());
        average = (double) sum / (list.size());

        return average;

    }


}

///make avg method
