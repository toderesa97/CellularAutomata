/**
 * Created by tdrs on 1/10/16.
 */
public class Main {


    public static void main(String[] args) {
        /* TODO
         -> Execute main and you will be able to see
         Serpinski triangle on the terminal
         */
        Neighborhood neighborhood = new Neighborhood();
        RuleNinety ruleNinety = new RuleNinety();
        neighborhood.evolve("00000000000000000000000000000000000000000000000001000000000000000" +
                "000000000000000000000000000000000",ruleNinety, 25);
        System.out.print(neighborhood);
    }


}
