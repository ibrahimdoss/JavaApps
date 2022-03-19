package toDoAppBackend.business.concretes;

import java.util.List;

import toDoAppBackend.business.abstracts.AddressService;
import toDoAppBackend.dataAccess.abstracts.AddressDao;
import toDoAppBackend.entities.concretes.Address;

public class AddressManager implements AddressService{

	AddressDao addressDao;
	
	public AddressManager(AddressDao addressDao) {
		super();
		this.addressDao = addressDao;
	}

	@Override
	public void add(Address address) {
		this.addressDao.add(address);
		
	}

	@Override
	public List<Address> getAll() {
		
		return this.addressDao.getAll();
	}

	@Override
	public void update(Address address) {
		this.addressDao.update(address);
		
	}

	@Override
	public void delete(Address address) {
		this.addressDao.delete(address);
		
	}

}
