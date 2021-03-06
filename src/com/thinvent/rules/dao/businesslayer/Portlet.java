package com.thinvent.rules.dao.businesslayer;

// Generated Jan 10, 2008 10:00:32 AM by Hibernate Tools 3.2.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Portlet generated by hbm2java
 */
public class Portlet implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String portletid;
	private String portletname;
	private Set<Portletmode> portletmodes = new HashSet<Portletmode>(0);

	public Portlet() {
	}

	public Portlet(String portletid) {
		this.portletid = portletid;
	}

	public Portlet(String portletid, String portletname, Set<Portletmode> portletmodes) {
		this.portletid = portletid;
		this.portletname = portletname;
		this.portletmodes = portletmodes;
	}

	public String getPortletid() {
		return this.portletid;
	}

	public void setPortletid(String portletid) {
		this.portletid = portletid;
	}

	public String getPortletname() {
		return this.portletname;
	}

	public void setPortletname(String portletname) {
		this.portletname = portletname;
	}

	public Set<Portletmode> getPortletmodes() {
		return portletmodes;
	}

	public void setPortletmodes(Set<Portletmode> portletmodes) {
		this.portletmodes = portletmodes;
	}


}
