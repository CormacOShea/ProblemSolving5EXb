package problemsolvingweek5.exerciseb;

public class TestComputer {
    public static void main(String[] args) {
        Computer comp1 = new Computer(new Case("Optiplex 7010", "Dell",240,new Dimension(275,
                250, 100)),"Acer 5363", "Asus 2345");
        Computer comp2 = new Computer(new Case("Optiplex GX620","Dell", 230,new Dimension(315,
                300,120)),"LG 3241", "Intel 6533");
        Computer comp3 = new Computer(new Case("i-Blason","Apple",115,new Dimension(250,
                275,110)),"HP 5433","1942");

        Computer allComputers[] = new Computer[3];

        allComputers[0] = comp1;
        allComputers[1] = comp2;
        allComputers[2] = comp3;

        System.out.println("\nDisplaying the state of the " + allComputers.length + "Computer objects at this point");

        for(int i=0;i < allComputers.length;i++)
        {
            System.out.println("Computer " + (i+1) + "\n\n" + allComputers[i] +"\n\n");
        }

        //Display a list of all Computers that have a case with the word "Optiplex" in the model for the computers Case

        String optiplexList = "";

        System.out.println("\n\nNow displaying a list of any Computer objects whose case model includes the word 'Optiplex'");

        for (int i =0; i < allComputers.length;i++)
            if(allComputers[i].getComputerCase().getModel().toLowerCase().contains("optiplex"))
                optiplexList += allComputers[i] + "\n\n";

            System.out.println("\n\n" + optiplexList);


    }

}
