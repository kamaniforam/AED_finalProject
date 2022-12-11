package Business.Bloodbank.resources;

public class BloodRequest {
	
	private String postedBy;
	private String postedOn;
	private String email;
	private String city;
	private String zipcode;
	private String bloodGroup;
	private String requestedUnits;
	
	public BloodRequest(String postedBy, String postedOn, String email, String city, String zipcode, String bloodGroup,
			String requestedUnits) {
		super();
		this.postedBy = postedBy;
		this.postedOn = postedOn;
		this.email = email;
		this.city = city;
		this.zipcode = zipcode;
		this.bloodGroup = bloodGroup;
		this.requestedUnits = requestedUnits;
	}
	
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	public String getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(String postedOn) {
		this.postedOn = postedOn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getRequestedUnits() {
		return requestedUnits;
	}
	public void setRequestedUnits(String requestedUnits) {
		this.requestedUnits = requestedUnits;
	}
}
