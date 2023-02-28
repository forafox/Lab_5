package org.forafox.commands;

import org.forafox.collection.CollectionManager;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 21.02.2023 23:53
 */

/**
 * Команда, выводящая информацию о коллекции
 */
public class InfoCommand implements Command{
    /**
     * Поле, хранящее ссылку на объект класса CollectionManager.
     */
    private CollectionManager collectionManager;
    /**
     * Конструктор класса.
     *
     * @param collectionManager Хранит ссылку на созданный в объекте Application объект CollectionManager.
     */
    public InfoCommand(CollectionManager collectionManager){
        this.collectionManager=collectionManager;
    }
    /**
     * Метод, исполняющий команду. Выводит описание коллекции TreeMap экземпляров LabWork.
     */
    @Override
    public void execute() {
        collectionManager.info();
    }
    /**
     * @return Возвращает описание команды.
     * @see Command
     */
    @Override
    public String getDescription() {
        return "команда получает информацию о коллекции(тип, дата инициализации, кол-во элементов, тип элементов коллекции)";
    }
}
