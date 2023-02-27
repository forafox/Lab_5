package org.forafox.commands;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 21.02.2023 20:12
 */
/**
 * Uнтерфейс, реализация которого приведена в командах.
 */
public interface Command {
    /**
     * Метод, исполняющий команду.
     */
    void execute();

    /**
     * Метод, возвращающий описание команды.
     * @return Возвращает описание команды.
     */
    default String getDescription() {
        return "Описание работы данной команды еще не реализовано";
    }
}
