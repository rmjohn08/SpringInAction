package net.rmj.spring.sia.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.rmj.spring.sia.beans.RegistrationForm;
import net.rmj.spring.sia.beans.Spittle;

@Repository
public class SpittleRepositoryImpl implements SpittleRepository {

	private List<RegistrationForm> spitters;

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSpitter(RegistrationForm form) {
		// TODO Auto-generated method stub
		if (spitters == null) {
			spitters = new ArrayList<RegistrationForm>();
		}

		spitters.add(form);
	}

	@Override
	public RegistrationForm getSpitter(String userName) {
		// TODO Auto-generated method stub
		for (RegistrationForm s : spitters) {
			if (s.getUserName().equals(userName)) {
				return s;
			}
		}
		return null;
	}

}
