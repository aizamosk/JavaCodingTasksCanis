package week1;

public class CigarParty {

    public boolean cigarParty(int cigars, boolean isWeekend) {

        boolean validRange = cigars >= 40 && cigars<= 60;
        boolean secondValid = isWeekend && cigars>=40;

        return secondValid|| validRange;

    }

}
