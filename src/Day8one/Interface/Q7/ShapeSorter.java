package Day8one.Interface.Q7;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeSorter {
    public static void sort(SortableShape[] shapes) {
        Arrays.sort(shapes, Comparator.comparingDouble(SortableShape::area));
    }
}
