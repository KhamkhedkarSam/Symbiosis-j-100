import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-feedback-form',
  imports: [CommonModule,FormsModule],
  templateUrl: './feedback-form.component.html',
  styleUrl: './feedback-form.component.css'
})
export class FeedbackFormComponent {

  feedback = {
    clientId: '',
    feedbackId: '',
    description: ''
  };

  onSubmit() {
    console.log('Feedback Submitted:', this.feedback);
    
  }
}
