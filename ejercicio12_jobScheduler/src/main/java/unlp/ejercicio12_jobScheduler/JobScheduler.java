package unlp.ejercicio12_jobScheduler;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected Strategy s;

    public JobScheduler (Strategy s) {
        this.jobs = new ArrayList<>();
        this.s = s;
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public Strategy getStrategy() {
        return this.s; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(Strategy aStrategy) {
        this.s = aStrategy;
    }

    public JobDescription next() {
    	JobDescription j = this.s.selectNext(jobs);
    	this.unschedule(j);
    	return j;
    }

}
