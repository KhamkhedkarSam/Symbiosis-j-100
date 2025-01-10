package com.trg.Main.Model;
	import java.util.List;

import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
    import jakarta.persistence.OneToMany;
    import jakarta.persistence.Table;
	@Entity
	@Table(name="client")
	public class Client {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int clientId;
		public int getClientId() {
			return clientId;
		}

		public void setClientId(int clientId) {
			this.clientId = clientId;
		}

		public List<Feedback> getFeedbacks() {
			return feedbacks;
		}

		public void setFeedbacks(List<Feedback> feedbacks) {
			this.feedbacks = feedbacks;
		}

		@OneToMany(mappedBy = "client")
	    private List<Feedback> feedbacks;
		public String getClientName() {
			return clientName;
		}

		@Column(name = "clientName" ,nullable = false)
		private String clientName;
		
		@Column(name = "clientEmail")
		private String clientEmail;
		
		@Column(name = "clientMobileNo")
		private long clientMobileNo; 
		
		@Column(name = "clientPassword")  
		private int clientPassword;
		
		@Column(name = "clientRole")
		private String clientRole;
		
		public String getClientEmail() {
			return clientEmail;
		}

		public void setClientEmail(String clientEmail) {
			this.clientEmail = clientEmail;
		}

		public long getClientMobileNo() {
			return clientMobileNo;
		}

		public void setClientMobileNo(long clientMobileNo) {
			this.clientMobileNo = clientMobileNo;
		}

		public int getClientPassword() {
			return clientPassword;
		}

		public void setClientPassword(int clientPassword) {
			this.clientPassword = clientPassword;
		}

		public String getClientRole() {
			return clientRole;
		}

		public void setClientRole(String clientRole) {
			this.clientRole = clientRole;
		}

		public void setClientName(String clientName) {
			this.clientName = clientName;
		}

		
		@Override
		public String toString() {
			return "Client [clientId=" + clientId + ", feedbacks=" + feedbacks + ", clientName=" + clientName
					+ ", clientEmail=" + clientEmail + ", clientMobileNo=" + clientMobileNo + ", clientPassword="
					+ clientPassword + ", clientRole=" + clientRole + "]";
		}	
		
} 
 
