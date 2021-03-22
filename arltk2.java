import java.text.NumberFormat;
import java.util.Scanner;

public class Rectangle
{

    // the instance variables
    private double length, width;

    //gets and processes the user input
    public void getUserInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Length: ");
        length = input.nextInt();
        System.out.print("Width: ");
        width = input.nextInt();
    }

    // methods of the rectangle class
    public void setLength(double len)
    {
        length = len;
    }

    public void setWidth(double w)
    {
        width = w;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getArea()
    {
        return length * width;
    }
    }
