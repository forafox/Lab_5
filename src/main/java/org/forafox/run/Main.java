package org.forafox.run;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 20.02.2023 23:07
 */
public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (!args[0].equals("")) {
                Application application = new Application();
                application.start(args[0]);
            }
        } else {
            Application application = new Application();
            application.start("D:\\JavaProject\\Lab_5ver2\\inputFiles\\testInputFile");
        }
    }
}
