package week4;

abstract class State {
    public State() {
    }

    abstract State a();
    abstract State b();
}

class StateF extends State{

    @Override
    public State a(){return new StateQ();}

    @Override
    public State b(){return new StateT();}

    public String toString() {
        return "state: " + this.getClass().getSimpleName();
    }
}

class StateQ extends State{

    @Override
    public State a(){return new StateQ();}

    @Override
    public State b(){return new StateR();}

    public String toString() {
        return "state: " + this.getClass().getSimpleName();
    }
}

class StateR extends State{

    @Override
    public State a(){return new StateQ();}

    @Override
    public State b(){return new StateS();}

    public String toString() {
        return "state: " + this.getClass().getSimpleName();
    }
}

class StateS extends State{

    @Override
    public State a(){return new StateQ();}

    @Override
    public State b(){return new StateF();}

    public String toString() {
        return "state: " + this.getClass().getSimpleName();
    }
}

class StateT extends State{

    @Override
    public State a(){return new StateT();}

    @Override
    public State b(){return new StateT();}

    public String toString() {
        return "state: " + this.getClass().getSimpleName();
    }
}


