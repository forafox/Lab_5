package org.forafox.commands;

import org.forafox.collection.CollectionManager;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 22.02.2023 23:43
 */

/**
 * Команда, выводящая значения поля author всех элементов в порядке убывания
 */
public class PrintFieldDescendingAuthor implements Command{
    /**
     * Поле, хранящее ссылку на объект класса CollectionManager.
     */
    private CollectionManager collectionManager;

    /**
     * @param collectionManager Хранит ссылку на созданный в объекте Application объект CollectionManager.
     */
    public PrintFieldDescendingAuthor(CollectionManager collectionManager)
    {
        this.collectionManager=collectionManager;
    }
    /**
     * Метод, исполняющий команду. При вызове изменяется указанной элемент коллекции до тех пор, пока в качестве аргумента не будет передан stop. В случае некорректного ввода высветится ошибка.
     */
    @Override
    public void execute() {
        collectionManager.showPerson();
    }
    /**
     * @return Метод, возвращающий описание команды.
     * @see Command
     */
    @Override
    public String getDescription() {
        return "вывести значения поля author всех элементов в порядке убывания";
    }
}
