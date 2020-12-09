package nirmalya.aatithya.restmodule.employee.model;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HrmsLeaveApprovalRestModel {

	private String employeeId;
	private String employeeName;
	private String fromDate;
	private String toDate;
	private Double workingDay;
	private Double paidleave;
	private Double unpaidleave;

	public HrmsLeaveApprovalRestModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HrmsLeaveApprovalRestModel(Object employeeId, Object employeeName, Object fromDate, Object toDate,
			Object workingDay, Object paidleave, Object unpaidleave) {
		super();
		this.employeeId = (String) employeeId;
		this.employeeName = (String) employeeName;
		this.fromDate = (String) fromDate;
		this.toDate = (String) toDate;
		this.workingDay = (Double) workingDay;
		this.paidleave = (Double) paidleave;
		this.unpaidleave = (Double) unpaidleave;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public Double getWorkingDay() {
		return workingDay;
	}

	public void setWorkingDay(Double workingDay) {
		this.workingDay = workingDay;
	}

	public Double getPaidleave() {
		return paidleave;
	}

	public void setPaidleave(Double paidleave) {
		this.paidleave = paidleave;
	}

	public Double getUnpaidleave() {
		return unpaidleave;
	}

	public void setUnpaidleave(Double unpaidleave) {
		this.unpaidleave = unpaidleave;
	}

	@Override
	public String toString() {
		ObjectMapper mapperObj = new ObjectMapper();
		String jsonStr;
		try {
			jsonStr = mapperObj.writeValueAsString(this);
		} catch (IOException ex) {

			jsonStr = ex.toString();
		}
		return jsonStr;
	}

}
