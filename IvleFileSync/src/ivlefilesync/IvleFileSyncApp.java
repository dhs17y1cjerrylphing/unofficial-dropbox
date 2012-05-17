/*
 * IvleFileSyncApp.java
 */

package ivlefilesync;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class IvleFileSyncApp extends SingleFrameApplication {
	
	//Constants to be kept in the memory during the application lifetime
	public static boolean SYNC_PENDING = false;

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        //new IvleFileSyncView(this);
        //show(new IvleFileSyncView(this));
        new IVLESystemTray().RunTray();
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of IvleFileSyncApp
     */
    public static IvleFileSyncApp getApplication() {
        return Application.getInstance(IvleFileSyncApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(IvleFileSyncApp.class, args);
    }
}