package service;

import java.util.HashMap;
import java.util.Map;

import model.Custmor;

public class CustmorService {
	private Map<String, Custmor> custmors;
	
	public CustmorService() {
		custmors = new HashMap<String, Custmor>();
		
		addCustmor(new Custmor("id001", "Alice1", "alice1.co.kr"));
		addCustmor(new Custmor("id002", "Alice2", "alice2.co.kr"));
		addCustmor(new Custmor("id003", "Alice3", "alice3.co.kr"));
		addCustmor(new Custmor("id004", "Alice4", "alice4.co.kr"));
		addCustmor(new Custmor("id005", "Alice5", "alice5.co.kr"));
	}
	
	public void addCustmor(Custmor custmor) {
		custmors.put(custmor.getId(), custmor);
	}
	
	public Custmor findCustmor(String id) {
		if(id != null) {
			return custmors.get(id.toLowerCase());
		}
	
	else {
		return null;
	}

	}

}