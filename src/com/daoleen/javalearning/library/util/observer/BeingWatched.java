package com.daoleen.javalearning.library.util.observer;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/28/13
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;
import static java.lang.System.out;

/**
 * Этот класс представляет наблюдаемого
 * Класс Observable служит для создания подклассов, за которыми могут
 * наблюдать другие классы. Когда с объектом такого подкласса происходят
 * изменения, наблюдающие классы извещаются об этом. Объект, подлажащий
 * наблюдению, когда изменяется должен вызвать метод setChanged(), а когда
 * он готов известить наблюдателей, то должен вызвать метод notifyObservers().
 * Наблюдаемый объект должен вызвать и метод setChanged() и notifyObservers(),
 * иначе ни о каких изменениях уведомлено не будет!
 */
public class BeingWatched extends Observable {
    void counter(int period) {
        for( ; period >= 0; period--) {
            setChanged();                           // "коммитим" изменения
            notifyObservers(period);   // извещаем наблюдателей, передаем им значение счетчика

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                out.println("Ожидание прервано");
            }
        }
    }
}
