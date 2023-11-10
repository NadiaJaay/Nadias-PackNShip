import java.util.Scanner;

public class Package{
    private double length;
    private double width;
    private double height;
    private Scanner input = new Scanner(System.in);

    public Package() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
    }

    public Package(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Package(Package copy){
        this.length = copy.length;
        this.width = copy.width;
        this.height = copy.height;
    }

    public void inputLength(){
        System.out.print("Enter length: ");
        this.length = input.nextDouble();
    }
    public void inputWidth(){
        System.out.print("Enter width: ");
        this.width = input.nextDouble();
    }
    public void inputHeight(){
        System.out.print("Enter height: ");
        this.height = input.nextDouble();
    }

    public void displayDimensions(){

        System.out.print(this.length + " X " + this.width + " X " + this.height);
        
    }

    public double calcVolume() {
        
        return this.length * this.width * this.height;
    }
}
