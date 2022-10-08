import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :-");
        System.out.println("Real Value:");
        double real1 = sc.nextDouble();
        System.out.print("Imaginary Value :");
        double img1 = sc.nextDouble();
        complex comp1 = new complex(real1,img1);
        System.out.println("The first complex number is :-" + comp1.real + "+" + comp1.img + "i");
        System.out.println("Enter the Second number :-");
        System.out.println("Real value:");
        double real2 = sc.nextDouble();
        System.out.print("Imaginary Value:");
        double img2 = sc.nextDouble();
        complex comp2 = new complex(real2, img2);
        System.out.println("The second complex number is :-" + comp2.real + "+" + comp2.img + "i");
        complex result = new complex();
        int i;
        do {
            System.out.println("Enter the operation to be performed on the complex number :-");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            i = sc.nextInt();
            switch (i) {
                case 1 -> result.add(comp1, comp2);
                case 2 -> result.sub(comp1, comp2);
                case 3 -> result.multi(comp1, comp2);
                case 4 -> result.div(comp1, comp2);
            }
        } while (i < 5);
    }
}
class complex
{
    double real;
    double img;

    public complex()
    {
        real=0;
        img=0;
    }
    complex (double r ,double i)
    {
        real=r;
        img=i;
    }
    complex add(complex c1, complex c2)
    {
        complex temp=new complex();
        temp.real=c1.real+c2.real;
        temp.img=c1.img+c2.img;
        System.out.print(temp.real);
        System.out.print("+");
        System.out.print(temp.img);
        System.out.println("i");
        return temp;
    }
    complex sub(complex c1, complex c2)
    {
        complex temp=new complex();
        temp.real=c1.real-c2.real;
        temp.img=c1.img-c2.img;
        if(temp.img<0)
        {
            System.out.print(temp.real);
            System.out.print(temp.img);
            System.out.println("i");
        }
        else
        {
            System.out.print(temp.real);
            System.out.print("+");
            System.out.print(temp.img);
            System.out.println("i");
        }
        return temp;
    }
    complex multi(complex c1,complex c2)
    {
        complex temp=new complex();
        temp.real = c1.real * c2.real - c1.img * c2.img;
        temp.img = c1.real * c2.img + c1.img * c2.real;
        if (temp.img < 0) {
            System.out.print(temp.real);
            System.out.print(temp.img);
            System.out.println("i");
        } else {
            System.out.print(temp.real);
            System.out.print("+");
            System.out.print(temp.img);
            System.out.println("i");
        }
        return temp;
    }
    complex div(complex c1,complex c2)
    {
        complex temp=new complex();
        temp.real=((c1.real* c2.real+ c1.img* c2.img)/(c2.real* c2.real+ c2.img* c2.img));
        temp.img=((c1.img* c2.real- c2.img* c1.real)/(c2.real* c2.real+ c2.img* c2.img));
        if (c2.real* c2.real+ c2.img* c2.img==0)
        {
            System.out.println("Division by zero is not possible");
        }
        else
        {
            if(temp.img<0){
                System.out.print(temp.real);
                System.out.print(temp.img);
                System.out.println("i");
            }
            else {
                System.out.print(temp.real);
                System.out.print("+");
                System.out.print(temp.img);
                System.out.println("i");
            }
        }
        return temp;
    }

}
