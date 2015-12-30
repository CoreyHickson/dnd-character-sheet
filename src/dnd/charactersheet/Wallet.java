package dnd.charactersheet;

/**
 * For tracking a charactersheet cp, sp, ep, gp, pp.
 * Created by Corey on 7/23/2015.
 */
public class Wallet extends Character {
    private int cp;
    private int sp;
    private int ep;
    private int gp;
    private int pp;

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public int getGp() {
        return gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
}
