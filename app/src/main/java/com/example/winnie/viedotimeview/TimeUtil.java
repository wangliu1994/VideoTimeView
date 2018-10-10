package com.example.winnie.viedotimeview;

import android.support.annotation.IntRange;

/**
 * @author : winnie
 * @date : 2018/10/9
 * @desc
 */
public class TimeUtil {
    public static final int MAX_TIME_VALUE = 24 * 3600;

    /**
     * 格式化时间 HH:mm
     * @param timeValue 具体时间值
     * @return 格式化后的字符串，eg：3600 to 01:00
     */
    public static String formatTimeHHmm(@IntRange(from = 0, to = MAX_TIME_VALUE) long timeValue) {
        if (timeValue < 0){
            timeValue=0;
        }
        long hour = timeValue / 3600;
        long minute = timeValue % 3600 / 60;
        StringBuilder sb = new StringBuilder();
        if (hour < 10) {
            sb.append('0');
        }
        sb.append(hour).append(':');
        if (minute < 10) {
            sb.append('0');
        }
        sb.append(minute);
        return sb.toString();
    }

    /**
     * 格式化时间 HH:mm:ss
     * @param timeValue 具体时间值
     * @return 格式化后的字符串，eg：3600 to 01:00:00
     */
    public static String formatTimeHHmmss(@IntRange(from = 0, to = MAX_TIME_VALUE) long timeValue) {
        long hour = timeValue / 3600;
        long minute = timeValue % 3600 / 60;
        long second = timeValue % 3600 % 60;
        StringBuilder sb = new StringBuilder();

        if (hour < 10) {
            sb.append('0');
        }
        sb.append(hour).append(':');

        if (minute < 10) {
            sb.append('0');
        }
        sb.append(minute);
        sb.append(':');

        if (second < 10) {
            sb.append('0');
        }
        sb.append(second);
        return sb.toString();
    }
}
