public class Main {
    public static void main(String[] args) {

        State NY = new State("New York", true, true, true, 58.8, 37.5, 29);
        State NJ = new State("New Jersey", true, true, true, 55.0, 41.8, 14);
        State CA = new State("California", true, true, true, 61.5, 33.2, 55);
        State AZ = new State("Arizona", false, false, false, 48.6, 44.2, 11);
        State AL = new State("Alabama", false, false, false, 34.6, 62.9, 9);
        State TX = new State("Texas", false, false, false, 45.3, 47.5, 38);
        State FL = new State("Florida", false, true, true, 46.5, 43.3, 29);
        State PA = new State("Pennsylvania", false, true, true, 48.0, 41.3, 20);
        State NC = new State("North Carolina", false, false, true, 46.7, 47.0, 15);
        State SC = new State("South Carolina", false, false, false, 40.8, 54.9, 9);
        State MN = new State("Minnesota", true, true, true, 46.9, 45.4, 10);
        State WI = new State("Wisconsin", false, true, true, 46.7, 44.0, 10);
        State MI = new State("Michigan", false, true, true, 46.5, 41.0, 16);
        State VA = new State("Virginia", true, true, true, 48.3, 41.0, 13);
        State NM = new State("New Mexico", true, true, true, 48.3, 40.0, 5);
        State CO = new State("Colorado", true, true, true, 47.2, 44.4, 9);
        State UT = new State("Utah", false, false, false, 27.8, 45.9, 6);
        State OH = new State("Ohio", false, true, true, 51.3, 44.7, 18);
        State IN = new State("Indiana", false, false, true, 37.9, 57.2, 11);
        State IL = new State("Illinois", true, true, true, 55.4, 39.4, 20);
        State IA = new State("Iowa", false, true, true, 44.0, 48.8, 6);
        State GA = new State("Georgia", false, false, false, 43.5, 51.0, 16);
        State ND = new State("North Dakota", false, false, false, 27.8, 64.1, 3);
        State SD = new State("South Dakota", false, false, false, 31.7, 61.5, 3);
        State ID = new State("Idaho", false, false, false, 27.6, 59.2, 4);
        State MS = new State("Mississippi", false, false, false, 39.7, 58.3, 6);
        State MO = new State("Missouri", false, false, false, 38.0, 57.1, 10);
        State LA = new State("Louisiana", false, false, false, 38.4, 58.1, 8);
        State MT = new State("Montana", false, false, false, 36.0, 56.5, 3);
        State NE = new State("Nebraska", false, false, false, 34.0, 60.3, 5);
        State AK = new State("Alaska", false, false, false, 37.7, 52.9, 3);
        State KS = new State("Kansas", false, false, false, 36.2, 57.2, 6);
        State AR = new State("Arkansas", false, false, false, 33.8, 60.4, 6);
        State TN = new State("Tennessee", false, false, false, 34.9, 61.1, 11);
        State KY = new State("Kentucky", false, false, false, 32.7, 62.5, 8);
        State OK = new State("Oklahoma", false, false, false, 28.9, 65.3, 7);
        State WV = new State("West Virginia", false, false, false, 26.5, 68.7, 5);
        State WY = new State("Wyoming", false, false, false, 22.5, 70.1, 3);
        State NV = new State("Nevada", true, true, true, 48.3, 44.7, 6);
        State OR = new State("Oregon", true, true, true, 51.7, 41.1, 7);
        State WA = new State("Washington", true, true, true, 54.4, 38.2, 12);
        State ME = new State("Maine", true, true, true, 53.3, 43.3, 4);
        State DE = new State("Delaware", true, true, true, 53.4, 41.9, 3);
        State CT = new State("Connecticut", true, true, true, 54.5, 41.2, 7);
        State MA = new State("Massachusetts", true, true, true, 60.8, 33.5, 11);
        State VT = new State("Vermont", true, true, true, 61.1, 32.6, 3);
        State NH = new State("New Hampshire", true, true, true, 49.5, 45.0, 4);
        State RI = new State("Rhode Island", true, true, true, 55.4, 39.8, 4);
        State MD = new State("Maryland", true, true, true, 60.5, 35.5, 10);
        State HI = new State("Hawaii", true, true, true, 62.3, 30.1, 4);
        State DC = new State("DC", true, true, true, 92.8, 4.1, 3);

        America a = new America(51);

        a.addState(AL);
        a.addState(AK);
        a.addState(AZ);
        a.addState(AR);
        a.addState(CA);
        a.addState(CO);
        a.addState(CT);
        a.addState(DC);
        a.addState(DE);
        a.addState(FL);
        a.addState(GA);
        a.addState(HI);
        a.addState(ID);
        a.addState(IL);
        a.addState(IN);
        a.addState(IA);
        a.addState(KS);
        a.addState(KY);
        a.addState(LA);
        a.addState(ME);
        a.addState(MD);
        a.addState(MA);
        a.addState(MI);
        a.addState(MN);
        a.addState(MS);
        a.addState(MO);
        a.addState(MT);
        a.addState(NE);
        a.addState(NV);
        a.addState(NH);
        a.addState(NJ);
        a.addState(NM);
        a.addState(NY);
        a.addState(NC);
        a.addState(ND);
        a.addState(OH);
        a.addState(OK);
        a.addState(OR);
        a.addState(PA);
        a.addState(RI);
        a.addState(SC);
        a.addState(SD);
        a.addState(TN);
        a.addState(TX);
        a.addState(UT);
        a.addState(VT);
        a.addState(VA);
        a.addState(WA);
        a.addState(WV);
        a.addState(WI);
        a.addState(WY);

        a.printStateOdds();

        System.out.println("");
        System.out.println("");
        
        a.runFullBasicSimulation();

    }
}