package mehdi.sakout.aboutpage;

import android.content.Intent;
import android.view.View;

/**
 * Created by medyo on 3/25/16.
 */
public class Element {

    private String tag;
    private String title;
    private String job;
    private Integer icon;
    private Integer staffIcon;
    private Integer color;
    private String value;
    private Intent intent;
    private Integer gravity;
    private Boolean autoIconColor = false;

    private View.OnClickListener onClickListener;


    public Element() {

    }

    public Element(String tag, String title, String job, Integer icon, Integer staffIcon) {
        this.tag = tag;
        this.title = title;
        this.job = job;
        this.staffIcon = staffIcon;
        this.icon = icon;
    }

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public Integer getGravity() {
        return gravity;
    }

    public void setGravity(Integer gravity) {
        this.gravity = gravity;
    }

    public String getTag() {
        return tag;
    }

    public Element setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Element setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getJob() {
        return job;
    }

    public Element setJob(String job) {
        this.job = job;
        return this;
    }

    public Integer getIcon() {
        return icon;
    }

    public Element setIcon(Integer icon) {
        this.icon = icon;
        return this;
    }
    public Integer getStaffIcon() {
        return staffIcon;
    }

    public Element setStaffIcon(Integer staffIcon) {
        this.staffIcon = staffIcon;
        return this;
    }
    public Integer getColor() {
        return color;
    }

    public Element setColor(Integer color) {
        this.color = color;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Element setValue(String value) {
        this.value = value;
        return this;
    }

    public Intent getIntent() {
        return intent;
    }

    public Element setIntent(Intent intent) {
        this.intent = intent;
        return this;
    }

    public Boolean getAutoIconColor() {
        return autoIconColor;
    }

    public Element setAutoIconColor(Boolean autoIconColor) {
        this.autoIconColor = autoIconColor;
        return this;
    }
}