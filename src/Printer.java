public class Printer {
    private int pagesPrinted;
    private int tonerLevel;
    private boolean doubleSided;

    public Printer(int tonerLevel, boolean doubleSided) {
        if (tonerLevel>-1 && tonerLevel<=100){
        this.tonerLevel = tonerLevel;
        }
        else{
            this.tonerLevel = -1;
        }
        this.doubleSided = doubleSided;
        this.pagesPrinted =0;
    }
    public int addToner(int tonerAmount) {
        if (tonerLevel > 0 && tonerAmount < 100) {
            if (this.tonerLevel +tonerAmount>100) {
            return -1;
            }
            else{
                this.tonerLevel+=tonerAmount;
                return this.tonerLevel;
            }
        }
        else{
            return -1;
        }
    }
    public int printPages(int pages){
            int pagesToPrint;
        if (this.doubleSided ){
             pagesToPrint=(pages/2 + pages%2);
            System.out.println("Printing in duplex mode");
        }
        else{
             pagesToPrint = pages;
        }
        return pagesToPrint;
    }
}
