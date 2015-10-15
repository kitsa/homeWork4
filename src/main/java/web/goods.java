package web;

public class goods{
    public String carrier;
    public double weight;
    public double cost;
    
    public String getCarrier(){
        return carrier;
    }
    public double getWeight(){
        return weight;
    }
    public double getCost(){
        double result = 0;
        double roundWeight = Math.round(weight);
        if(carrier.equals("fedex")){
            result = roundWeight*8;            
        }else if(carrier.equals("ups")){
            for(int i=1;i<=(int)roundWeight;i++){
                if(i<=3) result += 7;
                else result += 9;
            }
                
        }else if(carrier.equals("dhl")){
            for(int i=1;i<=(int)roundWeight;i++){
                if(i<=2) result += 9;
                else result += 7;
            }
        }else result = 0;        
        return result;
    }
    public void setCarrier(String temp){
        carrier = temp;        
    }
    public void setWeight(double temp){
        weight = temp;
    }
}