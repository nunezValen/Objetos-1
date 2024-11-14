package ar.edu.unlp.info.oo1.ejercicio10;

public class FIFO extends JobScheduler {

	@Override
	public JobDescription next() {
	   JobDescription nextJob = null;
	   nextJob = this.jobs.get(0);
       this.unschedule(nextJob);
	   return nextJob;
	}

}
