package org.forafox.commands;

import org.forafox.collection.CollectionManager;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 22.02.2023 1:46
 */
/**
 * Команда, удаляющая элементы коллекции, превыщающие заданный ключ
 */
public class RemoveGreaterKeyCommand implements CommandWithArguments {
    /**
     * Поле, хранящее ссылку на объект класса CollectionManager.
     */
    private CollectionManager collectionManager;
    /**
     * Поле, хранящее массив аргументов команды.
     */
    private String[] commandArguments;
    /**
     * Конструктор класса.
     * @param collectionManager Хранит ссылку на созданный в объекте Application объект CollectionManager.
     */
    public RemoveGreaterKeyCommand(CollectionManager collectionManager) {
        this.collectionManager=collectionManager;
    }
    /**
     * Метод, исполняющий команду. В случае успешного выполнения удалятся все элементы коллекции, значения идентификатора которых меньше переданного в качестве аргументов значения, иначе ошибка.
     */
    @Override
    public void execute() {
        try {
            collectionManager.removeGreaterKey(Integer.parseInt(commandArguments[0]));
            System.out.println("Соответствующие элементы коллекции были удалены.");
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Не указаны аргументы команды.");
        } catch (NumberFormatException ex) {
            System.err.println("Формат аргумента не соответствует целочисленному" + ex.getMessage());
        }
    }
    /**
     * @see Command
     * @return Возращает описание команды.
     */
    @Override
    public String getDescription() {
        return "удалить из коллекции все элементы, ключ которых превышает заданный";
    }

    /**
     * @see CommandWithArguments
     * @param commandArguments Аргументы команды.
     */
    @Override
    public void getCommandArguments(String[] commandArguments) {
        this.commandArguments=commandArguments;
    }
}
