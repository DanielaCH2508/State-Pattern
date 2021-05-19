/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class VideoPlayer {

    

    public static void main(String[] args) {

        VideoPlayerContext videoplay = new VideoPlayerContext();
        
        BeginningState iniciar = new BeginningState();
        StandByState pausar = new StandByState();
        PlayingState reproducir = new PlayingState();
        FinishState finalizar = new FinishState();
        
        Scanner sc = new Scanner(System.in);                
        int opcion;

        do {

            System.out.print(
                    "\n!!Estados del reproductor de video¡¡"
                    + "\n1. Iniciar"
                    + "\n2. Pausar"
                    + "\n3. Reproducir"
                    + "\n4. Finalizar"
                    + "\n0. Salir"
                    + "\nSeleccione una opción:\n "
            );

            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    videoplay.setState(iniciar);
                    videoplay.pressPlay();
                    break;
                case 2:
                    videoplay.setState(pausar);
                    videoplay.pressPlay();
                    break;
                case 3:
                    videoplay.setState(reproducir);
                    videoplay.pressPlay();
                    break;
                case 4:
                    videoplay.setState(finalizar);
                    videoplay.pressPlay();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion != 0);
    }
}
