package utils.interfaces;

public interface Sorting {
    /**
     * @param V   array of elements of type <T> (unsorted array)
     * @param <T> type that must implement Java's default Comparable interface
     * @return sorted array (increasing order) (a sorted copy of V array)
     */
    public <T extends Comparable<T>> T[] sort(T[] V);
}
