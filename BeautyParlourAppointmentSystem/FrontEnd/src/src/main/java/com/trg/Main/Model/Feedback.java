package com.trg.Main.Model;
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
    import jakarta.persistence.JoinColumn;
    import jakarta.persistence.ManyToOne;

    import jakarta.persistence.Table;

	@Entity
	@Table(name="feedback")
	public class Feedback {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "feedbackid")
		private int feedbackid;
		
		@ManyToOne
		@JoinColumn(name = "clientId")
		private Client client;
		
		@Column(name = "description")
		private String description;

		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}

		public int getFeedbackid() {
			return feedbackid;
		}

		public void setFeedbackid(int feedbackid) {
			this.feedbackid = feedbackid;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Feedback [client=" + client + ", feedbackid=" + feedbackid + ", description=" + description + "]";
		}
		
	
	} 
