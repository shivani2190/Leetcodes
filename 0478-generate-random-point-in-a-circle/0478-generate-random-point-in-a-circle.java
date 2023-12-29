class Solution {

    double radius;
    double x_center;
    double y_center;

    public Solution(double radius, double x_center, double y_center) {
       this.radius = radius;
       this.x_center = x_center;
       this.y_center = y_center; 
    }
    public double[] randPoint() {
        
        double ang = Math.random() * 2 * Math.PI,
            r = Math.sqrt(Math.random()) * radius;
            
        return new double[]{r*Math.cos(ang)+x_center,r*Math.sin(ang)+y_center};
}
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */