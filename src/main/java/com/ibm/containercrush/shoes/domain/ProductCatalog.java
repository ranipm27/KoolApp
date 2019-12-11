package com.ibm.containercrush.shoes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XXIBM_PRODUCT_CATALOG")
//@Table(name="XXIBM_PRODUCT_CATALOGUE")
public class ProductCatalog {
	
	private String segment;
	@Column(name="SEGMENT_NAME")
	private String segmentName;
	private String family;
	@Column(name="FAMILY_NAME")
	private String familyName;
	@Column(name="CLASS")
	private String clas;
	@Column(name="CLASS_NAME")
	private String className;
	@Id
	@GeneratedValue
	private String commodity;
	@Column(name="COMMODITY_NAME")
	private String commodityName;
	
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getSegmentName() {
		return segmentName;
	}
	public void setSegmentName(String segmentName) {
		this.segmentName = segmentName;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
}
