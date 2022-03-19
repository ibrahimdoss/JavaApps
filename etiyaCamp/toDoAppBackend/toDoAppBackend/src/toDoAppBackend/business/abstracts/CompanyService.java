package toDoAppBackend.business.abstracts;

import java.util.List;

import toDoAppBackend.entities.concretes.Company;

public interface CompanyService {
	void add(Company company);

	List<Company> getAll();

	void update(Company company);

	void delete(Company company);
}
