package ba.unsa.etf.rpr.tut2;


/**
 * Entry point to our math program
 */
public class App {

    public static void main( String[] args ){
        if (args.length != 2){
            System.err.println("Nedovoljan broj argumenata [funkcija] [argument]");
        } else if (!args[0].equals("sinus") && !args[0].equals("factoriel")) {
            System.err.println("Nevalidna funkcija, sinus i faktorijel su podrzane funkcije");
        }else{
            try {
                String funkcija = args[0];
                double input = Double.parseDouble(args[1]);
                if(input == (int)input){
                    if(args[0].equals("faktorijel")){
                        System.out.println("factoriel("+input+")="+Matematika.faktorijel((int)input));

                    }
                }else{
                    if(args[0].equals("sinus")){
                        System.out.println("sinus("+input+")="+Matematika.sinus(input));
                    }
                }

            }catch (Exception e){
                System.err.println("Nevalidan drugi argument, mora biti cijeli broj ako zelite faktorijel ili double ako zelite sinus");
            }
        }
    }
}