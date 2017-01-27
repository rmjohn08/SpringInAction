package net.rmj.spring.sia.data;

import java.util.List;

import net.rmj.spring.sia.beans.RegistrationForm;
import net.rmj.spring.sia.beans.Spittle;

public interface SpittleRepository {

	void addSpitter(RegistrationForm form);

	RegistrationForm getSpitter(String userName);

	List<Spittle> findSpittles(long max, int count);
}
