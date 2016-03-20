public class VirtualCPU {

    // Registers
    private int IC;
    private int R;
    private int CS;
    private int DS;
    private int C;


    // Default Constructor
    public VirtualCPU() {
        setIC(IC);
        setR(R);
        setCS(CS);
        setDS(DS);
        setC(CS);
    }


    // Setters
    public void setIC(int IC) {
        this.IC = IC;
    }

    public void setR(int R) {
        this.R = R;
    }

    public void setCS(int CS) {
        this.CS = CS;
    }

    public void setDS(int DS) {
        this.DS = DS;
    }

    public void setC(int C) {
        this.C = C;
    }


    // Getters
    public int getIC() {
        return IC;
    }

    public int getR() {
        return R;
    }

    public int getCS() {
        return CS;
    }

    public int getDS() {
        return DS;
    }

    public int getC() {
        return C;
    }

}
