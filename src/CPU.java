
public class CPU {

	//List of registers
	//2-bytes instruction counter
	private int ic;
	//4-bytes general purpose registers
	private int r1;
	private int r2;
	//1-byte comparison register
	private int c;
	//2-bytes code segment
	private int cs;
	//2-bytes data segment
	private int ds;
	//1-byte mode register
	private int mode;
	//4-bytes page-table register
	private static int ptr;
	//1-byte I/O interrupt register
	private int ioi;
	//1-byte programmical interrupt register
	private int pi;
	//1-byte supervisor's interrupt register
	private int si;
	//1-byte timer's interrupt register
	private int ti;
	//channels
	private int ch1;
	private int ch2;
	private int ch3;
	
	//TODO: paging mechanism
	
	//if mode = 0, then works in supervisor mode, else in user
	private static final int SUPERVISOR = 0;
	private static final int USER = 1;
	
	private static final int TIME = 20; 
	
	//default constructor with default registers values
	CPU() {
		//FIXME check if the values are correct
		setC(0);
		setCs(0);
		setDs(0);
		setIc(0);
		setIoi(0);
		setMode(0);
		setPi(0);
		setPtr(0);
		setR1(0);
		setR2(0);
		setSi(0);
		setTi(0);
		setCh1(0);
		setCh2(0);
		setCh3(0);
	}
	
    public int getInterrupt() {
    	//timer's interrupt
        if(ti == 0) {
            return 1;
        }
        
        switch(pi) {
        //memory protection
        case 1: return 2;
        //operation code doesn't exist
        case 2: return 3;
        }

        switch(si) {
    	//gd interrupt
        case 1: return 4;
        //pd
        case 2: return 5;
        //halt
        case 3: return 6;
        }
        
        switch(c) {
        //less
        case 0: return 7;
        //equals
        case 1: return 8;
        //more
        case 2: return 9;
        }

        return 0;
    }
	
	//Getters
	public int getIc() {
		return ic;
	}
	public int getR1() {
		return r1;
	}
	public int getR2() {
		return r2;
	}
	public int getC() {
		return c;
	}
	public int getCs() {
		return cs;
	}
	public int getDs() {
		return ds;
	}
	public int getMode() {
		return mode;
	}
	public static int getPtr() {
		return ptr;
	}
	public int getIoi() {
		return ioi;
	}
	public int getPi() {
		return pi;
	}
	public int getSi() {
		return si;
	}
	public int getTi() {
		return ti;
	}
	
	public static int getSupervisor() {
		return SUPERVISOR;
	}
	public static int getUser() {
		return USER;
	}
	
	public int getCh1() {
		return ch1;
	}

	public int getCh2() {
		return ch2;
	}

	public int getCh3() {
		return ch3;
	}


	//Setters
	public void setIc(int ic) {
		this.ic = ic;
	}
	public void setR1(int r1) {
		this.r1 = r1;
	}
	public void setR2(int r2) {
		this.r2 = r2;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void setCs(int cs) {
		this.cs = cs;
	}
	public void setDs(int ds) {
		this.ds = ds;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	public void setPtr(int ptr) {
		this.ptr = ptr;
	}
	public void setIoi(int ioi) {
		this.ioi = ioi;
	}
	public void setPi(int pi) {
		this.pi = pi;
	}
	public void setSi(int si) {
		this.si = si;
	}
	public void setTi(int ti) {
		this.ti = ti;
	}
	
	public void setCh1(int ch1) {
		this.ch1 = ch1;
	}
	
	public void setCh2(int ch2) {
		this.ch2 = ch2;
	}
	
	public void setCh3(int ch3) {
		this.ch3 = ch3;
	}
	
}
