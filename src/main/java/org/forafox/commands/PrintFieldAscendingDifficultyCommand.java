package org.forafox.commands;

import org.forafox.collection.CollectionManager;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 22.02.2023 23:36
 */

/**
 * Команда, выводящая щначения поля difficult всех элементов коллекции в порядке возрастания
 */
public class PrintFieldAscendingDifficultyCommand implements Command{
    /**
     * Поле, хранящее ссылку на объект класса CollectionManager.
     */
    private CollectionManager collectionManager;
    /**
     * @param collectionManager Хранит ссылку на созданный в объекте Application объект CollectionManager.
     */
    public PrintFieldAscendingDifficultyCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }
    /**
     * Метод, исполняющий команду. При вызове изменяется указанной элемент коллекции до тех пор, пока в качестве аргумента не будет передан stop. В случае некорректного ввода высветится ошибка.
     */
    @Override
    public void execute() {
        collectionManager.showDifficult();
    }
    /**
     * @return Метод, возвращающий описание команды.
     * @see Command
     */
    @Override
    public String getDescription() {
        return "вывести значения поля difficulty всех элементов в порядке возрастания";
    }
}
