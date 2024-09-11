package se.iths.LektionsÖvningar;

//Q8
//public class Test{
//    public static void main(String[] args){
            //lägg en int = i här
//        for(int i = 0 ; i < 10; i++){
//        }
//        System.out.println(i); // kan inte skriva ut då i finns inte utanför loopen
//    }
//}

//Q9 //som ovan fast i blev utflyttad =)
//public class Test{
//    public static void main(String[] args){
//        int i;
//        for(i = 0 ; i < 10; i++){
//        }
//        System.out.println(i);
//    }
//}

//Q10
public class Test {
        public static void main(String[] args){
            for(int i = 0; i < 10; i++){ //for loop, i = 0, i++ = i ökar i värde med 1, i < 10 = så länge 1 är mindre än 10
                if(i % 2 == 0) // if = om inte, % = rest av division, i % 2 == 0 = om i är jämt i = 0.5 om det är udda
                    continue; //är det jämt så går den tillbaka till loopen och börjar om
                System.out.println(i); //skriver ut udda tal
            }
        }
    }
