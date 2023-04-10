package week4;

public class Machine {

    private State currentstate = new StateQ();

    public void Machine(){}

    public void processA() { this.currentstate = this.currentstate.a(); }

    public void processB(){
        this.currentstate = this.currentstate.b();
    }

    public String toString() {
        return "state: " + this.currentstate.getClass().getSimpleName();
    }
}
