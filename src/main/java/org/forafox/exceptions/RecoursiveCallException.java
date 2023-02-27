package org.forafox.exceptions;

/**
 * @author Karabanov Andrey
 * @version 1.0
 * @date 21.02.2023 0:16
 */

/**
 * Uсключение, выбрасываемое когда script совершает рекурсивный вызов или вызов по циклу.
 */
public class RecoursiveCallException extends RuntimeException{
    public RecoursiveCallException(){

    }
}
