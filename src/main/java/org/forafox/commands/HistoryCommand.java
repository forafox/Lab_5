package org.forafox.commands;

import java.util.ArrayList;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 22.02.2023 1:53
 */

/**
 * Команда, выводящая список исполненных команд (последних 6)
 */
public class HistoryCommand implements Command{
    /**
     * Cписок,хранящий исполненные команды
     */
    ArrayList<String> commandsHistoryList = new ArrayList<>();
    /**
     * @param commandsHistoryList Хранит список исполненных команд
     */
    public HistoryCommand(ArrayList<String>  commandsHistoryList) {
        this.commandsHistoryList=commandsHistoryList;
    }
    /**
     * Метод, исполняющий команду. При вызове изменяется указанной элемент коллекции до тех пор, пока в качестве аргумента не будет передан stop. В случае некорректного ввода высветится ошибка.
     */
    @Override
    public void execute() {
        System.out.println("History: ");
        for(String str: commandsHistoryList)
            System.out.println(str);
    }
    /**
     * @return Метод, возвращающий описание команды.
     * @see Command
     */
    @Override
    public String getDescription() {
        return "вывести последние 6 команд (без их аргументов)";
    }
}
