class Investigator extends Characters{
    public Investigator() {
        setSpecialPower(new Investigate());
        setAlive(true);
        setProtected(false);
        setPlayerNumber(2);
        setBusy(false);
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }
}