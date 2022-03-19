package toDoAppBackend.business.abstracts;

import java.util.List;

import toDoAppBackend.entities.concretes.Address;

public interface AddressService {
	void add(Address address);

	List<Address> getAll();

	void update(Address address);

	void delete(Address address);
}
