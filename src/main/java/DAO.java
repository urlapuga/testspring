/**
 * Created by Андрей on 25.06.2017.
 */
public interface DAO<T> {
    boolean create(T t);

    T read(int id);

    boolean update(T t);

    boolean delete(T t);

}
