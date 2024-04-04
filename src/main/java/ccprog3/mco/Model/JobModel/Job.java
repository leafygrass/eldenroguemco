package ccprog3.mco.Model.JobModel;

public class Job extends JobDatabase{ 

    private JobDatabase cChosenJob;
    
    public Job(JobDatabase cChosenJob) {
        this.cChosenJob = cChosenJob;
    }

    public Job (){
        this.cChosenJob = this.initialJob();
    }

}
