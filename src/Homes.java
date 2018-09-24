import java.util.*;
import java.util.Iterator;

/**
 * This class is implemented to create Iterable objects on Homes List as this would be input to sort Method.
 *
 * @param - HomesList : List of Homes
 *
 */
public class Homes<T> implements Iterable<T> {
    private List<T> homeList;

    public Homes(List<T> t){
        homeList = t;
    }

    @Override
    public Iterator<T> iterator(){
        return homeList.iterator();
    }


}
