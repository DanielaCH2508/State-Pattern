/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author ASUS PC
 */
public class PlayingState implements State {

    @Override
    public void pressPlay() {
        System.out.println("Video reproducido");
    }

}
