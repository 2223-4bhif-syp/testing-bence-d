import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    List<Job> purchaserJobs;
    List<Job> clientJobs;

    public User(String name){
        this.name = name;
        purchaserJobs = new ArrayList<>();
        clientJobs = new ArrayList<>();
    }

    public void newJob(Job job){
        purchaserJobs.add(job);
    }

    public void work(Job job){
        job.work();
        clientJobs.add(job);
    }

    public void finishJob(Job job){
        clientJobs.remove(job);
    }

    public int lengthPurchaserJobs(){
        return this.purchaserJobs.size();
    }

    public int lengthClientJobs(){
        return this.clientJobs.size();
    }
}
