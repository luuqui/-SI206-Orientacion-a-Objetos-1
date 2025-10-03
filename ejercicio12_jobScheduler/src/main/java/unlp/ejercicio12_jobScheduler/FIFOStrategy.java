package unlp.ejercicio12_jobScheduler;

import java.util.List;

public class FIFOStrategy implements Strategy{

	@Override
	public JobDescription selectNext(List<JobDescription> jobs) {
		return jobs.isEmpty() ? null : jobs.get(0);
	}

}
