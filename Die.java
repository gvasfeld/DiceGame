
/**
 * Write a description of class Die here.
 *
 * @author (Greg Vasfeld)
 * @version (1.1, Sep 23. 2018)
 */
public class Die
{
    //Declare private to hold face value of the dice
    private int value;
    private String name;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // Call roll method to set the face value of the dice
        roll();
    }

    /**
     * Constructor for objects of class Die
     * @param  String to hold the name of the die
     */
    public Die(String Name)
    {
        // Call roll method to set the face value of the dice
        roll();
        name=Name;
    }

    /**
     * Method sets the face falue of the dice using random number generator
     * Face values could be: 1,2,3,4,5,6
     * @param  no params
     * @return no return value
     */
    public void roll()
    {
        value = (int)(Math.random()*6+1);
    }
    /**
     * Method returns the face value of the dice
     * @param  no params
     * @return int
     */
     public int getValue()
    {
        return value;
    }

    /** Method prints the face value of the dice
     *  @param  no params
     *  @return String
     */
    public String toString()
    {
        return "Die" + name +" is showing " + value;
    }
}