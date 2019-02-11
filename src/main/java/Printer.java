public class Printer {

    private int numPaperLeft;
    private int toner;



    public Printer(int numPaperLeft, int toner){
        this.numPaperLeft = numPaperLeft;
        this.toner = toner;


    }

    public int Print(int numPages, int numCopies) {
        int numPaperUsed = (numPages * numCopies);
        if (this.numPaperLeft >= numPaperUsed) {
            this.numPaperLeft = this.numPaperLeft - numPaperUsed;
            this.toner = this.toner - numPaperUsed;
            return this.numPaperLeft;

        }else{
            this.refil(numPaperUsed);
            return this.numPaperLeft;
        }
    }



    public void refil(int numPaper){
        this.numPaperLeft = this.numPaperLeft + numPaper;
    }


    public int getToner(){
        return this.toner;
    }






}
