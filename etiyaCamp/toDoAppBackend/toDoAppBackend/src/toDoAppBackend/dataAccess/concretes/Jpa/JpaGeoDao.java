package toDoAppBackend.dataAccess.concretes.Jpa;

import java.util.ArrayList;
import java.util.List;

import toDoAppBackend.dataAccess.abstracts.GeoDao;
import toDoAppBackend.entities.concretes.Geo;

public class JpaGeoDao implements GeoDao {
	List<Geo> geos;

	public JpaGeoDao() {
		super();
		this.geos = new ArrayList<Geo>();
	}

	@Override
	public void add(Geo entity) {
		this.geos.add(entity);

	}

	@Override
	public List<Geo> getAll() {

		return this.geos;
	}

	@Override
	public void update(Geo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Geo entity) {
		this.geos.remove(entity);

	}
}
