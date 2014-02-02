/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public abstract class GateGuardedBuilding implements GateInterface {
    private boolean lock;
    private Gate gate;
// ...
public void closeForTheNight() {
gate.moveInwards(90);
gate.getLock();
}

public abstract void moveInwards(int a);

public abstract String getLock();

}
