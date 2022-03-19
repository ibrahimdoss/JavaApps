package toDoAppBackend.business.abstracts;

import java.util.List;

import toDoAppBackend.entities.concretes.Geo;

public interface GeoService {
	void add(Geo geo);

	List<Geo> getAll();

	void update(Geo geo);

	void delete(Geo geo);
}
