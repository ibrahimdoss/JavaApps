package dataAccess.abstracts;

import java.util.List;

//Buradaki T typedan geliyor ve generic yapýda hangi tipi verirsek o tiple çalýþýrým mantýðý yürür.
//buna generic interface denir.

public interface EntityRepository<T> {
	
	List<T> getAll();
	void add(T entity);
	void update(T entity);
	void delete (T entity);
}
