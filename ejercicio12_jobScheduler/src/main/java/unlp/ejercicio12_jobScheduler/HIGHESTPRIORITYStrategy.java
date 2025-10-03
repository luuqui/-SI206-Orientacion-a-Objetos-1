package unlp.ejercicio12_jobScheduler;

import java.util.List;

public class HIGHESTPRIORITYStrategy implements Strategy{

	@Override
	public JobDescription selectNext(List<JobDescription> jobs) {
		return jobs.stream()
				.max((j1,j2) -> Integer.compare(j1.getPriority(), j2.getPriority()))
				.orElse(null);
	}

}
