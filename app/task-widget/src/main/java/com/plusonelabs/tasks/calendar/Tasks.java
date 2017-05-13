package com.plusonelabs.tasks.calendar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tasks {

	private String syncToken;
	private Boolean fullSync;
	private List<Task> items = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getSyncToken() {
		return syncToken;
	}

	public void setSyncToken(String syncToken) {
		this.syncToken = syncToken;
	}

	public List<Task> getItems() {
		return items;
	}

	public void setItems(List<Task> items) {
		this.items = items;
	}
}
