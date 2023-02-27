package org.forafox.commands;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 21.02.2023 23:03
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Класс команды, которая выводит описания всех команд, реализованных в программе.
 */
public class HelpCommand implements Command{
    /**
     * Коллекция, содержащая объекты всех доступных в программе команд без дополнительных аргументов.
     */
    private HashMap<String, Command> commandWithoutArgumentsHashMap;
    /**
     * Коллекция, содержащая объекты всех доступных в программе команд с дополнительными аргументами.
     */
    private HashMap<String, CommandWithArguments> commandWithArgumentsHashMap;
    /**
     * Конструктор класса.
     *
     * @param commandHashMap              Коллекция, содержащая объекты всех доступных в программе команд без дополнительных аргументов.
     * @param commandWithArgumentsHashMap Коллекция, содержащая объекты всех доступных в программе команд с дополнительными аргументами.
     */
    public HelpCommand(HashMap<String, Command> commandHashMap, HashMap<String, CommandWithArguments> commandWithArgumentsHashMap) {
        this.commandWithoutArgumentsHashMap = commandHashMap;
        this.commandWithArgumentsHashMap = commandWithArgumentsHashMap;
    }
    /**
     * Метод, исполняющий команду. Выводит описание всех доступных в программе команд.
     */
    @Override
    public void execute() {
        for (Map.Entry<String, Command> entry : commandWithoutArgumentsHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getDescription());//перебор Map в цикле. Ключ+значение
        }
        for (Map.Entry<String, CommandWithArguments> entry : commandWithArgumentsHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getDescription());//перебор Map в цикле. Ключ+значение
        }
    }
    /**
     * @return Описание данной команды.
     * @see Command
     */
    @Override
    public String getDescription() {
        return "выводит справку по всем командам";
    }
}
