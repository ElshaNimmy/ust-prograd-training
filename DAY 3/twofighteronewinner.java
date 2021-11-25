public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String Win;
        while(fighter1.health>0 || fighter2.health>0)
        {
            if(firstAttacker==fighter1.name)
            {
                fighter2.health-=fighter1.damagePerAttack;
                firstAttacker=fighter2.name;
            }
            else{
                fighter1.health-=fighter2.damagePerAttack;
                firstAttacker=fighter1.name;
            }
        }
        Win=firstAttacker;
       
        return Win;
    }
}