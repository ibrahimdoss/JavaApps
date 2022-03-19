package dataAccess.abstracts;

import java.util.List;

//Buradaki T typedan geliyor ve generic yap�da hangi tipi verirsek o tiple �al���r�m mant��� y�r�r.
//buna generic interface denir.

public interface EntityRepository<T> {
	
	List<T> getAll();
	void add(T entity);
	void update(T entity);
	void delete (T entity);
}
