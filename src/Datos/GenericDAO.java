package Datos;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T,ID extends Serializable> {
    
    public T read(ID id);
    public void insert(T t); //entity???
    public void update(T t); //entity???
    public void delete(ID id);
    public List<T> findAll();   
    
}
