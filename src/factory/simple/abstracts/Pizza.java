package factory.simple.abstracts;

public abstract class Pizza {

    private boolean prepare;
    private boolean bake;
    private boolean cut;
    private boolean box;

    public void prepare(){
        this.prepare = Boolean.TRUE;
    }

    public void bake(){
        this.bake = Boolean.TRUE;
    }

    public void cut(){
        this.cut = Boolean.TRUE;
    }

    public void box(){
        this.box = Boolean.TRUE;
    }

    public boolean isPrepare() {
        return prepare;
    }

    public boolean isBake() {
        return bake;
    }

    public boolean isCut() {
        return cut;
    }

    public boolean isBox() {
        return box;
    }

    public abstract String description();
}
