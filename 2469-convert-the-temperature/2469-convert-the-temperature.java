class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius+273.15;
        double fahrenheit = celsius*1.80+32.00;
        double[] myArr = new double[2];
        myArr[0] = kelvin;
        myArr[1] = fahrenheit;
        return myArr;
    }
}