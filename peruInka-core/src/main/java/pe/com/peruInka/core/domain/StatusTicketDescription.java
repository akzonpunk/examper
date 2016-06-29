package pe.com.peruInka.core.domain;

public class StatusTicketDescription extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	
	public enum Status {
		DESCRIPTIONTICKET_ACT("DESCRIPTIONTICKET_ACT"), DESCRIPTIONTICKET_INACT("DESCRIPTIONTICKET_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}


}
