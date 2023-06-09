package machine;
import java.util.Scanner;

public class CoffeeMachine {
    private int mlOfWater;
    private int mlOfMilk;
    private int grsOfCoffee;
    private int cantDisposableCups;
    private int valMoney;

    public CoffeeMachine(int mlOfWater, int mlOfMilk, int grsOfCoffee, int cantDisposableCups, int valMoney) {
        this.mlOfWater          = mlOfWater;
        this.mlOfMilk           = mlOfMilk;
        this.grsOfCoffee        = grsOfCoffee;
        this.cantDisposableCups = cantDisposableCups;
        this.valMoney           = valMoney;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }
    public int getMlOfMilk() {
        return mlOfMilk;
    }
    public int getGrsOfCoffee() { return grsOfCoffee; }
    public int getCantDisposableCups() {
        return cantDisposableCups;
    }
    public int getValMoney() {
        return valMoney;
    }
    public void setMlOfWater(int mlOfWater) { this.mlOfWater = mlOfWater; }
    public void setMlOfMilk(int mlOfMilk) { this.mlOfMilk = mlOfMilk; }
    public void setGrsOfCoffee(int grsOfCoffee) { this.grsOfCoffee = grsOfCoffee; }
    public void setCantDisposableCups(int cantDisposableCups) { this.cantDisposableCups = cantDisposableCups; }
    public void setValMoney(int valMoney) { this.valMoney = valMoney; }


