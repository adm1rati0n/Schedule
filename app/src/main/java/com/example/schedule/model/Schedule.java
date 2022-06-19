package com.example.schedule.model;

import java.util.Arrays;
import java.util.LinkedList;

public class Schedule {
    public final ScheduleDay MONDAY = new ScheduleDay("Понедельник", "Нахимовский");
    public final ScheduleDay TUESDAY = new ScheduleDay("Вторник", "Нахимовский");
    public final ScheduleDay WEDNESDAY = new ScheduleDay("Среда", "Нахимовский");
    public final ScheduleDay THURSDAY = new ScheduleDay("Четверг", "Нежинская");
    public final ScheduleDay FRIDAY = new ScheduleDay("Пятница", "Нахимовский");

    public final Lesson RPM1 =
            new Lesson("Разработка программных модулей", "А.А. Шимбирёв");

    public final Lesson TRZBD =
            new Lesson("Технология разработки и защиты баз данных", "А.Д. Горбунов");

    public final Lesson RPM2 =
            new Lesson("Разработка программных модулей", "А.Ю. Бушин");

    public final Lesson TRPO =
            new Lesson("Технология разработки программного обеспечения", "Л.А. Соколова");

    public final Lesson RMP =
            new Lesson("Разработка мобильных приложений", "А.О. Лясников");

    public final Lesson PRACTICE =
            new Lesson("ПРАКТИКА", "");

    public final Lesson SYS =
            new Lesson("Системное программирование", "А.Д. Нилов");

    public final Lesson ISRPO =
            new Lesson("Инструментальные средства разработки ПО", "Ю.В. Севастьянов");

    public final Lesson ENG =
            new Lesson("Иностранный язык в профессиональное деятельности", "А.Д. Завьялова, А.Ю. Дымская");

    public final Lesson PE =
            new Lesson("Физическая культура", "А.В. Андрюков");

    public Schedule() {
        MONDAY.fill(new LinkedList<>(Arrays.asList(
                new ScheduleRow(2, false, RPM1, null),
                new ScheduleRow(3, false, TRZBD, null),
                new ScheduleRow(4, true, RPM2, TRPO),
                new ScheduleRow(5, false, RMP, null)
        )));

        TUESDAY.fill(new LinkedList<>(Arrays.asList(
                new ScheduleRow(1, false, PRACTICE, null),
                new ScheduleRow(2, false, PRACTICE, null),
                new ScheduleRow(3, false, PRACTICE, null),
                new ScheduleRow(4, false, PRACTICE, null),
                new ScheduleRow(5, false, PRACTICE, null)
        )));

        WEDNESDAY.fill(new LinkedList<>(Arrays.asList(
                new ScheduleRow(1, false, PRACTICE, null),
                new ScheduleRow(2, false, PRACTICE, null),
                new ScheduleRow(3, false, PRACTICE, null),
                new ScheduleRow(4, false, PRACTICE, null),
                new ScheduleRow(5, false, PRACTICE, null)
        )));

        THURSDAY.fill(new LinkedList<>(Arrays.asList(
                new ScheduleRow(2, false, SYS, null),
                new ScheduleRow(3, false, TRPO, null),
                new ScheduleRow(4, false, ISRPO, null),
                new ScheduleRow(5, false, RPM2, null)
        )));

        FRIDAY.fill(new LinkedList<>(Arrays.asList(
                new ScheduleRow(1, false, ENG, null),
                new ScheduleRow(2, false, PE, null),
                new ScheduleRow(3, true, ISRPO, TRZBD),
                new ScheduleRow(4, true, RMP, SYS)
        )));
    }
}
