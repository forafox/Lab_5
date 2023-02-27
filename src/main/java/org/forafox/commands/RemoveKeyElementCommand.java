package org.forafox.commands;

import org.forafox.collection.CollectionManager;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 22.02.2023 0:27
 */

/**
 * Команда, удаляющая элемент по ключу
 */
public class RemoveKeyElementCommand implements CommandWithArguments{
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
     *
     * @param collectionManager Хранит ссылку на созданный в объекте Application объект CollectionManager.
     */

    public RemoveKeyElementCommand(CollectionManager collectionManager){
        this.collectionManager=collectionManager;
    }
    /**
     * Метод, исполняющий команду. В случае успешного выполнения удалится элемент коллекции, значение уникального идентификаторого которого соответствует переданному в качестве аргумента, иначе ошибка.
     */
    @Override
    public void execute() {
        try {
            if (collectionManager.containsKey(Integer.parseInt(commandArguments[0]))) {
                collectionManager.removeKey(Integer.parseInt(commandArguments[0]));
                System.out.println("Элемент коллекции был удален.");
            } else System.out.println("Данного элемента коллекции не существует");
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Не указаны аргументы команды.");
        } catch (NumberFormatException ex) {
            System.err.println("Формат аргумента не соответствует целочисленному" + ex.getMessage());
        }
    }
    /**
     * @return Возвращает описание команды.
     * @see Command
     */
    @Override
    public String getDescription() {
        return "удаляет элемент с указанным ключем";
    }
    /**
     * @param commandArguments Аргуметы команды.
     * @see CommandWithArguments
     */
    @Override
    public void getCommandArguments(String[] commandArguments) {
        this.commandArguments=commandArguments;
    }
}
