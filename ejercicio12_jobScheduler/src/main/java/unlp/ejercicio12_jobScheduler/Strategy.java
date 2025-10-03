package unlp.ejercicio12_jobScheduler;

import java.util.List;

public interface Strategy {
	JobDescription selectNext(List<JobDescription> jobs);
}