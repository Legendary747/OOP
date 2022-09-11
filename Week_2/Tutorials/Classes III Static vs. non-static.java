class Classes {
    public static void run() {
        
        PictureFrame p = new PictureFrame(21.0, 29.7);
        
        // p.getWidth();
        // PictureFrame.getWidth();

        // p.getMountingInfo();
        // PictureFrame.getMountingInfo();
    }
}

class PictureFrame {
    private double width;
    private double height;
    private static String mountingInfo = "All picture frames can be hanged in either portrait or landscape orientation.";

    /**Constructor: creates a new PictureFrame with the provided width and height.
    * @param width - A double value representing the width of the picture frame.
    * @param h - A double value representing the height of the picture frame.
    */
    public PictureFrame(double width, double h) {
        this.width = width;
        height = h;
    }

    /**Getter for the width of the PictureFrame.
    * @return the value of width.
    */
    public double getWidth() {
        return this.width;
    }
    
    /**Getter for the height of the PictureFrame.
    * @return the value of height.
    */
    public double getHeight() {
        return this.height;
    }
    
    /**Static method that specifices how Pictureframes may be mounted.
    * @return a String object that specifices how Pictureframes may be mounted.
    */
    public static String getMountingInfo() {
        return mountingInfo;
    }
    
    // Your swapOrientation() method.
    public void swapOrientation() {
        double tmp = width;
        width = height;
        height = tmp;
    }

}