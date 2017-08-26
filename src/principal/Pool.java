package principal;

/**
 *
 * @author urielcaire
 */
public interface Pool<T> {
    T acquire();
    void release(T t);
}
