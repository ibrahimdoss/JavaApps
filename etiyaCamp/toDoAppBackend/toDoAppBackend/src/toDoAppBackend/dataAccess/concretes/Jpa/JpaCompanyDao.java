package toDoAppBackend.dataAccess.concretes.Jpa;

import java.util.ArrayList;
import java.util.List;

import toDoAppBackend.dataAccess.abstracts.CompanyDao;
import toDoAppBackend.entities.concretes.Company;

public class JpaCompanyDao implements CompanyDao{
	List<Company> companies;

	public JpaCompanyDao() {
		super();
		this.companies = new ArrayList<Company>();
	}

	@Override
	public void add(Company entity) {
		this.companies.add(entity);
		
	}

	@Override
	public List<Company> getAll() {
		
		return this.companies;
	}

	@Override
	public void update(Company entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Company entity) {
		this.companies.remove(entity);
		
	}
}
