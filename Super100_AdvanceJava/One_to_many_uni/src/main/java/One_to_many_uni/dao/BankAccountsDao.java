package One_to_many_uni.dao;


import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import One_to_many_uni.dto.BankAccounts;
import One_to_many_uni.dto.Person;

public class BankAccountsDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hamitha");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
			
	public void saveAccount(int personId,BankAccounts accounts)
	{
		Person pdb=em.find(Person.class, personId);
		if(pdb!=null)
		{
			ArrayList<BankAccounts>list = new ArrayList<BankAccounts>();
			list.add(accounts);
			list.addAll(pdb.getAccounts());  // db lo columns same if not write list.addall it jumble ,if it write it remains same
			pdb.setAccounts(list);
			et.begin();
			em.merge(pdb);
			et.commit();
		}

	}
}
