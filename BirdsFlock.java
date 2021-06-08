
public class BirdsFlock {
    private final int N; // capacity
    private int n;  // size: number of current members
    private Bird[] birds;

    public BirdsFlock (int N){
        this.N = N;
        n = 0;
        birds = new Bird[N];
    }

    
    public void add(Bird bird){
        if (n >= N) return;
        birds[n] = bird;
        n++;
    }

    public void singing(){
        for(int i = 0; i < n; i++){
            birds[i].singing();
        }
    }
    
}