    public void buy(CoffeeMachine coffeeMachine){

        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String type = scanner.nextLine();

        if        (type.equals("1")) {
            int mlOfWater   = 250;
            int grsOfCoffee = 16;
            int valMoney    = 4;
            if (coffeeMachine.getMlOfWater()          >= mlOfWater   &&
                    coffeeMachine.getGrsOfCoffee()        >= grsOfCoffee &&
                    coffeeMachine.getCantDisposableCups() >= 1) {
                System.out.println("I have enough resources, making you a coffee!");
                coffeeMachine.setMlOfWater(coffeeMachine.getMlOfWater() - mlOfWater);
                coffeeMachine.setGrsOfCoffee(coffeeMachine.getGrsOfCoffee() - grsOfCoffee);
                coffeeMachine.setValMoney(coffeeMachine.getValMoney() + valMoney);
                coffeeMachine.setCantDisposableCups(coffeeMachine.getCantDisposableCups() - 1);
            } else {
                if (coffeeMachine.getMlOfWater() < mlOfWater) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeMachine.getGrsOfCoffee() < grsOfCoffee) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(coffeeMachine.getCantDisposableCups() == 0) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
            }
        } else if (type.equals("2")) {
            int mlOfWater   = 350;
            int mlOfMilk    = 75;
            int grsOfCoffee = 20;
            int valMoney    = 7;
            if (coffeeMachine.getMlOfWater()          >= mlOfWater   &&
                    coffeeMachine.getMlOfMilk()           >= mlOfMilk    &&
                    coffeeMachine.getGrsOfCoffee()        >= grsOfCoffee &&
                    coffeeMachine.getCantDisposableCups() >= 1) {
                System.out.println("I have enough resources, making you a coffee!");
                coffeeMachine.setMlOfWater(coffeeMachine.getMlOfWater() - mlOfWater);
                coffeeMachine.setMlOfMilk(coffeeMachine.getMlOfMilk() - mlOfMilk);
                coffeeMachine.setGrsOfCoffee(coffeeMachine.getGrsOfCoffee() - grsOfCoffee);
                coffeeMachine.setValMoney(coffeeMachine.getValMoney() + valMoney);
                coffeeMachine.setCantDisposableCups(coffeeMachine.getCantDisposableCups() - 1);
            } else {
                if (coffeeMachine.getMlOfWater() < mlOfWater) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeMachine.getMlOfMilk() < mlOfMilk) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeMachine.getGrsOfCoffee() < grsOfCoffee) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(coffeeMachine.getCantDisposableCups() == 0) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
            }
        } else if (type.equals("3")) {
            int mlOfWater   = 200;
            int mlOfMilk    = 100;
            int grsOfCoffee = 12;
            int valMoney    = 6;
            if (coffeeMachine.getMlOfWater()          >= mlOfWater   &&
                    coffeeMachine.getMlOfMilk()           >= mlOfMilk    &&
                    coffeeMachine.getGrsOfCoffee()        >= grsOfCoffee &&
                    coffeeMachine.getCantDisposableCups() >= 1) {
                System.out.println("I have enough resources, making you a coffee!");
                coffeeMachine.setMlOfWater(coffeeMachine.getMlOfWater() - mlOfWater);
                coffeeMachine.setMlOfMilk(coffeeMachine.getMlOfMilk() - mlOfMilk);
                coffeeMachine.setGrsOfCoffee(coffeeMachine.getGrsOfCoffee() - grsOfCoffee);
                coffeeMachine.setValMoney(coffeeMachine.getValMoney() + valMoney);
                coffeeMachine.setCantDisposableCups(coffeeMachine.getCantDisposableCups() - 1);
            } else {
                if (coffeeMachine.getMlOfWater() < mlOfWater) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeMachine.getMlOfMilk() < mlOfMilk) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeMachine.getGrsOfCoffee() < grsOfCoffee) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(coffeeMachine.getCantDisposableCups() == 0) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
            }
        } else if (type.equals("back")) {
            return;
        }
        System.out.println();
    }

    public void fill(CoffeeMachine coffeeMachine){
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        int addMlOfWater = scanner.nextInt();
        coffeeMachine.setMlOfWater(coffeeMachine.getMlOfWater() + addMlOfWater);

        System.out.println("Write how many ml of milk you want to add:");
        int addMlOfMilk = scanner.nextInt();
        coffeeMachine.setMlOfMilk(coffeeMachine.getMlOfMilk() + addMlOfMilk);

        System.out.println("Write how many grams of coffee beans you want to add:");
        int addGrsOfCoffee = scanner.nextInt();
        coffeeMachine.setGrsOfCoffee(coffeeMachine.getGrsOfCoffee() + addGrsOfCoffee);

        System.out.println("Write how many disposable cups you want to add:");
        int addCantDisposableCups = scanner.nextInt();
        coffeeMachine.setCantDisposableCups(coffeeMachine.getCantDisposableCups() + addCantDisposableCups);

        System.out.println();

    }

    public void take(CoffeeMachine coffeeMachine){
        System.out.println();
        System.out.println("I gave you $" + coffeeMachine.getValMoney());
        coffeeMachine.setValMoney(0);
        System.out.println();
    }

    public void remaining(CoffeeMachine coffeeMachine) {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(coffeeMachine.getMlOfWater()          + " ml of water"        );
        System.out.println(coffeeMachine.getMlOfMilk()           + " ml of milk"         );
        System.out.println(coffeeMachine.getGrsOfCoffee()        + " g of coffee beans"  );
        System.out.println(coffeeMachine.getCantDisposableCups() + " disposable cups"    );
        System.out.println("$" + coffeeMachine.getValMoney()     + " of money"           );
        System.out.println();
    }

    public static String optionMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        return scanner.nextLine();
    }

    public static void start(String answer) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine(400,540,120,9,550);
        while(!(answer.equals("exit"))) {
            if (answer.equals("buy" ))             { coffeeMachine.buy(coffeeMachine);
            } else if (answer.equals("fill"))      { coffeeMachine.fill(coffeeMachine);
            } else if (answer.equals("take"))      { coffeeMachine.take(coffeeMachine);
            } else if (answer.equals("remaining")) { coffeeMachine.remaining(coffeeMachine);
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            answer  = scanner.nextLine();
        }

    }

    //Main Class
    public static void main(String[] args) {
        String answer = CoffeeMachine.optionMenu();
        CoffeeMachine.start(answer);
    }
}
