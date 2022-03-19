package toDoAppBackend.dataAccess.abstracts;

import java.util.List;

public interface EntityRepository<T> {
	void add(T entity);

	List<T> getAll();

	void update(T entity);

	void delete(T entity);
}
