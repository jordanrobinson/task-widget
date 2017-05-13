package com.plusonelabs.tasks.calendar;

import org.joda.time.DateTime;
import java.util.List;

public class Task implements Comparable<Task> {

	public Long day_order;
	public Object assigned_by_uid;
	public String due_date_utc;
	public Long is_archived;
	public List<Object> labels = null;
	public Boolean all_day;
	public Long in_history;
	public String date_added;
	public Long checked;
	public String date_lang;
	public Long id;
	public String content;
	public Long indent;
	public Long user_id;
	public Long is_deleted;
	public Long priority;
	public Object parent_id;
	public Long item_order;
	public Long project_id;
	public Long collapsed;
	public String date_string;
	public transient DateTime date;

    @Override
    public int compareTo(Task task) {
        return date.compareTo(task.date);
    }
}
