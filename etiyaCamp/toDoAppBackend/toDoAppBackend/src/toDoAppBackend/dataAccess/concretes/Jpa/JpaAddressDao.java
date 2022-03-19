package toDoAppBackend.dataAccess.concretes.Jpa;

import java.util.ArrayList;
import java.util.List;

import toDoAppBackend.dataAccess.abstracts.AddressDao;
import toDoAppBackend.entities.concretes.Address;

public class JpaAddressDao implements AddressDao {

	List<Address> addresses;

	public JpaAddressDao() {
		super();
		this.addresses = new ArrayList<Address>();
	}

	@Override
	public void add(Address entity) {
		this.addresses.add(entity);

	}

	@Override
	public List<Address> getAll() {

		return this.addresses;
	}

	@Override
	public void update(Address entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Address entity) {
		this.addresses.remove(entity);

	}

}
