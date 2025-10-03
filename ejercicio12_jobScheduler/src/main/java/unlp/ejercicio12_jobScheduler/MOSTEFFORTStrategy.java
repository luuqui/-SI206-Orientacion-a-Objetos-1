package unlp.ejercicio12_jobScheduler;

import java.util.List;

public class MOSTEFFORTStrategy implements Strategy{

	@Override
	public JobDescription selectNext(List<JobDescription> jobs) {
		return jobs.stream()
				.max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
				.orElse(null);
	}

}