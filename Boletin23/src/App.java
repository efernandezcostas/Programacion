public class App {
    public static void main(String[] args) {

        System.out.println("\nEjercicio 1:");
        //1
        String uno = "Esto é Java!";
        System.out.println(uno.length());


        System.out.println("\nEjercicio 2:");
        //2
        String dos = "Java";
        for (int i=0; i<dos.length(); i++){
            System.out.println(dos.charAt(i));
        }


        System.out.println("\nEjercicio 3:");
        //3
        String tres = "Java desde 0";
        for (int i=tres.length()-1; i>=0; i--){
            System.out.print(tres.charAt(i));
        }


        System.out.println("\n\nEjercicio 4:");
        //4
        String cuatro = "James Gosling Created Java";
        for (int i=0; i<cuatro.length(); i++){
            if (!Character.isSpaceChar(cuatro.charAt(i))){
                System.out.print(cuatro.charAt(i));
            }
        }


        System.out.println("\n\nEjercicio 5:");
        //5
        String cinco = "java java java";
        int cincoContadorVocal=0;
        int cincoContadorConsonante=0;
        for(int i=0; i<cinco.length(); i++){
            if(cinco.charAt(i)=='a' || cinco.charAt(i)=='e' || cinco.charAt(i)=='i' || cinco.charAt(i)=='o' || cinco.charAt(i)=='u'){
                cincoContadorVocal++;
            }
            else{
                if(!Character.isSpaceChar(cinco.charAt(i))){
                    cincoContadorConsonante++;
                }
            }
        }
        System.out.println("Vocales: "+cincoContadorVocal+"\nConsonantes: "+cincoContadorConsonante);


        System.out.println("\nEjercicio 6:");
        //6
        String seis = "www.javadesde0.com";
        String seisUno="";
        for (int i=0; i<seis.length()/2-1; i++){
            seisUno=seisUno+seis.charAt(i);
        }
        String seisDos="";
        for(int i=seis.length()/2-1; i<seis.length(); i++){
            seisDos=seisDos+seis.charAt(i);
        }
        System.out.println(seisUno);
        System.out.println(seisDos);
        System.out.println(seisUno+seisDos);


        System.out.println("\nEjercicio 7:");
        //7
        String siete = "javeros";
        String sieteDos = siete.toUpperCase();
        System.out.println(sieteDos);
        String sieteTres = sieteDos.toLowerCase();
        System.out.println(sieteTres);


        System.out.println("\nEjercicio 8:");
        //8
        String ocho = "Java";
        String ochoUno = "JavaScript";
        if (ocho.compareTo(ochoUno)==0)     System.out.println("Son iguales");
        else                                System.out.println("No son iguales");


        System.out.println("\nEjercicio 9:");
        //9
        String nueve = "Jeve jeve jeve";
        String nueveUno="";
        for (int i=0; i<nueve.length(); i++){
            if(nueve.charAt(i)=='e'){
                nueveUno+='a';
            }
            else{
                nueveUno+=(nueve.charAt(i));
            }
        }
        nueveUno=nueveUno.toLowerCase();
        System.out.println(nueveUno);


        System.out.println("\nEjercicio 10:");
        //10
        String diez = "ABCD";
        String diezASCI="";
        int diezInt;
        for (int i=0; i<diez.length(); i++){
            diezInt=(int) diez.charAt(i);
            diezASCI+=diezInt;
        }
        System.out.println(diezASCI);


        System.out.println("\nEjercicio 11:");
        //11
        String once = "Ola, son alumno de DAM1, e son programador desde o 2021";
        contaCaracteres(once);
    }

    static void contaCaracteres(String string){
        int contadorLetras=0;
        int contadorNumeros=0;
        int contadorEspacios=0;
        for (int i=0; i<string.length(); i++){
            if (Character.isLetter(string.charAt(i)))       contadorLetras++;
            if (Character.isDigit(string.charAt(i)))        contadorNumeros++;
            if (Character.isSpaceChar(string.charAt(i)))    contadorEspacios++;
        }
        System.out.println("Cantidade de letras: "+contadorLetras
                            +"\nCantidade de números: "+contadorNumeros
                            +"\nCantidade de espazos: "+contadorEspacios);
    }
}
