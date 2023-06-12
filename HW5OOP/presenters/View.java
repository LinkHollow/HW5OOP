package HW5OOP.presenters;

import HW5OOP.models.Table;

import java.util.Collection;

public interface View {

    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    void printReservationTableResult(int reservationNo);

    void printReservationTableError(String errorMessage);

    void printChangeReservationTableResult(int reservationNo);

    void printChangeReservationTableError(String errorMessage);

}
