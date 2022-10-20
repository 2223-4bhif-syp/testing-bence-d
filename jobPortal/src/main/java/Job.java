public class Job {
    String purchaser;
    String description;
    boolean available;

    public Job(String purchaser, String description){
        this.purchaser = purchaser;
        this.description = description;
        available = false;
    }

    public void work(){
        this.available = true;
    }
}
