public class PMMU {
    public final static int BLOCK_SIZE = 256;
    public final static int WORDS_IN_BLOCK = 16;

    public int virtualToRealAddress(int address) {
        int virtualBlockIndex = (int) Math.floor(address / WORDS_IN_BLOCK);

        int blockIndexAddress = CPU.getPtr() + virtualBlockIndex;

        Word blockIndexInRealMemory = RealMachine.getRealMemory().read(blockIndexAddress);

        int blockRealAddress = Word.wordToInt(blockIndexInRealMemory) * PMMU.WORDS_IN_BLOCK;

        return blockRealAddress + (address - virtualBlockIndex * PMMU.WORDS_IN_BLOCK);
    }
}
