package toDoAppBackend.business.concretes;

import java.util.List;

import toDoAppBackend.business.abstracts.GeoService;
import toDoAppBackend.dataAccess.abstracts.GeoDao;
import toDoAppBackend.entities.concretes.Geo;

public class GeoManager implements GeoService{

	GeoDao geoDao;
	public GeoManager(GeoDao geoDao) {
		super();
		this.geoDao = geoDao;
	}

	@Override
	public void add(Geo geo) {
		this.geoDao.add(geo);
		
	}

	@Override
	public List<Geo> getAll() {
		
		return this.geoDao.getAll();
	}

	@Override
	public void update(Geo geo) {
	this.geoDao.update(geo);
		
	}

	@Override
	public void delete(Geo geo) {
		this.geoDao.delete(geo);
		
	}

}
