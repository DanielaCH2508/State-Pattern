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
public class VideoPlayerContext {

    private State state;

    public void setState(State s) {

        this.state = s;
    }

    public void pressPlay() {

        state.pressPlay();
    }
}
