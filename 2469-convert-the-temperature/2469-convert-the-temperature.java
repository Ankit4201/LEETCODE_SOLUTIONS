class Solution {
    public double[] convertTemperature(double celsius) {
        
        return new double[]{celsius + 273.15, (celsius * 1.80)+32.00};
        // double kelvin, fahrenheit;
        // kelvin = celsius + 273.15;
        // fahrenheit =  celsius * 1.80 + 32.00;
        // double[] ans = new double[2];
        // ans[0] = kelvin;
        // ans[1] = fahrenheit;
        // return ans;
    }
}