package org.forafox.commands;

import org.forafox.collection.CollectionManager;
import org.forafox.io.UserIO;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 22.02.2023 0:44
 */

/**
 * Команда , обновляющая элемент коллекции
 */
public class UpdateElementCommand implements CommandWithArguments{
    /**
     * Поле, хранящее ссылку на объект класса CollectionManager.
     */
    private CollectionManager collectionManager;
    /**
     * Поле, хранящее ссылку на объект класса UserIO.
     */
    private UserIO userIO;
    /**
     * Поле, хранящее массив аргументов команды.
     */
    private String[] commandArguments;
    /**
     * @param collectionManager Хранит ссылку на созданный в объекте Application объект CollectionManager.
     * @param userIO            Хранит ссылку на объект класса UserIO.
     */
    public UpdateElementCommand(CollectionManager collectionManager,UserIO userIO){
        this.collectionManager=collectionManager;
        this.userIO=userIO;
    }
    /**
     * Метод, исполняющий команду. При вызове изменяется указанной элемент коллекции до тех пор, пока в качестве аргумента не будет передан stop. В случае некорректного ввода высветится ошибка.
     */
    @Override
    public void execute() {
        try {
            if (collectionManager.containsKey(Integer.parseInt(commandArguments[0]))) {
                userIO.printCommandText(collectionManager.getFieldNames());

                userIO.printCommandText("Напишите stop, если хотите прервать изменение элемента коллекции\n");
                userIO.printCommandText("Введите значения полей для элемента коллекции:\n");
                String[] commandWords = new String[0]; //хранит id элемента коллекции
                do {
                    try {
                        commandWords = userIO.readLine().trim().split("\\s+");
                        if (commandWords.length == 1) {
                            collectionManager.update(Integer.parseInt(commandArguments[0]), commandWords[0], "");//пустая строка в поле
                        } else
                            collectionManager.update(Integer.parseInt(commandArguments[0]), commandWords[0], commandWords[1]);
                    } catch (IndexOutOfBoundsException ex) {
                        System.err.println("Не указано поле/значение.");
                    }
                } while (!commandWords[0].equals("stop"));
            } else System.err.println("Элемента с данным ключом в коллекции не существует.");
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Не указаны все аргументы команды.");
        } catch (NumberFormatException ex) {
            System.err.println("Формат аргумента не соответствует целочисленному " + ex.getMessage());
        }
    }
    /**
     * @return Метод, возвращающий описание команды.
     * @see Command
     */
    @Override
    public String getDescription() {
        return "изменяет указанное поле выбранного по id элемента коллекции ";
    }
    /**
     * @param commandArguments Аргументы команды.
     * @see Command
     */
    @Override
    public void getCommandArguments(String[] commandArguments) {
        this.commandArguments = commandArguments;
    }
}
