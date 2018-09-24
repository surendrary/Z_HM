import java.util.*;


/**
 * This class represents Entry point to the program and implements sort method.
 */
public class SortHomes {


    /**
     * Implementation of Sort Method
     * @param - Iterable<Homes> homes : Iterable object on list of homes.
     * @param sortField : Home attribute field on which list will be sorted.
     * @param ascending : Decided list sorting in ascending or descending order.
     *
     * @return List of Homes sorted according to the input parameters.
     */
    private static List<Home> sort(Iterable<Home> homes, String sortField, boolean ascending){

        List<Home> h1 = new ArrayList<Home>();
        homes.forEach(h1::add);
        Collections.sort(h1, new GenericComparator(sortField, ascending));

        return h1;
    }



    public static void main(String args[]){

        Home home1 = new Home("23rd","5","San Jose","CA",95112,new Date(),13.0);
        Home home2 = new Home("29th","4","LAs","CA",94112,new Date(),7.0);

        List<Home> homeList = new ArrayList<Home>();
        homeList.add(home1);
        homeList.add(home2);  //Creating HomeList for testing



        Homes<Home> homes  = new Homes<>(homeList); // Creating Iterable Object

        List<Home> result = sort(homes,"street",true); // Sort Method Call.

        // Displaying Results
        for (Home elem_ : result) {
            System.out.print(elem_.street+ "- ");
            System.out.print(elem_.unit+ "- ");
            System.out.print(elem_.city+ "- ");
            System.out.print(elem_.state+ "- ");
            System.out.print(elem_.zip+ "- ");
            System.out.print(elem_.dateLastRented+ "- ");
            System.out.print(elem_.price+ "- ");
            System.out.println();

        }

    }
}
