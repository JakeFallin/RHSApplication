package com.jakefallin.rhsapp.UI;

/**
 * Created by Jake on 4/26/2016.
 */
import android.text.InputFilter;
import android.text.Spanned;

/**
 * InputFilter which will take a mMinValue an max value as limit.
 */
public class MinMaxInputFilter implements InputFilter {

    private final double mMinValue;
    private final double mMaxValue;

    /**
     * Constructor, enter the desired min and max as doubles.
     */
    public MinMaxInputFilter(double min, double max) {
        mMinValue = min;
        mMaxValue = max;
    }

    /**
     * Here the numbers are filtered.
     */
    @Override
    public CharSequence filter(
            CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        try {
            double input = Double.parseDouble(dest.toString() + source.toString());
            if (isInRange(mMinValue, mMaxValue, input))
                return null;
        } catch (NumberFormatException ignored) {
        }
        return "";
    }

    private boolean isInRange(double a, double b, double c) {
        return b > a ? c >= a && c <= b : c >= b && c <= a;
    }
}

