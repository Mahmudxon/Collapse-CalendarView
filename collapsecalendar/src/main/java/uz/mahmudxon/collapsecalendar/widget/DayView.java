package uz.mahmudxon.collapsecalendar.widget;

import android.content.Context;
import android.util.AttributeSet;

import uz.mahmudxon.collapsecalendar.R;

public class DayView extends androidx.appcompat.widget.AppCompatTextView {

    private static final int[] STATE_CURRENT = {R.attr.state_current};

    private boolean mCurrent;

    public DayView(Context context) {
        super(context);
    }

    public DayView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DayView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setCurrent(boolean current) {
        if (mCurrent != current) {
            mCurrent = current;
            refreshDrawableState();
        }
    }

    public boolean isCurrent() {
        return mCurrent;
    }

    @Override
    protected int[] onCreateDrawableState(int extraSpace) {
        final int[] state = super.onCreateDrawableState(extraSpace + 1);

        if (mCurrent) {
            mergeDrawableStates(state, STATE_CURRENT);
        }

        return state;
    }
}