package weather;

import common.HasSpread;

public class WeatherDay implements HasSpread {
    private final int fDayNum;
    private final int fMaxTemp;
    private final int fMinTemp;

    public WeatherDay(int dayNum, int maxTemp, int minTemp) {
        fDayNum = dayNum;
        fMaxTemp = maxTemp;
        fMinTemp = minTemp;
    }

    public int getDayNum() {
        return fDayNum;
    }

    public int getMaxTemp() {
        return fMaxTemp;
    }

    public int getMinTemp() {
        return fMinTemp;
    }

    @Override
    public int getSpread() {
        return getMaxTemp() - getMinTemp();
    }

    @Override
    public String toString() {
        return fDayNum + " " + fMaxTemp + " " + fMinTemp;
    }
}
