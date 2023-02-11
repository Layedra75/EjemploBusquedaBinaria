import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[8];
        System.out.println("Escribe 8 numeros");
        for(int i=0; i<8; i++){
            arreglo[i] = sc.nextInt();
        }
        
        System.out.println("Ingresa un numero a buscar");
        int numBuscar = sc.nextInt();
        
        int n = arreglo.length, inf=0,centro=0;
        int sup = n-1;
        boolean bol = false;
        while(inf<=sup){
            centro=(sup+inf)/2;
            if(arreglo[centro]==numBuscar){
                bol=true;
                break;
            }
            else if(numBuscar<arreglo[centro]){
                sup=centro-1;
            }
            else{
                inf=centro+1;
            }
        }
        if(bol==true){
            System.out.println("Se encontro tu numero ");
        }
        else{
            System.out.println("Lo siento no encontre tu numero");
        }
    }   
}