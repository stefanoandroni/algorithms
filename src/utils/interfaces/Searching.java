package utils.interfaces;

public interface Searching {
    /**
     * @param k element of type <T> (target element)
     * @param V array of elements of type <T> (searching space)
     * @param <T> type that must implement Java's default Comparable interface
     * @return the index of the first element found (-1 if the element is not present)
     */
    public <T extends Comparable<T>> int find(T [] V, T k);
}
