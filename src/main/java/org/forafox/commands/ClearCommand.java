package org.forafox.commands;

import org.forafox.collection.CollectionManager;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 22.02.2023 0:15
 */
/**
 * Команда, очищающая коллекцию.
 */
public class ClearCommand implements Command{
    /**
     * Поле, хранящее ссылку на объект класса CollectionManager.
     */
    private CollectionManager collectionManager;
    /**
     * Конструктор класса
     *
     * @param collectionManager Хранит ссылку на созданный в объекте Application объект CollectionManager.
     */
    public ClearCommand(CollectionManager collectionManager){
        this.collectionManager = collectionManager;
    }
    /**
     * Метод, исполняющий команду. Выводит сообщение когда коллекция очищена.
     */
    @Override
    public void execute() {
        collectionManager.clear();
        System.out.println("Коллекция была очищена");
    }
    /**
     * @return Описание команды.
     * @see Command
     */
    @Override
    public String getDescription() {
        return "очищает все элементы коллекции";
    }
}
