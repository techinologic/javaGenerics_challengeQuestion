import java.util.ArrayList;

public class GenericArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("black");
        list.add("black");
        list.add("black");
        list.add("yellow");
        list.add("red");

        ArrayList<String> noDupes = removeDupes(list);
        System.out.println(noDupes);

    }

    /* Method that will find duplicates in an arraylist, and add elements of that list
    to another arraylist without the duplicates elements.
     */
    public static <E extends Comparable<E>> ArrayList<E> removeDupes(ArrayList<E> list) {

        boolean found = false;

        if (list.size() == 0) return list;

        //create the newlist where non-duplicates elements will be added
        ArrayList<E> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < newList.size(); j++) {
                if (list.get(i).compareTo(newList.get(j)) == 0) {
                    found = true;
                    break;
                }
            }
            if (found != true) {
                newList.add(list.get(i));
            }
            found = false;
        }

        return newList;
    }
}
