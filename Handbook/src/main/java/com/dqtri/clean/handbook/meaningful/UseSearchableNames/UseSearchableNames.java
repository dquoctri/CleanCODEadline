package com.dqtri.clean.handbook.meaningful.UseSearchableNames;

public class UseSearchableNames {
    public void Encoding() {
        int[] t = new int[]{0, 2, 0, 8, 2, 0, 2, 3};
        int s = 0;
        for (int j = 0; j < 34; j++) {
            s += (t[j] * 4) / 5;
        }
    }

    public int sumTaskWeeks() {
        int[] taskEstimate = new int[]{0, 2, 0, 8, 2, 0, 2, 3};
        final int NUMBER_OF_TASKS = taskEstimate.length;

        int realDaysPerIdealDay = 4;
        final int WORK_DAYS_PER_WEEK = 5;
        int sum = 0;
        for (int j = 0; j < NUMBER_OF_TASKS; j++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }
        return sum;
    }
}
