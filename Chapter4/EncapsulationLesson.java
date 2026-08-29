package Chapter4;

public class EncapsulationLesson{
    public static void main(String[] args) {
        Swan mother = new Swan();
        // mother.numberEggs = 31;
        mother.setNumberEggs(31);
        System.out.println(mother.getNumberEggs());
        EVehivle sealion = new EVehivle(45764, "Sea Lion", 2524, 2_500_000, 15);
        // sealion.price=1_000_000;
        sealion.setPrice(1_000_000);
        System.out.println("Price = P"+sealion.getPrice());

    }
}

class Swan {
    private int numberEggs;                    
    public int getNumberEggs() {                    
      return numberEggs;
    }
    public void setNumberEggs(int numberEggs) {    
        if (numberEggs >= 0)                     
            this.numberEggs = numberEggs;
        else
            System.out.println("invalid numberEggs");
    } }

class EVehivle{
    private final long id;
    private String modelName;
    private int modelNumber;
    private double price;
    private int qty;

    public EVehivle(long id,String modelName,int modelNumber,double price,int qty){
        this.id = id;
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.price = price;
        this.qty = qty;
    }

    public long getId(){
        return id;
    }

    public void setModelName(String modelName){
         this.modelName = modelName;
    }
    public String getModelName(){
        return modelName;
    }

    public void setModelNumber(int modelNumber){
        this.modelNumber= modelNumber;
    }
    public int getmModelNumber(){
        return modelNumber;
    }
    /**
         * page 32 of technical documentation titled ()
         * the price must be greater than the SRP
         * if lower that SRP set method will not modify the price
         */
    public void setPrice(double price){
        
        if(price>this.price){
            this.price = price;
        }        
    }
    public double getPrice(){
        return price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public int getQty(){
        return qty;
    }
    }

// addInventory(EVehivle ecar,int item)
// ecar.setQty(ecar.getQty()+item);

// minusInventory(EVehivle ecar,int item)
// ecar.setQty(ecar.getQty()-item);