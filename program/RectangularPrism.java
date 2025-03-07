
/**
 * Rectangular Prism Class
 */

public class RectangularPrism extends ThreeDimensions{
    /** height of a rectangular prism*/
    private final double height;
    /** width of a rectangular prism */
    private final double width;
    /** length of a rectangular prism */
    private final double length;

    /**
     * Constructor
     * 
     * @param height height of a rectangular prisim
     * @param width width of a rectangular prisim
     * @param length lenght of a rectangular prisim
     */
    public RectangularPrism(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    /**
     * Method to return volume
     * 
     * @return the volume of a rectangular prism
     */
    @Override
    public double getVolume(){
        return height * width * length;
    }

    /**
     * Method to return information about a Rectangular prisim object
     * 
     * @return a string containing the dimensions of a rectangular prisim and it's volume
     */
    @Override
    public String getHistory(){
        return "Volume of Rectangular Prisim: \nLength: " + this.length + 
                " \nWidth: " + this.width + " \nHeight: " + this.height + 
                " \nVolume: " + getVolume();
    }
    
}