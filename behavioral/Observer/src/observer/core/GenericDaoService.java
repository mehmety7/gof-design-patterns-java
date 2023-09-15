package observer.core;

public interface GenericDaoService<T> {

    void doCreate(T obj);

}
