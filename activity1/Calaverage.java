public class Calaverage {
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        
        return sum / numbers.length;
    }
    
    public static void main(String[] args) {
        double[] values = { 2.5, 4.0, 6.5, 8.0, 10.0 };
        
        double average = Calaverage.calculateAverage(values);
        
        System.out.println("Average: " + average);
    }
}
