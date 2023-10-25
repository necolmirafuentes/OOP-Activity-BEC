public class Intances {

    private static int instanceCount = 0;
    
    public Intances() {
        
        instanceCount++;
    }
    
    public static int getInstanceCount() {
        return instanceCount;
    }
    
    public static void main(String[] args) {
     
        Intances obj1 = new Intances();
        Intances obj2 = new Intances();
        Intances obj3 = new Intances();
        
       
        int count = Intances.getInstanceCount();
        
        System.out.println("Number of instances: " + count);
    }
}