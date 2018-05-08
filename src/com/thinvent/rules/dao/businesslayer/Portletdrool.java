package com.thinvent.rules.dao.businesslayer;

// Generated Jan 10, 2008 10:00:32 AM by Hibernate Tools 3.2.0.CR1


/**
 * Portletdrool generated by hbm2java
 */
public class Portletdrool implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private PortletdroolPK comp_id;
	private String drl;
	private String dsl;
	private byte[] droolpackage;
	private Portletmode portletmode;

	public Portletdrool() {
	}

	public Portletdrool(PortletdroolPK comp_id, String drl) {
		this.comp_id = comp_id;
		this.drl = drl;
	}

	public Portletdrool(PortletdroolPK comp_id, String drl, String dsl, byte[] droolpackage, Portletmode portletmode) {
		this.comp_id = comp_id;
		this.drl = drl;
		this.dsl = dsl;
		this.droolpackage = droolpackage;
		this.portletmode = portletmode;
	}

	public PortletdroolPK getComp_id() {
		return this.comp_id;
	}

	public void setComp_id(PortletdroolPK comp_id) {
		this.comp_id = comp_id;
	}

	public String getDrl() {
		return drl;
	}

	public void setDrl(String drl) {
		this.drl = drl;
	}

	public String getDsl() {
		return dsl;
	}

	public void setDsl(String dsl) {
		this.dsl = dsl;
	}

	public byte[] getDroolpackage() {
		return this.droolpackage;
	}

	public void setDroolpackage(byte[] droolpackage) {
		this.droolpackage = droolpackage;
	}

	public Portletmode getPortletmode() {
		return this.portletmode;
	}

	public void setPortletmode(Portletmode portletmode) {
		this.portletmode = portletmode;
	}

}
