package org.forafox.commands;

import org.forafox.collection.CollectionManager;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 23.02.2023 0:02
 */

/**
 * Команда, выводящая элементы коллекции с группировкой по полю difficult
 */
public class GroupCountingByDifficult implements Command{
    /**
     * Поле, хранящее ссылку на объект класса CollectionManager.
     */
    private CollectionManager collectionManager;

    /**
     * @param collectionManager Хранит ссылку на созданный в объекте Application объект CollectionManager.
     */
    public GroupCountingByDifficult(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }
    /**
     * Метод, исполняющий команду. При вызове изменяется указанной элемент коллекции до тех пор, пока в качестве аргумента не будет передан stop. В случае некорректного ввода высветится ошибка.
     */
    @Override
    public void execute() {
        collectionManager.GroupCountingByDifficult();
    }
    /**
     * @return Метод, возвращающий описание команды.
     * @see Command
     */
    @Override
    public String getDescription() {
        return "сгруппировать элементы коллекции по значению поля difficulty, вывести количество элементов в каждой группе";
    }
}
