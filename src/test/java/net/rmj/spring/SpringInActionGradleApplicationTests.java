package net.rmj.spring;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import net.rmj.spring.sia.beans.Spittle;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class SpringInActionGradleApplicationTests {


	public void shouldShowPagedSpittles() throws Exception {
		
		// List<Spittle> mockRepo = createSpittleList(50);
		// SpittleRepository mockRepo = mock(SpittleRepository.class);
		 
	}

	private List<Spittle> createSpittleList(int count) {
		List<Spittle> spittles = new ArrayList<Spittle>();
		for (int i = 0; i < count; i++) {
			spittles.add(new Spittle("Spittle " + i, new Date()));
		}
		return spittles;
	}

}
