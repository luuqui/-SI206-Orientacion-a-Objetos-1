package unlp.ejercicio12_jobScheduler;

import java.util.List;

public class LIFOStrategy implements Strategy{

	@Override
	public JobDescription selectNext(List<JobDescription> jobs) {
		return jobs.isEmpty() ? null : jobs.get(jobs.size() - 1);
	}

}
