package ar.edu.unlp.info.oo1.ejercicio10;

public class LIFO extends JobScheduler {

	@Override
	public JobDescription next() {
		JobDescription nextJob = null;
        nextJob = this.jobs.get(this.jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
	}

	
	
	
}
