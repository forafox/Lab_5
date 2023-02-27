package org.forafox.commands;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 21.02.2023 20:14
 */
/**
 * Uнтерфейс, реализуемый командами с аргументами, записываемыми с новой строки.
 */
public interface CommandWithArguments extends Command {
    /**
     * Метод, получающий аргументы команды.
     *
     * @param commandArguments Аргументы команды.
     */
    void getCommandArguments(String[] commandArguments);
}
