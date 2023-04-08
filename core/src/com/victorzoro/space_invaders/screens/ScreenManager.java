package com.victorzoro.space_invaders.screens;

/**
 * <h3>Classe responsável por gerenciar as telas.</h3>
 */
public class ScreenManager {
    private static Screen currentScreen;
    
    /**
     * <h3>Configura a próxima tela</h3>
     * 
     * @param screen - recebe a tela a ser configurada
     */
    public static void setScreen(Screen screen) {
        //Descarta a tela atual
        if(!isScreenNull()) { 
            currentScreen.dispose();
        }
        //Configura uma nova tela.
        currentScreen = screen;
        currentScreen.create();
    }

    /**
     * <h3>Retorna a tela atual.</h3>
     * 
     * @return - tela atual.
     */
    public static Screen getCurrentScreen() {
        return currentScreen;
    }

    /**
     * <h3>Testa se a tela não é nula</h3>
     * 
     * @return <p>- true: tela nula</p>
     *         <p>- false: tela tem algo</p>
     */
    public static boolean isScreenNull() {
        return currentScreen == null;
    }
}
