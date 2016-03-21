public class VirtualMachine {

    private VirtualCPU virtualCPU;

    private int index;

    // Memory
    private VirtualMemory virtualMemory;

    public static final int MEMORY_SIZE = 256;

    final static int DATA_START = 0;
    final static int DATA_SIZE = 112;

    final static int PROGRAM_START = 112;
    final static int PROGRAM_SIZE = 112;

    final static int STACK_START = 224;
    final static int STACK_SIZE = 32;

    final int IC_ADDRESS = 109;
    final int R_ADDRESS = 110;
    final int C_ADDRESS = 111;
    final int CS_ADDRESS = 112;
    final int DS_ADDRESS = 113;


    // Default constructor
    public VirtualMachine(int index){
        this.virtualCPU = new VirtualCPU();
        this.virtualMemory = new VirtualMemory(MEMORY_SIZE);
        this.index = index;
    }

    public VirtualMemory getVirtualMemory(){
        return virtualMemory;
    }

    public void printMemory() {
        for(int i = 0; i < MEMORY_SIZE; i++)
            System.out.println(virtualMemory.getMemory()[i] + " ");
    }

    public int getIC(){
        return Word.wordToInt(PMMU.read(IC_ADDRESS));
    }
    public int getR(){
        return Word.wordToInt(PMMU.read(R_ADDRESS));
    }
    public int getC(){
        return Word.wordToInt(PMMU.read(C_ADDRESS));
    }
    public int getCS() { return Word.wordToInt(PMMU.read(CS_ADDRESS));}
    public int getDS() { return Word.wordToInt(PMMU.read(DS_ADDRESS));}
    public int getIndex(){
        return index;
    }

    public void saveIC(int IC){
        PMMU.write(Word.intToWord(IC), IC_ADDRESS);
    }
    public void saveR(int R){
        PMMU.write(Word.intToWord(R), R_ADDRESS);
    }
    public void saveC(int C){
        PMMU.write(Word.intToWord(C), C_ADDRESS);
    }
    public void saveCS(int CS){
        PMMU.write(Word.intToWord(CS), CS_ADDRESS);
    }
    public void saveDS(int DS){
        PMMU.write(Word.intToWord(DS), DS_ADDRESS);
    }
}
