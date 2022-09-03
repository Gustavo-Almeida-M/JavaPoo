import java.util.Scanner;
import java.text.*;

class Car{
    public int pass = 0; // Passageiros
    public int passMax = 2; // limite de Passageiros
    public int gas = 0; // tanque
    public int gasMax = 100; // limite do tanque
    public int km; // quantidade de quilometragem
    
    public Car();
    public String toString()
    {
        System.out.printf("pass: %d, gas: %d, km: %d", this.pass, this.gas, this.km);
    }
    public void enter()
    {
        if(pass >= passMax)
        {
           System.out.println(" fail: limite de pessoas atingido");
        }
        else
        {
            pass++;
        }       
    }
    public void leave()
    {
        if(pass == 0)
        {
            System.out.println("fail: nao ha ninguem no carro");
        }
        else
        {
            pass--;
        }
    }
    public void fuel(int gas)
    {
        this.gas = gas;
        if(this.gas > gasMax)
        {
            this.gas = gasMax;
        }
    }
    public void drive (int km)
    {
        if(km > this.gas)
        {
            System.out.format("fail: tanque vazio apos andar %d km", this.gas);
        }
    }

    
};

class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        while(true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            System.out.println("$" + line);
            if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("enter")) {
                car.enter();
            } else if(ui[0].equals("leave")) {
                car.leave();
            } else if(ui[0].equals("show")) {
                System.out.println(car.toString());
            } else if (ui[0].equals("drive")) {//km
                car.drive(Integer.parseInt(ui[1]));
            } else if (ui[0].equals("fuel")) {//gas
                car.fuel(Integer.parseInt(ui[1]));
            } else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}