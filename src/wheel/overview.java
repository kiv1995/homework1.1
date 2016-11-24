package wheel;

import wheel.model.summer;
import wheel.model.wholeyear;
import wheel.model.winter;
import wheel.model.wheel;

/**
 * Created by Kevin on 07.11.2016.
 */
public class overview {
    public static void main(String[] args) {
        summer summer1=new summer("Michelin",20,10,false,10);
        summer summer2=new summer("Michelin",20,10,false,10);
        summer summer3=new summer("Continetal",30,5,true,10);

        winter winter1=new winter("Michelin",60,5,false,40);
        winter winter2=new winter("Michelin",60,5,false,40);
        winter winter3=new winter("Continetal",60,30,true,70);

        wholeyear wholeyear1=new wholeyear("Separit",60,5,false,"Stollen");
        wholeyear wholeyear2=new wholeyear("Separit",60,5,false,"Stollen");
        wholeyear wholeyear3=new wholeyear("SepContinetalarit",100,90,true,"Stollen");
        wholeyear wholeyear4=new wholeyear("Mazda",50,5,true,"Spikes");

        //Test summer
        System.out.println("summer-wheel:");
        System.out.println(summer1==summer1);
        System.out.println(summer1==summer2);
        System.out.println(summer2==summer3);
        //Test winter
        System.out.println("winter-wheel:");
        System.out.println(winter1==winter1);
        System.out.println(winter1==winter2);
        System.out.println(winter2==winter3);
        //Test wholeyear
        System.out.println("wholeyear-wheel:");
        System.out.println(wholeyear1==wholeyear1);
        System.out.println(wholeyear1==wholeyear2);
        System.out.println(wholeyear2==wholeyear3);
        //Test
        System.out.println("Other tests:");
        wholeyear4.area("Stollen");
        summer1.diameterSteel("20");
        winter1.diameterAlu("50");
        System.out.println("Final tests:");
        System.out.println(winter1);
        System.out.println(summer3);
        System.out.println(wholeyear4);

    }

}
